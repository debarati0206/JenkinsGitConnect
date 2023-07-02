
public class StarP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int row =6,i,j;
		for (i=0;i<row;i++) {
			for (j=(row-i);j>=0;j--) {
				System.out.print(" ");
			}
			for (j = 0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
