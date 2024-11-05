package company;

public class SalesPerson extends Employee{

    //Add an int salesTarget attribute
    private int salesTarget;

    public SalesPerson(String name, String department, double salary, int salesTarget) {
        super(name, department, salary);
        this.salesTarget = salesTarget;
    }

    //Getter and Setter
    public int getSalesTarget() {
        return salesTarget;
    }
    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }

    //Add a method to update the sales target
    public void updateSalesTarget(int salesTarget) {

    }

    //Override Method
    @Override
    public String toString() {
        return super.toString() + "Sales Target: " + salesTarget;
    }
}
