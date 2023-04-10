package basics;

public class StrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int  i, j, sum = 0;  
		  for (i = 1; i <= 100; i++)  
		  {  
		             for (j = 1; j <= i/2; j++)   
		             {  
		                       if (i % j == 0)  
		                       {  
		                                  sum = sum + j;  
		                       }  
		             }  
		                  if (sum > i)  
		                          System.out.print( i+" ");  
		                  sum = 0;  
		  }  

	}

	  int  i, j, sum = 0;  
	for (i = 1; i <= 100; i++)  
	{  
	           for (j = 1; j <= i/2; j++)   
	           {  
	                     if (i % j == 0)  
	                     {  
	                                sum = sum + j;  
	                     }  
	           }  
	                if (sum > i)  
	                        System.out.print( i+" ");  
	                sum = 0;  
	}  

}
