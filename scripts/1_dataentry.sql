
INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (1, '20100416', 'Kelly Francis', 12, 'Fredsgatan 2', 'abc123@live.se', '07105215', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (2, '20120512', 'Kyle Kent', 10, 'Abbagatan 1', 'KentPappa@hej.se', '19025152', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (3, '20130306', 'Frans Fagerlund', 9, 'Bertagatan 4' , 'Fransmamma@live.se', '19021401', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (4, '20141010', 'Filip Fagerlund', 8, 'Carl wilhelmsvägen 5' , 'flintsebbe@live.se', '01593511', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (5, '20120712', 'Palle Porjas', 10, 'Digiloogatan 10' , 'Pallespappapratar@hotmail.com', '9012515', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (6, '20090611', 'Henrik Amdahl', 13, 'Eriksdahlsgatan 2' , 'Henriksmamma@google.com', '10295190', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (7, '19991010', 'Iris Vantanen', 22, 'Flintavägen 99' , 'Irisvantanen@live.se', '9129141', 'Instructor');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (8, '19891212', 'Adam Adamsson', 32, 'Gjoerhelmsgatan 44' , 'Adamadamadam123@hotmail.com', '129091025', 'Instructor');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (9, '20000101', 'Erik Kolros', 22, 'Hopplagatan 66' , 'Kolerik@google.com', '9012095109', 'Instructor');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (10, '20030303', 'Rasmus Eriksson', 17, 'Ingalundalunden 20' , 'ErikssonElise@live.se', '071259124', 'Student');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (11, '10231023', 'Katarina Eriksson', '50', 'Tjabbatjenagatan 2', 'ErikssonKatarina@google.com', '12031031', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (12, '0121322', 'Johan Lindström', 55, 'Hingstgatan 22', 'bord123@live.se', '012312313', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (13, '12305124', 'Kristoffer Haninge', 62, 'Gammelgatan 44', 'gammal@hej.se', '03914124', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (14, '13123', 'Zacharias Konungsson', 39, 'Kungsgatan 44', 'Kungen@live.se', '0123131', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (15, '124151', 'Ingela Småholm', 43, 'Småholmsgatan 2', 'smaholma@google.com', '0213124', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (16, '126151', 'Bror Brorsson', 33, 'Brodersgatan 22', 'Brorbrosson@live.se', '02414124', 'Parent');

INSERT INTO USERS (id, person_number, name, age, address, email, phone_number, role)
VALUES (17, '112514', 'Friz Freschsson', 54, 'Gatansgatan 88', 'Fresch@live.se', '90151512', 'Parent');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (1, 'Guitar');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (2, 'Violin');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (3, 'Bass');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (4, 'Flute');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (5, 'Harmonica');

INSERT INTO INSTRUMENT_TYPES (id, type)
VALUES (6, 'Drums');

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (1, 'Poor shape, beaten', '123123019', 1);

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (2, 'Poor shape, very bad crack', '215125', 4);

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (3, 'ok shape, used condition', '721615', 3);

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (4, 'perfect shape', '1261614', 2);

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (5, 'ok shape, small paint scuffs', '716215400', 6);

INSERT INTO RENTAL_INSTRUMENTS (id, description, serial_number, instrument_type_id)
VALUES (6, 'sounds bad but looks good', '861251', 5);

INSERT INTO LEASES (id, start_time, end_time, rental_instrument_id, student_id)
VALUES (1, '2021-01-01T00:00:00', '2021-01-01T00:00:00', 2, 1);

INSERT INTO LEASES (id, start_time, end_time, rental_instrument_id, student_id)
VALUES (2, '2021-01-01T00:00:00', '2021-01-01T00:00:00', 3, 2);

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (1, 'group guitar', 'learn how to read notes', 5, 15, 'Group lesson', null);

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (2, 'private lesson guitar', 'learn how to play first instrument', 1, 1, 'Individual lesson', null);

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (3, 'rock ensemble', 'Lets learn how to rock n roll', 5, 30, 'ensemble', 'rock');

INSERT INTO LESSONS (id, name, description, min_participants, max_participants, type, genre)
VALUES (4, 'beautiful sounds', 'Lets learn how to play harmonic music', 2, 15, 'ensemble', 'soft');

INSERT INTO APPLICATIONS (id, letter, instrument_type_id, user_id)
VALUES (1, 'Hello i want to play the guitar im very good', 1, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (1, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (2, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (3, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (4, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (5,1 );

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (6, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (7, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (7, 2);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (7, 3);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (7, 4);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (8, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (8, 6);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (8, 4);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (9, 1);

INSERT INTO USER_INSTRUMENT_TYPES (user_id, instrument_type_id)
VALUES (10, 1);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (1, '2022-01-03T13:00:00', '2022-01-03T16:00:00', 2, 1 , 8);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (2, '2022-01-04T13:00:00', '2022-01-04T16:00:00', 4, 2 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (3, '2022-01-06T13:00:00', '2022-01-06T16:00:00', 4, 3 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (4, '2022-01-06T16:00:00', '2020-01-06T19:00:00', 4, 4 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (5, '2022-01-10T13:00:00', '2022-01-10T16:00:00', 4, 5 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (6, '2022-01-11T16:00:00', '2020-01-11T19:00:00', 4, 7 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (7, '2022-02-06T16:00:00', '2020-02-06T19:00:00', 4, 4 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (8, '2022-04-10T13:00:00', '2022-04-10T16:00:00', 4, 5 , 7);

INSERT INTO BOOKINGS (id, start_time, end_time, lesson_id, student_id, instructor_id)
VALUES (9, '2022-07-11T16:00:00', '2020-07-11T19:00:00', 4, 7 , 7);


INSERT INTO PARENTS (student_id, parent_id)
VALUES (1, 14);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (2, 11);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (3, 12);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (4, 13);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (5, 15);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (6, 16);

INSERT INTO PARENTS (student_id, parent_id)
VALUES (7, 17);

INSERT INTO SIBLINGS (student_id, student_id2)
VALUES (3, 4);

INSERT INTO USER_PAYMENTS (id, type, amount, currency, user_id)
VALUES (1, 'rental payment', 1000, 'SEK', 1);