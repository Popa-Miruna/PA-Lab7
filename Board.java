import java.util.ArrayList;
import java.util.Vector;

public class Board {
    Vector<Token> tokens = new Vector<>();

    public Board(int numberOfTokens, int maxValue){ 
       for(int i=0;i<numberOfTokens;i++)
       {
           tokens.add(new Token(maxValue));
       }
    }
    
    public void removeToken(int index)
    {
        tokens.remove(index);
    }
    public void removeToken(Token tok)
    {
        tokens.remove(tok);
    }
    public Token tokenAt(int index)
    {
        return tokens.get(index);
    }
    
    public int tokensLeft()
    {
        return this.tokens.size();
    }
}
