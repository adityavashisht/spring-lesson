package org.indasil.learningjava.spring.intro.order.singleton;

/**
 * Created by vashishta on 9/21/15.
 */
public class Order {

    private String id;
    private String ship;

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", ship='" + ship + '\'' +
                '}';
    }
}
