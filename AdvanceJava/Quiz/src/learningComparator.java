import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Normal Sort:        Collections.sort(ArrayListName);
public class learningComparator {
    public static void main(String [] args){
        List<Integer> nums = new ArrayList();
        nums.add(427);
        nums.add(745);
        nums.add(645);
        nums.add(563);
        nums.add(155);

        System.out.println(nums);

        Comparator<Integer> billSort = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                if (i % 10 > j % 10){
                    return 1;
                }
                else if ( i% 10 < j%10){
                    return -1;
                }
                return 0;
            }
        };

        Collections.sort(nums, billSort);
        System.out.println(nums );

        List<Student> student= new ArrayList<>();
        student.add(new Student(12,"John"));
        student.add(new Student(21,"Navin"));
        student.add(new Student(18,"Parul"));
        student.add(new Student(20,"Kiran"));

        Comparator<Student> biuSort = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if(i.getAge() > j.getAge()){
                    return 1;
                }
                else if(i.getAge() < j.getAge()){
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(student, biuSort);
        for(Student s : student){
            System.out.println(s.getAge());
        }
        Comparator<Student> billFilter = new Comparator<Student>(){
            public int compare(Student i, Student j){
                if ( i.getAge() > j.getAge()){
                    return -1;
                }
                else if ( i.getAge() < j.getAge()){
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(student, billFilter);
        List<Student> bill = student.stream()
                .toList();

        bill.forEach(n -> System.out.println(n.getAge()));

    }
}



class Student{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }
}