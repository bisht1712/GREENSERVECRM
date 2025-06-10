// Concrete Citizen class extends User
public class Citizen extends User {
    private String citizenId;
    private String address;

    // Constructor that calls the User constructor via super()
    public Citizen(String citizenId, String name, String email, String phone, String address) {
        super(name, email, phone);
        this.citizenId = citizenId;
        this.address = address;
    }

    // Getters for citizen-specific fields
    public String getCitizenId() {
        return citizenId;
    }

    public String getAddress() {
        return address;
    }

    // Setters if you want to allow updates
    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
