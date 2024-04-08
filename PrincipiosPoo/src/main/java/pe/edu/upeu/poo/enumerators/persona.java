
package pe.edu.upeu.poo.enumerators;

enum GENERO{Masculino, Femenino}
enum ESTADO_CIVIL{CASADO, DIVORSIADO, SOLTERO}
public class persona {
    public static void main(String[] args) {
        System.err.println("Genero:+GENERO.Masculino");
        for (ESTADO_CIVIL ec:ESTADO_CIVIL.values()) {
            System.err.println(ec);
            
        }
    }
}
