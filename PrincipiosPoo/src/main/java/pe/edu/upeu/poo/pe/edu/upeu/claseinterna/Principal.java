
package pe.edu.upeu.poo.pe.edu.upeu.claseinterna;


public class Principal {
    public static void main(String[] args) {
        Mama ma=new Mama();
        System.out.println("La mama provee"+ma.alimento);
        Mama.bebe bb=ma.new bebe();
        System.out.println("Su bebe tien un peso"+bb.peso+"Kg");
    }
}
