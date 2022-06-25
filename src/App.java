public class App {
    public static void main(String[] args) throws Exception {
        
        int sumar = sumas(2,3,5);
        System.out.println("Sumas: "+sumar);

        Coche miCoche = new Coche(3);
        miCoche.incrementarPuertas();
        System.out.println("Cantidad de puertas: "+miCoche.puertas);


    }

    static int sumas(int a, int b, int c){
        return a+b+c;
    }
}


class Coche{
    int puertas;

    Coche(int puertas){
        this.puertas = puertas;
    }

    void incrementarPuertas(){
        this.puertas++;
    }
}

