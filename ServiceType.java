public class ServiceType {
    private int serviceTypeId;
    private String name;
    private String description;

    public ServiceType(int serviceTypeId, String name, String description) {
        this.serviceTypeId = serviceTypeId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(int serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name; // For easy display
    }
}
