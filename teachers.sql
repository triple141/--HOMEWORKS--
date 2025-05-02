DROP TABLE IF EXISTS teacher;
CREATE TABLE teachers (
	id BIGINT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	hire_date DATE,
	email TEXT
);
SELECT table_name FROM INFORMATION_SCHEMA.Tables
WHERE table_schema = 'public';
INSERT INTO teachers VALUES
(1, 'Sarah', 'Anderson', '2002-04-17', 'sarah.mendez82@mailpro.com'),
(2, 'Jess', 'Garcia', '20010-11-29', 'jessica.lee2025@yahoo.com'),
(3, 'Nate', 'Robinson', '2001-08-06', 'nate_builder123@outlook.com'),
(4, 'Zoe', 'Mitchell', '1984-10-10', 'zoe.wilkins77@protonmail.com'),
(5, 'KittyCat', 'Grrrrrr', '2007-02-13', 'funnycat555@live.com');
SELECT * FROM teachers
WHERE hire_date > '2009-01-01';
ALTER TABLE teachers
ADD COLUMN department VARCHAR(50);
ALTER TABLE teachers
RENAME COLUMN email TO contact_email;
SELECT first_name, contact_email FROM teachers
WHERE hire_date < '2015-01-01' OR hire_date > '2018-12-31';