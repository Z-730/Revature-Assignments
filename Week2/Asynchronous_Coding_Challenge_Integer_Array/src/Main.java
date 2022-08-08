public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] reverseArray = new int[10];


        System.out.println("Printing intArray:");
        for(int i = 0; i < 10; i++){
            System.out.print(intArray[i] + " ");
        }

        // Reversing the intArray

        // Counter to keep track of original array index
        int counter = intArray.length - 1;
        for(int j = 0; j < intArray.length; j++){
            reverseArray[j] = intArray[counter-j];
        }

        System.out.println("\n\nPrinting reverseArray:");
        for(int k = 0; k < reverseArray.length; k++){
            System.out.print(reverseArray[k] + " ");
        }

    }
}
