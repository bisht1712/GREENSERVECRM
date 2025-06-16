# GREENSERVECRM
# GreenServe CRM – Service Request & Sustainability Tracker

## 1. Project Overview
GreenServe CRM is a console-based Java application for managing citizen service requests related to sustainability, such as:
- Solar panel installation
- Waste management
- Pollution control

It supports:
- Citizen registration and request submission
- Admin-side tracking, assignment, and monitoring
- Request prioritization using queues

---

## 2. Technologies Used
- Java (OOP concepts, Enums, Collections)
- MySQL (Relational database)
- JDBC (Java Database Connectivity)
- Java Time API (for date handling)

---

## 3. Database Schema
Tables used:
- `citizen(citizen_id, name, email, phone, address)`
- `technician(technician_id, tech_name, phone, skill_area)`
- `service_type(service_id, service_name)`
- `request(request_id, citizen_id, technician_id, service_id, status, priority, request_date)`

All tables are interlinked using foreign keys to maintain referential integrity.

### ERD Diagram
![ERD Diagram](screenshots/erd.png)
---

## 4. Features Implemented

### Java Classes:
- `Citizen`, `Request`, `ServiceType` – model classes
- `Status`, `Priority` – enums for request status and priority
- `DBUtil`, `CitizenDAO`, `RequestDAO` – database interaction classes

### Functionalities:
- CRUD operations for `Citizen` and `Request`
- JDBC-based MySQL integration
- Exception handling for database and input operations
- Request filtering: only `PENDING` requests are prioritized
- Priority queue implemented using `PriorityQueue`

---

## 5. How to Run

### Prerequisites:
### Prerequisites:
- Java installed (JDK 8+)
- MySQL installed and configured
- **MySQL Connector/J** (JDBC driver)

> Make sure to download and install the [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/) `.jar` file.
> - Place the `.jar` file in your project folder or configure it in your IDE.
> - If running from terminal, include it in the classpath like this:
```bash
javac -cp ".;mysql-connector-java-8.0.xx.jar" Main.java
java -cp ".;mysql-connector-java-8.0.xx.jar" Main


### Steps:
1. Clone or Download
2. Run the `schema.sql` file in MySQL Workbench to create the database and tables.
3. Update the database credentials in `DBUtil.java`.
4. To verify that your connection works before      running the full app,In Main.java, temporarily add this code:
```java
try {
    Connection con = DBUtil.getConnection();
    if (con != null && !con.isClosed()) {
        System.out.println("JDBC Connection successful!");
    } else {
        System.out.println("Connection failed.");
    }
    con.close();
} catch (Exception e) {
    e.printStackTrace();
}
```

5. Compile and run the application using:
```bash
   javac Main.java
   java Main
```
6. Console Output  
This is the output of a successful JDBC connection:

![Console Output](screenshots/connection.png)
---

## 6. Screenshots

### 6.1 Add Citizen
![Insertion Check](screenshots/citizeninsert.png)

### 6.2 All Citizens in the System
![All Citizens](screenshots/view_citizen_record.png)

### 6.3 Update Citizen
![Updatioon Check](screenshots/citizenupdate.png)

### 6.4 Delete Citizen
![Deletion Check](screenshots/citizendelete.png)

### 6.5 Insert Request
![Insertion Check](screenshots/add_request.png)

### 6.6 View Request
![All Requests](screenshots/view_all_request.png)

### 6.7 Update Request
![Updation Check](screenshots/update_request.png)

### 6.8 Delete Request
![Deletion Check](screenshots/request_delete.png)

### 6.9 Pending Requests by Priority
![Priority Queue](screenshots/priorityqueue.png)

---