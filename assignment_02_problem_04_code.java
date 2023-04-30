//name : seif mahmoud
//id : 20216574
import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   
        for (int i = num ; i > 0 ; i--) {
            for (int K = 0; K < i; K++) {
                System.out.print("*");
            }   
            System.out.println();
        }
    }
}
