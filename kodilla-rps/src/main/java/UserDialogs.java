import java.util.Scanner;

public class UserDialogs {
    private static String name;
    private static int quantity;

    public UserDialogs() {
        this.name = getUserName();
        this.quantity = getBestOfQuantity();
    }

    private static String getUserName() {
        String name;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entry your name: ");
            name = scanner.nextLine();
            if(name.length() < 3) {
                System.out.println("To short name!");
            } else if(!validName(name)){
                System.out.println("Invalid characters, please use only letters!");
            } else {
                return name;
            }
        }
    }

    private static int getBestOfQuantity() {
        String quantity;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Entry best of: ");
            quantity = scanner.nextLine();
            if(quantity.length() == 0) {
                System.out.println("To not enough rounds");
            } else if (!(validQuantity(quantity))){
                System.out.println("Invalid characters, please use only numbers!");
            } else {
                int result = Integer.parseInt(quantity);
                return result;
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

    private static boolean validQuantity(String quantity) {
        boolean valid = true;
        for(int i=0; i<quantity.length(); i++) {
            if(!(quantity.charAt(i) >= 48 && quantity.charAt(i) <= 57)){
                valid = false;
            }
        }
        return valid;
    }

    public static String getName() {
        return name;
    }

    public static int getQuantity() {
        return quantity;
    }
}
