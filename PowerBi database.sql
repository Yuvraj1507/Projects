-- Create the database (if not already created)
CREATE DATABASE sales_db;

-- Use the database
USE sales_db;

-- Create the sales table
CREATE TABLE sales (
    order_id INT PRIMARY KEY,
    product_name VARCHAR(255),
    region VARCHAR(100),
    sales_amount DECIMAL(10, 2),
    quantity INT,
    order_date DATE,
    customer_id VARCHAR(50)
);
show databases

-- Insert sample data into the sales table
INSERT INTO sales (order_id, product_name, region, sales_amount, quantity, order_date, customer_id)
VALUES
(1001, 'Laptop', 'North', 1200, 2, '2023-05-01', 'C001'),
(1002, 'Phone', 'South', 800, 1, '2023-05-02', 'C002'),
(1003, 'Tablet', 'East', 500, 3, '2023-05-03', 'C003'),
(1004, 'Laptop', 'West', 1500, 1, '2023-05-04', 'C004'),
(1005, 'Phone', 'North', 700, 2, '2023-05-05', 'C005');
