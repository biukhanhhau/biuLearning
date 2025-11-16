import java.util.List;
import java.util.ArrayList;
class Studentt{
    private int age;
    private String name;

    public Studentt() {
    }

    public Studentt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


public class constructorRef {
    public static void main(String [] args){
        List<String> studentsName = new ArrayList();
        studentsName.add("Bill");
        studentsName.add("Son");
        studentsName.add("Cao");
        studentsName.add("Fat");
        studentsName.add("Bink");

        List<Studentt> studentList = studentsName.stream()
                .map(Studentt::new)
                .toList();

        List<Studentt> studentListt = studentsName.stream()
                .map(name -> new Studentt(name))
                .toList();

        for(Studentt n : studentList){
            System.out.println(n.getName());
        }
    }
}
