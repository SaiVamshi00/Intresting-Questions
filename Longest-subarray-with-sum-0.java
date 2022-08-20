class Longest-subarray-with-sum-0{
public static void main(String args[]){
int arr[]={15,-2,2,-8,1,7,10,23};       // the output should be 5.
		int n=8;                            // as the numbers are -2 2 -8 1 7 with sum 0. 
		int i=0,l=0,max=0,s=0;
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(i=0;i<n;i++){
		    s=s+arr[i];
		    if(s==0){                      //if the sum is 0 till that index the numbers have to be counted.
		        max=i+1;
		        l=0;
		    }
		    else{
		        if(hm.containsKey(s))     //if the key is containing the same number in the hashmap 
		        {
		            max=Math.max(max,i-hm.get(s));  // making a count from beginning index to the latest index i
		        }
		        else{
		            hm.put(s,i);         //if not there puting new key with the index.
		        }
		    }
		}
		System.out.println(max);
}
}
