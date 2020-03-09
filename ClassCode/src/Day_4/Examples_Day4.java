package Day_4;

import java.util.function.IntSupplier;
import java.util.function.Predicate;

public class Examples_Day4 {
    public static void main(String[] args) {
        //Creating Lambdas
        InterfaceOne obj1 = (int a, int b) -> a / (b + 1);
        int resultOne = obj1.divide(5, 0);
        System.out.println("Result 1: " + resultOne);

        InterfaceOne obj1_2 = (int a, int b) -> a / (b + 1);
        int resultOne_Two = obj1_2.divide(7, 2);
        System.out.println("Result 1_2: " + resultOne_Two);

        InterfaceTwo obj2 = (String str) -> System.out.println("This string contains: " + str);
        System.out.print("Result 2: ");
        obj2.print("these words");

        InterfaceTwo obj2_2 = (String str) -> System.out.println("This string contains: " + str);
        System.out.print("Result 2_2: ");
        obj2_2.print("these other words");

        InterfaceThree obj3 = (int a, Integer b) -> a * b;
        int resultThree = obj3.multiply(5, 1);
        System.out.println("Result 3: " + resultThree);

        InterfaceThree obj3_2 = (int a, Integer b) -> a * b;
        int resultThree_Two = obj3_2.multiply(56, 657);
        System.out.println("Result 3_2: " + resultThree_Two);

        InterfaceFour obj4 = (String s, int x) -> Integer.parseInt(s) + x;
        int resultFour = obj4.add("7", 7);
        System.out.println("Result 4: " + resultFour);

        InterfaceFour obj4_2 = (String s, int x) -> Integer.parseInt(s) + x;
        int resultFour_Two = obj4_2.add("86", 78);
        System.out.println("Result 4_2: " + resultFour_Two);

        InterfaceFive<Double, Integer> obj5 = (Double t, Integer j) -> t.intValue() + j;
        int resultFive = obj5.calc(7.2, 7);
        System.out.println("Result 5: " + resultFive);


        // Comparing this to using a Java Functional Interface (below)
        // create new object of our interface (defining what object types it takes, if a Generic interface is used)
        // then before ->, declare the variable
        // after ->, define method body. This needs to return the type defined in the interface method
        InterfaceFive<Double, Integer> obj5_2 = (Double t, Integer j) -> t.intValue() + j; // -> defines method body within Lamda
        int resultFive_Two = obj5_2.calc(555.789, 6); // don't drop then pen; assign the result to a variable
        System.out.println("Result 5_2: " + resultFive_Two);

        // Lamda using Predicate
        // also starts with creating new object of the chosen FI, and defining the object type/s it takes if Generic
        // then before ->, declare the variable (must be the type defined in the FI, if there is one)
        // after ->, define method body. Needs to return type defined in FI, e.g. boolean here
        Predicate<Integer> obj6 = (Integer p) -> {
            if( p > 10) // defines method body (in this case on several lines)
                return true;
            return false;
        }; //if curly brackets are used, remember to add semi colon after
        boolean predicateResult = obj6.test(13);
        System.out.println("Result 6: " + predicateResult); // should be true

        // Static method reference
        // Example1
        Predicate<Integer> obj7 = PredicateTest::isThisTrue;
        boolean thisResult = obj7.test(3); //must take in and return same types as FI (in this case return is defined
        // but input parameter is Generic)
        System.out.println("Result 7: " + thisResult);  //should be false

        // Example2
        IntSupplier obj8 = CreateInt::gimmeAnInt;
        int newInt = obj8.getAsInt();
        System.out.println("Result 8: " + newInt);

        // Instance method reference
        NonStaticPredicateTest nonStaticObj = new NonStaticPredicateTest();
        Predicate<Integer> newObj = nonStaticObj::isThisAlsoTrue;
        boolean thisOtherResult = newObj.test(3);
        System.out.println("Result 9: " + thisOtherResult); // should be false

    }
}


