import java.io.*;

public class Main {

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    private static Property[] properties = new Property[10];

    private static int counter = 0;

    public static void main(String[] args) throws Exception{
        routeUser();
    }

    public static int printMenu() throws Exception {
        int option = -1;

        System.out.println("*** MacPato's Real State ***");
        System.out.println("1. Register Property.");
        System.out.println("2. List Properties");
        System.out.println("3. Search Property.");
        System.out.println("4. Calculate Rent Incomes.");
        System.out.println("5. Exit.");
        System.out.print("Type an option: ");

        option = Integer.parseInt(in.readLine());
        return option;
    }

    public static void routeUser() throws Exception {
        boolean isExiting = false;

        do {
            switch (printMenu()) {
                case 1:
                    registerProperty();
                    break;

                case 2:
                    listProperties();
                    break;

                case 3:
                    System.out.println("*** Search Property ***");
                    System.out.print("Type the name of the property you want to seach: ");
                    searchProperty(in.readLine());
                    break;

                case 4:
                    calculateRentIncome();
                    break;

                case 5:
                    System.out.println("Thanks for Supporting MacPato's Real State");
                    isExiting = true;
                    break;

                case -1:
                    System.out.println("Please type an option to continue!");
                    routeUser();
                    break;

                default:
                    System.out.println("Type a valid option!");
                    routeUser();
                    break;
            }
        } while (!isExiting);
    }

    public static boolean isNameRegistered(String name) {
        for (int i = 0; i < counter; i++) {
            if (properties[i].getPropertyName().equals(name)) {
                System.out.println("This property name already exists!");
                return true;
            }
        }
        return false;
    }

    public static boolean isCodeRegistered(int code) {
        for (int i = 0; i < counter; i++) {
            if (properties[i].getPropertyCode() == (code)) {
                System.out.println("This property code already exists!");
                return true;
            }
        }
        return false;
    }

    public static void registerProperty() throws Exception {
        if (properties[9] != null) {
            System.out.println("You don't have any property slots left!");
        } else {
            String propertyName;
            int propertyCode;

            System.out.println("*** Register Property ***");

            do {
                System.out.print("Type the property's code: ");
                propertyCode = Integer.parseInt(in.readLine());
            } while (isCodeRegistered(propertyCode));

            do {
                System.out.print("Type the property's name: ");
                propertyName = in.readLine();
            } while (isNameRegistered(propertyName));

            System.out.print("Type the amount of rooms: ");
            int propertyRoomsAmount = Integer.parseInt(in.readLine());

            System.out.print("Type the province: ");
            String province = in.readLine();

            System.out.print("Type the monthly rent fee: ");
            Double rentFee = Double.parseDouble(in.readLine());

            Property property = new Property(propertyCode, propertyName, propertyRoomsAmount, province, rentFee);
            properties[counter] = property;
            counter++;

            System.out.println("Property successfully registered!");

            listProperties();
        }
    }

    public static void listProperties() throws Exception {
        System.out.println("*** Your Properties ***");

        if (properties[0] == null) {
            System.out.println("You don't have any registered properties!");
            System.out.println("*****************************************");
        } else {
            for (int i = 0; i < properties.length; i++) {
                if (properties[i] != null) {
                    System.out.println("****** Property #" + (i + 1) + "******");
                    System.out.println("Property Code: " + properties[i].getPropertyCode());
                    System.out.println("Property Name: " + properties[i].getPropertyName());
                    System.out.println("Rooms: " + properties[i].getPropertyRoomsAmount());
                    System.out.println("Province: " + properties[i].getProvince());
                    System.out.println("Monthly Rent Price: " + properties[i].getRentFee());
                    System.out.println("************************************");

                }

            }
        }
    }

    public static void searchProperty(String name) {
        boolean found = false;

        System.out.println("*** Properties Found ***");

        for (int i = 0; i < properties.length; i++) {
            if (properties[i] != null && properties[i].getPropertyName().equals(name) && !found) {
                System.out.println("****** Property #" + (i + 1) + "******");
                System.out.println("Property Code: " + properties[i].getPropertyCode());
                System.out.println("Property Name: " + properties[i].getPropertyName());
                System.out.println("Rooms: " + properties[i].getPropertyRoomsAmount());
                System.out.println("Province: " + properties[i].getProvince());
                System.out.println("Monthly Rent Price: " + properties[i].getRentFee());
                System.out.println("************************************");
                found = true;
            }
            if (!found) {
                System.out.println("There are no properties with that name.");
            }
        }
    }

    public static void calculateRentIncome() throws Exception {
        Double totalIncomes = 0.0;

        System.out.println("*** Total Rent Incomes ***");

        if(properties[0] != null) {
            for (int i = 0; i < properties.length; i++) {
                if (properties[i] != null) {
                    totalIncomes += properties[i].getRentFee();
                }
            }
            System.out.println("The total monthly income is $" + totalIncomes);
        }else {
            System.out.println("No properties were found!");
        }
    }


}
