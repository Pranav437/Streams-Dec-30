package December;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonNew {
    private String name;
    private Date birthdate;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy");

    public PersonNew(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;

    }

    @Override
    public String toString() {
        return "PersonNew{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", format=" + format +
                '}';
    }
}
