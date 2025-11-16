class threadOne implements Runnable{
        public void run(){
            for(int i = 0; i <= 1000; i++){
            System.out.println("I love you!!!");
        }
    }
}


class threadTwo implements Runnable{
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("But I already have a bf :<");
        }
    }
}

public class checkkPriorityThread {
    public static void main(String [] args){
        threadOne one = new threadOne();
        threadTwo two = new threadTwo();

        Thread onee = new Thread(one);
        Thread twoo = new Thread(two);

        onee.start();
        twoo.start();
    }
}
