package javaPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


interface Math1 {
	static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase=Integer.parseInt(br.readLine());
		for(int i=0; i<testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int distance = end-start;
			double sqrt=Math.sqrt(distance); 
			int n = (int)Math.round(sqrt);
			if(sqrt <= n) {
				n= 2*n-1;
			}
			else if(sqrt >n) {
				n= 2*n;
			}
			
			System.out.println(n);
			System.out.println("hello222");
		}
		
	}
}