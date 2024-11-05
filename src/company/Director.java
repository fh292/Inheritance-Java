package company;

public class Director extends Employee {

    //Add a double budget attribute
    private double budget;

    public Director(String name, String department, double salary, double budget) {
        super(name, department, salary);
        this.budget = budget;
    }

    //Getter and Setter
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }

    //Add a method to allocate budget to his departments
    public void allocateBudget(){

    }

    //Override Method
    @Override
    public String toString() {
        return super.toString() + ", Budget: " + budget ;
    }
}
