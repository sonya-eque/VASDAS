import java.util.ArrayList;
public interface Printable {
    public String getTitle();
    public void print();
    ArrayList<Printable> list = new ArrayList<Printable>();
    public static void printMagazine(ArrayList<Printable> printable) {
        System.out.println("Magazines:");
        for (int i = 0; i < printable.size(); i++) {
            if (printable.get(i) instanceof Magazine) {
                System.out.println(printable.get(i).getTitle());
            }
        }
    }
    public static void printBooks(ArrayList<Printable> printable) {
        System.out.println("Books:");
        for (int i = 0; i < printable.size(); i++) {
            if (printable.get(i) instanceof Book) {
                System.out.println(printable.get(i).getTitle());
            }
        }
    }
    public static void main(String[] args) {
        list.add(new Book("War of worlds"));
        list.add(new Book("Green mile"));
        list.add(new Magazine("Vogue"));
        list.add(new Magazine("BellaSara"));
        list.add(new Book("History of Russia"));

        printMagazine(list);
        printBooks(list);
    }
}