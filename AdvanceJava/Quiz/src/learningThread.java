class Thread1 extends Thread{
    public void run(){
        for (int i = 0; i <= 1000 ; i++){
            System.out.println("Tao là tao ");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0; i <= 1000; i++){
            System.out.println("Luôn tự tin ở nơi đông người");
        }
    }
}



public class learningThread {
    public static void main(String [] args){
        Thread one = new Thread1();
        Thread two = new Thread2();
                                        // Cả hai luồng đều đang chạy song song với nhau
        one.start();
        two.start();

    }
}
