
/**
 * Write a description of class PlusTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlusTest
{
    public static void main (String[] args){
        System.out.println("This is a long string that is the " +
                                    "concatentation of two shorter strings.");
        //I think it will print the two lines one after the other on the same line
        //correct
        System.out.println("The first computer was invented about" + 55 + 
                                "years ago.");
        //I think it'll print a normal string with "55" in between about and years
        //"about55years"
        System.out.println("8 plus 5 is " + 8 + 5);
        // i think it'll say 8 plus 5 is 8 + 5
        //8 plus 5 is 85
        System.out.println("8 plus 5 is " + (8+5));
        //i think itll say 8 plus 5 is 13
        //correct
        System.out.println(8 + 5 + "equals 8 plus 5.");
        //i think it'll say 8 + 5 equals 8 plus 5
        //13equals 8 plus 5
    }
}
