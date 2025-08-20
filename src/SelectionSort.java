import java.util.*;
public class SelectionSort<T> {
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
    
    private void troca(T[] array, int i, int j){
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            contTroca++;
    }   

    private int indiceMenorValorVetor(T[] array, int pos, 
                                Comparator<T> comparator){
         int minIndice = pos;
         for(int i=pos+1;i<array.length;i++){
            contComparacao++;
            if(comparator.compare(array[i],array[minIndice])<0)
                minIndice = i;
         }// fim for         
         return minIndice;          
    }

    public T[] sort(T[] array, Comparator<T> comparator){
        contComparacao = 0;  
        contTroca = 0; 
        contFases = 0;
        for(int i=0;i<array.length-1;i++){
            contFases++;
            int indiceMenor = indiceMenorValorVetor(array, i, comparator);
            if(comparator.compare(array[i], array[indiceMenor]) > 0)
                troca(array, i, indiceMenor);
        }// fim for
        return  array;
    }

    public T[] sort(T[] array){
        return sort(array, (a,b)->((Comparable<T>) a).compareTo(b));
    }
}