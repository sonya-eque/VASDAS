public interface Priceable {
    public int getPrice();
    public static void main(String [] args) {
        House house = new House();
        Cookies cookies = new Cookies();
        Sofa sofa = new Sofa();
        Glass glass = new Glass();
        System.out.println("House: " + house.getPrice() + " RUB");
        System.out.println("Cookies: " + cookies.getPrice() + " RUB");
        System.out.println("Sofa: " + sofa.getPrice() + " RUB");
        System.out.println("Glass: " + glass.getPrice() + " RUB");
    }
}