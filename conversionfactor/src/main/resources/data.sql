DROP TABLE IF EXISTS conversion;
CREATE TABLE conversion( id INT AUTO_INCREMENT PRIMARY KEY, country VARCHAR(25) NOT NULL, factor decimal(30,5) NOT NULL);  
INSERT INTO conversion(country, factor) VALUES
('US', 0.013),
('EU', 0.012);