package System.Classes;

public enum Cooling {
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
}
