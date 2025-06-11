import java.sql.*;
import java.time.LocalDate;

public class RequestDAO {

    public void insertRequest(Request request) {
        String query = "INSERT INTO request (requestId, citizenId, technicianId, serviceId, status, priority, submissionDate) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setInt(1, request.getRequestId());
            pst.setInt(2, request.getCitizenId());
            pst.setInt(3, request.getTechnicianId());
            pst.setInt(4, request.getServiceId());
            pst.setString(5, request.getStatus().name());
            pst.setString(6, request.getPriority().name());
            pst.setDate(7, Date.valueOf(request.getSubmissionDate()));

            int rows = pst.executeUpdate();
            System.out.println(rows + " row(s) inserted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add update, delete, getById methods similarly
}
