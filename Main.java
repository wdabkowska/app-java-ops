public class Main {
    public static void main(String[] args) {
        System.out.printf("Good morning, You!");

        String[] names = {"Piotr", "Anna", "Jan", "Leszek"};

        for (int i = 1; i <= 4; i++) {
            System.out.println("" + i + " + names[i - 1]);
        }
    }
}
