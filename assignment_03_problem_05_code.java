//name : seif mahmoud
//id : 20216574
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_1  = sc.nextInt();
        int num_2  = sc.nextInt();
        int your_sum = 0;
        if (num_1 < num_2){
            for (int i = num_1; i < num_2 ; i++) {
                if (i%2==1 ){
                    your_sum = your_sum + i;
                }        
            }
        }else if(num_1 > num_2){
           for (int i = num_2; i < num_1 ; i++) {
                if (i % 2 ==1 ){
                    your_sum = your_sum + i; 
                }
            }
        }
        System.out.print(your_sum);
    
    }
}
