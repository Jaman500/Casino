
import java.util.*;
public class Blackjack
{
    public void deal(int x)
    {Deck ugh = new Deck();
        ugh.shuffle();
       ArrayList<Card> hand = new ArrayList<Card>();
        for(int i = 0; i< x; i++)
        {
         hand.add(ugh.getArray().remove(0));
         i--;
        }
        
    }
    public void sop(String sent)
    {System.out.println(sent);
    }
    public String winner(int user, int comp)
    { 
        if (user == 21 && comp != 21)
        {return "user";
        }
        else if(user != 21 && comp ==21)
        {return "comp";
        }
       else if(user>comp)
        {return "user";
        }
        else if(user<comp)
        {return "comp";
        }
        return "tie";
    }
    public void changeAce(ArrayList<Card> hand, Card ace, int x) //x will be the current count
    { if(x>21)
        { int place =0;
            for(int i =0; i<hand.size(); i++)
            {if (hand.get(i).equals(ace.getSuit()))
                {place =i;
                }
                
            }
            hand.remove(place);
          hand.add(new Card(1 , ace.getSuit(), ace.getFace()));
        }
    }
}
