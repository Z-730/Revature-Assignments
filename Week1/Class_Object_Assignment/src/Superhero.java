public class Superhero {
    String name;
    String publisher;
    String origin;
    double hp;
    int stamina;

    public Superhero (String name, String publisher){
        this.name = name;
        this.publisher = publisher;
        this.origin = "unknown";
        this.hp = 0;
        this.stamina = 0;
    }

    public Superhero (String name, String publisher, String origin, double hp, int stamina) {
        this.name = name;
        this.publisher = publisher;
        this.origin = origin;
        this.hp = hp;
        this.stamina = stamina;
    }

    public void setOrigin(String newOrigin){
        this.origin = newOrigin;
    }

    public void setHP (double newHP){
        this.hp = newHP;
    }

    public void setStamina (int newStamina){
        this.stamina = newStamina;
    }
    public String getOrigin(){
        return this.origin;
    }

    public double getHP(){
        return this.hp;
    }

    public void checkStatus(){
        System.out.println("Checking " + this.name + "'s status....");

        if(this.stamina > 0){
            System.out.println("I am invincible!!!");
        }else{
            System.out.println("xxxDEADxxx");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Superhero)) return false;

        Superhero other = (Superhero) obj;

        if(!this.name.equals(other.name)) return false;
        if(!this.publisher.equals(other.publisher)) return false;
        if(!this.origin.equals(other.origin)) return false;

        if(this.hp != other.hp) return false;
        if(this.stamina != other.stamina) return false;

        return true;
    }
}

