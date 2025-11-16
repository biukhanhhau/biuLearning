import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    public int sId;
    public String sName;
    public int sAge;

    public Student(){};

    public Student(int sId, String sName, int sAge) {
        this.sId = sId;
        this.sName = sName;
        this.sAge = sAge;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsId() {
        return sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }
}
