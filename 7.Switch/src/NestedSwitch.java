import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dep = in.next();

        switch (empId) {
            case 1 -> System.out.println("Jayani Hansani");
            case 2 -> System.out.println("Yasas Kavinda");
            case 3 -> {
                System.out.println("Mayuka Kavindi");
                switch (dep) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Managements":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Enter a department");
                }
            }
            default -> System.out.println("Enter valid empId");
        }
    }
}
