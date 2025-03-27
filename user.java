CREATE TABLE IF NOT EXISTS Users (
    UserID INT AUTO_INCREMENT PRIMARY KEY,
    Username VARCHAR(50) NOT NULL,
    Email VARCHAR(100) NOT NULL UNIQUE,
    PasswordHash VARCHAR(255) NOT NULL,
    CreatedAt TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Users (Username, Email, PasswordHash) VALUES 
('1' , 'Tom ', 'tom@gmail.com', 'hashedpassword1'),
('2','Jenny', 'jenny@gmail.com', 'hashedpassword2'),
('3','Johanna', 'johanna@gmail.com', 'hashedpassword3');

SELECT * FROM Users;
