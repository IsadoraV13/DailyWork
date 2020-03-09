package Day_5;

public class Examples_Day5 {
    public static void main(String[] args) {

        CustomHashMap<Integer, String> list = new CustomHashMap<>();
        System.out.println("Before adding anything, check first index");
        System.out.println("the value at key 1 is: " + list.get(17)); // null
        System.out.println("counter is " +list.counter);
        list.put(17, "eggs");

        System.out.println();
        System.out.println("After adding key 1, check for value at key 1");
        System.out.println("the value at key 1 is: " + list.get(17)); // eggs
        System.out.println("counter is " +list.counter);
        System.out.println("length of array: " + list.map.length);
        System.out.println();

        //Adding more elements
        list.put(44, "avocado");
        list.put(25, "x");
        list.print();
        System.out.println("length of array after element 3: " + list.map.length);
        list.put(67, "y");
        list.put(89, "z");
        list.put(24, "zz");
        list.put(56, "zzz");
        list.put(37, "sweet potatoes");
        System.out.println("length of array: " + list.map.length);
        System.out.println("counter before adding coffee is " +list.counter);
        list.print();
        list.put(37, "coffee");
        System.out.println("counter after coffee is " +list.counter);
        list.print();
        System.out.println();

        list.remove(25);
        list.remove(67);
        list.remove(89);
        list.remove(24);
        list.remove(56);
        System.out.println("length of array after mass removal: " + list.map.length);
        list.print();
        System.out.println();

        System.out.println("the value at key 69 is: " + list.get(69)); // null
        System.out.println("the value at key 37 is: " + list.get(37)); // should be coffee
        System.out.println(list.contains(69)); // false
        System.out.println(list.contains(37)); // true
        list.remove(37);
        list.remove(79);
        System.out.println("counter after removing coffee is " +list.counter);
        System.out.println(list.contains(37)); // should be false
        System.out.println("length of array after coffee: " + list.map.length);





    }
}
