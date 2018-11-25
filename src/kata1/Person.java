package kata1;

import java.time.LocalDate;


public class Person {

    private final String name;
    private final LocalDate birthdate;
    
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return birthdate.until(LocalDate.now()).getYears();
    }
}
