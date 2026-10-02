
/**
 *
 * @author islapis
 */
public class Pizza {
    // paso 1: definir los aitributos de la clase
    private String nombre, tamano, masa;
    //paso 2: definir los metodos constructores 
    //constructor sin parametros
    public Pizza(){
        
    }
    //constructor con parametros
    public Pizza(String nombre, String tamano, String masa)
    {
        this.nombre = nombre ;
        this.tamano = tamano;
        this.masa = masa;
    }
    //paso 3: métodos personalizados
    public void preparar ()
    {
        System.out.println("Se esta preparando la Pizza");
        System.out.println("===========================");
        System.out.println("Nombre:"+nombre);
        System.out.println("Tamano"+tamano);
        System.out.println("Masa"+masa);
        
    }
    public void servir ()
    {
        System.out.println("Se esta Sirviendo la Pizza");
        System.out.println("==========================");
        System.out.println("Se entrega la pizza: "+nombre);
        System.out.println("De masa: "+masa);
        System.out.println("Buen proveecho.....! yummy yummy mueheheh");
        System.out.println("Bv");
    }
}