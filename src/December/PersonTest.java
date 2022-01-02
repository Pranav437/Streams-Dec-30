package December;

import com.sun.jmx.snmp.internal.SnmpAccessControlModel;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Dave", Arrays.asList(
                Arrays.asList("Java", "C++"),
                Arrays.asList("Linux", "Java"))),
                        new Person("Mike", Arrays.asList(
                                Arrays.asList("JavaScript", "HTML"),
                                Arrays.asList("React", "Node", "Java")))
        );


//
//        Integer reduce = Arrays.asList(1, 2, 4, 7, 9).stream().reduce(1, (a, b) -> a * b);
//        System.out.println(reduce);
//String name = "null";
//        Optional <String> atin = Optional.of(name);
//        System.out.println(Optional.ofNullable(name));
    }
}
