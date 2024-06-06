import java.util.*;
public class QUESTION4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//applicable for 6 sized string
//		String st=sc.next();
		String st = "carbon";
		int i,j,k,l,m,n;
		for(i=0;i<st.length();i++) {
			for(j=0;j<st.length();j++) {
				for(k=0;k<st.length();k++) {
					for(l=0;l<st.length();l++) {
						for(m=0;m<st.length();m++) {
							for(n=0;n<st.length();n++) {
								if(i!=j && i!=k && i!=l && i!=m && i!=n 
										&& j!=k && j!=l && j!=m && j!=n 
												&& k!=l && k!=m && k!=n 
														&& l!=m && l!=n 
																&& m!=n) 
									System.out.println(""+st.charAt(i)+st.charAt(j)+st.charAt(k)+st.charAt(l)+st.charAt(m)+st.charAt(n));
							}
						}
					}
				}
			}
		}
							
		

	}
	

}
