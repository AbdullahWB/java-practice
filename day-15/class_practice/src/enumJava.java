
enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED,
}

class Order {

    private final int orderID;
    private OrderStatus status;

    public Order(int orderID) {
        this.orderID = orderID;
        this.status = OrderStatus.PENDING;
    }

    public void updateStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("order " + orderID + " status updated to " + status);
    }
}

public class enumJava {

    public static void main(String[] args) {
        Order order1 = new Order(1);
        order1.updateStatus(OrderStatus.SHIPPED);
        order1.updateStatus(OrderStatus.DELIVERED);
    }
}
