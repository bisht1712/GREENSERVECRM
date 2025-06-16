import java.sql.Connection;
import java.time.LocalDate;
import java.sql.Connection;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

// 1. check connection
/*  try {
    Connection con = DBUtil.getConnection();
    if (con != null && !con.isClosed()) {
        System.out.println("JDBC Connection successful!");
    } else {
        System.out.println("Connection failed.");
    }
    con.close();
} catch (Exception e) {
    e.printStackTrace();
} */  



//Insert Citizen
/*CitizenDAO citizenDAO = new CitizenDAO();
Citizen c1 = new Citizen(0, "Ishaan Verma", "9123456789", "ishaan@example.com", "Jaipur");
citizenDAO.addCitizen(c1);*/


// UPDATE 
/*citizenDAO.updateCitizenByEmail("ishaan@example.com", "Ishaan V.", "9000000000", "Udaipur");*/

//DELETE
/*citizenDAO.deleteCitizenByEmail("ishaan@example.com");*/

//VIEW all citizens
/*List<Citizen> allCitizens = citizenDAO.getAllCitizens();

System.out.println("All Citizens in the system:");
for (Citizen c : allCitizens) {
    System.out.println(c);
}*/


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
















    
//INSERT request
RequestDAO dao = new RequestDAO();

       /*  Request request = new Request(
            0,              
            8,              
            1,             
            2,              
            Status.PENDING, 
            Priority.HIGH,  
            LocalDate.now() 
        );

        dao.addRequest(request);*/

//VIEW all requests

/*List<Request> requests = dao.getAllRequests();

for (Request req : requests) {
    System.out.println(req);
}*/


//UPDATE request
/*Request updatedReq = new Request(
    7,                  
    8,                  
    1,                 
    1,                 
    Status.IN_PROGRESS, 
    Priority.HIGH,      
    LocalDate.now()     
);

dao.updateRequest(updatedReq);*/

//DELETE request
/*boolean deleted = dao.deleteRequestById(7); // Replace with correct ID
System.out.println("Delete status: " + deleted);*/



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

       


    }
}
