import java.util.Scanner;
public class Check{
  public static void main(String[] args)
  {
	
	
	 
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("enter number");
	 int num = sc.nextInt();
	 
	 if(num%5 ==0)
	 {
		 System.out.println(num+  "it is divisible by 5");
		 
	 }
	 else
	 {
		  System.out.println(num+ "it is  not divisible by 5");
		 
	 }
}
}
