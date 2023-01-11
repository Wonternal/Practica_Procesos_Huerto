import com.procesos.Consumidor;
import com.procesos.Huerto;
import com.procesos.Productor;

public class Main {

    public static void main(String[] args) {
        Huerto huerto = new Huerto(5);
        Productor productor = new Productor(huerto);
        Consumidor consumidor = new Consumidor(huerto);

        productor.start();
        consumidor.start();
    }
}
