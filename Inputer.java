import java.util.Scanner;

public class Inputer {
    private static final Scanner scanner = new Scanner(System.in);

    // Hàm nhập dữ liệu theo regex
    public static String getInput(String regex) {
        System.out.print("Enter input: ");
        String str = scanner.nextLine();
        if (str.matches(regex)) {
            return str;
        }
        return ""; // Trả về chuỗi rỗng nếu không khớp regex
    }



    // Hàm nhập một số nguyên dương
    public static int getPositiveInteger() {
        int result;
        while (true) {
            String str = getInput("[1-9]\\d*"); // Regex cho số nguyên dương
            if (!str.isEmpty()) {
                result = Integer.parseInt(str);
                break;
            }
            System.out.println("Invalid input. Please enter a positive integer.");
        }
        return result;
    }
}
