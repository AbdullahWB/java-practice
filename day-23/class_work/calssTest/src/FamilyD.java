import java.util.HashMap;
import java.util.Map;

class Family {
    private Map<String, String> members = new HashMap<>();

    public void addMember(String name, String relationship) {
        members.put(name, relationship);
        System.out.println(name + " added as " + relationship + ".");
    }

    public void displayFamily() {
        System.out.println("Family Members:");
        for (Map.Entry<String, String> entry : members.entrySet()) {
            System.out.println(entry.getKey() + " is the " + entry.getValue());
        }
    }
}

public class FamilyD {
    public static void main(String[] args) {
        Family family = new Family();
        family.addMember("Alice", "Mother");
        family.addMember("Bob", "Father");
        family.addMember("Charlie", "Son");
        family.displayFamily();
    }
}
