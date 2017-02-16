CREATE TABLE user (
id INT NOT NULL AUTO_INCREMENT,
username VARCHAR(255),
password VARCHAR(255),
PRIMARY KEY (id)
)Engine=InnoDB;

CREATE TABLE vehicle (
id INT NOT NULL AUTO_INCREMENT,
userid INT NOT NULL,
type INT NOT NULL,
displayname VARCHAR(255),
totalkilometersdriven INT,
latestinspectiondate DATE,
lastinspectiondate DATE,
latestoilchange DATE,
PRIMARY KEY (id),
FOREIGN KEY (userid) REFERENCES user (id)
)Engine=InnoDB;

CREATE TABLE servicelog (
id INT NOT NULL AUTO_INCREMENT,
vehicleid INT NOT NULL,
entry TEXT,
date TEXT,
PRIMARY KEY (id),
FOREIGN KEY (vehicleid) REFERENCES vehicle (id)
)Engine=InnoDB;