//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"Harry", "Ron", "Hermione"};

        String[] reverseStringArray = new String[stringArray.length];

        int counter = stringArray.length - 1;
        for(int i = 0; i < stringArray.length; i++){
            reverseStringArray[i] = stringArray[counter-i];
        }

        System.out.println("Printing reverseArray:");
        for(int j = 0; j < stringArray.length; j++){
            System.out.print(reverseStringArray[j] + " ");
        }

        System.out.println("\n\nPrinting reverseArray backwards:");

        for(int k =0; k < stringArray.length; k++){
            System.out.print(new StringBuilder(reverseStringArray[k]).reverse().toString() + " ");

        }

    }
}
