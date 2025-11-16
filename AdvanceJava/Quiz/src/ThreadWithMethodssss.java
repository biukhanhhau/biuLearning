class bestThread implements Runnable{     // extend Thread hoặc implements Runnable đều được
    public void run(){                    // Để chạy được nhiều methods con trong một class đa luồng
        bill();                           // Phải gộp tất cả các methods con vào  trong method run!!!
        one();
        two();
        three();
    }

    private void bill(){
        System.out.println();
    }
    private void one(){
        System.out.println("Program is thinking..");
        try{Thread.sleep(3000);}
        catch(Exception e){}
    }
    private void two(){
        System.out.println("Thinking done!!!");
        try{Thread.sleep(1000);}
        catch(Exception a){}
        System.out.println("Accessing Bill's brain......");
        try{Thread.sleep(3000);}
        catch(Exception b){}
    }
    private void three(){
        System.out.println("We are in Bill's brain!!!!");
    }
}


public class ThreadWithMethodssss {
    public static void main(String [] args){
        bestThread startThread = new bestThread();
        Thread startt = new Thread(startThread);

        startt.start();
    }
}
