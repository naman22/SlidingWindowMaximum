package oops.exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        try {
            int a = 5, b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage()+" occurred");
        }
    }
}
