//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Edwin");
        e.setID(2);
        e.setSalary(30000);

        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getID());
        System.out.println("Salary: "+e.getSalary());

    }
}