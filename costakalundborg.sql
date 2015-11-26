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
	hasDog        BOOLEAN
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


INSERT INTO products (name, maxAdults, maxChildren, seasonPriceL, seasonPriceH)
VALUES ("Fucking fedt hus", 9, 7, 900, 88)
       ("Test hus - ret nedren", 9, 7, 900, 88);
              
INSERT INTO customers (name, email)
VALUES ("Lars14", "areyouthefbiorsomething@fuckyou.now")
	   ("Favad Saidi", "favadsmailtilfraekketilbud@hollydayallday.now");

INSERT INTO extraProducts (productName, price, unit)
VALUES ("Strøm", 9000.0, "Kwh")
	   ("Hund",  100, "")


INSERT INTO spots (productID, location, size)
VALUES (1, 2, 2)
       (1, 2, 2)
       (1, 2, 2)
       (1, 2, 2)
       (1, 2, 2)
       (1, 2, 2);
		   
INSERT INTO reservations (customerID, spotID, startDate, endDate, adults, children, status, hasDog)
VALUES (1, 1, STR_TO_DATE("1/1/2016", "%d/%m/%Y"), STR_TO_DATE("2/1/2016", "%d/%m/%Y"), 2, 4, "test", FALSE)
	   (2, 2, STR_TO_DATE("2/1/2016", "%d/%m/%Y"), STR_TO_DATE("5/1/2016", "%d/%m/%Y"), 2, 4, "TEST", TRUE);
		  

INSERT INTO extraBuys (extraProductID, reservationID, amount, isPaid)
VALUES (1, 1, 3.6, TRUE);