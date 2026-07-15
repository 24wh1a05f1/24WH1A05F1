package pattern;
public class hollow {

	public static void main(String[] args) {
	int n = 6;
	for(int i=1;i<=n;i++) {
			if(i == 1 || i == n) {
				for(int j=1;j<=n+1;j++) {
				System.out.print("*"+" ");
			}
			}
			else {
				System.out.print("*");
	
		for(int j=1;j <= n-1;j++) {
			System.out.print(" "+" ");
		}
			
	
		System.out.print(" "+"*");
			}
		System.out.println();
	
		
	    }
	}
}
		
	
			
	
	





		
	
	

	


