import java.util.ArrayList;
public abstract class Learner {
    public abstract String whoIsIt();
    public abstract String getName();
    static ArrayList<Learner> learnersList = new ArrayList<Learner>();

    public static void main(String [] args) {
        learnersList.add(new Pupil("Sofya"));
        learnersList.add(new Student("Egor"));
        learnersList.add(new Pupil("Karina"));
        learnersList.add(new Student("Pavel"));
        learnersList.add(new Pupil("Ivan"));
        learnersList.add(new Student("Vlad"));
        learnersList.add(new Pupil("Anastasia"));
        learnersList.add(new Student("Ekaterina"));
        learnersList.add(new Pupil("Danil"));
        learnersList.add(new Student("Artem"));
        learnersList.add(new Student("Karim"));

        for (int i = 0; i < learnersList.size(); i++) {
            System.out.print(learnersList.get(i).getName() + " is ");
            System.out.println(learnersList.get(i).whoIsIt());
        }

        System.out.println();

        System.out.println("STUDENTS:");

        for (int i = 0; i < learnersList.size(); i++) {
            if (learnersList.get(i).whoIsIt().equals("Student")) {
                System.out.println(learnersList.get(i).getName());
            }
        }

        System.out.println();

        System.out.println("Pupils:");

        for (int i = 0; i < learnersList.size(); i++) {
            if (learnersList.get(i).whoIsIt().equals("Pupil")) {
                System.out.println(learnersList.get(i).getName());
            }
        }


    }
}