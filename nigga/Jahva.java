import java.util.Scanner;
/**
 * Write a description of class Jahva here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jahva
{
    public static void main(String[] args)
    {   Scanner s = new Scanner(System.in);
        System.out.println("Get a sword?(y/n)");
        char ans = s.next().charAt(0);
        boolean hasSword;
        if (ans=='y')
        hasSword=true;
        else
        hasSword=false;
      
        if (hasSword)
        {
        System.out.println("You have a sword");
        System.out.println("Good luck");
    
        }else
        {
        System.out.println("You do not have thy sword");
        System.out.println("Good luck with blood being on your hands");
        }
        System.out.println("The End");
        }
}