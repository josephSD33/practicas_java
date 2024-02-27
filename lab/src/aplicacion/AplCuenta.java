
package aplicacion;

import logicadenegocios.Cuenta;

public class AplCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("George Takei", 2000);
        Cuenta cuenta2 = new Cuenta("Luna Hamill", 5000);

        System.out.println(cuenta1.depositar(2000));
        System.out.println(cuenta1.retirar(500));
        System.out.println();
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
    
    }
        
    
}
