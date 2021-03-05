public class SortAlgorithm {
    public void BubbleSort(int[] mas) {
        boolean x = false;
        int buf;
        while (!x) {
            x = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    x = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            System.out.println("Hello World");
        }

    }
}
