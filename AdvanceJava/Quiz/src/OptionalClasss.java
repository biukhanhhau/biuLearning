import java.util.Arrays;
import java.util.List;

public class OptionalClasss {
    public static void main(String [] args){
        List<String> names = Arrays.asList("Thach", "Bill", "Son", "Cao");

        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not found");          // use this to handle the exception
        System.out.println(name);        // or can use it in sout(name.orElse("")) after swap name into Optional<String> name
    }
}
