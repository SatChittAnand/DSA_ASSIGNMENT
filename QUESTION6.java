import java.util.*;
public class QUESTION6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(isOdd(n)) System.out.println(n+" is odd: true");
		

	}
	public static boolean isOdd(int n) {
		if((n&1)==1) return true;
		return false;
	}
}
