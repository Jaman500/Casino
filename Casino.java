
import java.util.*;
public class Casino
{
    public void main()
    {Scanner sc = new Scanner(System.in);
        int cash = 100;
        sop("Welcome to Fujii Resort and Casino!");
        sop("Here we have an assortment of games you can play!");
        sop("would you like to play:");
        sop("1) Blackjack");
        sop("2) Poker");
        
        int x = sc.nextInt();
        
        if (x == 1)
        {sop("Welcome to Blackjack!");
         sop("The object of this game is to add up the values of your cards to get to 21.");
         sop("If your cards add up to over 21, you lose (bust).");
         sop("If neither you nor the computer get your cards to 21, the player with the higher sum wins.");
         sop("Are you ready to play?");
         sc.nextLine();
         String ans = sc.nextLine();
         if (ans.equals("yes")|| ans.equals("yea"))
         {      while(true)
                {   sop("How much would you like to bet?");
                    int bet = sc.nextInt();
                    //dealer deals
                    
                    
                    //reveal user cards, then one dealer card
                    //
                    
                }
         }
         else 
         {sop("Oh... then what do you wanna talk about?");
             String blah = sc.nextLine();
             
             if(blah.equals("Star Wars")|| blah.equals("star wars"))
             { sop("DUDE NO WAY!!! OMG YOU'RE MY NEW BEST FRIEND!");
                 sop("SO I TEACH MARTIAL ARTS AND ONE OF THE NEW CLASSES WE HAVE IS A LIGHTSABER COMBAT CLASS!");
                 sop("but we call it saber combat cuz we don't want to get sued by Disney");
                 sop("BUT ANYWAY IT'S SO COOL DUDE. I'VE LEARNED HOW TO FIGHT AND I'D KICK YOUR BUTT!");
                 sop("");
                 sop("sorry dude, my boss is telling me that I have to kick you out. See you next time!");
                 sop("");
                 sop("");
                 sop("YOU HAVE BEEN KICKED OUT OF FUJII RESORT ");
                }
             else
             {sop("Ok. That's cool and all, but have you heard about the new Star Wars movie??");
             sop("Dude it's super cool. It's about how the rebel alliance gets the plans for the deathstar!");
             sop("Darth Vader is in it and it's super cool.");
             sop("But anyway, you don't want to hear about this... so uh... get out.");
             sop("");
             sop("");
             sop("YOU HAVE BEEN KICKED OUT OF FUJII RESORT");
            }
             
             
             
            }
         
        }
        if (x == 2)
        {sop("Welcome to Video Poker");
         sop("The object of this game is to ");
        }
    }
    public void sop(String sent)
    {System.out.println(sent);
    }
    /*public int cashout(int bet, int user, int comp)
     {if(winner(user, comp).equals("comp"))
         {cash-=bet;
            }
         else if (winner(user, comp).equals("user"))
      {cash+=bet;
      }
      else
      {cash = cash;
        }
     }
     */
 }
