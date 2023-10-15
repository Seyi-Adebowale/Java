class Factorial{
   public static void main(String [] args){
    int answer = fact(5);
    System.out.println(answer);
   } 

   public static int fact(int n){
    if (n > 0){
        return n * fact(n-1);
    }else{
        return 1;
    }
   }
}