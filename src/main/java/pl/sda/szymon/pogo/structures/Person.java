package pl.sda.szymon.pogo.structures;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;

    @Override
    public int compareTo(Person person){
        return Integer.compare(age, person.getAge());
    }
}
