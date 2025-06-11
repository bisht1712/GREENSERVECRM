import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CitizenDAO {

    public void addCitizen(Citizen citizen) {
        String query = "INSERT INTO citizen (citizen_name, email, phone_number, address) VALUES (?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, citizen.getName());
            pst.setString(2, citizen.getEmail());
            pst.setString(3, citizen.getPhoneNumber());
            pst.setString(4, citizen.getAddress());
                        int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Citizen inserted successfully.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



     public List<Citizen> getAllCitizens() {
        List<Citizen> citizens = new ArrayList<>();
        String query = "SELECT * FROM citizen";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("citizen_id");
                String name = rs.getString("citizen_name");
                String email = rs.getString("email");
                String phone = rs.getString("phone_number");
                String address = rs.getString("address");

                Citizen citizen = new Citizen(id, name, phone, email, address);
                citizens.add(citizen);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return citizens;
    }

    public void deleteCitizen(int id) {
    String query = "DELETE FROM citizen WHERE citizen_id = ?";

    try (Connection con = DBUtil.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {

        pst.setInt(1, id);
        int rowsDeleted = pst.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println(" Citizen with ID " + id + " deleted successfully.");
        } else {
            System.out.println("No citizen found with ID " + id);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
