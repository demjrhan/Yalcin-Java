import java.util.ArrayList;
import java.util.List;

public class TaskLogic {

    public static String greetIfGreater7(int number) {
        return number > 7 ? "Hello" : "";
    }

    public static String greetName(String name) {
        if (name == null) return "There is no such name";
        return name.trim().equalsIgnoreCase("John") ? "Hello, John" : "There is no such name";
    }

    public static List<Integer> multiplesOf3(int[] input) {
        List<Integer> out = new ArrayList<>();
        if (input == null) return out;
        for (int x : input) if (x % 3 == 0) out.add(x);
        return out;
    }
}
