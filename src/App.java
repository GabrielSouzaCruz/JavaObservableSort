import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
            int tamanho = 10000;
            long inicio, fim;
            //Integer[] numeros = BubbleSort.carregarArquivo("src/numeros_aleatorios.txt");
            //Integer[] numerosCopia = Arrays.copyOf(numeros, numeros.length);
            //Integer[] numerosCopia1 = Arrays.copyOf(numeros, numeros.length);
  
  
            Integer[] vetoInteiros = new Integer[tamanho];
            Random rand = new Random();
            for(int i = 0; i < tamanho;i++){
                vetoInteiros[i] = rand.nextInt(100);
            }

            BubbleSort<Integer> bsort = new BubbleSort<>();
            SelectionSort selectionSort = new SelectionSort();
            SortObserver observador = new SortObserver();
            InsertionSort insertSort = new InsertionSort<>();
            
            //System.out.println("\nAntes de ordenar: " + Arrays.toString(vetoInteiros)+"\n");

           /*System.out.println("\n--- Bubble Sort ---");
            Integer[] vetoInteiro = Arrays.copyOf(vetoInteiros, vetoInteiros.length);
            inicio = System.currentTimeMillis();
            bsort.sortOtimizado(vetoInteiro);
            fim = System.currentTimeMillis();
            System.out.println("Tempo = " + (fim-inicio));*/

            System.out.println("\n--- Selection Sort ---");
            Integer[] vetoInteiros1 = Arrays.copyOf(vetoInteiros, vetoInteiros.length);
            inicio = System.currentTimeMillis();
            selectionSort.sort(vetoInteiros1);
            fim = System.currentTimeMillis();
            System.out.println("Tempo = " + (fim-inicio));

            System.out.println("\n--- Insertion Sort ---");
            Integer[] vetoInteiros2 = Arrays.copyOf(vetoInteiros, vetoInteiros.length);
            inicio = System.currentTimeMillis();
            insertSort.sort(vetoInteiros2);
            fim = System.currentTimeMillis();
            System.out.println("Tempo = " + (fim-inicio));


    }
}