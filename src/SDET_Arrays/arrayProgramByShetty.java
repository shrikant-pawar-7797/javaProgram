package SDET_Arrays;

public class arrayProgramByShetty {

	public static void main(String[] args) {

		int sum=0;
		
		int a[]= {9,7,7,8,1,2,3,4,5,6,7};
		
		for(int i=0; i<a.length;i++) {
			
			sum=sum+a[i];
		}
		System.out.println(sum);
		int f=0;
		int	total=0;
		
		while(sum>0) {
			
			f=sum%10;
			total= total+f;
			sum/=10;
			//System.out.println(sum);
			if(total>9) {
				continue;
			}
			
		}
		
		System.out.println(total);
	}
	
	

}
