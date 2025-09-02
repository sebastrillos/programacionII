public class EjemploCeis {
   public static void main(String[] args){
    Coche miCoche = new Coche("toyota");
    miCoche.acelerar();
   }


}

class Coche {
    String marca;

    public void acelerar() {
        System.out.println("El " + marca + " esta acelerando.");
    }

    public Coche(String marca){
    this.marca = marca;
    }
    
}