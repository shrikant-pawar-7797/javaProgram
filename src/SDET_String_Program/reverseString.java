package SDET_String_Program;

//1.) Java program to reverse a string

public class reverseString {

	public static void main(String[] args) {

		String name="Shrikant";
		char ch;
		String nstr="";
		int i=0;
		
		//for(int i=0; i<name.length();i++)
			
			while(i<name.length())
		{
			
			ch= name.charAt(i);
			i++;
			
			nstr = ch + nstr;
			
		}
		
		System.out.println(nstr);
	}

}
