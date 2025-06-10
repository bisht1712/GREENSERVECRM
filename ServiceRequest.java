import java.time.LocalDateTime;

public class ServiceRequest {
    private String requestId;
    private Citizen citizen;          // Assuming Citizen class exists
    private ServiceType serviceType;  // New field as object
    private Status status;
    private int priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public enum Status {
        PENDING,
        IN_PROGRESS,
        COMPLETED
    }

    public ServiceRequest(String requestId, Citizen citizen, ServiceType serviceType, int priority) {
        this.requestId = requestId;
        this.citizen = citizen;
        this.serviceType = serviceType;
        this.status = Status.PENDING;
        this.priority = priority;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = createdAt;
    }

    // Getters and setters
    public String getRequestId() {
        return requestId;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }

    public int getPriority() {
        return priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return "ServiceRequest{" +
                "requestId='" + requestId + '\'' +
                ", citizen=" + citizen.getName() +    // showing citizen name for clarity
                ", serviceType=" + serviceType +
                ", status=" + status +
                ", priority=" + priority +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
