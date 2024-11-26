import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
            // Nhập kích thước mảng
            System.out.println("Enter the size of the array (positive integer): ");
            int n = Inputer.getPositiveInteger();

            // Tạo đối tượng MyArray
            MyArray myArray = new MyArray(n);

            // Sinh mảng ngẫu nhiên
            Random random = new Random();
            int[] randomArray = new int[n];
            for (int i = 0; i < n; i++) {
                randomArray[i] = random.nextInt(10); // Giá trị ngẫu nhiên từ 0 đến 9
            }
            myArray.setArray(randomArray);

            // Hiển thị mảng ban đầu
            System.out.println("Unsorted array:");
            for (int val : myArray.getArray()) {
                System.out.print(val + " ");
            }
            System.out.println();

            // Sắp xếp mảng bằng Bubble Sort
            myArray.sort();

            // Hiển thị mảng sau khi sắp xếp
            System.out.println("Sorted array:");
            for (int val : myArray.getArray()) {
                System.out.print(val + " ");
            }
            System.out.println();
    }
}
