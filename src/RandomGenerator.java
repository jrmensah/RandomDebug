import java.util.Random;

public class RandomGenerator {

    public static void main(String[]args)
    {
        Random r = new Random();

        output("Generate 10 random integers between 0 and 6");


        for (int i=1; i <=10; i++)
        {
            int randomInt = + r.nextInt(6);
            output("Generated number:" +randomInt);
        }
            output("Done.");
    }
    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}
