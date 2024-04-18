INSERT INTO Seller (Name, DOB, Phone, Address, Email, Password) 
VALUES 
    ('Rajesh Kumar', '1980-07-25', '9876543210', 'A-102, Green Valley Apartments, Sector 15, Gurgaon', 'rajesh.kumar@example.com', 'password123'),
    ('Sangeeta Sharma', '1992-04-15', '9876541230', 'B-303, Rosewood Heights, Powai, Mumbai', 'sangeeta.sharma@example.com', 'securepass'),
    ('Anita Singh', '1978-03-12', '9876547890', 'C-203, Royal Residency, Whitefield, Bangalore', 'anita.singh@example.com', 'sellerpass'),
    ('Sanjay Verma', '1987-09-28', '9988774433', 'D-502, Ocean View Apartments, Bandra, Mumbai', 'sanjay.verma@example.com', 'password123'),
    ('Ramesh Singh', '1975-10-08', '9876541111', 'F-101, Green Meadows, HSR Layout, Bangalore', 'ramesh.singh@example.com', 'seller123'),
    ('Geeta Kapoor', '1983-05-18', '9988776655', 'G-402, Golden Towers, Worli, Mumbai', 'geeta.kapoor@example.com', 'geetapass');

INSERT INTO Buyer (Name, DOB, Phone, Address, Email, Password) 
VALUES 
    ('Amit Gupta', '1985-12-10', '9988776655', 'Flat No. 501, Skyline Towers, Indiranagar, Bangalore', 'amit.gupta@example.com', 'buyerpass'),
    ('Priya Patel', '1990-08-25', '9876543210', 'C-402, Orchid Gardens, Baner, Pune', 'priya.patel@example.com', 'anotherpass'),
    ('Nitin Shah', '1988-08-30', '9876549876', 'Flat No. 801, Palm Springs, Koramangala, Bangalore', 'nitin.shah@example.com', 'nitinpass'),
    ('Deepa Desai', '1995-04-25', '9988779988', 'H-204, Harmony Heights, Koregaon Park, Pune', 'deepa.desai@example.com', 'deepapass');

INSERT INTO Property (S_Id, House_Name, Size, Status, House_No, Floor, Street_Name, Locality, City, State, Postal_Code, Description, Listing_Category, BHK, Is_RERA_Approved) 
VALUES 
    (1, 'Luxury Villa', 3000, 'Ready to Move', '101', 1, 'MG Road', 'City Center', 'Gurgaon', 'Haryana', 122001, 'A luxurious villa with modern amenities.', 'Sell', 4, 'Yes'),
    (1, '2 BHK Apartment', 1200, 'Ready to Move', '501', 5, 'Old Airport Road', 'Indiranagar', 'Bangalore', 'Karnataka', 560038, 'A well-designed apartment in a prime location.', 'Rent', 2, 'No'),
    (2, 'Penthouse', 2500, 'Under Construction', '1203', 12, 'Powai Lake Road', 'Powai', 'Mumbai', 'Maharashtra', 400076, 'A luxurious penthouse with panoramic views.', 'Sell', 3, 'Yes'),
    (3, '3 BHK Apartment', 1500, 'Ready to Move', '1001', 10, 'Old Madras Road', 'Indiranagar', 'Bangalore', 'Karnataka', 560038, 'A spacious apartment with modern amenities.', 'Sell', 3, 'Yes'),
    (4, 'Independent House', 2000, 'Ready to Move', '23', 2, 'Sion-Trombay Road', 'Chembur', 'Mumbai', 'Maharashtra', 400071, 'An independent house with a garden.', 'Rent', 4, 'No'),
    (5, 'Duplex Villa', 4000, 'Under Construction', '301', 3, 'Inner Ring Road', 'Koramangala', 'Bangalore', 'Karnataka', 560034, 'A luxurious duplex villa with a private pool.', 'Sell', 5, 'Yes');

INSERT INTO Views (B_Id, P_Id) 
VALUES 
    (1, 4),
    (2, 5),
    (3, 6),
    (4, 1);

-- select * from buyer;
-- select * from property;

INSERT INTO Rent (P_Id, Rent_Price, Duration, R_Agr_Id) 
VALUES 
    (2, 25000, 12, 1001),
    (4, 35000, 24, 1002),
    (5, 20000, 30, 1003);

INSERT INTO Sale (P_Id, Price, S_Agr_Id) 
VALUES 
    (1, 45000000, 2001),
    (3, 35000000, 2002),
    (6, 60000000, 2003);

INSERT INTO G_Map (P_Id, Latitude, Longitude) 
VALUES 
    (1, 28.4595, 77.0266), -- Luxury Villa in Gurgaon
    (2, 12.9716, 77.5946), -- 2 BHK Apartment in Bangalore
    (3, 19.1197, 72.9056), -- Penthouse in Mumbai
    (4, 12.9941, 77.6611), -- 3 BHK Apartment in Bangalore
    (5, 19.0575, 72.8638), -- Independent House in Mumbai
    (6, 18.5204, 73.8567); -- Duplex Villa in Bangalore

INSERT INTO Rating (P_Id, Rating, View) 
VALUES 
    (1, 4.5, 20),  -- Luxury Villa in Gurgaon
    (2, 4.2, 25),  -- 2 BHK Apartment in Bangalore
    (3, 4.7, 25),  -- Penthouse in Mumbai
    (4, 4.6, 35),  -- 3 BHK Apartment in Bangalore
    (5, 3.9, 20),  -- Independent House in Mumbai
    (6, 4.8, 28);  -- Duplex Villa in Bangalore

INSERT INTO Review (P_Id, Review) 
VALUES 
    (1, 'Great property with excellent location.'),  -- Luxury Villa in Gurgaon
    (2, 'Nice apartment but needs some maintenance work.'),  -- 2 BHK Apartment in Bangalore
    (3, 'Beautiful penthouse with stunning views.'),  -- Penthouse in Mumbai
    (4, 'Great location with easy access to amenities.'),  -- 3 BHK Apartment in Bangalore
    (5, 'Nice house but needs some renovation.'),  -- Independent House in Mumbai
    (6, 'Excellent property with spacious rooms.');  -- Duplex Villa in Bangalore




