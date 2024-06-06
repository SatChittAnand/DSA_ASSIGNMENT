import java.util.*;
public class QUESTION10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		double[][] a= new double[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
			
		}
		for(int i=0;i<n;i++) {
			double s=0;
			for(int j=0;j<m;j++) {
				s+=a[j][i];
			}
			
			System.out.println("Sum of the element at column "+i+" is "+s);
		}
		
		
		
	}

}
