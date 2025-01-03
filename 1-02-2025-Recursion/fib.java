public class fib{
  public static void main(String[] args){
    System.out.println(fib(46));
  }

  public static int fib(int n){
    if (n < 2){
      return n;
    }
    else{
      return fib(n-1)+fib(n-2);
    }
  }
}

// 46 is the limit for under 10 seconds
// 46 is also the limit for no integer overflow
