
import java.util.Scanner;
public class Temperature {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celsius value : ");
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0 ;
        System.out.println("Fahrenheit = "+fahrenheit);
    }
}