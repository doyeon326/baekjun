package javaPractice;

public class BiggerstNumber {
	public static void main(String[] args) {
		int [] numbers = {12,121,33,7};
		// 총 나올 수 있는수 총값 -1 * 길이
		String answer=""; 
		int count;
		String []tempnum = new String[numbers.length];
		int temp;
		//int [] acs = new int[numbers.length];
		
		for(int i=0; i<numbers.length; i++) {
		
//			if(numbers[i]<10 && numbers[i]%10!=0) {
//				System.out.println(numbers[i]%10);
//				//acs[i] = numbers[i]%10;
//			}
			
			if(numbers[i]<10) {
				//10자리수일때
				if(numbers[i]>=10) {
					for(count=i+1; count<numbers.length; count++) {
						if(numbers[i]/10>numbers[count]/10 &&numbers[count]>=10) {
							temp = numbers[count];
							numbers[count] = numbers[i];
							numbers[i] = temp;
						}
						
					}
					
					System.out.println(numbers[i]/10);
					//acs[i] = numbers[i]/10;
				}
				//0과 같을
			}
			
		}
		
		
		for(int i=0; i<numbers.length ; i++)
		{
			tempnum[i] = String.valueOf(numbers[i]);
			
			System.out.println(tempnum[i]);
		}
		
		
		for(int i=0; i<=numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(Integer.parseInt(tempnum[i].substring(0,1))<Integer.parseInt(tempnum[j].substring(0,1))) {
					String str2 = tempnum[j]; 
					tempnum[j]=tempnum[i];
					tempnum[i] = str2;
				}
			}
			
		}
		
		for(int i=0; i<tempnum.length; i++) {
			System.out.println("final"+tempnum[i]);
			answer += tempnum[i];
		}
		System.out.println(answer);
		
		

	}
}
