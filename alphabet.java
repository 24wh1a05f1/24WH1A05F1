package pattern;

public class alphabet {

	public static void main(String[] args) {
		int n = 7;
		for(int i=1;i<=n;i++) {
			if(i != 1) {
				for(int j=1;j<i;j++) {
					System.out.print(" "+" ");
				}
			}
			for(int j=0;j<=n-i;j++) {
				char ch = (char)('A'+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}