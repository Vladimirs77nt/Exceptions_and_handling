import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random(0);
        System.out.println("Анжелика");
        for (int i = 0; i <= 100; i++) {
            System.out.println("Привет! " + random.nextInt(100));
        }
    }
}