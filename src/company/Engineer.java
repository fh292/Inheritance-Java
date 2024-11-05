package company;

import java.util.Arrays;

public class Engineer extends Employee{

    // Add a String[] skills attribute
    private String[] skills;

    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    //Getter and Setter
    public String[] getSkills() {
        return skills;
    }
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    //Add a method to add new skills
    public void newSkills(){

    }

    //Override Method
    @Override
    public String toString() {
        return super.toString()+"Skills: "+ Arrays.toString(skills);
    }
}
