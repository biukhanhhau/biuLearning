class testOne extends Thread{
    public void run(){
        for (int i = 0; i <= 100; i++){
            System.out.println("I love you");
        }
    }
}

class testTwo implements Runnable{
    public void run(){
        for (int i = 0; i <= 100; i++){
            System.out.println("I dont love you anymore :<");
            bill();
        }
    }
    public void bill(){
        System.out.println("I am gayyy");
    }
}

public class ThreadReview {
    public static void main(String [] args){
        Thread one = new testOne();

        testTwo testTwo = new testTwo();
        Thread two = new Thread(testTwo);
        one.setPriority(10);
        one.start();
        two.start();
    }
}
