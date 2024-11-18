
enum DeliveryStatus {
    ORDERED,
    ACCEPTED,
    PREPARED,
    READY_TO_DELIVER,
    PICKED_UP,
    IN_TRANSIT,
    DELIVERED,
    CANCELLED
}

class Order {

    private final int orderID;
    private DeliveryStatus status;

    public Order(int orderID) {
        this.orderID = orderID;
        this.status = DeliveryStatus.ORDERED;
    }

    public void updateStatus(DeliveryStatus newStatus) {
        this.status = newStatus;
        System.out.println("order " + orderID + " status updated to " + status);
    }
}

public class food_enum {

    public static void main(String[] args) {
        Order order1 = new Order(1);
        order1.updateStatus(DeliveryStatus.ACCEPTED);
        order1.updateStatus(DeliveryStatus.READY_TO_DELIVER);
        order1.updateStatus(DeliveryStatus.PICKED_UP);
        order1.updateStatus(DeliveryStatus.IN_TRANSIT);
        order1.updateStatus(DeliveryStatus.DELIVERED);
        order1.updateStatus(DeliveryStatus.CANCELLED);

    }
}
