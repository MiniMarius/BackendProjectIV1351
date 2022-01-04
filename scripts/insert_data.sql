
INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (1, "13:00", "14:00", 2, #{studentId} , #{instructorId});

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (#{id}, #{type});

INSERT INTO LEASES (id, start_time, end_time, rental_instrument_id, student_id)
VALUES (#{id}, #{startTime}, #{endTime}, #{rentalInstrumentId}, #{studentId});

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (1, "group guitar", "learn how to read notes", 5, 15, "guitar", null);

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (2, "private lesson guitar", "learn how to play first instrument", 1, 1, "guitar", null);

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (3, "rock ensemble", "Lets learn how to rock n roll", 10, 30, null, "rock");

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (4, "beautiful sounds", "Lets learn how to play harmonic music", 2, 15, "flute", null);

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

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (1, "19990416", "Kelly Francis", 22, "Fredsgatan 2" , "abc123@live.se", "07105215");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (2, "19960512", "Kyle Kent", 25, "Abbagatan 1", "kyle123@google.com", "19025152");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (3, "20010306", "Frans Fagerlund", 20, "Bertagatan 4" , "Fransff@google.com", "19021401");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (4, "20041010", "Filip Flint", 16, "Carl wilhelmsvägen 5" , "flintfilip@live.se", "01593511");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (5, "19990712", "Palle Porjas", 22, "Digiloogatan 10" , "Pallepratar@hotmail.com", "9012515");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (6, "19950611", "Henrik Amdahl", 26, "Eriksdahlsgatan 2" , "Amdahlbossen@google.com", "10295190");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (7, "19991010", "Iris Vantanen", 22, "Flintavägen 99" , "Irisvantanen@live.se", "9129141");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (8, "19891212", "Adam Adamsson", 32, "Gjoerhelmsgatan 44" , "Adamadamadam123@hotmail.com", "129091025");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (9, "20000101", "Erik Kolros", 22, "Hopplagatan 66" , "Kolerik@google.com", "9012095109");

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (10, "20030303", "Rasmus Eriksson", 17, "Ingalundalunden 20" , "Erikssonrasmus@live.se", "071259124");

INSERT INTO USER_PAYMENTS (id, type, amount, currency, user_id)
VALUES (#{id}, #{type}, #{amount}, #{currency}, #{userid});