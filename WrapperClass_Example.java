public class WrapperClass_Example {
    public static void main(String[] args) {
        // Using Integer wrapper class
        Integer intObject1 = new Integer(42); // Creating an Integer object
        Integer intObject2 = 27; // Autoboxing - converting int to Integer implicitly

        // Using Double wrapper class
        Double doubleObject1 = new Double(3.14); // Creating a Double object
        Double doubleObject2 = 2.718; // Autoboxing - converting double to Double implicitly

        // Using Character wrapper class
        Character charObject1 = new Character('A'); // Creating a Character object
        Character charObject2 = 'B'; // Autoboxing - converting char to Character implicitly

        // Using Boolean wrapper class
        Boolean boolObject1 = new Boolean(true); // Creating a Boolean object
        Boolean boolObject2 = false; // Autoboxing - converting boolean to Boolean implicitly

        // Using wrapper classes in a collection (ArrayList)
        java.util.ArrayList<Integer> integerList = new java.util.ArrayList<>();
        integerList.add(10); // Autoboxing - converting int to Integer implicitly
        integerList.add(20); // Autoboxing - converting int to Integer implicitly

        // Unboxing - converting Integer to int implicitly
        int sum = integerList.get(0) + integerList.get(1);

        // Printing the results
        System.out.println("Integer Objects: " + intObject1 + ", " + intObject2);
        System.out.println("Double Objects: " + doubleObject1 + ", " + doubleObject2);
        System.out.println("Character Objects: " + charObject1 + ", " + charObject2);
        System.out.println("Boolean Objects: " + boolObject1 + ", " + boolObject2);
        System.out.println("Sum of Integers: " + sum);
    }
}

