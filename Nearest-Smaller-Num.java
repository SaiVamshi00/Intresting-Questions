
import java.util.*;
public class Nearest-Smaller-Num
{
	public static void main(String[] args) {
		int arr[]={4,10,5,8,20,15,3,12};
		 //ouput: -1 4 4 5 8  8 -1  3
		int i;
		int n=arr.length;
		Stack<Integer>st=new Stack<>();
		int ans[]=new int[arr.length];
		int j=0;
		for(i=0;i<n;i++){
		    j=i;
		    while(j<=i){
		    if(st.isEmpty()){
		        ans[i]=-1;
		        st.push(arr[i]);
		        j++;
		    }
		    else if(st.peek()<arr[i]){
		        ans[i]=st.peek();
		        st.push(arr[i]);
		        j++;
		    }
		    else
		    st.pop();
		    }
		}
		for(i=0;i<n;i++)
		System.out.print(ans[i]+" ");
	}
}
