import java.util.ArrayList;

public class InnerClass {
    public static void main(String [] args){
        innerTest bill = new innerTest();
        bill.showAge();

        innerTest.innerClass thisIsInner = bill.new innerClass();
        thisIsInner.showInner();
        ArrayList<innerTest> bil = new ArrayList();
        bil.add(bill);

    }
}

class innerTest{
    int ageBill = 18;

    public void showAge(){
        System.out.println(ageBill);
    }

    class innerClass{
        public void showInner(){
            System.out.println("This code from InnerClass");
        }
    }
}
