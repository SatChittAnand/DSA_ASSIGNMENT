import java.util.Scanner;
public class QUESTION5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt(),rev=0;
		System.out.println(sum_of_Digits(n));
		
		
		
		
		
	}
	public static int sum_of_Digits(int n) {
		int s=n;
		while(s>9) {
			n=s;
			s=0;
			while(n>0) {
				s+=n%10;
				n/=10;
			}
		}
		return s;
	}
}