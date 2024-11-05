package company;

import java.util.List;
public class Engineer extends Employee{

    // Add a String[] skills attribute
    private List<String> skills;

    public Engineer(String name, String department, double salary, List<String> skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    //Getter and Setter
    public  List<String> getSkills() {
        return skills;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    //Add a method to add new skills
    public void newSkills(String skill){
        skills.add(skill);
    }

    //Override Method
    @Override
    public String toString() {

        return super.toString()+", Skills: "+ skills;
    }
}
