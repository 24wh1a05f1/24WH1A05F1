package pattern;

public class starPattern {

	public static void main(String[] args) {
		int n = 3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print(i);
			
			for(int j=1;j<2*(n-i);j++) {
				System.out.print(" ");
			}
			if(i != n) {
			for(int j=i;j<=i;j++) {
				System.out.print(j);
			}
			}
		
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=i;j<n-1;j++) {
			System.out.print(" ");
			}
			System.out.print(i+n);
			for(int j=1;j<2*i;j++) {
				System.out.print(" ");
			}
			System.out.print(i+n);
			System.out.println();
			}
	
	}
	
	}
		

		
			
			
	
		


