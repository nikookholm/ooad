/* Drops already existing tables */
DROP TABLE IF EXISTS reservations;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS spots;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS extraBuys;
DROP TABLE IF EXISTS extraProducts;

/* Creates the tables */

CREATE TABLE products(
	productID    INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name         TEXT,
	maxAdults    INT,
	maxChildrens INT,
	seasonPriceL REAL,
	seasonPriceH REAL
) ENGINE=innoDB;

CREATE TABLE extraProducts(
	extraProductID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	productName    TEXT,
	price          REAL,
	unit	       TEXT
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

CREATE TABLE customers(
	customerID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	name       TEXT,
	email      TEXT
) ENGINE=innoDB;

CREATE TABLE spots(
	spotID        INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	productId     INT,
	location      INT,
	size          INT,
	FOREIGN KEY (productID) REFERENCES products(productID)
) ENGINE=innoDB;

CREATE TABLE reservations(
	reservationID INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	customerID    INT,
	spotID        INT,
	startDate     DATE,
	endDate       DATE
	adults        INT,
	childrens     INT,
	FOREIGN KEY (customerID) REFERENCES customers(customerID),
	FOREIGN KEY (spotID) REFERENCES spots(spotID)
) ENGINE=innoDB;

/* Inserts data in the tables */


INSERT INTO products (name, maxAdults, maxChildrens, seasonPriceL, seasonPriceH)
              VALUES ("Test", 9, 7, 900, 88);

INSERT INTO extraProducts (productName, price, unit)
		   VALUES ("test extra product", 3.6, "bananer")


INSERT INTO extraBuys (extraProductID, reservationID, amount, isPaid)
	       VALUES (0, 0, 3.6, TRUE)


INSERT INTO customer (name, email)
	      VALUES ("Lars14", "areyouthefbiorsomething@fuckyou.now");


INSERT INTO reservations (customerID, spotID, startDate, endDate, adults, children)
		  VALUES (0, 0, STR_TO_DATE("1/1/2016", "%d/%m/%Y"), STR_TO_DATE("2/1/2016", "%d/%m/%Y"), 2, 4);


INSERT INTO spots (productID, location, size)
	   VALUES (0, 2, 2);