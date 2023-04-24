class Nearest_smaller_tower{
	int [] nearestSmallestTower(int [] arr){
		//Write your code here
		int n=arr.length;
		int left[]=new int[n];
		int right[]=new int[n];
		int i,j=0;
		Stack<Integer>s1=new Stack<>();
		Stack<Integer>s2=new Stack<>();
		for(i=0;i<n;i++){
		    j=i;
		    while(j<=i){
		        if(s1.isEmpty()){
		            left[i]=-1;
		            s1.push(i);
		            j++;
		        }
		        else if(arr[s1.peek()]<arr[i]){
		            left[i]=s1.peek();
		            s1.push(i);
		            j++;
		        }
		        else
		        s1.pop();
		    }
		}
	for(i=n-1;i>=0;i--){
	    j=i;
		    while(j>=i){
		        if(s2.isEmpty()){
		            right[i]=-1;
		            s2.push(i);
		            j--;
		        }
		        else if(arr[s2.peek()]<arr[i]){
		            right[i]=s2.peek();
		            s2.push(i);
		            j--;
		        }
		        else
		        s2.pop();
		    }
	}
// 	System.out.println("left:");
// 	for(int k=0;k<n;k++)
// 	System.out.print(left[k]+" ");
// 	System.out.println();
// 	System.out.println("right:");
// 	for(int k=0;k<n;k++)
// 	System.out.print(right[k]+" ");
	int ans[]=new int[n];
// 	System.out.println();
	for(i=0;i<n;i++){
	    if(left[i]==-1&&right[i]==-1)
	    ans[i]=-1;
	    else if(right[i]!=-1&&left[i]!=-1&&Math.abs(i-left[i])<Math.abs(i-right[i])){
	        ans[i]=left[i];
	    }
	    else if(right[i]!=-1&&left[i]!=-1&&Math.abs(i-left[i])>Math.abs(i-right[i]))
	    ans[i]=right[i];
	    else{
	     if(left[i]==-1)
	     ans[i]=right[i];
	     else if(right[i]==-1)
	     ans[i]=left[i];
	     else if(arr[left[i]]==arr[right[i]])
	     ans[i]=Math.min(left[i],right[i]);
	     else if(arr[left[i]]<arr[right[i]])
	     ans[i]=left[i];
	     else
	     ans[i]=right[i];
	    }
	}
	return ans;
		
	}
}
