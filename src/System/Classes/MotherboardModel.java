package System.Classes;

public enum MotherboardModel {
    GIGABYTEB550MAORUSELITE(Socket.AM4, 3999, FormFactor.MICROATX),
    GIGABYTEB650MGAMINGXAX(Socket.AM5, 7399, FormFactor.MICROATX),
    ASUSROGSTRIXZ590EGAMING(Socket.LGA1200, 8899, FormFactor.MICROATX),
    GIGABYTEB760GAMINGX(Socket.LGA1700, 6489, FormFactor.ATX),
    ASUSPRIMEB250MPLUS(Socket.LGA1151_V2, 1799, FormFactor.ATX);
    private final Socket socket;
    private final int price;

    private final FormFactor formFactor;
    private MotherboardModel(Socket socket, int price, FormFactor formFactor) {
        this.socket = socket;
        this.price = price;
        this.formFactor = formFactor;
    }
    public Socket getSocket() {
        return socket;
    }
    public int getPrice() {
        return price;
    }
}
