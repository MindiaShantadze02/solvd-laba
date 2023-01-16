USE university;

-- INSERT Statements
INSERT INTO Students VALUES -- ("01234567890", "Mindia", "Shantadze", "591010203", 1, NULL, "Male", 3, "2002-12-02"),
						    ("43243243243", "Rick", "Sanchez", "227511221", 1, NULL, "Male", 4, "1999-3-4"),
                            ("65645464588", "Rickone", "Sanchezfive", "2212311222", 1, NULL, "Male", 3, "1999-3-4"),
                            ("87687696768", "Ricktwo", "Sanchezsix", "224321223", 1, NULL, "Male", 3, "2002-3-4"),
                            ("43243423432", "Rickthree", "Sanchezseven", "22678224", 1, NULL, "Male", 2, "2003-3-4"),
                            ("54354354323", "Rickfour", "Sanchezbla", "229481225", 1, NULL, "Male", 3, "2003-3-4");

INSERT INTO Departments VALUES (NULL, "Science Department", "02123456789");
INSERT INTO Administration VALUES -- ("02123456789", "John", "Doe", "Admin", "571001122", "Male", NULL, 1),
								  ("03020104051", "Random", "Person", "Financist", "591020106", "Female", NULL, 1),
                                  ("01245674050", "Randoma", "Personone", "Financist", "591520106", "Female", NULL, 1),
                                  ("03020424050", "Randomb", "Persontwo", "Rector", "591720106", "Female", NULL, 1),
                                  ("03020768950", "Randomc", "Technician", "Financist", "592320106", "Male", NULL, 1),
                                  ("03026126050", "Randomd", "Personfour", "Financist", "596620106", "Male", NULL, 1),
                                  ("03027104050", "Randome", "Personfive", "Financist", "591780106", "Male", NULL, 1),
                                  ("03920888880", "Randomf", "Personsix", "Technician", "591022106", "Female", NULL, 1),
                                  ("17020104051", "Randomg", "Personseven", "Financist", "591120106", "Female", NULL, 1);
                                  
INSERT INTO Classes (name, description, level, department_id) VALUES ("OOP", "In this course students will learn OOP", 1, 1);

INSERT INTO ClassesStudents VALUES ("01234567890", 3), ("01234567890", 3);

INSERT INTO Finances (amount, payment_date, student_id, department_id) VALUES (600.0, "2023-02-20", "01234567890", 1),
																			  (750.0, "2023-03-31", "01234567890", 1),
                                                                              (599.0, "2023-03-31", "01234567890", 1),
                                                                              (900.0, "2023-03-31", "010630405", 1),
                                                                              (500.0, "2023-03-31", "010630405", 1);

INSERT INTO Events (name, description, organiser_id, date) VALUES ("Chess tourmament", "Tournament for chess enjoyers", "010630405", "2023-01-29"),
																  ("Some Event", "Some event description", "010630405", "2023-02-02"),
                                                                  ("Third Event", "Third event description...", "01234567890", "2023-03-01");

INSERT INTO Scholarships (name, description, coverage) VALUES ("Random Scholarship", "Hello this is some random scholarship", 500),
															  ("Petter Griffin scholarship", "This is also some random scholarship but with different name", 800),
                                                              ("3 Scholarship", "This is third scholarship", 900),
                                                              ("4th scholarship", "And here it is! the forth scholarship", 650);
  
INSERT INTO ScholarshipsStudents (scholarship_id, student_id) VALUES (2, "01234567890"),
																	 (2, "01234567890"), 
																	 (3, "01234567890"), 
                                                                     (3, "010630405"), 
                                                                     (4, "01234567890");
    
INSERT INTO SocialPrograms (name, coverage) VALUES ("Social Program for some people", 600), 
												   ("Some random social program", 700),
                                                   ("Also random SP", 450);

INSERT INTO SocialProgramsStudents (social_program_id, student_id) VALUES (1, "010630405"), (2, "010630405"), (2, "01234567890");

