import java.util.*;
public class QUESTION3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt(),num=n;
		if(spy(n)) System.out.println(n+" is a spy number");
		int c=0;
		for(int i=1;i<=100000;i++) {
			if(spy(i)) { System.out.println(i+" is a spy number."); c++;}
		}
		System.out.println(c);

	}
	public static boolean spy(int n) {
		int s=0,p=1;
		while(n>0) {
			int ld=n%10;
			s+=ld;
			p*=ld;
			n/=10;
		}
		
		if(s==p) return true;
		else return false;
	}

}
