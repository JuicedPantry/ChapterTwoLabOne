public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length=15;
            int width=11;
            int height=8;
            //declare double totalSqFt;
            double totalSqFt = (4*(width*height))+(length*width);
            //declare double paintNeeded;
            double paintneeded = totalSqFt/COVERAGE;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            int gallonsNeeded= (int) paintneeded + 1; 
            //Compute the amount of paint needed
            System.out.println("Length is: " + length);
            System.out.println("Width is: " + width);
            System.out.println("Height is: " + height);
            System.out.println("Gallons of paint needed: " + gallonsNeeded);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
        }
}