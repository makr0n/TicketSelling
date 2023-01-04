package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика v0.0.1
 */
public class Carrier {
    private int id;
    private ArrayList<Integer> zones;
    private long cardNumber;


    public Carrier(int id, ArrayList<Integer> zones, long cardNumber) {
        this.id = id;
        this.zones = zones;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
