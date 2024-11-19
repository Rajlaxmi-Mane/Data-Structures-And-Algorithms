package com.hashmap;
import java.util.*;

public class HashmapImplement {
	
	// generics
	static class Hashmap<k,v>{ 
		private class Node{
			k key;
			v value;
			
			public Node(k key,v value) {
				this.key=key;
				this.value=value;
			}
		}
		
		private int n;  // total no of nodes
		
		// total no of buckets
		private int N;
		private LinkedList<Node> buckets[];  // N=buckets.lenght
		
		public Hashmap() {
			this.N=4;
			this.buckets=new LinkedList[4];
			for(int i=0;i<4;i++) {
				this.buckets[i]=new LinkedList<>();
			}
		}
		
		
		public void put(k key , v value) {
		int buckInd=bucketIndex(key);
		
		
		// dataIndex - index of node in likedlist
		int dataInd=searchInList(key,buckInd);
		
		
		// key does not exist
		if(dataInd==-1) {
			buckets[buckInd].add(new Node(key,value));
			n++;
			
		}else {
			// key exist
			
			Node data=buckets[buckInd].get(dataInd);
			data.value=value;
		}
		
		double lambda=(double)n/N;
		
		if(lambda>2.0) {
			// rehashing 
			reHash();
			
		}
		
		
		}
		
		
		private int bucketIndex(k key) {
			int bi=key.hashCode();
			return Math.abs(bi)%N;
		
		}
		
		private int searchInList(k key, int buckInd) {
			
			LinkedList<Node> list=buckets[buckInd];
			for(int i=0;i<list.size();i++) {
				if(list.get(i).key==key) {
					return i;
				}
			}
			
			return -1;
		}
		
		private void reHash() {
			LinkedList<Node> oldBuckets[]=buckets;
			
			buckets=new LinkedList[N*2];
			for(int i=0;i<N*2;i++) {
				buckets[i]=new LinkedList<>();
			}
			
			for(int i=0;i<oldBuckets.length;i++) {
				LinkedList<Node> list=oldBuckets[i];
				
				for(int j=0;j<list.size();j++) {
					Node node=list.get(j);
					put(node.key,node.value);
				}
			}
		}
		
		
		
		public v get(k key) {
			int buckInd=bucketIndex(key);
			
			
			// dataIndex - index of node in likedlist
			int dataInd=searchInList(key,buckInd);
			
			
			// key does not exist
			if(dataInd==-1) {
				return null;
			}else {
				// key exist
				
				Node data=buckets[buckInd].get(dataInd);
				return data.value;
			}
		}
		
		public boolean containsKey(k key) {
			int buckInd=bucketIndex(key);
			
			
			// dataIndex - index of node in likedlist
			int dataInd=searchInList(key,buckInd);
			
			
			// key does not exist
			if(dataInd==-1) {
				return false;
				
			}else {
				// key exist
				return true;
			}
		}
		
		
		public v remove(k key) {
			int buckInd=bucketIndex(key);
			
			
			// dataIndex - index of node in likedlist
			int dataInd=searchInList(key,buckInd);
			
			
			// key does not exist
			if(dataInd==-1) {
				return null;
			}else {
				// key exist
				
				Node data=buckets[buckInd].remove(dataInd);
				n--;
				return data.value;
			}
		}
		
		public boolean isEmpty() {
			return n==0;
		}
		
		public ArrayList<k> keySet(){
			ArrayList<k> keys=new ArrayList<>();
			for(int i=0;i<buckets.length;i++) {
				LinkedList<Node> list=buckets[i];
				for(int j=0;j<list.size();j++) {
					Node node =list.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}
		
	}
	
		
	
	public static void main(String[] args) {
		Hashmap<String,Integer> map=new Hashmap<>();
		
		map.put("ind", 100000);
		map.put("pak", 76553);
		map.put("usa", 122443);
		map.put("russia",64763);
		
		System.out.println(map.get("ind"));
		System.out.println(map.containsKey("usa"));
		
		System.out.println(map.keySet());
		
		map.remove("pak");
		
		System.out.println(map.containsKey("pak"));
		
	}

}
