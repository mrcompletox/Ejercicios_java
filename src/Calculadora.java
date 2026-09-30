/**
 *
 * @author Martín Donoso
 */
//Libreria utilizada para la lectura de los datos
import java.util.Scanner;
public class Calculadora {

    private static boolean s;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Readable source = null;
        // Paso 1: Declarando las variables
        Scanner ventrada = new Scanner(System.in);
        float vnumero1, vnumero2;
        float vsuma,vresta,vmultiplica,vdivision;
        //paso 2: solicitar los datos
        System.out.println("CALCULADORA DE BOLSILLO");
        System.out.println("========================");
        System.out.println("Ingrese el N1: ");
        vnumero1=ventrada.nextFloat();
        System.out.println("Ingrese el N2: ");
        vnumero2=ventrada.nextFloat();
        //paso 3: realizar las operaciones de la calculadora
        vsuma=vnumero1+vnumero2;
        vresta=vnumero1-vnumero2;
        vmultiplica=vnumero1*vnumero2;
        if (vnumero2==0)//validando el denominador
        {
            vdivision=0;
            System.out.println("Error.!Div. Entre 0 no permitida");
            System.out.println("la division es:"+vdivision);
        }
        else //se puede realizar la division
        {
            vdivision=vnumero1/vnumero2;
            System.out.println("La división es:"+vdivision);
        }
        System.out.println("La suma es:"+vsuma);
        System.out.println("La resta es:"+vresta);
        System.out.println("La Multiplicación es:"+vmultiplica);
    }
}
