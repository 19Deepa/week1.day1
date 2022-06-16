package week1.Day1;

public class Fiboseries {
  public static void main(String[] args) {
	  int n1 = 0,n2 = 1,sum ,range;
	  range =8;
	  System.out.println(n1);
	  System.out.println(n2);
	  for (int i = 0; i < range;i++) {
		  sum= n1+n2;
		  System.out.println(sum); 	  
		  n1=n2;
		  n2=sum;
		
		
	}
	
}
	
}
