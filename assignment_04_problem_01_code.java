//name : seif mahmoud
//id : 20216574
import java.util.Scanner;  
public class main{  
    public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);  
        int num =sc.nextInt(); 
        
        int[] array = new int[num];  
        for(int i=0; i<num; i++){  
            array[i]=sc.nextInt(); 
        }
        for(int i=0 ; i < array.length ; i++){
            if (array[i] > 0){
                System.out.print("1 ");
            }else if (array[i] < 0) {
                System.out.print("2 ");
            }else {
                System.out.print("0 ");
            }
        }
    }  
}
