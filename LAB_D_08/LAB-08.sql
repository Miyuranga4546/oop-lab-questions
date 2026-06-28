CREATE DATABASE IF NOT EXISTS oop_lab_08;

USE oop_lab_08;

CREATE TABLE students (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    mark INT NOT NULL
);
SHOW TABLES;
DESCRIBE students;

INSERT INTO students VALUES
(2, 'Kamal Silva', 74),
(3, 'Sunethra Fernando', 91);