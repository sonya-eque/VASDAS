public interface Name {
    public String getName();

    public static void main(String [] args) {
        Dolfin lion = new Dolfin();
        Rabbit parrot = new Rabbit();
        Bear human = new Bear();
        System.out.println(lion.getName());
        System.out.println(parrot.getName());
        System.out.println(human.getName());
    }
}