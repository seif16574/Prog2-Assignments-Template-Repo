//name : seif mahmoud
//id : 20216574
import java.util.*;
public class first{
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int sum=0;
        int x = sc.nextInt();//4
        int y = sc.nextInt();//5
        if(x%2 != 0){
            for(int i=1 ; i <= y ;i++){
                System.out.print(x+"+");
                sum = sum + x;
                x = x+2;
            }
        }else{
            x = x+1;
            for(int i=1 ; i <= y ;i++){
                System.out.print(x+"+");
                sum = sum + x;
                x = x+2;
            }
        }
        System.out.println("\n"+sum);
	}
}
