package Pattern;

public class DiamondStar {

	public static void main(String[] args) {
		int row=15,i,j,k;
		for(i=1;i<=row;i++) {
			for(j=row;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<2*(i-1);k++) {
				System.out.print(" ");
				
			}
			if(i==1) {
				System.out.println("");
			}
			else {
				System.out.println("*");
			}
		}
		for(i=row-1;i>=1;i--) {
			for(j=row;j>i;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<2*(i-1);k++) {
				System.out.print(" ");
			}
			if(i==1) 
				System.out.println("");
				
			else 
				System.out.println("*");
			
		}

	}

}
