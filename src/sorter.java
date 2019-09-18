public class sorter {
    public static void main(String[] args) {
        int mas[] = new int[20];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100 - 50);
            System.out.print(mas[i] + " ");
        }
        int left = 0;
        int right = mas.length - 1;
        int buffer;
        do {
            for (int i = left; i < right; i++) {
                if (mas[i] > mas[i + 1]) {
                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            right--;
            for (int j = right; j > left; j--) {
                if (mas[j] < mas[j - 1]) {
                    buffer = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = buffer;
                }
            }
            left++ ;
        }
        while (left < right);
        System.out.println("");
        for (int i = 0; i <20 ; i++) {
            System.out.print(mas[i] + " ");
        }

    }
}

