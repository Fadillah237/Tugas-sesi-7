import java.util.ArrayList;

public class Lists {
    public static void list() {
        System.out.println("List");

        java.util.List<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Kurniawan");
        names.add("Khanedy");

        names.set(0, "Kurniawan");


        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));


        System.out.println();
    }
    
}