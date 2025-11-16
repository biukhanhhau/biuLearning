class ThreadOnee extends Thread{
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("I love you!!!");
        }
    }
}


class ThreadTwoo extends Thread{
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("But I already have a bf :<");
        }
    }
}

public class checkPriorityThread {
    public static void main(String [] args){
        Thread one = new ThreadOnee();
        Thread two = new ThreadTwoo();

        one.setPriority(10);
        two.setPriority(1);
        System.out.println(one.getPriority());
        one.start();
        two.start();
    }
}
