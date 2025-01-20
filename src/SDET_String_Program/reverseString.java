package SDET_String_Program;

//1.) Java program to reverse a string

public class reverseString {

	public static void main(String[] args) {

		String name="Shrikant";
		char ch;
		String nstr="";
		
		for(int i=0; i<name.length();i++) {
			
			ch= name.charAt(i);
			
			nstr=ch+nstr;
			
		}
		
		System.out.println(nstr);
	}

}
