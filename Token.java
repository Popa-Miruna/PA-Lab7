import java.util.Random;

public class Token {
    int value;
    
    public Token(int maxValue) {
        Random random = new Random();
        value = random.nextInt(maxValue);
        if(Math.random() < 0.1f)
            value = -1;
    }
    
    
}
