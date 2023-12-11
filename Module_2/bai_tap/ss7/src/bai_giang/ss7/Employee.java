package ss6;

public abstract class Employee extends Person {
    private float salary;

    public Employee() {
    }
    public Employee(float salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }
    public abstract void getBonus();
    @Override
    public void howToGo() {
        System.out.println("đi bằng xe đạp");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id= " + super.getId()+
                "name= "+ super.getName()+
                "salary=" + salary +
                '}';
    }
}
