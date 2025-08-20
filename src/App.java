import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("====================================");
            System.out.println("Atividade 1");
            System.out.println("====================================");
            
            Integer[] numeros = BubbleSort.carregarArquivo("src/numeros_aleatorios.txt");
            Integer[] numerosCopia = Arrays.copyOf(numeros, numeros.length);
            Integer[] numerosCopia1 = Arrays.copyOf(numeros, numeros.length);
            BubbleSort<Integer> bsort = new BubbleSort<>();
            SelectionSort selectionSort = new SelectionSort();
            SortObserver observador = new SortObserver();
            
            System.out.println("\nAntes de ordenar: " + Arrays.toString(numeros)+"\n");
            System.out.println("--- Bubble Sort Padrão ---");
            bsort.setObserver(observador);
            bsort.sort(numeros);
            
            System.out.println("\n--- Bubble Sort Otimizado ---");

            bsort.sortOtimizado(numerosCopia);

            
            selectionSort.sort(numerosCopia1);
            System.out.println("--- Selection Sort Otimizado ---");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}