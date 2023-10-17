package System.Classes;

import java.lang.reflect.Array;
import java.util.Arrays;

public enum Cooling implements CharacteristicsProvider {
    AEROCOOLCYLON4(new Socket[] {Socket.LGA1200, Socket.LGA1200, Socket.LGA1151_V2}, 1499),
    AMD_WRAITH_STEALTH(new Socket[] {Socket.AM4}, 249);
    private final Socket[] compatibilitySockets;
    private final int price;
    private Cooling(Socket[] compatibilitySockets, int price) {
        this.compatibilitySockets = compatibilitySockets;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public String characteristicsToString() {
        return this.toString() + " | Можливі сокети: " + Arrays.toString(this.getCompatibilitySockets()) + " | ціна : " + this.getPrice();
    }

    public Socket[] getCompatibilitySockets() {
        return compatibilitySockets;
    }
}
