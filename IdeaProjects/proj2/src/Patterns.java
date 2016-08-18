/**
 * Created by harshita on 18/8/16.
 */
import java.util.Scanner;

/**
 * Created by harshita on 14/8/16.
 */
public class Patterns {

    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void DrawPolygonPattern(int width,int height)
    {
        for (int i = 0; i < width; i++)
        {
            System.out.print(" __   ");
        }

        for (int k = 0; k < height; k++) {

            System.out.println();
            for (int i = 1; i <= width; i++) {
                if (i == width) {
                    System.out.print("/  \\");
                } else {
                    System.out.print("/  \\__");
                }

            }
            System.out.println();
            for (int i = 0; i < width; i++) {
                System.out.print("\\__/  ");
            }

        }

    }

    public static void drawBox(int NumberOfBoxes)
    {
        System.out.print("+");
        for(int i=0;i<NumberOfBoxes;i++)
        {
            System.out.print("------+");
        }
        System.out.println();

        for (int j=1;j<=2;j++)
        {
            System.out.print("|");
            for (int i=0;i<NumberOfBoxes;i++)
            {

                System.out.print("      |");
            }
            System.out.println();
        }

        System.out.print("+");
        for(int i=0;i<NumberOfBoxes;i++)
        {
            System.out.print("------+");
        }
        System.out.println();
    }




    public static void main(String args[])
    {


        System.out.println("Project 1 written By Harshita.");
        System.out.println("Pattern 1: ");
        int NumberOfBoxes;

        System.out.println("Enter the number of boxes: ");
        NumberOfBoxes=CONSOLE.nextInt();

        drawBox(NumberOfBoxes);

        // PrintBox printBox= new PrintBox(NumberOfBoxes);
        //Implementation in one function
        //printBox.drawBox();

        //Dividing implementation into two functions
        //printBox.DrawFirstAndLastLineOfTheBox();
        //printBox.DrawMiddleLinesOfTheBox();
        //printBox.DrawFirstAndLastLineOfTheBox();


        System.out.println("Pattern 2: ");

        System.out.println("Enter width of the pattern: ");
        int width=CONSOLE.nextInt();
        System.out.println("Enter height of the pattern: ");
        int height=CONSOLE.nextInt();


        //Polygon polygon=new Polygon(width,height);
        DrawPolygonPattern(width,height);


    }
}


