package Pattern;

public class TriangleStar {
	public static void main(String[] args) {
		int i,j,k,row=9;
		for(i=1;i<=row;i++) {
			for(j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++) {
				if(k==1||i==row||k==(2*i-1)) {
					System.out.print("*");
				}
					else
					{
						System.out.print(" ");
						
				}
				
			}
			System.out.println();
			}
	}

}
