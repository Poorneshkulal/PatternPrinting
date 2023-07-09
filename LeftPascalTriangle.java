package Pattern;

public class LeftPascalTriangle {
	public static void main(String[] args) {
		int row=4;
		for(int i=1;i<=row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row;i>=1;i--) {
			for(int j=i;j<=row;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
