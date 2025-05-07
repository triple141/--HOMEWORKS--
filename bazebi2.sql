DROP TABLE students;

CREATE TABLE  students (
    id SERIAL PRIMARY KEY,  
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    dob DATE NOT NULL,
    enrollment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  
    grade INTEGER CHECK (grade >= 1 AND grade <= 12),  
    email TEXT UNIQUE NOT NULL  
    );
	
	INSERT INTO students (first_name, last_name, dob, enrollment_date, grade, email) VALUES
('Leqso', 'Wade', '2016-09-11', '2024-02-03 10:00:00', 4, 'lex.wade777@yahho.com'),
('Data', 'Dadiani', '2007-12-27', DEFAULT, 11, 'd.datiani07@gmail.com'),
('Vache', 'Rekhviashvili', '2013-01-09', DEFAULT, 6, 'Vachepro@gmail.com'),
('Mari', 'Kirvalidze', '2009-07-22', DEFAULT, 10, 'M.K2009@gmail.com'),
('Soso', 'Sasosise', '2013-12-05', '2024-02-20 15:47:00', 5, 'dzerskisosisi@gmail.com');
INSERT INTO students (first_name, last_name, dob, grade, email)
VALUES ('Zuka', 'Miqiashvili', '2008-03-21', 96, 'miqiashvili996@gmail.com');
UPDATE students
SET grade = grade + 1
WHERE grade = 6;
DELETE FROM students
WHERE first_name = 'Data';
SELECT * FROM students;