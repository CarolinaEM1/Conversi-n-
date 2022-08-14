
package numeros;

import java.util.Scanner;

/**
 *
 * @author Carolina EM
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,n, base, aux;
        double p=0;
        String convertido="";
        Scanner t=new Scanner(System.in);
        System.out.println("Teclea el numero decimal a convertir");
        n=t.nextInt();
        System.out.println("Teclea la base a convertir");
        base=t.nextInt();
        
        aux=n;
        String a="";
        
        while (aux>0){
            switch (aux%base){
                case 10:
                    a="A";
                    break;
                case 11:
                    a="B";
                    break;
                case 12:
                    a="C";
                    break;
                case 13:
                    a="D";
                    break;
                case 14:
                    a="E";
                    break;
                case 15:
                    a="F";
                    break;   
                default:a=""+aux%base;    
            }
            convertido=a+convertido;
            aux=aux/base;
        }
        System.out.println(convertido);
    }
    
}
