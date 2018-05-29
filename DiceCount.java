import java.util.Random;
class DiceCount
{
    public static void main(String[] args) {
        Random randomgenerator = new Random();
        int num = randomgenerator.nextInt(6)+1;
        int count=0;
        while(num!=6)
        {
            System.out.println(num+" is rolled");
            count++;
            num = randomgenerator.nextInt(6)+1;
        }
       System.out.println("you have rolled "+count+" time to get 6");
    }
}
