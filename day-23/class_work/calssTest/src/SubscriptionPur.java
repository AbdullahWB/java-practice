import java.util.HashMap;
import java.util.Map;

class Subscription {
    private Map<String, Double> plans = new HashMap<>();
    private String activePlan = null;

    public void addPlan(String planName, double price) {
        plans.put(planName, price);
        System.out.println("Plan " + planName + " added with price $" + price);
    }

    public void activatePlan(String planName) {
        if (plans.containsKey(planName)) {
            activePlan = planName;
            System.out.println("Plan " + planName + " activated.");
        } else {
            System.out.println("Plan " + planName + " does not exist.");
        }
    }

    public void displayPlans() {
        System.out.println("Available Subscription Plans:");
        for (Map.Entry<String, Double> entry : plans.entrySet()) {
            System.out.println("- " + entry.getKey() + ": $" + entry.getValue());
        }
    }

    public void displayActivePlan() {
        if (activePlan != null) {
            System.out.println("Active Plan: " + activePlan + " ($" + plans.get(activePlan) + ")");
        } else {
            System.out.println("No active plan.");
        }
    }
}

public class SubscriptionPur {
    public static void main(String[] args) {
        Subscription subscription = new Subscription();
        subscription.addPlan("Basic", 9.99);
        subscription.addPlan("Premium", 19.99);
        subscription.displayPlans();
        subscription.activatePlan("Premium");
        subscription.displayActivePlan();
    }
}
