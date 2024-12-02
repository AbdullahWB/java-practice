
class CounterService {

    private int count = 0;

    class CounterInner {

        public int Increment(int value) {

            count += value;
            return count;
        }
    }

    public void countUp() {

        CounterInner counter = new CounterInner();
        System.out.println("Current count after increment: " + counter.Increment(5));
    }
}

public class Count {

    public static void main(String[] args) {

        CounterService counterService = new CounterService();
        counterService.countUp();

        CounterService.CounterInner counter = counterService.new CounterInner();
        System.out.println("Current count after increment: " + counter.Increment(10));
    }
}
