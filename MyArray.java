public class MyArray {
    private int[] a;

    // Constructor
    public MyArray(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Array size must be non-negative.");
        }
        a = new int[n];
    }

    // Hàm sắp xếp bằng Bubble Sort
    public void sort() {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Đổi chỗ nếu phần tử hiện tại lớn hơn phần tử tiếp theo
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // Nếu không có hoán vị nào, mảng đã được sắp xếp
            if (!swapped) break;
        }
    }
    // Hàm thiết lập giá trị cho mảng
    public void setArray(int[] array) {
        if (array.length != a.length) {
            throw new IllegalArgumentException("Array size mismatch.");
        }
        System.arraycopy(array, 0, a, 0, array.length);
    }

    // Hàm lấy giá trị mảng
    public int[] getArray() {
        return a.clone();
    }
}
