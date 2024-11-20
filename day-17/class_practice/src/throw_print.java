
public class throw_print {

    static void cnaVote(int age) {
        if (age < 18) {
            try {
                throw new IllegalAccessException("You are not eligible to vote");
            } catch (IllegalAccessException e) {
                System.out.println("you are not an adult!" + e.getMessage());
            }
        } else {
            System.out.println("You can vote!");
        }
    }

    public static void main(String[] args) {
        cnaVote(10);
        cnaVote(20);
    }
}
