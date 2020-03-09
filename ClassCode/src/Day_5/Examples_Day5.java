package Day_5;

public class Examples_Day5 {
    public static void main(String[] args) {

        CustomHashMap<Integer, String> list = new CustomHashMap<>();
        System.out.println("Before adding anything, check for first index");
        System.out.println("the value at key 1 is: " + list.get(17));
        list.put(17, "eggs");

        System.out.println();
        System.out.println("After adding key 1, check for value at key 1");
        System.out.println("the value at key 1 is: " + list.get(17));

        System.out.println();
        System.out.println("Add more elements");
        list.put(44, "avocado");
        list.put(37, "sweet potatoes");
        list.put(37, "coffee");
        System.out.println("the value at this key is: " + list.get(69));
        System.out.println("the value at this key is: " + list.get(37));
        System.out.println(list.contains(69));
        System.out.println(list.contains(37));
        list.remove(17);
        System.out.println(list.contains(17));



    }
}
