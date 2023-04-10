package basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i=1;i<=10;i++)
		{
			fact = i*fact;
			System.out.println(i+""+fact);
		}
		

	}

}
