
package fibbonacci;
import java.util.Scanner;
public class serie {
    private int fibo;
    private int fibant;
    private Scanner teclado;
    int n;
    public int get_numserie(){
        
        System.out.println("Ingrese la cantidad de numeros de la serie que desee: ");
        teclado = new Scanner(System.in);
        n= teclado.nextInt();
        return n;
    }
    
    void imprimir(){
         int cont;
         int fibantdos;
         fibantdos=1;
         fibant=1;
        cont = 0;
        fibo=1;
        while(n>cont){
           
            System.out.println("su serie es: " +fibo);
            fibo=fibant+fibantdos;
            
            cont++;
        }
    
    }
    
}
