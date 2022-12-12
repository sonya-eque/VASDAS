public class Magazine implements Printable {
    private String title;
    Magazine(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void print() {
        System.out.println("Magazine has been printed");
    }
}
