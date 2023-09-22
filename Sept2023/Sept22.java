package Sept2023;

import java.util.ArrayList;

public class Sept22 {
	
	    ArrayList<Integer> find(int arr[], int n, int x)
	    {
	        // code here
	        ArrayList<Integer> a =new ArrayList<>();
	        int flag=0;
	        
	        for(int i=0;i<n;i++){
	            if(arr[i]==x){
	                flag=1;
	                a.add(i);
	                break;
	            }
	        }
	        if(flag==0)
	          a.add(-1);
	         
	        for(int i=n-1;i>=0;i--){
	            if(arr[i]==x){
	                flag=1;
	                a.add(i);
	                break;
	            }
	        }
	        if(flag==0)
	          a.add(-1);
	         return a;
	    }
}



