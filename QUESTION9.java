import java.util.*;
public class QUESTION9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		double[][] a=new double[m][n];
		System.out.println("Enter 4-by-4 matrix row by row: ");
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
		System.out.println(sumMajorDiagonal(a));

	}
	public static double sumMajorDiagonal(double[][] a) {
		double s=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(i-j==0) s+=a[i][j];
			}
		}
		return s;
	}

}
