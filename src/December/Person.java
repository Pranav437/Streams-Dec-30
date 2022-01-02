package December;

import java.util.List;

class Person {
private String name;
private List<List<String>> courses;

    public Person(String name, List<List<String>> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<List<String>> getCourses() {
        return courses;
    }
}
