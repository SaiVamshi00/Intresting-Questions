class No-of-doors-open {
    static int noOfOpenDoors(Long N) {
        // code here
        int i,cnt=0,j,n=Math.toIntExact(N); // best way to convert Long to int
        int arr[]=new int[n+1];
        Arrays.fill(arr,1);
        for(i=2;i<=n;i++){
            for(j=i;j<=n;j=j+i){
                if(arr[j]==1)
                arr[j]=0;
                else
                arr[j]=1;
            }
        }
        for(i=1;i<=n;i++){
            if(arr[i]==1)
            cnt++;
        }
        return cnt;
    }
};             
