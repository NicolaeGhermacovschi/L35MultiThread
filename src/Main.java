import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        int cor = Runtime.getRuntime().availableProcessors();

        ExecutorService eexutors = Executors.newFixedThreadPool(cor);


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            for (int i = 0; i < 10; i++)
                executorService.execute(() -> new Contor().increment());

            executorService.execute(() -> System.out.println("Contor " + Contor.getCount()));

        } finally {
            executorService.shutdown();
        }
    }
}