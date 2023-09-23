package Sept2023;

public class Sept23 {
	public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        int pos=0;
        long lsum=0;
        long rsum=0;
        long sum=0;
        
        for(int i=0;i<n;i++){
            pos=i+1;
            sum+=arr[i];
            lsum=sum-arr[i];
            rsum=total-sum;
            if(lsum==rsum)
              return pos;
        }
        return -1;
	}   
        
}
