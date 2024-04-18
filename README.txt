REAL_ESTATE_MANAGEMENT

1. Overview
   - In the current real estate market, the process of buying and selling properties is  
     heavily reliant on brokers, which often results in additional costs and complexities
     for both buyers and sellers. 
   - The presence of intermediaries can lead to a lack of transparency, delayed communications,
     and an overall increase in the time and effort required to close property deals. 


2. Features
   - User Registration and Authentication:
	1. Allow users to register as buyers or sellers, providing necessary information and verifying their identity. 
        2. Implement secure authentication mechanisms to ensure the privacy and security of user accounts.

   - Property Listing and Management:
	1. Sellers can add new properties, edit existing listings, and remove listings that are no longer available. 
	2. Include a user-friendly interface for sellers to input detailed property information, including type, size, amenities, location, and pricing.
	3. Enable sellers to set property availability status (available, sold/rented) and update it in real-time.  

   - Interactive GUI
	1. Engage seamlessly with our interactive graphical user interface, designed for effortless navigation and a user-friendly experience 
           that enhances your interaction with the system.

   - Property Search and Filtering:
	1. Provide a robust search and filtering functionality for buyers to filter properties based on criteria such as 
           location, type, size, price range, and amenities.

   - Contact Information:
	1. Buyers can directly contact sellers or agents through the platform. 

   - G_Map Integration:
        1. Buyers can view the loction of the property on the map.
   
   - User Profiles:
	1. Buyers and Sellers can create profiles with their contact information, prefences,
           and property requirements.

   - Review and Ratings:
	1. Users can leave review and ratings for the properties for they have visited.

   - Financial Tools:
	1. Integrate an EMI Calculator to help buyers estimate monthly mortgage payments for properties.

   - Document Management:
	1. It provides a recommended rent/sale agreement.


3. Technologies Used
   - MySQL Workbench
   - Apache NetBeans IDE
   - IntelliJ IDEA Community Edition
   - JDK 22
   - mysql-connector-j-8.2.0.jar
   - jxmapviewer2-2.8.jar


4. Database Schema
   - Buyer: contains information about the buyer.
   - Seller: contains information about the seller.
   - Property: contains information about the property.
   - Sale: contains the property sale details.
   - Rent: contains the property rent details.
   - G_Map: contains the latitude and longitude details.
   - Images: contains the property images.
   - Reviews: contains the property reviews given by the buyers.
   - Rating: contains no of views and rating of the properties.
   - views: relationship which contains the information about the buyers visiting a particular property.


5. Installation
   - MySQL Database Setup:
	Execute the provided SQL script in MySQL Workbench or any MySQL client to create the necessary database schema and tables.

  - Java Development Environment Setup:
	Ensure you have Java Development Kit (JDK) installed on your system.
  
  - Jar Files Installation
	Make sure you have the required jar files installed on your system.

  - Project Configuration:
	Update the database connection settings in the Java application code to connect to your MySQL database.

  - Compile and Run:
	Compile the Java source files using any Java IDE or command-line tools.
        Run the Real_Estate_Management.java file which will open the home page and application will progress further.


6. Usage
  - Login
	Use your credentials to login to your system as a particular role (buyer/seller) or signup if not an already existing user.

  - Navigate through JFrames
	Explore various JFrames such as buyer/seller login window, buyer/seller dashboard, properties window, etc.

  - Perform Actions
	Perform actions such as adding/deleting/updating property, viewing properties, EMI Calculator, Buy vs Rent tools, etc.


7. Contributors
  - Aayush Gupta      2022A7PS0088P   
  - Saksham Jain      2022A7PS0132P
  - Mudit Gupta       2022A7PS0178P
  - Ishaan Gupta      2022A7PS1180P


8. Acknowledgements
  - MySQl Documentation
  - JavaFX Documentation
  - Stack Overflow (for troubleshooting)
  - GeeksForGeeks (for troubleshooting)
  - Kaggle (for sample database)