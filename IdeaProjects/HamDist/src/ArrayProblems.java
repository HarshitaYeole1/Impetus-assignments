import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by harshita on 18/8/16.
 */
public class ArrayProblems {

    public static int ARRAY_LENGTH=10;
    public static final Scanner CONSOLE = new Scanner(System.in);

    public static int hammingDistance(int[] aList, int[] bList)
    {
        int hammDist=0;
        for (int i = 0; i <aList.length ; i++)
        {
                if(aList[i]!=bList[i])
                {
                    hammDist++;
                }
        }
        return hammDist;
    }




    public static void main(String[] args)
    {
        int[] aList = new int[ARRAY_LENGTH];
        int[] bList = new int[ARRAY_LENGTH];

        System.out.println("Enter " + aList.length + " Elements for first array are: ");
        for (int i = 0; i < aList.length; i++) {
            System.out.print("Enter Element: ");
            aList[i]=CONSOLE.nextInt();
        }

        System.out.println("Enter " + bList.length + " Elements for second array are:");
        for (int i = 0; i < bList.length; i++) {

            System.out.print("Enter Element: ");
            bList[i]=CONSOLE.nextInt();
        }

        System.out.println("The Elements of first array."+ Arrays.toString(aList));

        System.out.println("TheElements of second array."+ Arrays.toString(bList));

        int hammingDist=hammingDistance(aList,bList) ;
        System.out.println("The hamming Distance is : "+ hammingDist);
    }
}
