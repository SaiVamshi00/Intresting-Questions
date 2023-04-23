//User function Template for Java
class Smaller-Sum
{
    public long[] smallerSum(int n,int arr[])
    {
        int i;
        int cp[]=new int[n];
        long p_sum[]=new long[n];
        for(i=0;i<n;i++)
        cp[i]=arr[i];
        Arrays.sort(cp);
        Arrays.fill(p_sum,0);
        p_sum[0]=cp[0];
        
        for(i=1;i<n;i++){
            p_sum[i]=p_sum[i-1]+cp[i];
        }
        // for(i=0;i<n;i++)
        // System.out.print(p_sum[i]+" ");
        // System.out.println();
        long actual[]=new long[n];
        actual[0]=0L;
        for(i=1;i<n;i++){
            if(cp[i-1]==cp[i]){
                actual[i]=actual[i-1];
            }
            else{
                actual[i]=p_sum[i-1];
            }
        }
        // for(i=0;i<n;i++)
        // System.out.print(actual[i]+" ");
        // System.out.println();
        long ans[]=new long[n];
        for(i=0;i<n;i++){
            int ele=arr[i];
            int l=0,h=n-1;
            while(l<=h){
                int mid=(l+h)/2;
                if(ele==cp[mid]){
                ans[i]=actual[mid];
                break;
                }
                else if(cp[mid]>ele)
                h=mid-1;
                else
                l=mid+1;
            }
        }
        return ans;
    }
}
