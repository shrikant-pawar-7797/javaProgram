package BasicPrograms;

// 2. Swap Two Numbers Without Using a Third Variable

public class swapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
