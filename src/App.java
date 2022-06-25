public class App {
    public static void main(String[] args) throws Exception {
        
        int sumar = sumas(2,3,5);
        System.out.println("Sumas: "+sumar);

        Coche coche = new Coche(3);
        coche.incrementarPuertas();
        System.out.println("Cantidad de puertas: "+coche.puertas);


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

