package oops.exceptionHandling;

public class throwAndThrows {
    public static void main(String[] args) {
        fun();
    }
    static void fun(){
        int a=5,b=3;
        int c=a/b;
        System.out.println(c);
        try{
            fun2();
        }
        catch (Exception e){
            System.out.println(e.getMessage()+" occurred");
        }
    }
    static void fun2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger=true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger was coming");
        }
    }
}
