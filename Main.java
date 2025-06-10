public class Main {
    public static void main(String[] args) {
        // Create a citizen
        Citizen citizen = new Citizen("CIT001", "Ekta Bisht", "ekta@example.com", "9876543210", "123 Green St");

        // Create a service type
        ServiceType serviceType = new ServiceType(1, "Waste Management", "Waste collection and disposal");

        // Create a service request
        ServiceRequest request = new ServiceRequest("REQ001", citizen, serviceType, 1);

        // Print initial service request details
        System.out.println(request);

        // Update the status to IN_PROGRESS
        request.setStatus(ServiceRequest.Status.IN_PROGRESS);
        System.out.println("After status update:");
        System.out.println(request);

        // Update the status to COMPLETED
        request.setStatus(ServiceRequest.Status.COMPLETED);
        System.out.println("After completing request:");
        System.out.println(request);
    }
}
