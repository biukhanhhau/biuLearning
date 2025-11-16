import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamAPI {
    public static void main(String [] args){
        List<Integer> nums = new ArrayList();
        nums.add(89);
        nums.add(74);
        nums.add(42);
        nums.add(34);
        nums.add(12);

        List<Integer> result = nums.stream()
                .filter(name -> name > 40)
                .map(name -> name*2)
                .toList();

        System.out.println(result);

        // Tạo một HashMap
        Map<String, Integer> userMap = Map.of(
                "An", 19,
                "Bao", 25,
                "Chi", 30
        );

// Dây chuyền Stream (dùng .entrySet())
        List<String> results = userMap.entrySet().stream() // Stream các cặp (Entry)
                .filter(entry -> entry.getValue() > 20)     // 1. Lọc (theo Value là Tuổi)
                .map(entry -> entry.getKey())               // 2. Biến đổi (chỉ lấy Key là Tên)
                .collect(Collectors.toList());              // 3. Thu thập

        System.out.println(results); // Kết quả: [Bao, Chi]

    }
}
