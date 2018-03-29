import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        String name;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entry your name: ");
            name = scanner.nextLine();
            if(name.length() == 0) {
                System.out.println("To short name!");
            } else if(!validName(name)){
                System.out.println("Invalid characters, please use only letters");
            } else {
                return name;
            }
        }
    }

    public static int getBestOfQuantity() {
        int quantity;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entry best of: ");
            quantity = scanner.nextInt();
            if(quantity == 0) {
                System.out.println("To not enough rounds");
            } else {
                return quantity;
            }
        }
    }

    private static boolean validName(String name) {
        boolean valid = true;
        for(int n=0; n<name.length(); n++) {
            if (!((name.charAt(n) >= 65 && name.charAt(n) <= 90) || (name.charAt(n) >= 97 && name.charAt(n) <= 122))) {
                valid = false;
            }
        }
        return valid;
    }

}
