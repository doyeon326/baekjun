package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;


public class Ascii {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine().toUpperCase();
	HashMap<String,Integer> map= new HashMap<String,Integer>();
	String max ="";  
	int value = 0;

	for(int i=0; i<str.length(); i++) {

		   Iterator<String> keys = map.keySet().iterator();
		   if(!keys.hasNext()) {
			   map.put(str.substring(i,i+1),1);
		   }
		   else {
			   map.put(str.substring(i,i+1),1+1);
				   if(value<map.get(str.substring(i,i+1))) {
					   value = map.get(str.substring(i,i+1));
					   max = str.substring(i,i+1);
				   }
//				   else if(value==map.get(str.substring(i,i+1))) {
//					   max="?";
//				   }
		   }
	}
	System.out.println(max);
	
}
}

