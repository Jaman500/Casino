public class Card
{
    // instance variables - replace the example below with your own
    private int value;
    private String suit;
    private String name; //jack,queen,king

    
    public Card(int num, String type, String face)
    {
        value = num;
        suit = type;
        name = face;
       
    }
    //WORKS
    public String getFace()
    {return name;
    }
    //WORKS
    public String getSuit()
    {return suit;
    }
    //WORKS
    public int getNum()
    {return value;
    }
    //WORKS
    public String toString()
    {return name +" of "+ suit;
    }
}
