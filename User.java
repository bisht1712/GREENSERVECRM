// Abstract User class
public abstract class User {
    protected String name;
    protected String email;
    protected String phone;

    // Constructor to initialize common user fields
    public User(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters for common fields
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    // You can add setters if needed for updates
}
