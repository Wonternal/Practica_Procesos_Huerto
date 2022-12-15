import com.procesos.Consumidor;
import com.procesos.Huerto;
import com.procesos.Productor;

public class Main {

    public static void main(String[] args) {
        Huerto huerto = new Huerto(5);
        Productor productor = new Productor(huerto);
        Consumidor consumidor = new Consumidor(huerto);
        Productor productor2 = new Productor(huerto);
        Consumidor consumidor2 = new Consumidor(huerto);
        Productor productor3 = new Productor(huerto);
        Consumidor consumidor3 = new Consumidor(huerto);

        productor.start();
        consumidor.start();
        productor2.start();
        consumidor2.start();
        productor3.start();
        consumidor3.start();
    }
}
