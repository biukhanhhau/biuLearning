import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class learningSet {
    public static void main(String [] args ){
        Set<Integer> nums = new HashSet();
        nums.add(654);
        nums.add(361);
        nums.add(136);
        nums.add(711);

        Set<Integer> tree = new TreeSet();
        tree.add(2313);
        tree.add(8722);
        tree.add(1541);
        tree.add(6123);
        tree.add(5413);

        for(int n : nums){
            System.out.println(n);
        }

        for(int n : tree){
            System.out.println(n);
        }
    }
}
