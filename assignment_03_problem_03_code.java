//name : seif mahmoud
//id : 20216574
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
        for (int i = 1; i <= num * 4 ; i++) {
        if (i % 4 == 0){
            System.out.print("PUM");
            System.out.println();
            
        }else{
            System.out.print(i + " ");
        } 
        }
    }    
}
