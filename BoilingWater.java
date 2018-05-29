import java.util.Scanner;
class BoilingWater
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input Temperature");
        int temp=in.nextInt();
        if(temp>=100)
            System.out.println("BoilingWater");
        else if(temp<=0)
            System.out.println("Freezing Water");
        else
            System.out.println("Normal Water");
    }
}