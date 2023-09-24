package Sept2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindDuplicatesInAnArray {
	 public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	        HashSet<Integer>  h1=new HashSet<>();
	        HashSet<Integer>  h2=new HashSet<>();
	        ArrayList<Integer>  a=new ArrayList<>();
	      for(int i=0;i<n;i++){
	          if(!h1.contains(arr[i]))
	            h1.add(arr[i]);
	          else
	            h2.add(arr[i]);
	      }
	      for(int i:h2)
	        a.add(i);
	      if(a.isEmpty())
	        a.add(-1);
	      Collections.sort(a);
	      return a;
	      
	    }
}
