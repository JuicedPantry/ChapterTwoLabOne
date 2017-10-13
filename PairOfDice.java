
/**
 * Write a description of class PairOfDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PairOfDice
{
            public int die1;
            
            public int die2;
            
            public PairOfDice() {
                roll();
                announce();
            }
            public void roll() {
                die1 = (int)(Math.random()*6) + 1;
                die2 = (int)(Math.random()*6) + 1;
            }
            public void announce(){
                System.out.println("first die rolled a " + die1);
                System.out.println("first die rolled a " + die2);
                
            }
            
}
