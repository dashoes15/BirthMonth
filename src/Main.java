import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int birthMonth;
        String invBirthMonthString;
        double invBirthMonthDouble;
        System.out.println("Enter your birth month:");
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth > 0 && birthMonth < 13) {
                System.out.println("Your birth month is " + birthMonth);
            }else{
                System.out.println("You have entered a invalid input of " + birthMonth);
            }
        } else if (scan.hasNext()) {
            invBirthMonthString = scan.nextLine();
            System.out.println("You have entered a invalid input of " + invBirthMonthString);
        } else if (scan.hasNextDouble()){
            invBirthMonthDouble = scan.nextDouble();
            System.out.println("You have entered a invalid input of " + invBirthMonthDouble);
        } else {
        }
    }
}