INSERT INTO Lecturer VALUES ("95960315671", "Chuck", "Norris", "593010203", "Lecturer", "1980-12-02", NULL, "Male");

-- AGGREGATE FUNCTIONS
SELECT MAX(coverage) AS max FROM SocialPrograms;

SELECT MIN(coverage) AS min FROM SocialPrograms;

SELECT AVG(coverage) FROM SocialPrograms;

SELECT SUM(amount) FROM Finances;

SELECT COUNT(student_id) FROM Students;

SELECT MAX(amount) - MIN(amount) FROM Finances;

-- AGGREGATE FUNCTIONS WITH GROUP BY AND HAVING
SELECT student_id, MAX(amount) AS max_amount FROM Finances GROUP BY student_id;

SELECT student_id, COUNT(amount) AS payment_count FROM Finances GROUP BY student_id;

SELECT birth_date, COUNT(student_id) FROM students GROUP BY birth_date;

SELECT gender, COUNT(employee_id) FROM Administration GROUP BY gender;

SELECT YEAR(birth_date), AVG(level) FROM Students GROUP BY YEAR(birth_date);

SELECT scholarship_id, COUNT(student_id) FROM ScholarshipsStudents GROUP BY scholarship_id;

-- UPDATE Statements
UPDATE Students SET first_name = "Beth", last_name = "Smith" WHERE student_id = "010630405";

UPDATE Administration SET photo = "photo-link.png", last_name = "Lenon" WHERE employee_id = "02123456789";

UPDATE Classes SET level = 4 WHERE class_id = 3;

UPDATE Events SET date = "2024-01-01" WHERE event_id = 1;

UPDATE Departments SET name = "STEM" WHERE department_id = 1;

UPDATE Scholarships SET name = "Hello World Scholarship" WHERE scholarship_id = 1;

UPDATE SocialPrograms SET coverage = 550 WHERE social_program_id = 2;

UPDATE Finances SET amount = 1000 WHERE student_id = "01234567890";

UPDATE Lecturer SET phone_number = "555001145" WHERE lecturer_id = "95960315671";

UPDATE ScholarshipsStudents SET scholarship_id = 1 WHERE student_id = "01234567890";


-- DELETE Statemnets
DELETE FROM Finances WHERE student_id IN ("01234567890", "010630405");

DELETE FROM SocialProgramsStudents WHERE student_id IN ("01234567890", "010630405");

DELETE FROM ScholarshipsStudents WHERE student_id IN ("01234567890", "010630405");

DELETE FROM ClassesStudents WHERE student_id IN ("01234567890", "010630405");

DELETE FROM Classes WHERE class_id = 3;

DELETE FROM Finances WHERE student_id = "01234567890";

DELETE FROM Lecturer WHERE lecturer_id = "95960315671";

DELETE FROM Administration WHERE employee_id = "02123456789";

DELETE FROM Events WHERE event_id = 1;

DELETE FROM Scholarships WHERE scholarship_id = 1;

-- JOINS
SELECT * FROM Students INNER JOIN finances ON Students.student_id = Finances.student_id;

SELECT Students.student_id, first_name, last_name, coverage FROM Students 
INNER JOIN ScholarshipsStudents ON 
Students.student_id = ScholarshipsStudents.student_id
INNER JOIN Scholarships ON
ScholarshipsStudents.scholarship_id = Scholarships.scholarship_id;

SELECT Students.student_id, Classes.class_id FROM Students 
LEFT JOIN ClassesStudents ON 
Students.student_id = ClassesStudents.student_id
LEFT JOIN Classes ON
ClassesStudents.class_id = Classes.class_id;

SELECT Administration.employee_id, Departments.department_id FROM Administration
RIGHT JOIN Departments ON Administration.employee_id = Departments.head_of_department_id;

SELECT Students.student_id, Events.event_id FROM Events 
LEFT JOIN Students ON Students.student_id = Events.organiser_id
UNION
SELECT Students.student_id, Events.event_id FROM Events 
LEFT JOIN Students ON Students.student_id = Events.organiser_id;
