package com.nt.recursion;

public class SevenFindChar {

	public static void main(String[] args) {
		
		String st ="gautamkumar";
		char ch ='p';
		char[] cha= st.toCharArray();
		
		int i=0;
		boolean b =findChar(cha,ch,i);
		System.out.println(b);

	}

	private static boolean findChar(char[] cha, char ch, int i) {
		
		if(i==cha.length) {
			return false;
		}
		
		if(cha[i]==ch) {
			return true;
		}
		i++;
		return findChar(cha,ch,i);
		
		
		
	}

}
