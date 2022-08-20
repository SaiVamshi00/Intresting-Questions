class  BigintegerProgram{
  static  String findSum(String X, String Y) {
        // code here
        java.math.BigInteger sumx=new java.math.BigInteger(X);        // input 23 and 25 in terms of strings
        java.math.BigInteger sumy=new java.math.BigInteger(Y);        //output 48
        java.math.BigInteger ans=sumx.add(sumy);                      //We have used BigInteger because it can take 1000 lines of integer also and can added to another
        String s=ans.toString();                                      //integer . whereas a long variable cannot handle huge numbers .
        return s;                                                     //to add two numbers we have to use add function.
    }
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    String x= sc.next();
    String y=sc.next();
    String ans=findsum(x,y);
    System.out.println(ans);
  }
}
