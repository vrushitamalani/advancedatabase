CREATE TABLE IF NOT EXISTS Products (
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    ProductName VARCHAR(100) NOT NULL,
    Price DECIMAL(10, 2) NOT NULL,
    Stock INT NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Products (ProductName, Price, Stock) VALUES 
('Shampoo', 100.00, 150),
('HairOil', 70.00, 400),
('conditioner' , 80.00 , 250);

SELECT * FROM Products;
