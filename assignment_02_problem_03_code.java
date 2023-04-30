//name : seif mahmoud
//id : 20216574
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   
        for (int i = 1; i <= num; i++) {
            for (int K = 1; K <= i; K++) {
                System.out.print("*");
            }   
            System.out.println();
        }
    }
}
