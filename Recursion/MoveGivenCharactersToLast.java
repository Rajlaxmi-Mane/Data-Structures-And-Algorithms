package Recursion;

public class MoveGivenCharactersToLast {
	public static int cnt=0;
	public static String newStr="";
	
	public static void MoveCharsToLast(String str,int index,char el) {
		//we have to move the character present in el at the last
		
		// base case condition
		if(index==str.length()-1) {
			for(int i=0;i<cnt;i++) {
				newStr+=el;
			}
			System.out.println(newStr);
			return;
		}
		
		char currentChar=str.charAt(index);
		if(currentChar==el) {
			
			// here we are counting the no of el present in a string
			cnt++;
			
			// recursive call statement
			MoveCharsToLast(str,index+1,el);
			
		}
		else {
			// if el is not matching with the current character we have to add it into our new string
			newStr+=currentChar;
			MoveCharsToLast(str,index+1,el);
			
		}
	}
	
public static void main(String[] args) {
	String str="abcdxefxghxijxkxlx";
	char ch='x';
	MoveCharsToLast(str,0,ch);
}

}
