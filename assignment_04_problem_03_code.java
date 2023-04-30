//name : seif mahmoud
//id : 20216574
import java.util.*;
public class first{
    public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);  
        int size=sc.nextInt(); 
        int[] array = new int[size];  
        for(int i=0; i<size; i++){  
            array[i]=sc.nextInt(); 
        }
        int x = sc.nextInt();
        for(int i=0 ; i < array.length ; i++){
            if(i != size-1){
                if(array[i] == x) {
                    System.out.println(i);
                    break;
                } else continue;
            }else{
                if(array[i] == x){
                    System.out.println(i);
                }else{
                    System.out.println("-1");
                }
            }
        }  
    }
}
