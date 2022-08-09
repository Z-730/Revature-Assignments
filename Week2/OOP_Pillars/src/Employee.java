public class Employee {
    String name;
    String username;
    String password;

    public Employee(){
        this.name = null;
        this.username = null;
        this.password = null;
    }

    public Employee(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void speak(){
        System.out.println("I am just an employee!");
    }

    public void speak(String name){
        System.out.println(name + " is just an employee!");
    }


}
