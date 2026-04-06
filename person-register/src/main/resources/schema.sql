CREATE TABLE community_details (
    address_id   VARCHAR(20) PRIMARY KEY,
    house_no     VARCHAR(10),
    street       VARCHAR(100),
    city         VARCHAR(50),
    country      VARCHAR(50),
    postal_code  VARCHAR(20)
);

CREATE TABLE person (
    personal_no     BIGINT PRIMARY KEY,
    person_name     VARCHAR(100),
    age             INT,
    date_of_birth   DATE,
    gender          VARCHAR(10),
    age_group       VARCHAR(20),
    address_id      VARCHAR(20),
    CONSTRAINT fk_person_address
        FOREIGN KEY (address_id)
        REFERENCES community_details(address_id)
);

INSERT INTO community_details
(address_id, house_no, street, city, country, postal_code)
VALUES
('ADDR12A', '12A', 'Trodhiemsgatan', 'Stockholm', 'Sweden', '16472'),
('ADDR14B', '14B', 'Norgegatan', 'Stockholm', 'Sweden', '16477'),
('ADDR01C', '01C', 'Oslogatan', 'Stockholm', 'Sweden', '16474');

INSERT INTO person
(personal_no, person_name, age, date_of_birth, gender, age_group, address_id)
VALUES
(199505158818, 'John Doe', 30, DATE '1995-05-15', 'Male', NULL, 'ADDR12A'),
(199708229011, 'Priya Sharma', 28, DATE '1997-08-22', 'Female', NULL, 'ADDR14B'),
(199002108988, 'Michael Smith', 35, DATE '1990-02-10', 'Male', NULL, 'ADDR01C'),
(199810157858, 'Janny Smith', 25, DATE '1998-10-15', 'Female', NULL, 'ADDR01C');