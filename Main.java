import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;

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




        // Citizen c1 = new Citizen(0, "Aditi", "9764479568", "aditia@example.com", "Dehradun");
        // Citizen c2 = new Citizen(0, "Rahul", "9876543210", "rahul@example.com", "Mumbai");
        // Citizen c3 = new Citizen(0, "Priya", "9123456780", "priya@example.com", "Delhi");
        // Citizen c4 = new Citizen(0, "Aman", "9988776655", "aman@example.com", "Pune");




        // CitizenDAO dao = new CitizenDAO();
        // // dao.addCitizen(c1);
        // // dao.addCitizen(c2);
        // // dao.addCitizen(c3);
        // // dao.addCitizen(c4);

        //  dao.updateCitizenByEmail("aditia@example.com", "Aditi Sharma", "8888888888", "Delhi");
        // List<Citizen> citizenList = dao.getAllCitizens();

        // System.out.println("Citizens in the system:");
        // for (Citizen c : citizenList) {
        //     System.out.println(c);
        // }

        // dao.deleteCitizenByEmail("ekta@example.com");  // simulate a self-deletion

    

RequestDAO requestDAO = new RequestDAO();


// Request r1 = new Request(0, 3, 1, 1, Status.PENDING, Priority.HIGH, LocalDate.now());
// Request r2 = new Request(0, 4, 2, 2, Status.IN_PROGRESS, Priority.MEDIUM, LocalDate.now());
// requestDAO.addRequest(r1);
// requestDAO.addRequest(r2);

// List<Request> requests = requestDAO.getAllRequests();
// System.out.println("Requests in system:");
// for (Request r : requests) {
//     System.out.println(r);
// }

// // Update request with ID 1
// Request updated = new Request(1, 3, 1, 1, Status.COMPLETED, Priority.LOW, LocalDate.now());
// requestDAO.updateRequest(updated);

// // Delete request with ID 2
// requestDAO.deleteRequestById(2);

// // Print updated list
// System.out.println("Requests after update and delete:");
// requests = requestDAO.getAllRequests();
// for (Request r : requests) {
//     System.out.println(r);
// }

        List<Request> allRequests = requestDAO.getAllRequests();

        PriorityQueue<Request> pendingQueue = new PriorityQueue<>(new PriorityComparator());

        for (Request r : allRequests) {
            if (r.getStatus() == Status.PENDING) {
                pendingQueue.offer(r); // put it in the queue
            }
        }

        System.out.println("Pending Requests (by priority):");
        while (!pendingQueue.isEmpty()) {
            System.out.println(pendingQueue.poll()); // print and remove from queue
        }



    }
}
