import java.util.HashMap;
import java.util.Map;

public class learningHashMap {
    public static void main(String [] args ){
        Map<Integer , String> bill = new HashMap();
        bill.put(28, "Hòa Bình");
        bill.put(34, "Hải Dương");
        bill.put(35, "Ninh Bình");
        bill.put(36, "Thanh Hóa");
        bill.put(37, "Nghệ An");
        bill.put(38, "Hà Tĩnh");
        bill.put(43, "TP. Đà Nẵng");
        bill.put(47, "Đắk Lắk");
        bill.put(48, "Đắk Nông");
        bill.put(49, "Lâm Đồng");
        bill.put(61, "Bình Dương");
        bill.put(62, "Long An");
        bill.put(63, "Tiền Giang");

        System.out.println(bill.get(62));
        System.out.println(bill.keySet());

        for(int n : bill.keySet()){
            System.out.println("Số xe " + n + " là tỉnh " + bill.get(n));
        }
    }
}
