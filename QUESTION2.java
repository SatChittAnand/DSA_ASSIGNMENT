import java.util.*;
public class QUESTION2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter person weight in kg: ");
		double we=sc.nextDouble();
		System.out.print("Enter height of person in meter: ");
		double he=sc.nextDouble();
		double BMI= we/Math.pow(he,2);
		if(BMI<18.5) System.out.println("The person is Underweight.");
		else if(BMI<=24.9) System.out.println("The person is Normal Weight.");
		else if(BMI<30.0) System.out.println("The person is OverWeight.");
		else  System.out.println("The person is Obese");
		
		
		// TODO Auto-generated method stub

	}

}
