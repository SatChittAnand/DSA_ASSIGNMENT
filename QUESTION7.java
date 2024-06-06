import java.util.*;
public class QUESTION7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements of Array: ");
		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.print("Enter elements of the array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int mx=a[0],mn=a[0];
		int in=0,lin=0;
		int cn=1,cnt=1;
//		Arrays.sort(a);
		for(int i=1;i<n;i++) {
			if(a[i]==mx) cn++;
			if(a[i]>mx) {
				mx=a[i];in=i;
				
			}
			if(a[i]<=mn) {
				if(a[i]<mn) cnt=1;
				if(a[i]==mn) cnt++;
				mn=a[i];lin=i;
			}
				
			
			
			
			
		}
		
//		for(int i=0;i<n;i++) {
//			if(a[0]==a[i]) mn++;
//			else if(a[n-1]==a[i]) mx++;
//		}
		System.out.println("Maximum element of Array is "+mx+" and occurs "+cn+" times");
		System.out.println("Minimum element of Array is "+mn+" and occurs "+cnt+" times");
		System.out.println("First occurence of maximum element is at position "+in);
		System.out.println("last occurence of minimum element is at position "+lin);

	}

}
//