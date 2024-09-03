package Recursion;
import java.util.HashSet;

public class SubSequencesNotRepeated {
	
	public static void subsequences(String str,int index, String newStr,HashSet set) {
		// base case
		if(index==str.length()) {
			// check newString is already existed or not
			if(set.contains(newStr)) {
				return;
			}
			else {
				// printing subsequences and adding that into the set
				System.out.println(newStr);
				set.add(newStr);
				return;
			}
		}
		char currentChar=str.charAt(index);
		
		subsequences(str,index+1,newStr+currentChar,set);
		
		// not to be 
		subsequences(str,index+1,newStr,set);
	}
	
	public static void main(String[] args) {
		String str="aabba";
		
		//set to store unique subsequeces
		HashSet <String>set=new HashSet<>();
		subsequences(str,0,"",set);
	}

}
