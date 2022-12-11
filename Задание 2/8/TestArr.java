public class TestArr {
    public static void main(String[] args) {
        String [] array = {"s", "1", "4", "ui", "1o", "p", "34", "9w1","kkk"};

        for (int i = 0; i < array.length / 2; i++) {
            String tempString = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = tempString;
        }





        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}