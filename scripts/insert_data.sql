
INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (#{id}, #{startTime}, #{endTime}, #{lessonId}, #{studentId} , #{instructorId});

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (#{id}, #{type});

INSERT INTO LEASES (id, start_time, end_time, rental_instrument_id, student_id)
VALUES (#{id}, #{startTime}, #{endTime}, #{rentalInstrumentId}, #{studentId});

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (#{id}, #{name}, #{description}, #{minParticipants}, #{maxParticipants}, #{type}, #{genre});

INSERT INTO PARENTS (student_id, parent_id)
VALUES (#{studentId}, #{parentId});

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (#{id}, #{description}, #{serialNumber}, #{instrumentTypeId});

INSERT INTO SIBLINGS (student_id, student_id2)
VALUES (#{studentIdOne}, #{studentIdTwo});

INSERT INTO APPLICATIONS (id, letter, instrument_type_id, user_id)
VALUES (#{id}, #{letter}, #{instrumentTypeId}, #{userId});

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (#{userId}, #{instrumentTypeId});

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number)
VALUES (#{id}, #{personNumber}, #{name}, #{age}, #{address} , #{email}, #{phoneNumber});

INSERT INTO USER_PAYMENTS (id, type, amount, currency, user_id)
VALUES (#{id}, #{type}, #{amount}, #{currency}, #{userid});