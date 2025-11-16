class testThread{
    private int count = 0;

    public synchronized void  plusCount(){   // thêm synchronized để cho method chỉ được một truy cập trong cùng 1 lúc
        count++;
    }

    public int getCount(){
        return count;
    }
}



public class RaceConditionThread {
    public static void main(String[] args) throws InterruptedException {

        testThread bill = new testThread();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 100000; i++){
                bill.plusCount();
            }
        });

        Thread two = new Thread(() -> {
            for (int j = 0 ; j < 100000; j++){
                bill.plusCount();
            }
        });

        one.start();
        two.start();

        one.join();
        two.join();

        System.out.println(bill.getCount());
    }
}
