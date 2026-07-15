package pattern;

public class diamond {

	public static void main(String[] args) {
	int n = 4;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print(" ");
		}
		System.out.print("*");
	if(i != 1) {
	for(int j=1;j<2*(i-1);j++) {
		System.out.print(" ");
	}
	System.out.print("*");
	}
	System.out.println();
	
	}
	for(int i=1;i<n;i++) {
		if(i != 1) {
		for(int j=1;j<i;j++) {
			System.out.print(" ");
		}
		}
		System.out.print(" *");
        if(i != n-1) {
		for(int j=n-i;j>=i;j--){
			System.out.print(" ");
		}
        }
        if(i != n-1) {

		System.out.print("*");
        }
        
		System.out.println();
	
	}
	}
}

		
			

