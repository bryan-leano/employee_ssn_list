import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] employeeNames = new String[5];
        int[] socialSecurityNumbers = new int[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("What is your employee name?");
            employeeNames[i] = sc.nextLine();
            System.out.println("What is their SSN?");
            socialSecurityNumbers[i] = sc.nextInt();
            sc.nextLine();
        };

        for (int i = 0; i < employeeNames.length; i++) {
            System.out.println("Employee's name is " + employeeNames[i]);
            System.out.println("And " + employeeNames[i] + "'s SSN is " + socialSecurityNumbers[i]);
        }

    }
}
