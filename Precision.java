public static void plusMinus(List<Integer> arr) {
    // Write your code here
int pos=0,neg=0,zero=0;
for(int i=0;i<arr.size();i++){
    if(arr.get(i)==0)
    zero++;
    else if(arr.get(i)>0)
    pos++;
    else
    neg++;
}
double a=(double)pos/arr.size();
double b=(double)neg/arr.size();
double c=(double)zero/arr.size();
System.out.println(String.format("%.6f",a));
System.out.println(String.format("%.6f",b));
System.out.println(String.format("%.6f",c));
    }

}
