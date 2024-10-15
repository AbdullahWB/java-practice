public class string_var {
    public static void main(String[] args) {
        String name = "mohammad abdullah";
        String love = "Have No";

        String upperCase = name.toUpperCase();
        System.out.println(upperCase);

        int length = upperCase.length();
        System.out.println("Length: " + length);

        boolean isEmpty = upperCase.isEmpty();
        System.out.println("Is empty: " + isEmpty);

        char anyCharInString = upperCase.charAt(2);
        System.out.println(anyCharInString);

        int indexNumber = name.indexOf('a');
        System.out.println(indexNumber);

        String concat = name.concat(" " + love);
        System.out.println(concat);
    }
}
