class Specialsubsets
{
  
public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        //code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        // Collections.sort(A);
        helper(A,0,ans,ds);
        // System.out.println("size:"+ans.size());
        //for sorting 
        Collections.sort(ans, (o1, o2) -> {
            int n = Math.min(o1.size(), o2.size());
            for (int i = 0; i < n; i++) {
                if (o1.get(i) == o2.get(i)) {
                    continue;
                }
                else {
                    // sort based on the unequal elements value
                    return o1.get(i) - o2.get(i);
                }
            }
            // sort based on size
            return o1.size() - o2.size();
        });
        return ans;
    }
    public static void helper(ArrayList<Integer> arr,int index,ArrayList<ArrayList<Integer>> ans,
    ArrayList<Integer>ds){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.size();i++){
            ds.add(arr.get(i));
            helper(arr,i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
//my output
//  1 2 3
// 1 2
// 1 3
// 1
// 2 3
// 2
// 3
 // expected output
//  1
// 1 2               To reach expected out put we need to sort inner arraylist based on size of it aswell lexographical order also.
// 1 2 3             To do it we need follow the code from 13 to 26.
// 1 3               It is quite helpfull in most of the cases even.
// 2
// 2 3
// 3
