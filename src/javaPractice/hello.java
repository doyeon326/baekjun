package javaPractice;

public class hello {
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int []answer = new int[commands.length];
		
for(int f=0; f<answer.length; f++) {
	
	
	int count=0;

	
	//get i,j,k
	int i = commands[f][0];
	int j = commands[f][1];
	int k = commands[f][2];
	
	System.out.println("i:" + i);
	System.out.println("j:" + j);
	System.out.println("k:" + k);
	
	int [] temp = new int[j-i+1];
		
	//1. 자른 수 
			int current = i-1; 
			for(int x=0; x<temp.length; x++) {
				
				temp[count] = array[current++];
				System.out.println(temp[count]);
				
				count++;
			}
			
			
	//2. 정렬 
	
			for(int x=0; x<temp.length; x++) {
				for(int y=x+1;y<temp.length; y++) {
					if(temp[x]>temp[y]) {
						int c;
						c=temp[x];
						temp[x] = temp[y];
						temp[y] = c;
						
					}
				}
				
			}
			
	answer[f]=temp[k-1];
	System.out.println("answer: " + answer[f]);
}		



	}
}
