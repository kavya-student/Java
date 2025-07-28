import java.util.Scanner;
public class loops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int T = input.nextInt();
        int R = input.nextInt();
        int simpleInterest = (p*T*R/100);
        System.out.println(simpleInterest);
    }
}
