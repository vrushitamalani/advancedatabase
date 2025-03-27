CREATE TABLE Transactions (
    TransactionID INT AUTO_INCREMENT PRIMARY KEY,
    OrderID INT,
    PaymentMethod VARCHAR(50),
    Amount DECIMAL(10, 2) NOT NULL,
    TransactionDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID)
);

INSERT INTO Transactions (OrderID, PaymentMethod, Amount, TransactionDate) VALUES 
(1, 'online', 5000.00, 2023-09-12),
(2, 'cash', 8000.00, 2022-12-21),
(3, 'cash', 12000.00, 2021-06-06);


SELECT * FROM ecommercedb.transaction;