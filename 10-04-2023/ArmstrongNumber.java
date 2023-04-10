package basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i<100; i++){
			int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i)
	         {
	            System.out.println(i+" is an Armstrong number.");
	         }
	         
	}

	}

}
