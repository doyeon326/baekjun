package javaPractice;
	
	public class PracticeWhile {
	public static void main(String[] args) {

		int []arr = new int[100000];
		
		for(int i=0; i<10000; i++) {
			arr[i] = i+1;
		} 
				
		for(int i=1; i<=10000; i++) {
		
			if(i<10) {
				int temp = i + i/10 + i;
				arr[temp-1] =0;
				
			}
			else if(i>=10&&i<100) {
				int temp = i + (i/10) + (i%10);
				arr[temp-1]=0;
				
			}
			else if(i>=100&&i<1000) {
				int temp = i + (i/100) + ((i%100)/10) + i%10;
					arr[temp-1]=0;
			
			}
			if(i>=1000 && i<10000){
				int temp = i + (i/1000) + ((i%1000)/100) +((i%100)/10) + i%10;
	
					arr[temp-1]=0;
				
			}
		}
		
		for(int i=0; i<10000; i++) {
			if(arr[i]!=0 && arr[i]<10000) {
				System.out.println(arr[i]);
			}
			
		}
	}
	}
