//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Edwin");
        e.setID(2);
        e.setSalary(30000);


        Cars car1 = new Cars("Toyota", 2022, "Harrier");

        System.out.println("Type: " + car1.getType() + "  Make: " + car1.getMake() + "  Year: " + car1.getYear());

        System.out.println("After updating the make");

        car1.setType("Fielder");

        System.out.println("Type: " + car1.getType() + "  Make: " + car1.getMake() + "  Year: " + car1.getYear());



        System.out.println("________________________________________________________________");



        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getID());
        System.out.println("Salary: "+e.getSalary());



    }
}