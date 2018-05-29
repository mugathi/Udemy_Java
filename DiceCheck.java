import java.util.*;
class DiceCheck
{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int die;
      do
      {
        System.out.println("Enter the value of DICE");
        die=in.nextInt();
        if(die<1||die>6)
            System.out.println("Bad Dice");
      }while(die<1||die>6);  
    }
}
