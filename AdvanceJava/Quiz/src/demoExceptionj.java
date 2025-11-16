public class demoExceptionj {
    public static void main(String [] args) {
        int i = 2, j = 0;
        int[] bill = new int[3];
        try {
            j = 20 / 2;
            System.out.println(bill[3]);
        }
        catch (ArithmeticException e) {
            System.out.println("Something went wrong");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println( "Know your limited"); // For catching each of Exception, have to use multi-catches.
        }
        System.out.println(j);
    }
}
