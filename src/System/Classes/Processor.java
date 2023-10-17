package System.Classes;

public enum Processor implements CharacteristicsProvider {
    RYZEN_7_5700X(Socket.AM4, 7799),
    RYZEN_5_5600G(Socket.AM4, 4799),
    INTEL_CORE_I5_12400F(Socket.LGA1700, 6549),
    RYZEN_5_7600(Socket.AM5, 9299),
    INTEL_CORE_I5_10400F(Socket.LGA1200, 4155),
    INTEL_CORE_I5_8500(Socket.LGA1151_V2, 2999);
    final int price;
    final Socket socket;
    private Processor(Socket socket, int price) {
        this.socket = socket;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public Socket getSocket() {
        return this.socket;
    }
    @Override
    public String characteristicsToString() {
        return this.toString() + " | Сокет: " + this.getSocket().toString() + " | ціна: " + this.getPrice();
    }
}
