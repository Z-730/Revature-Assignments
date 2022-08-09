public class Manager extends Employee {
    private String dob;
    private String ssn;
    private double salary;

    public Manager(String name, String username, String password, String dob, String ssn, double salary) {
        super(name, username, password);
        this.dob = dob;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void speak(){
        System.out.println("I am a manager..... which also makes me an employee.");
    }

    public void speak(String name){
        System.out.println(name + " is a manager!");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "dob='" + dob + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }
}
