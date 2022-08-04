public class SuperHeroExampleObject {
    public static void main(String[] args) {
        Superhero hero1 = new Superhero("Batman", "DC");
        Superhero hero2 = new Superhero("Ironman", "Marvel");

        // Checking original stats
        System.out.println("Hero 1 name: " + hero1.name);
        System.out.println("Hero 1 origin: " + hero1.getOrigin());

        System.out.println();

        System.out.println("Hero 2 name: " + hero2.name);
        System.out.println("Hero 2 origin: " + hero2.getOrigin());

        System.out.println();

        // Updating stats
        hero1.setOrigin("Gotham");
        hero1.setStamina(44);
        hero2.setHP(99);

        // Checking updated stats
        System.out.println("Hero 1 updated origin: " + hero1.getOrigin());

        System.out.println();

        System.out.println("Hero 2 updated HP: " + hero2.getHP());

        System.out.println();

        // Checking if hero is Dead or Alive
        hero1.checkStatus();
        hero2.checkStatus();

        // Checking new .equals method

        Superhero hero3 = new Superhero("Hulk", "Marvel", "Dayton", 101, 200);
        Superhero hero4 = new Superhero("Hulk", "Marvel", "Dayton", 101, 200);

        System.out.println();

        if(hero3.equals(hero4)){
            System.out.println("Same characters!");
        } else{
            System.out.println("Not the same characters.");
        }

        if(hero3.equals(hero1)){
            System.out.println("Same characters!");
        } else{
            System.out.println("Not the same characters.");
        }
    }
}
