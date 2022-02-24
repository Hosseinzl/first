import java.util.*;
public class test
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean nozuli = false , soudi = false;
        int firstFigur , secondFigure;
        
        while(number>=10)
        {
            firstFigur = number%10;
            number /= 10;
            secondFigure = number%10;
            if(secondFigure>firstFigur)
                nozuli = true;

            else if(secondFigure<firstFigur)
                soudi = true;



            //System.out.println(secondFigure + " " + firstFigur);
        }
        
        if(!nozuli)
            System.out.println("Soudi!");
        else if(!soudi)
            System.out.println("Nozuli!");
        else
            System.out.println("Hich kodam!");
    }
}