public class Main {
    public static void main(String[] args) {
        Employee newEmployee = new Employee("Morty", "notSanchez", "easypass");

        newEmployee.speak();
        newEmployee.speak(newEmployee.getName());

        Manager newManager = new Manager("Rick", "C-137(Rick)", "written in a notepad. no one knows where it is!", "unknown", "000-000-0000", 1000000000);

        System.out.println("\n");

        newManager.speak();
        newManager.speak(newManager.getName());
        System.out.println(newManager.toString());

        System.out.println("\nRick's super secret password password: " + newManager.getPassword());

    }
}
