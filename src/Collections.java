import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Collections {
    static Collection<String> names = new ArrayList<>();

    static void addCollections() {
        System.out.println(" Add Collections");

        names.add("Eko");
        names.add("Kurniawan");
        names.addAll(Arrays.asList("Ihsan", "Akbar"));

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
    }

    static void removeCollection() {
        System.out.println("Remove Collection");

        names.add("Eko");
        names.add("Kurniawan");
        names.addAll(Arrays.asList("Ihsan", "Akbar"));

        names.remove("Eko");
        names.removeAll(Arrays.asList("Ihsan", "Akbar"));

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();
    }

    static void checkCollection() {
        System.out.println("Check Collection");

        names.add("Eko");
        names.add("Kurniawan");
        names.addAll(Arrays.asList("Ihsan", "Akbar"));

        System.out.println(names.contains("Eko"));
        System.out.println(names.containsAll(Arrays.asList("Ihsan", "Akbar")));

        names.remove("Eko");
        names.removeAll(Arrays.asList("Ihsan", "Akbar"));

        System.out.println(names.contains("Eko"));
        System.out.println(names.containsAll(Arrays.asList("Ihsan", "Akbar")));

        System.out.println();
    }

}