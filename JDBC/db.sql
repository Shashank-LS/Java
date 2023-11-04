-- Create a database schema if it doesn't already exist
CREATE DATABASE IF NOT EXISTS db;

-- Switch to the 'db' database
USE db;

-- Create a table 'db_table' with columns 'id', 'name_', and 'Qualification'
CREATE TABLE IF NOT EXISTS db (
    id INT,
    name_ VARCHAR(50)
);

-- Insert data into the 'db_table'
INSERT INTO db (id, name_) VALUES (10, 'shashank');

-- Select all rows from 'db_table'
SELECT * FROM db;

-- Drop the 'db_table' table
DROP TABLE IF EXISTS db;

