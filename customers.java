CREATE TABLE customers(id INT, name VARCHAR(50), phone VARCHAR(15));

INSERT INTO customers VALUES (1, 'Ravi', '9876543210');

SELECT * FROM customers WHERE name LIKE '%Ra%';

UPDATE customers SET phone = '9999999999' WHERE id = 1;

DELETE FROM customers WHERE id = 1;