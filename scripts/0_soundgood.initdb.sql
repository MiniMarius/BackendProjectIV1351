CREATE TYPE role AS ENUM ('Student', 'Instructor', 'Parent');
CREATE TABLE users (
 id INT NOT NULL,
 person_number VARCHAR(500),
 name VARCHAR(500),
 age VARCHAR(500),
 address VARCHAR(500),
 email VARCHAR(500),
 phone_number VARCHAR(500),
 user_role role
);

ALTER TABLE users ADD CONSTRAINT PK_users PRIMARY KEY (id);


CREATE TABLE instrument_types (
 id INT NOT NULL,
 type VARCHAR(500)
);

ALTER TABLE instrument_types ADD CONSTRAINT PK_instrument_types PRIMARY KEY (id);


CREATE TABLE applications (
 id INT NOT NULL,
 letter VARCHAR(2000),
 instrument_type_id INT,
 user_id INT
);

ALTER TABLE applications ADD CONSTRAINT PK_applications PRIMARY KEY (id);


CREATE TABLE user_payments (
 id INT NOT NULL,
 type VARCHAR(500),
 amount VARCHAR(500),
 currency VARCHAR(500),
 user_id INT
);

ALTER TABLE user_payments ADD CONSTRAINT PK_user_payments PRIMARY KEY (id);


CREATE TABLE user_instrument_types (
 user_id INT NOT NULL,
 instrument_type_id INT NOT NULL
);

ALTER TABLE user_instrument_types ADD CONSTRAINT PK_user_instrument_types PRIMARY KEY (user_id,instrument_type_id);


CREATE TABLE parents (
 student_id INT NOT NULL,
 parent_id INT NOT NULL
);

ALTER TABLE parents ADD CONSTRAINT PK_parents PRIMARY KEY (student_id,parent_id);


CREATE TABLE siblings (
 student_id INT NOT NULL,
 student_id2 INT NOT NULL
);

ALTER TABLE siblings ADD CONSTRAINT PK_siblings PRIMARY KEY (student_id,student_id2);


CREATE TABLE rental_instruments (
 id INT NOT NULL,
 description VARCHAR(2000),
 serial_number VARCHAR(500),
 instrument_type_id INT
);

ALTER TABLE rental_instruments ADD CONSTRAINT PK_rental_instruments PRIMARY KEY (id);


CREATE TABLE lessons (
 id INT NOT NULL,
 name VARCHAR(500),
 description VARCHAR(2000),
 level VARCHAR(500),
 min_participants INT,
 max_participants INT,
 type VARCHAR(500),
 genre VARCHAR(500)
);

ALTER TABLE lessons ADD CONSTRAINT PK_lessons PRIMARY KEY (id);


CREATE TABLE bookings (
 id INT NOT NULL,
 start_time VARCHAR(500),
 end_time VARCHAR(500),
 lesson_id INT,
 student_id INT,
 instructor_id INT
);

ALTER TABLE bookings ADD CONSTRAINT PK_bookings PRIMARY KEY (id);


CREATE TABLE leases (
 id INT NOT NULL,
 start_time VARCHAR(500),
 end_time VARCHAR(500),
 rental_instrument_id INT NOT NULL,
 student_id INT
);

ALTER TABLE leases ADD CONSTRAINT PK_leases PRIMARY KEY (id);


ALTER TABLE applications ADD CONSTRAINT FK_applications_0 FOREIGN KEY (instrument_type_id) REFERENCES instrument_types (id);
ALTER TABLE applications ADD CONSTRAINT FK_applications_1 FOREIGN KEY (user_id) REFERENCES users (id);


ALTER TABLE user_payments ADD CONSTRAINT FK_user_payments_0 FOREIGN KEY (user_id) REFERENCES users (id);


ALTER TABLE user_instrument_types ADD CONSTRAINT FK_user_instrument_types_0 FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE user_instrument_types ADD CONSTRAINT FK_user_instrument_types_1 FOREIGN KEY (instrument_type_id) REFERENCES instrument_types (id);


ALTER TABLE parents ADD CONSTRAINT FK_parents_0 FOREIGN KEY (student_id) REFERENCES users (id);
ALTER TABLE parents ADD CONSTRAINT FK_parents_1 FOREIGN KEY (parent_id) REFERENCES users (id);


ALTER TABLE siblings ADD CONSTRAINT FK_siblings_0 FOREIGN KEY (student_id) REFERENCES users (id);
ALTER TABLE siblings ADD CONSTRAINT FK_siblings_1 FOREIGN KEY (student_id2) REFERENCES users (id);


ALTER TABLE rental_instruments ADD CONSTRAINT FK_rental_instruments_0 FOREIGN KEY (instrument_type_id) REFERENCES instrument_types (id);


ALTER TABLE bookings ADD CONSTRAINT FK_bookings_0 FOREIGN KEY (lesson_id) REFERENCES lessons (id);
ALTER TABLE bookings ADD CONSTRAINT FK_bookings_1 FOREIGN KEY (student_id) REFERENCES users (id);
ALTER TABLE bookings ADD CONSTRAINT FK_bookings_2 FOREIGN KEY (instructor_id) REFERENCES users (id);


ALTER TABLE leases ADD CONSTRAINT FK_leases_0 FOREIGN KEY (rental_instrument_id) REFERENCES rental_instruments (id);
ALTER TABLE leases ADD CONSTRAINT FK_leases_1 FOREIGN KEY (student_id) REFERENCES users (id);


