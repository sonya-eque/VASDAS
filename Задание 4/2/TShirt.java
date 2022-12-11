public class TShirt extends Clothes implements ManClothing, WomenClothing {
    /*TShirt() {
        super(3);
    }*/
    public void dressMan() {
        System.out.println("The tshirt is on man!");
    }
    public void dressWomen() {
        System.out.println("The tshirt is on woman!");
    }
}