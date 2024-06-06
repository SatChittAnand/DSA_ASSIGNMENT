import java.util.*;
public class QUESTION8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of row and column of 2D-Array: ");
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int a[][]=new int [n][n1];
		int s=0;
		System.out.print("Enter elements of 2D Array: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n1;j++) {
				a[i][j] = sc.nextInt();
				s+=a[i][j];
			}
		}
		System.out.println("Elements of 2D Array are: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of elements of the 2D-Array is "+ s);
		

	}

}
