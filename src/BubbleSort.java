import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BubbleSort<T> extends ObservableSort<T> {
    private int contComparacao=0;
    private int contTroca=0;
    private int contFases=0;

    public int getContComparacao() {
        return contComparacao;
    }

    public int getContTroca() {
        return contTroca;
    }

    public int getContFases(){
        return contFases;
    }

    private void troca(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        notificarTroca(i, j);
    }

    public T[] sort(T[] array) {
        Comparator<T> comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);

        int n = array.length;
        for (int fase = 1; fase < n; fase++) {
            for (int j = 0; j < n - fase; j++) {
                notificarComparacao(j, j + 1);
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    troca(array, j, j + 1);
                }
            }
        }
        notificarConclusao();
        return array;
    }

    public T[] sortOtimizado(T[] array) {
        Comparator<T> comparator = (a, b) -> ((Comparable<T>) a).compareTo(b);

        int n = array.length;
        boolean trocou;
        for (int fase = 1; fase < n; fase++) {
            trocou = false;
            for (int j = 0; j < n - fase; j++) {
                notificarComparacao(j, j + 1);
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    troca(array, j, j + 1);
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
        notificarConclusao();
        return array;
    }

    public T[] sort(T[] array) {
        return sort(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }
    
    public T[] sortOtimizado(T[] array) {
        return sortOtimizado(array, (a, b) -> ((Comparable<T>) a).compareTo(b));
    }


    public static Integer[] carregarArquivo(String nomeArquivo) throws IOException {
        List<String> linhas = Files.readAllLines(Paths.get(nomeArquivo));
        Integer[] numeros = new Integer[linhas.size()];
        for (int i = 0; i < linhas.size(); i++) {
            numeros[i] = Integer.parseInt(linhas.get(i).trim());
        }
        return numeros;
    }
}