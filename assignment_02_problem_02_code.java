//name : seif mahmoud
//id : 20216574
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   
        for (int i = 1; i <= 12; i++) {
        int sum = num * i ; 
        System.out.println( num + " * " + i + " = " + sum );
        }
    }
}
