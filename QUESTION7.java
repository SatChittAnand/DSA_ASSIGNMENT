import java.util.Scanner;
public class Q7 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		input(a);
		display(a);
		findMaxMin(a);
	}
	public static void input(int a[])
	{
		System.out.println("Input array elements:");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	public static void display(int a[])
	{
		System.out.print("The array elements are:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void findMaxMin(int a[])
	{
		int max=a[0],min=a[0],x=0,y=0,c1=1,c2=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==max)
				c1++;
			if(a[i]>max)
			{
				max=a[i]; x=i;
				c1=1;
			}
			if(a[i]<=min)
			{
				if(a[i]<min)
					c2=1;
				if(a[i]==min)
					c2++;
				min=a[i]; y=i;
			}
		}
		System.out.println("No of occurance of max="+c1);
		System.out.println("No of occurance of min="+c2);
		System.out.println("First occurance of max at index "+x);
		System.out.println("Last occurance of min at index "+y);
	}
}
