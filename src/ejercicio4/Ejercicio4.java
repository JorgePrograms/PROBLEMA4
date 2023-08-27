package ejercicio4;
import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[] args) {
 int num,n=0,c=0;
 Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num=entrada.nextInt();
        if(num%2==0){
        n=num/2;
        
        }
        else{
            n=(num+1)/2;
        }
        for(int i=0;i<n;i++){
        c=2*i+1;
         System.out.println(c);
        }
       
    }
}