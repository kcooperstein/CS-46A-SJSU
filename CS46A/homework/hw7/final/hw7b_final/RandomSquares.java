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
        int count = 1;
        int randomLength = 0;
        int biggest = 0;
        Rectangle biggestRect = new Rectangle(0, 0, 0 ,0);
        Rectangle green = new Rectangle(0, 0, 0, 0);
        Random gen = new Random(123456789);
        while (count <= 25)
        {
            int randomX = gen.nextInt(200);
            int randomY = gen.nextInt(300);
            randomLength = gen.nextInt(80) + 20;
            if (count == 1)
            {
                biggest = randomLength;
            }
            green = new Rectangle(randomX, randomY, randomLength, randomLength);
            green.setColor(Color.GREEN);
            if (biggest < randomLength)
            {
                biggest = randomLength;
                biggestRect = green;
            }
            green.draw();
            count++;
        }
        biggestRect.setColor(Color.BLUE);
        biggestRect.fill();
    }
    
}