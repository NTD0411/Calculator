package calculator;
public class Calculator {

       public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return a / b;
    }
    public long getFactorial(int n) {
          if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
        if( n  == 0 || n == 1)
            return  1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
            return  product;
    }
    
}
