import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            array[i] = scanner.nextInt();
        }
        insertionSort(array);
        System.out.println("Sau sắp xếp");
        displayArray(array);
        System.out.println("\n---------------------");
    }

    private static void displayArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int pos, temp;
        for (int i = 1; i < array.length; i++) {
            System.out.println("Bắt đầu vòng " + i);
            temp = array[i];
            pos = i;
            System.out.println("Gán temp = " + array[i] + ", pos = " + i);
            while (pos > 0 && array[pos - 1] > temp) {
                System.out.println("Thỏa mãn điều kiện  pos > 0 && array[pos - 1] > temp");
                System.out.println("Đổi vị trí " + array[pos] + " và " + array[pos - 1]);
                array[pos] = array[pos - 1];
                pos--;

            }
            System.out.println("Gán lại array[pos] = " + temp);
            array[pos] = temp;
            System.out.println("Kết thúc vòng " + i);
            System.out.print("Mảng sau vòng" + i + " : ");
            displayArray(array);
            System.out.println("\n-------------------------");
        }
    }

}
