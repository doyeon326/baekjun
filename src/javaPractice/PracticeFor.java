package javaPractice;

	import java.util.Scanner;
	
	public class PracticeFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int f;
		int s;
		int count =0; 
		
		int n = sc.nextInt(); 
	
	
			f = n/10;
			s = n%10;
			
			do{
				
				int temp = 0; 
				
				temp = s; 
				s = (f+s)%10; 
				f = temp; 
				count ++;
				
				
				
			
			}while(n!= (f*10 + s));
			
			System.out.println(count);
	
		
		
	}
	}
