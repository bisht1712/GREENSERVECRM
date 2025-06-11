import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // // Creating a sample Request
        // Request request = new Request(
        //         1,                  // requestId
        //         101,                // citizenId
        //         201,                // technicianId
        //         1,                  // serviceId
        //         Status.PENDING,     // status (enum)
        //         Priority.HIGH,      // priority (enum)
        //         LocalDate.now()     // submissionDate
        // );

        // // Print the request
        // System.out.println("Testing Request object:");
        // System.out.println(request);

        // // Accessing individual values (optional)
        // System.out.println("Status: " + request.getStatus());
        // System.out.println("Priority: " + request.getPriority());
        // ServiceType service = new ServiceType(1, "Solar Installation");
        // System.out.println(service);



//  try {
//             Connection con = DBUtil.getConnection();

//             if (con != null && !con.isClosed()) {
//                 System.out.println("Connection successful!");
//             } else {
//                 System.out.println("Connection failed!");
//             }

//             con.close();

//         } catch (Exception e) {
//             e.printStackTrace();
//         }




        Citizen citizen = new Citizen(0, "Aditi", "9764479568", "aditia@example.com", "Dehradun");
        Citizen c2 = new Citizen(0, "Rahul", "9876543210", "rahul@example.com", "Mumbai");
        Citizen c3 = new Citizen(0, "Priya", "9123456780", "priya@example.com", "Delhi");
        Citizen c4 = new Citizen(0, "Aman", "9988776655", "aman@example.com", "Pune");




        CitizenDAO dao = new CitizenDAO();
        dao.addCitizen(citizen);
        dao.addCitizen(c2);
        dao.addCitizen(c3);
        dao.addCitizen(c4);
        List<Citizen> citizenList = dao.getAllCitizens();

        System.out.println("📋 Citizens in the system:");
        for (Citizen c : citizenList) {
            System.out.println(c);
        }

    }
}
