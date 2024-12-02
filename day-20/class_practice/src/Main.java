
interface SignUp {

    void SignUpBonus();
}

public class Main {

    public static void main(String[] args) {
        SignUp signUp = new SignUp() {
            @Override
            public void SignUpBonus() {
                System.out.println("SignUp bonus: 10%");
            }
        };
        signUp.SignUpBonus();
    }
}
