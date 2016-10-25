import java.util.Random;
/**
 * Draws random squares
 */
public class RandomSquares
{
    public static void main(String[] args)
    {
        final int MAX_X = 200;
        final int MAX_Y = 300;
        final int MAX_LENGTH = 100;
        final int MIN_LENGTH = 20;
        final int NUMBER_OF_SQUARES = 25;
        Random gen = new Random(123456789);
        int randomX = gen.nextInt(200);
        int randomY = gen.nextInt(300);
        int randomLength = gen.nextInt(80) + 20;
        Rectangle green = new Rectangle(randomX, randomY, randomLength, randomLength);
        green.setColor(Color.GREEN);
        green.draw();
    }
}