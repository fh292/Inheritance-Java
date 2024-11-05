package company;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emily = new Employee("Emily", "Finance", 50000);
        Manager john = new Manager("John", "IT", 75000, 5);
        Intern dave = new Intern("Dave", "Marketing", 30000, "State University");
        Director jospeh = new Director("Joseph", "HR", 1500, 3800);

        List <String> engineerSkills = new ArrayList<>();
        engineerSkills.add("Java");
        engineerSkills.add("Python");
        engineerSkills.add("C++");

        Engineer alice = new Engineer("Alice", "Production", 40000, engineerSkills);
        SalesPerson andrew = new SalesPerson("Andrew", "PR", 2000, 900 );

        System.out.println(emily);
        System.out.println(john);
        System.out.println(dave);
        System.out.println(jospeh);
        System.out.println(alice);
        System.out.println(andrew);

    }
}