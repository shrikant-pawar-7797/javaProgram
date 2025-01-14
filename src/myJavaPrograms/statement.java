package myJavaPrograms;
// WAP to print following series: 
/*
21
22
23
25
26
28
29
30*/

public class statement {

	public static void main(String[] args) {

		int i = 21;

		while (i <= 30) {
			if (i == 24 || i == 27) {
				i++;
				continue;
			}

			System.out.println(i);
			i++;
		}
	}

}
