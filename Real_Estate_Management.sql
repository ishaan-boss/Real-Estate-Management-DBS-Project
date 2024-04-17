CREATE DATABASE Real_Estate_Management;
 -- drop database Real_Estate_Management;
USE Real_Estate_Management;
CREATE TABLE Seller (
	S_Id int PRIMARY KEY AUTO_INCREMENT,
    Name varchar(100) NOT NULL,
    DOB date,
    Phone varchar(10) NOT NULL,
    Address varchar(200),
	Email varchar(50) UNIQUE NOT NULL,
    Password varchar(20) NOT NULL);

CREATE TABLE Buyer (
	B_Id int PRIMARY KEY AUTO_INCREMENT,
    Name varchar(100) NOT NULL,
    DOB date,
    Phone varchar(10) NOT NULL,
    Address varchar(200),
	Email varchar(50) UNIQUE NOT NULL,
    Password varchar(20) NOT NULL);

CREATE TABLE Property (
	P_Id int PRIMARY KEY AUTO_INCREMENT,
    S_Id int NOT NULL,
    House_Name varchar(20),
    Size int NOT NULL,
    Status varchar(20) NOT NULL,
    House_No varchar(10),
	Floor int,
    Street_Name varchar(25),
    Locality varchar(20),
    City varchar(30) NOT NULL,
    State varchar(30) NOT NULL,
    Postal_Code int NOT NULL check(Postal_code between 100000 and 999999),
    Description varchar(1000),
    Listing_Category ENUM ("Sell", "Rent") NOT NULL,
	BHK int NOT NULL,
    Is_RERA_Approved ENUM ("Yes", "No") NOT NULL,
    FOREIGN KEY (S_Id) REFERENCES Seller(S_Id));
    
    CREATE TABLE Views (
	B_Id int,
    P_Id int,
    PRIMARY KEY(B_Id, P_Id),
    FOREIGN KEY(B_Id) REFERENCES Buyer(B_Id),
    FOREIGN KEY(P_Id) REFERENCES Property(P_Id));
    
CREATE TABLE Rent (
	P_Id int PRIMARY KEY,
    Rent_Price int NOT NULL,
    Duration int NOT NULL,
    R_Agr_Id int UNIQUE NOT NULL,
    FOREIGN KEY (P_Id) REFERENCES Property(P_Id));

CREATE TABLE Sale (
	P_Id int PRIMARY KEY,
    Price int NOT NULL,
    S_Agr_Id int UNIQUE NOT NULL,
    FOREIGN KEY (P_Id) REFERENCES Property(P_Id));

CREATE TABLE G_Map (
	P_Id int PRIMARY KEY,
    Latitude float NOT NULL,
    Longitude float NOT NULL,
    FOREIGN KEY (P_Id) REFERENCES Property(P_Id));

CREATE TABLE Review (
	P_Id int,
    Review varchar(200),
    FOREIGN KEY (P_Id) REFERENCES Property(P_Id));

CREATE TABLE Rating (
	P_Id int PRIMARY KEY,
    Rating float NOT NULL,
    View int NOT NULL,
    FOREIGN KEY (P_Id) REFERENCES Property(P_Id));
    
CREATE TABLE IMAGES(
	I_Id int PRIMARY KEY auto_increment,
    P_Id int,
    Image longblob,
    FOREIGN KEY(P_Id) REFERENCES PROPERTY(P_Id));    