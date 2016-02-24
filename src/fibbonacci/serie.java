
package fibbonacci;
import java.util.Scanner;
public class serie {
    private int fibo;
    private Scanner teclado;
    int n;
    public int get_numserie(){
        
        System.out.println("Ingrese la cantidad de numeros de la serie que desee: ");
        teclado = new Scanner(System.in);
        n= teclado.nextInt();
        return n;
    }
    //terminado
    void imprimir(){
         int cont;
         int fibant;
         int fibantdos;
         fibantdos=0;
         fibant=1;
         cont = 0;
         fibo=1;
         System.out.println("su serie es: ");
        while(n>cont){
           
            System.out.print(+fibo+" ");
            fibo=fibant+fibantdos;
            fibantdos=fibant;
            fibant=fibo;            
            cont++;
        }
         System.out.println();
    }
    
}
