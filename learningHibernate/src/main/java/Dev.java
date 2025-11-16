import jakarta.persistence.*;

import java.util.List;

@Entity
public class Dev {
    @Id
    private int id;
    private String name;
    private int age;
    private int exYear;
    @OneToMany
    private List<Laptop> laptops;



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

    public int getExYear() {
        return exYear;
    }

    public void setExYear(int exYear) {
        this.exYear = exYear;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", exYear=" + exYear +
                ", laptops=" + laptops +
                '}';
    }
}
