package Variable;
import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();

        // get a random int between 1 and 6
        int xr = random.nextInt(6)+1;
        System.out.println(xr);

        // get a random double
        double yr = random.nextDouble();
        System.out.println(yr);

        // get a random bool
        boolean br = random.nextBoolean();
        System.out.println(br);

    }
}
