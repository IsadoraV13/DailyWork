package Day_5;

public class Examples_Day5 {
    public static void main(String[] args) {

        CustomHashMap<Integer, String> list = new CustomHashMap<>();
        System.out.println("Before adding anything, check first index");
        System.out.println("the value at key 1 is: " + list.get(17)); // null
        list.put(17, "eggs");

        System.out.println();
        System.out.println("After adding key 1, check for value at key 1");
        System.out.println("the value at key 1 is: " + list.get(17)); // eggs

        System.out.println();
        //Adding more elements
        list.put(44, "avocado");
        list.put(37, "sweet potatoes");
        list.put(37, "coffee");
        System.out.println("the value at key 69 is: " + list.get(69)); // null
        System.out.println("the value at key 37 is: " + list.get(37)); // should be coffee
        System.out.println(list.contains(69)); // false
        System.out.println(list.contains(37)); // true
        list.remove(37);
        System.out.println(list.contains(37)); // should be false



    }
}
