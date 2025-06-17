import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CitizenDAO citizenDAO = new CitizenDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- Citizen Management -----");
            System.out.println("1. Add Citizen");
            System.out.println("2. View All Citizens");
            System.out.println("3. Update Citizen by Email");
            System.out.println("4. Delete Citizen by Email");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    Citizen newCitizen = new Citizen(0, name, phone, email, address);
                    citizenDAO.addCitizen(newCitizen);
                    break;

                case 2:
                    List<Citizen> citizens = citizenDAO.getAllCitizens();
                    for (Citizen c : citizens) {
                        System.out.println(c);
                    }
                    break;

                
                case 3:
                System.out.print("Enter email of citizen to update: ");
                String emailToUpdate = scanner.nextLine();

                // Fetch the existing citizen
                List<Citizen> allCitizens = citizenDAO.getAllCitizens();
                Citizen oldCitizen = null;
                for (Citizen c : allCitizens) {
                    if (c.getEmail().equalsIgnoreCase(emailToUpdate)) {
                        oldCitizen = c;
                        break;
                    }
                }

                if (oldCitizen == null) {
                    System.out.println("No citizen found with email: " + emailToUpdate);
                    break;
                }

                System.out.print("Enter new name (leave blank to keep '" + oldCitizen.getName() + "'): ");
                String newName = scanner.nextLine();
                if (newName.isEmpty()) newName = oldCitizen.getName();

                System.out.print("Enter new phone number (leave blank to keep '" + oldCitizen.getPhoneNumber() + "'): ");
                String newPhone = scanner.nextLine();
                if (newPhone.isEmpty()) newPhone = oldCitizen.getPhoneNumber();

                System.out.print("Enter new address (leave blank to keep '" + oldCitizen.getAddress() + "'): ");
                String newAddress = scanner.nextLine();
                if (newAddress.isEmpty()) newAddress = oldCitizen.getAddress();

                citizenDAO.updateCitizenByEmail(emailToUpdate, newName, newPhone, newAddress);
                break;



                case 4:
                    System.out.print("Enter email of citizen to delete: ");
                    String emailToDelete = scanner.nextLine();
                    citizenDAO.deleteCitizenByEmail(emailToDelete);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
