import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        /*
        Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
        */
        
        System.out.print(iva(3));
        
    }
    static double iva(double precio) {
        double precioFinal = precio * 1.21;
        return precioFinal;
    }
}
