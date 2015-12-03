/* Drops already existing tables */
DROP TABLE IF EXISTS extraBuys;
DROP TABLE IF EXISTS extraProducts;
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS spots;
DROP TABLE IF EXISTS products;

/* Creates the tables */

CREATE TABLE products(
	productID    INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name         TEXT,
	maxAdults    INT,
	maxChildren  INT,
	seasonPriceL REAL,
	seasonPriceH REAL
) ENGINE=innoDB;

CREATE TABLE customers(
	customerID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name       TEXT,
	email      TEXT
) ENGINE=innoDB;

CREATE TABLE extraProducts(
	extraProductID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	productName    TEXT,
	price          REAL,
	unit	       TEXT
) ENGINE=innoDB;

CREATE TABLE spots(
	spotID        INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	productID     INT,
	location      INT,
	size          INT,
	FOREIGN KEY (productID) REFERENCES products(productID)
) ENGINE=innoDB;

CREATE TABLE reservations(
	reservationID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customerID    INT,
	spotID        INT,
	startDate     DATE,
	endDate       DATE,
	adults        INT,
	children      INT,
	status        TEXT,
	hasDog        BOOLEAN,
	FOREIGN KEY (customerID) REFERENCES customers(customerID),
	FOREIGN KEY (spotID) REFERENCES spots(spotID)
) ENGINE=innoDB;

CREATE TABLE extraBuys(
	extraBuyID      INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	extraProductID	INT,
	reservationID	INT,
	amount          REAL,
	isPaid          BOOLEAN,
	FOREIGN KEY (extraProductID) REFERENCES extraProducts(extraProductID),
	FOREIGN KEY (reservationID)  REFERENCES reservations(reservationID)
) ENGINE=innoDB;

/* Inserts data in the tables */


INSERT INTO products(name, maxAdults, maxChildren, seasonPriceL, seasonPriceH) VALUES 
(“telt”, 0, 0, 0, 0),
(“vognLille”, 0, 0, 25, 25),
(“vognStor”, 0, 0, 40, 40),
(“Alm Hytte”, 2, 0, 415, 450),
(“Lille Hytte”, 2, 0, 380, 410),
(“Hytte 4.pers”, 4, 0, 700, 800),
(“Luksus Hytte Tag”, 6, 0, 810, 910),
(“Luksus Hytte Alm”, 6, 0, 790, 890);
              
INSERT INTO customers(name, email) VALUES
(“Favad, “favad@favad.dk”),
(“Jacob”, “jacob@jacob.dk”),
(“SheKim”, “shekim@shekim.dk”),
(“Amal”, “amal@amal.dk”),
(“Niko”, “niko@niko.dk”),
(“Kim”, “kim@kim.dk”);

INSERT INTO extraProducts (productName, price, unit)
VALUES ("Strøm", 9000.0, "Kwh");

INSERT INTO spots(productID, location, size) VALUES
(1, 1, 0),
(1, 2, 0),
(1, 3, 0),
(1, 4, 0),
(1, 5, 0),
(2, 12, 0),
(2, 13, 0),
(2, 14, 0),
(2, 15, 0),
(2, 16, 0),
(2, 17, 0),
(2, 18, 0),
(2, 19, 0),
(2, 20, 0),
(2, 21, 0),
(2, 22, 0),
(2, 23, 0),
(2, 24, 0),
(2, 25, 0),
(2, 26, 0),
(3, 31, 0),
(3, 32, 0),
(3, 33, 0),
(3, 34, 0),
(3, 35, 0),
(3, 36, 0),
(3, 37, 0),
(3, 38, 0),
(3, 39, 0),
(4, 6, 0),
(4, 7, 0),
(4, 8, 0),
(4, 9, 0),
(5, 10, 0),
(5, 11, 0),
(5, 27, 0),
(5, 28, 0),
(5, 29, 0),
(5, 30, 0),
(6, 40, 0),
(6, 41, 0),
(7, 44, 0),
(7, 45, 0),
(8, 65, 0),
(8, 66, 0),
(8, 67, 0),
(8, 68, 0);
		   
INSERT INTO reservations(customerID, spotID, startDate, endDate, adults, children, status, hasDog) VAlUES
(1, 1, STR_TO_DATE(“04-12-2015”, “%d/%m/%Y”), STR_TO_DATE(“11/12/2015”, "%d/%m/%Y"), 2, 2, 0, TRUE),
(2, 7, STR_TO_DATE(“06-12-2015”, “%d/%m/%Y”), STR_TO_DATE(“13/12/2015”, "%d/%m/%Y"), 4, 2, 0, FALSE),
(3, 20, STR_TO_DATE(“05-12-2015”, “%d/%m/%Y”), STR_TO_DATE(“20/12/2015”, “%d/%m/%Y”), 3, 1, 0, TRUE),
(4, 25, STR_TO_DATE(“04-12-2015”, “%d/%m/%Y”), STR_TO_DATE(“30/12/2015”, “%d/%m/%Y”), 4, 0, 0, FALSE),
(5, 28, STR_TO_DATE(“01-12-2016”, “%d/%m/%Y”), STR_TO_DATE(“21/01/2016”, “%d/%m/%Y”), 4, 4, 0, TRUE),
(6, 30, STR_TO_DATE(“04-12-2015”, “%d/%m/%Y”), STR_TO_DATE(“11/12/2015”, "%d/%m/%Y"), 1, 0, 0, TRUE);
		  

INSERT INTO extraBuys (extraProductID, reservationID, amount, isPaid)
VALUES (1, 1, 3.6, TRUE);