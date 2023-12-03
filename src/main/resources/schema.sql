-- Future me, the issue we have is due to the PRIMARY KEYS/FOREIGN KEYS OF RESUME TABLE AND OTHER TABLES (CONTACT_DETAILS ETC)
-- I tried for like 10 mins but I cant figure out why this fails, as we first create a resume and then contact details

-- Create table for Resume
CREATE TABLE IF NOT EXISTS resume (
    id BIGINT PRIMARY KEY AUTO_INCREMENT
);

-- Create table for ContactDetails
CREATE TABLE IF NOT EXISTS contact_details (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(255),
    linked_in VARCHAR(255),
    email VARCHAR(255),
    github VARCHAR(255),
    mobile VARCHAR(255),
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Certification
CREATE TABLE IF NOT EXISTS certification (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    certification_name VARCHAR(255),
    organization VARCHAR(255),
    certification_date DATE,
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Education
CREATE TABLE IF NOT EXISTS education (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    university VARCHAR(255),
    degree VARCHAR(255),
    grade DOUBLE,
    graduation_date DATE,
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Role
CREATE TABLE IF NOT EXISTS role (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(255),
    position VARCHAR(255),
    location VARCHAR(255),
    working_model VARCHAR(255),
    employment_type VARCHAR(255),
    start_date DATE,
    end_date DATE,
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Language
CREATE TABLE IF NOT EXISTS spoken_language (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    language_name VARCHAR(255),
    proficiency VARCHAR(255),
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Project
CREATE TABLE IF NOT EXISTS project (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    project_name VARCHAR(255),
    description TEXT,
    resume_id BIGINT,
    FOREIGN KEY (resume_id) REFERENCES resume(id)
);

-- Create table for Achievements
CREATE TABLE IF NOT EXISTS achievements (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    role_id BIGINT,
    description TEXT,
    FOREIGN KEY (role_id) REFERENCES role(id)
);

-- Create table for Technology Stack
CREATE TABLE IF NOT EXISTS technology_stack (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    role_id BIGINT,
    technology TEXT,
    FOREIGN KEY (role_id) REFERENCES role(id)
);

-- Use the generated resume_id when inserting into the contact_details table
INSERT INTO contact_details (full_name, linked_in, email, github, mobile, resume_id)
VALUES ('Panagiotopoulos Panagiotis', 'https://www.linkedin.com/in/panayiotis-panagiotopoulos/', 'takispanayiot@gmail.com', 'https://github.com/takispanag', '(+30) 6979579800', 1);

-- Insert a row into the resume table
INSERT INTO resume DEFAULT VALUES;

-- Insert into Certification
INSERT INTO certification (certification_name, organization, certification_date, resume_id)
VALUES ('Master Microservices with Spring Boot, Spring Cloud, Docker and Kubernetes', 'Udemy', '2022-06-09', 1);

-- Insert into Education
INSERT INTO education (university, degree, grade, graduation_date, resume_id)
VALUES ('University of Peloponnese', 'B.Sc. in Software Engineering', 8.32, '2022-09-01', 1);

-- Insert into Role
INSERT INTO role (company_name, position, location, working_model, employment_type, start_date, end_date, resume_id)
VALUES ('Tyntec - Cloud Telecommunications', 'Java Software Engineer - Backend', 'Dortmund, Germany', 'REMOTE', 'Full-time', '2023-09-01', null, 1);
INSERT INTO role (company_name, position, location, working_model, employment_type, start_date, end_date, resume_id)
VALUES ('Light & Wonder - iGaming', 'Java Software Engineer - Backend', 'Athens, Greece', 'REMOTE', 'Full-time', '2022-08-08', '2023-09-01', 1);
INSERT INTO role (company_name, position, location, working_model, employment_type, start_date, end_date, resume_id)
VALUES ('Deloitte', 'Consulting Intern - Backend', 'Athens, Greece', 'REMOTE', 'Full-time', '2022-02-01', '2022-08-01', 1);

-- Insert into Language
INSERT INTO spoken_language (language_name, proficiency, resume_id)
VALUES ('Greek', 'NATIVE', 1);
INSERT INTO spoken_language (language_name, proficiency, resume_id)
VALUES ('English', 'B2', 1);
INSERT INTO spoken_language (language_name, proficiency, resume_id)
VALUES ('German', 'A2', 1);

-- Insert into Project
INSERT INTO project (project_name, description, resume_id)
VALUES ('Twitter Sentiment Analysis for Stock Prediction (Thesis)', 'Implemented a tool for market close price prediction using Deep Neural Networks and traditional ML methods by analyzing Twitter sentiment.', 1);

-- Insert into Resume
INSERT INTO resume (contact_details_id, role_id, projects_id, spoken_languages_id, certifications_id, education_id)
VALUES (1, 1, 1, 1, 1, 1);
