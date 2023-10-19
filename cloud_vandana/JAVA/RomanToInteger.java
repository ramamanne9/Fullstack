package Roman;
import java.util.Scanner;
public class RomanToInteger {
public static void main(String[] args) {
		
		RomanToInteger obj = new RomanToInteger();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Roman Number in capital letters: ");
		String inputRoman=s.nextLine();	
		char [] ch=inputRoman.toCharArray();
		System.out.println("The Integer value of given Roman number is: "+obj.romaToInt(ch));
	   } 
		   
		   int NumValue(char r) {
		      if (r == 'I')
		         return 1;
		      if (r== 'V')
		         return 5;
		      if (r == 'X')
		         return 10;
		      if (r == 'L')
		         return 50;
		      if (r == 'C')
		         return 100;
		      if (r == 'D')
		         return 500;
		      if (r == 'M')
		         return 1000;
		      return -1;
		   }
		   int romaToInt(char str[])
		   {
			   int sum=0;
			   for(int i=0;i<str.length;i++)
			   
			   {
				   int s1=NumValue(str[i]);
				   if(i+1 <str.length)
						   
				   {
					   int s2=NumValue(str[i+1]);
							   
							   if(s1>=s2)
							   {
								   sum=sum+s1;
								   
							   }
							   else
							   {
								 sum=sum-s1;
							   }
				   }
				   else {
					   sum=sum+1;
				   }}
			   return sum;
							   }
							  
				   
				   
			   }
		   

		


