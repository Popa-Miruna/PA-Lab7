import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Player implements Runnable {
    ArrayList<Token> extractedTokens = new ArrayList<>();
    String name;
    final Game game;
    
    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
    }

    public String getName() {
        return name;
    }
@Override
public void run() {
        
        while(game.tokensLeft() != 0)
        {
                
            System.out.println(name + ", write the index of the token you want to take:");
            Scanner scanner = new Scanner(System.in);
            int answear;
            
            while((answear = scanner.nextInt()) > game.tokensLeft() -1 && game.tokensLeft() != 0)
            {
                System.out.println("Invalid token for " + name + ", enter it again");
            }
            if(game.tokensLeft() == 0)
                break;
            
            extractedTokens.add(game.tokenAt(answear));
            game.removeToken(answear);
            
            System.out.println("Available tokens");
            for(Token t : game.board.tokens)
            {
                System.out.printf("%d ",t.value);
            }
            System.out.println("");
            
        }
            
        }
}
