public class Main {
    public static void main(String[] args) {
        int size = 20; //размер
        int[][] mas; //массив
        mas = new int[size][]; //cтрочки
        for (int i = 0; i < size; i++) {
            mas[i] = new int[i + 1]; //в каждую строчку на одну ячейку большн, чем номер строчки (лесенка)
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {   //заполняю единички
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = mas[i - 1][j - 1] + mas[i - 1][j]; //остальные ячейки заполняю
                }
            }
        }
        for (int n = 0; n < size; n++) {   //вывожу
            for (int k = 0; k <= n; k++) {
                System.out.print(mas[n][k] + " ");
            }
            System.out.println();

        }
    }
}