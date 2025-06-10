CREATE TABLE citizen (
    citizen_id INT PRIMARY KEY AUTO_INCREMENT,
    citizen_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(10),
    address VARCHAR(250)
);
CREATE TABLE service_type (
    service_id INT PRIMARY KEY AUTO_INCREMENT,
    service_name VARCHAR(100) NOT NULL
);

CREATE TABLE technician (
    technician_id INT PRIMARY KEY AUTO_INCREMENT,
    tech_name VARCHAR(50) NOT NULL,
    phone_number VARCHAR(10),
    skill_area VARCHAR(100)
);

CREATE TABLE request (
    request_id INT PRIMARY KEY AUTO_INCREMENT,
    citizen_id INT,
    technician_id INT,
    service_id INT,
    status VARCHAR(50),
    priority VARCHAR(50),
    request_date DATETIME DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (citizen_id) REFERENCES citizen(citizen_id),
    FOREIGN KEY (technician_id) REFERENCES technician(technician_id),
    FOREIGN KEY (service_id) REFERENCES service_type(service_id)
);
