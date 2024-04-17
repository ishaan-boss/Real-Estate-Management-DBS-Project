
//import java.lang.System.Logger.Level;
import com.mysql.cj.conf.PropertyKey;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.*;
import javax.swing.JOptionPane;



/**
 *
 * @author ishaan
 */
public class P_PROPERTY {

   int sellerid;
    private Integer priceInteger;
    private Float LatitudeFloat;
    private Float LongitudeFloat;
    private Integer DurationInteger;
    private int PID;
    private int SID;
    private String name;
    private int size;
    private String status;
    private String HouseNo;
    private int Floor;
    private String StreetName; 
    private String Locality;
    private String City;
    private String State;
    private int PostalCode;
    private int Bedrooms;
    private boolean RERA;
    private String Category;
    private String Description;

    public P_PROPERTY() {

    }

    public Integer getPriceInteger() {
        return priceInteger;
    }

    public Float getLatitudeFloat() {
        return LatitudeFloat;
    }

    public Float getLongitudeFloat() {
        return LongitudeFloat;
    }

    public Integer getDurationInteger() {
        return DurationInteger;
    }

    public int getPID() {
        return PID;
    }

    public int getSID()
    {
        return SID;
    }    
    
    public int getFloor(){
        return Floor;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getStatus() {
        return status;
    }

    public String getHouseNo() {
        return HouseNo;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getLocality() {
        return Locality;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getPostalCode() {
        return PostalCode;
    }

    public int getBedrooms() {
        return Bedrooms;
    }

    public String isRERAString() {
        if (this.RERA) return "YES";
        else return "NO";
    }
    public boolean isRERABoolean(String bool)
    {
        return bool.equals("YES");
    }
    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }
    public void setPID(int PID){
        this.PID = PID;
        
    }
    public void setSID(int sid)
    {
        //create object to get particular SId
        this.SID = sid;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHouseNo(String HouseNo) {
        this.HouseNo = HouseNo;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public void setLocality(String Locality) {
        this.Locality = Locality;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setPostalCode(int PostalCode) {
        this.PostalCode = PostalCode;
    }

    public void setBedrooms(int Bedrooms) {
        this.Bedrooms = Bedrooms;
    }

    public void setRERA(String RERA) {
        this.RERA = RERA.equals("YES");
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public void setFloor(int Floor){
        this.Floor = Floor;
    }
    
     public int getDuration(){
        PreparedStatement ps;
        ResultSet rs;
        String Query;
        int duration = 0;
        if (this.Category.equalsIgnoreCase("rent")){
           Query = "SELECT Rent.Duration FROM Rent JOIN Property ON P_Id WHERE P_Id = ?;";
           try{
               ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
               ps.setInt(1, this.PID);
               rs = ps.executeQuery();
               rs.next();
               duration = rs.getInt(1);
           }catch (SQLException ex){     
                Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        else duration = 0;
        return duration;
    }
    
    public int getPrice(){
        PreparedStatement ps;
        ResultSet rs;
        String Query;
        int price = 0;
        if (this.Category.equalsIgnoreCase("rent")){
           Query = "SELECT Rent.Price FROM Rent JOIN Property ON P_Id WHERE P_Id = ?;";
           try{
               ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
               ps.setInt(1, this.PID);
               rs = ps.executeQuery();
               rs.next();
               price = rs.getInt(1);
           }catch (SQLException ex){     
                Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        else{
            Query = "SELECT Sale.Price FROM Sale JOIN Property ON P_Id WHERE P_Id = ?";
            try{
                ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
                ps.setInt(1, this.PID);
                rs = ps.executeQuery();
                rs.next();
                price = rs.getInt(1);
            }catch (SQLException ex){     
                Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        return price;
    }
    
    public int getViews(){
        PreparedStatement ps;
        ResultSet rs;
        int views = 0;
        String Query = "SELECT View FROM Rating WHERE P_Id = ?;";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
            ps.setInt(1, this.PID);
            rs = ps.executeQuery();
            rs.next();
            views = rs.getInt(1);

        }catch (SQLException ex){
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        return views;
    }

    public float getRating(){
        PreparedStatement ps;
        ResultSet rs;
        float rating = 0;
        String Query = "SELECT Rating FROM Rating WHERE P_Id = ?;";
        try {
            ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
            ps.setInt(1, this.PID);
            rs = ps.executeQuery();
            rs.next();
            rating = rs.getFloat(1);

        }catch (SQLException ex){
            Logger.getLogger(P_PROPERTY.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rating;
    }

    public ArrayList<String> getReviews(){
        ArrayList<String> reviews = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        String Query = "SELECT Review from Review where P_Id = ?;";
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
            ps.setInt(1, this.PID);
            rs = ps.executeQuery();
            //review r = new review();
            while(rs.next()){
                //r.name = rs.getString(1);
                //r.review = rs.getString(2);
                reviews.add(rs.getString(1));
            }
        }catch(Exception ex){
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return reviews;
    }
    
    
    public P_PROPERTY(int sellerid){this.sellerid = sellerid;}
    
    public P_PROPERTY properties_feature(P_PROPERTY property, Integer priceInteger, Float LatitudeFloat, Float LongitudeFloat, Integer DurationInteger){
//        System.out.println("INSIDE FEATURES")+;
        property.priceInteger = priceInteger;
        property.LatitudeFloat= LatitudeFloat;
        property.LongitudeFloat= LongitudeFloat;
        property.DurationInteger= DurationInteger;
        
        return property;
    }
    
    public P_PROPERTY(int SID, String name, int size, String status, String HouseNo, int Floor, String StreetName, String Locality, String City, String State, int PostalCode, int Bedrooms, boolean RERA, String Category, String Description) {
        
        sellerid = SID;
        this.SID = SID;
        System.out.println("inside of constructor:"+sellerid);
        this.name = name;
        this.size = size;
        this.status = status;
        this.HouseNo = HouseNo;
        this.Floor = Floor;
        this.StreetName = StreetName;
        this.Locality = Locality;
        this.City = City;
        this.State = State;
        this.PostalCode = PostalCode;
        this.Bedrooms = Bedrooms;
        this.RERA = RERA;
        this.Category = Category;
        this.Description = Description;
    }
    
   //function to add a new property
    
   
    
   

//    public P_PROPERTY(Integer priceInteger, Float LatitudeFloat, Float LongitudeFloat, Integer DurationInteger, int PID, int SID, String name, int size, String status, String HouseNo, int Floor, String StreetName, String Locality, String City, String State, int PostalCode, int Bedrooms, boolean RERA, String Category, String Description) {
//        this.priceInteger = priceInteger;
//        this.LatitudeFloat = LatitudeFloat;
//        this.LongitudeFloat = LongitudeFloat;
//        this.DurationInteger = DurationInteger;
//        this.PID = PID;
//        this.SID = SID;
//        this.name = name;
//        this.size = size;
//        this.status = status;
//        this.HouseNo = HouseNo;
//        this.Floor = Floor;
//        this.StreetName = StreetName;
//        this.Locality = Locality;
//        this.City = City;
//        this.State = State;
//        this.PostalCode = PostalCode;
//        this.Bedrooms = Bedrooms;
//        this.RERA = RERA;
//        this.Category = Category;
//        this.Description = Description;
//    }
    
    public boolean addNewProperty(P_PROPERTY property) throws SQLException
    {
//        int sid = getSID();
       // System.out.println(sid);
        PreparedStatement ps,ps1;
        ResultSet rs,rs1;
        String getPIDQuery = "SELECT MAX(P_Id) AS ID FROM PROPERTY;";
        String addQuery = "INSERT INTO Property (S_Id,House_Name, Size, Status, House_No, Floor, Street_Name, Locality, City, State, Postal_Code, Description, Listing_Category, BHK, Is_RERA_Approved) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        String addQuery_Rent = "INSERT INTO Rent (P_Id,Rent_Price, Duration, R_Agr_Id) VALUES (?, ?, ?, ?);";
        String addQuery_Sale = "INSERT INTO Sale (P_Id,Price,S_Agr_Id) VALUES (?, ? , ?);";
        String addQuery_G_Map = "INSERT INTO G_Map VALUES (?, ?, ?);";
        String add_Query_Rating = "INSERT INTO Rating VALUES(?, 0, 0);";
        try {
            
//            THE_CONNECTION.getTheConnection().setAutoCommit(false);
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            
            ps.setInt(1, property.getSID());
            ps.setString(2, property.getName());
            ps.setInt(3, property.getSize());
            ps.setString(4, property.getStatus());
            ps.setString(5, property.getHouseNo());
            ps.setInt(6, property.getFloor());
            ps.setString(7, property.getStreetName());
            ps.setString(8, property.getLocality());
            ps.setString(9, property.getCity());
            ps.setString(10, property.getState());
            ps.setInt(11, property.getPostalCode());
            ps.setString(12, property.getDescription());
            ps.setString(13, property.getCategory());
            ps.setInt(14, property.getBedrooms());
            ps.setString(15, property.isRERAString());
                
            int i = ps.executeUpdate();

            ps1 = THE_CONNECTION.getTheConnection().prepareStatement(getPIDQuery);
            rs1 = ps1.executeQuery();
            rs1.next();
            int pid = Integer.parseInt(rs1.getString(1));
            // System.out.println(pid);
            property.setPID(pid);
           //System.out.println(rs1.next());
            //System.out.println(rs1.getString(1));
            //setPID(-1);
                //property.setPID(rs1.getInt("ID"));
             
             
//             if (PID== -1) {
//                throw new IllegalStateException("Failed to retrieve valid property ID");
//            }
           
           
             if ("Rent".equalsIgnoreCase(property.getCategory())) {
                ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery_Rent);
           
                ps.setInt(1,property.getPID());
                ps.setInt(2, property.getPriceInteger());
                ps.setInt(3,property.getDurationInteger());
                ps.setInt(4,property.getPID());
                
                i = ps.executeUpdate();
             }
             if("Sell".equalsIgnoreCase(property.getCategory()))
             {
                 ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery_Sale);
           
                ps.setInt(1,property.getPID());
                ps.setInt(2, property.getPriceInteger());
                ps.setInt(3,property.getPID());
                
                i = ps.executeUpdate();
             }
             
             ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery_G_Map);                          
             ps.setInt(1, property.getPID());
             ps.setFloat(2,property.getLatitudeFloat());
             ps.setFloat(3,property.getLongitudeFloat());
              i = ps.executeUpdate();
              
             ps = THE_CONNECTION.getTheConnection().prepareStatement(add_Query_Rating);
             ps.setInt(1,property.getPID());
             i= ps.executeUpdate();
            return (i >0);
            
            
        } catch (SQLException ex) {
           // THE_CONNECTION.getTheConnection().rollback();
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
//        finally{
//            THE_CONNECTION.getTheConnection().setAutoCommit(true);
//        }
        
    }
    public boolean editProperty(P_PROPERTY property, int PID)
    {
        PreparedStatement ps;
        
        String editQuery = "UPDATE Property SET " +
                     "S_Id = ?, " +
                     "House_Name = ?, " +
                     "Size = ?, " +
                     "Status = ?, " +
                     "House_No = ?, " +
                     "Floor = ?, " +
                     "Street_Name = ?, " +
                     "Locality = ?, " +
                     "City = ?, " +
                     "State = ?, " +
                     "Postal_Code = ?, " +
                     "Description = ?, " +
                     "Listing_Category = ?, " +
                     "BHK = ?, " +
                     "Is_RERA_Approved = ? " +
                     "WHERE P_Id = ?";
        
        String editQuery_Rent = "UPDATE Rent SET Rent_Price = ?, Duration=? ;";
        String editQuery_Sale = "UPDATE Sale SET Price = ?;";
        String editQuery_G_Map = "UPDATE G_Map SET Latitude = ?, Longitude = ?;";
        try {
            ps =  THE_CONNECTION.getTheConnection().prepareStatement(editQuery);
            System.out.println("IN P_PROPERTY"+property.getSID());
            ps.setInt(1, property.getSID());
            ps.setString(2, property.getName());
            ps.setInt(3, property.getSize());
            ps.setString(4, property.getStatus());
            ps.setString(5, property.getHouseNo());
            ps.setInt(6, property.getFloor());
            ps.setString(7, property.getStreetName());
            ps.setString(8, property.getLocality());
            ps.setString(9, property.getCity());
            ps.setString(10, property.getState());
            ps.setInt(11, property.getPostalCode());
            ps.setString(12, property.getDescription());
            ps.setString(13, property.getCategory());
            ps.setInt(14, property.getBedrooms());
            ps.setString(15, property.isRERAString());
            ps.setInt(16, PID);
            
             int i = ps.executeUpdate();
            
            if ("Rent".equalsIgnoreCase(property.getCategory())) {
                ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery_Rent);
       
                ps.setInt(1, property.getPriceInteger());
                ps.setInt(2,property.getDurationInteger());
                
                
                i = ps.executeUpdate();
             }
             if("Sell".equalsIgnoreCase(property.getCategory()))
             {
                 ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery_Sale);
          
                ps.setInt(1, property.getPriceInteger());
                
                
                i = ps.executeUpdate();
             }
             
             ps = THE_CONNECTION.getTheConnection().prepareStatement(editQuery_G_Map);                          
             
             ps.setFloat(1,property.getLatitudeFloat());
             ps.setFloat(2,property.getLongitudeFloat());
              i = ps.executeUpdate();
            return (i >0);
           
        } catch (Exception ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean removeProperty(int P_Id)
    {
        PreparedStatement ps;
        //or write ON DELETE CASCADE IN SQL FILE
        String deleteQuery = "DELETE FROM Property WHERE P_Id = ?";
        String deleteQuery_Rent = "DELETE FROM Rent WHERE P_Id = ?";
        String deleteQuery_Sale = "DELETE FROM Sale WHERE P_Id = ?";
        String deleteQuery_G_Map = "DELETE FROM G_Map WHERE P_Id = ?";
        try {
            
            
            ps =  THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery_Rent);
            ps.setInt(1, P_Id);
           int i = ps.executeUpdate();
            
            ps =  THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery_Sale);
            ps.setInt(1, P_Id);
            i = ps.executeUpdate();
            
            ps =  THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery_G_Map);
            ps.setInt(1, P_Id);
            i = ps.executeUpdate();
            
            ps =  THE_CONNECTION.getTheConnection().prepareStatement(deleteQuery);
            
            ps.setInt(1, P_Id);
             i = ps.executeUpdate();
            
            return (i > 0);
            
        } catch (Exception ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public ArrayList<P_PROPERTY> propertiesListAll()
    {
        ArrayList<P_PROPERTY> list  = new ArrayList<>();
        String selectQuery = "SELECT * FROM property";
        System.err.println("IN P PROPERTY"+selectQuery);
        PreparedStatement ps = null;
        ResultSet rs;
        
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
//            ps.setInt(1,this.SID );
        rs = ps.executeQuery();
        P_PROPERTY property;
        int i =0;
        while(rs.next()){
           property = new P_PROPERTY(rs.getInt("S_Id"),
                                     rs.getString("House_Name"),
                                     rs.getInt("Size"),
                                     rs.getString("Status"),
                                     rs.getString("House_No"),
                                     rs.getInt("Floor"),
                                     rs.getString("Street_Name"),
                                     rs.getString("Locality"),
                                     rs.getString("City"),
                                     rs.getString("State"),
                                     rs.getInt("Postal_Code"),
                                     rs.getInt("BHK"),
                                     isRERABoolean(rs.getString("Is_RERA_Approved")),
                                     rs.getString("Listing_Category"),
                                     rs.getString("Description"));
           
           property.setPID(rs.getInt("P_Id"));
           list.add(property);
        }
        
        }catch(SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE,null,ex);
        }
    
        return list;
    }
    
    
    
    //funciton to return an arralist of properties by sellerid
    public ArrayList<P_PROPERTY> propertiesList()
    {
        ArrayList<P_PROPERTY> list  = new ArrayList<>();
        String selectQuery = "SELECT * FROM property where s_id = "+sellerid;
        System.err.println("IN P PROPERTY"+selectQuery);
        PreparedStatement ps = null;
        ResultSet rs;
        
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
//            ps.setInt(1,this.SID );
        rs = ps.executeQuery();
        P_PROPERTY property;
        int i =0;
        while(rs.next()){
           property = new P_PROPERTY(rs.getInt("S_Id"),
                                     rs.getString("House_Name"),
                                     rs.getInt("Size"),
                                     rs.getString("Status"),
                                     rs.getString("House_No"),
                                     rs.getInt("Floor"),
                                     rs.getString("Street_Name"),
                                     rs.getString("Locality"),
                                     rs.getString("City"),
                                     rs.getString("State"),
                                     rs.getInt("Postal_Code"),
                                     rs.getInt("BHK"),
                                     isRERABoolean(rs.getString("Is_RERA_Approved")),
                                     rs.getString("Listing_Category"),
                                     rs.getString("Description"));
           
           property.setPID(rs.getInt("P_Id"));
           list.add(property);
        }
        
        }catch(SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE,null,ex);
        }
    
        return list;
    }
    
    
    
    public boolean addImage(int propertyId, String image_path)
    {
        PreparedStatement ps;
        String addQuery = "INSERT INTO Images (P_ID,image) VALUES (?,?)";
        try {
               try{
                     FileInputStream propertyImage = new FileInputStream(new File(image_path));
                     ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
                     ps.setInt(1, propertyId);
                     ps.setBinaryStream(2, propertyImage);
                     return(ps.executeUpdate() > 0);
               
               } catch(FileNotFoundException ex)
               {
//                   Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                   JOptionPane.showMessageDialog(null,ex.getMessage()+ "Invalid File","Image ERROR",2);
                   
                   return false;
               }

            
        }
        catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //function to get the list of images by property
    public HashMap<byte[], Integer> propertyImagesList (int propertyId)
    {
    HashMap<byte[], Integer> list = new HashMap<> ();
    PreparedStatement ps;
    ResultSet rs;

    String selectQuery = "SELECT * FROM images WHERE P_ID =? ";

    try {

            ps = THE_CONNECTION.getTheConnection() .prepareStatement (selectQuery);
            ps.setInt (1, propertyId) ;
            rs = ps.executeQuery ();
            while (rs.next ()) {
                list.put(rs.getBytes("image"),rs.getInt("I_Id"));
            }}
    catch (SQLException ex)
    {     
        Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
    }  
    return list;
    }
    
    //func to get image by id
    public byte[] getImageById (int imageId)
    {
    PreparedStatement ps;
    ResultSet rs;

    String selectQuery = "SELECT image FROM images WHERE I_ID =? ";

    try {

            ps = THE_CONNECTION.getTheConnection() .prepareStatement (selectQuery);
            ps.setInt (1, imageId) ;
            rs = ps.executeQuery ();
            if (rs.next ()) {
               return rs.getBytes("image") ;
            }else{
                return null;
            }
    }
    catch (SQLException ex)
    {     
        Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         return null;
    }  
    
    }
    //func to remove image  by id
    public boolean removeImageById (int imageId)
    {
    PreparedStatement ps;
    ResultSet rs;

    String deleteQuery = "DELETE FROM images WHERE I_ID =? ";

    try {

            ps = THE_CONNECTION.getTheConnection() .prepareStatement (deleteQuery);
            ps.setInt (1, imageId) ;
            
            return(ps.executeUpdate()>0);
    }
    catch (SQLException ex)
    {     
        Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         return false;
     }  
    
    }
    
    public P_PROPERTY getPropertyByPID(int PID){
        P_PROPERTY property = new P_PROPERTY(sellerid);
        PreparedStatement ps;
        ResultSet rs;
        String Query = "SELECT * FROM property WHERE P_Id = ?;";
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(Query);
            ps.setInt(1, PID);
            rs = ps.executeQuery();
            if(rs.next())
            property = new P_PROPERTY(rs.getInt("S_Id"),
                                     rs.getString("House_Name"),
                                     rs.getInt("Size"),
                                     rs.getString("Status"),
                                     rs.getString("House_No"),
                                     rs.getInt("Floor"),
                                     rs.getString("Street_Name"),
                                     rs.getString("Locality"),
                                     rs.getString("City"),
                                     rs.getString("State"),
                                     rs.getInt("Postal_Code"),
                                     rs.getInt("BHK"),
                                     isRERABoolean(rs.getString("Is_RERA_Approved")),
                                     rs.getString("Listing_Category"),
                                     rs.getString("Description"));
           property.setPID(rs.getInt("P_ID"));
        }catch(SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
        return property;
    }
    
    public ArrayList<P_PROPERTY> filterProperty(String filter, String sort){
        ArrayList<P_PROPERTY> filterPropertyList = new ArrayList<>();
        if(sort.equals("Ascending")) sort = "asc";
        else sort = "desc";
        if(filter.equals("Category")) filter = "Listing_Category";
        String selectQuery1 = "SELECT * FROM property ORDER BY " + filter +" " + sort;
//        if (sort.equals("Ascending"))
//            selectQuery1 = "SELECT * FROM property ORDER BY ? asc;";
//        else selectQuery1 = "SELECT * FROM property ORDER BY ? desc;";

//        switch(filter){
//            case "Name" : if(sort.equals("Ascending")) selectQuery1 = "SELECT * FROM property ORDER BY House_Name asc;";
//                          else selectQuery1 = "SELECT * FROM property ORDER BY House_Name desc;";
//                          break;
//            case "Category" : if(sort.equals("Ascending")) selectQuery1 = "SELECT * FROM property ORDER BY Listing_Category asc;";
//                              else selectQuery1 = "SELECT * FROM property ORDER BY Listing_Category desc;";
//                              break;
//
//
//        }


        System.out.println(filter +" "+ sort);
        PreparedStatement ps = null;
        ResultSet rs;
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery1);
            //ps.setString(1, filter);
            //ps.setString(2, sort);
            System.out.println(ps);
            rs = ps.executeQuery();
            P_PROPERTY property;
            while(rs.next()){
                property = new P_PROPERTY(rs.getInt("S_Id"),
                        rs.getString("House_Name"),
                        rs.getInt("Size"),
                        rs.getString("Status"),
                        rs.getString("House_No"),
                        rs.getInt("Floor"),
                        rs.getString("Street_Name"),
                        rs.getString("Locality"),
                        rs.getString("City"),
                        rs.getString("State"),
                        rs.getInt("Postal_Code"),
                        rs.getInt("BHK"),
                        isRERABoolean(rs.getString("Is_RERA_Approved")),
                        rs.getString("Listing_Category"),
                        rs.getString("Description"));
                property.setPID(rs.getInt("P_ID"));
                filterPropertyList.add(property);
                System.out.println(rs.getInt("size"));
            }

        }catch(SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }

        return filterPropertyList;
    }
    
}
