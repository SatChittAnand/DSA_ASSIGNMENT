import java.util.Scanner;
public class QUESTION1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number greater than 2: ");
		int n = sc.nextInt();
		int num =n,c=0;
		while(n>=2) {
			c++;
			n/=2;
		}
		System.out.println(num+" should be repeatedly divided by 2, "+c);

	}

}