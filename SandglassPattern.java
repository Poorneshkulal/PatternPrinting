package Pattern;

public class SandglassPattern {
	public static void main(String[] args) {
		int i,j,row=5;
		for(i=0;i<row;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<row-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=row-1;i>=0;i--) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(j=i;j<row;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


