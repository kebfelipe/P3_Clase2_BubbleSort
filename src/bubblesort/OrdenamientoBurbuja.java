package bubblesort;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        int[] intArray = {-20, 35, -15, 7, 55, 1, -22};
        Ordenar(intArray);
        for (int x = 0; x < intArray.length; x++) {
            System.out.println(intArray[x]);
        }
    }

    /**
     * Recibe el arreglo y lo ordena a traves del metodo burbuja
     * 
     * @param arreglo arreglo a ordenar
     */
    public static void Ordenar(int[] arreglo) {
        for (int lastUnsortedIndex = arreglo.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arreglo[i] > arreglo[i + 1]) {// swap
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[i + 1];
                    arreglo[i + 1] = temp;
                }
            }
        }
    }
}
