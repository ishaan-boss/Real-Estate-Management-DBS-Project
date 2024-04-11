package real_estate_management;

//import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.*;



/**
 *
 * @author ishaa
 */
public class P_PROPERTY {
    private String name;
    private int size;
    private int status;
    private int HouseNo;
    private int Floor;
    private String StreetName; 
    private String Locality;
    private String City;
    private String State;
    private int PostalCode;
    private int Bedrooms;
    private boolean RERA;
    private int Category;
    private String Description; 

    
    public int getFloor(){
        return Floor;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getStatus() {
        return status;
    }

    public int getHouseNo() {
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

    public boolean isRERA() {
        return RERA;
    }

    public int getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setHouseNo(int HouseNo) {
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

    public void setRERA(boolean RERA) {
        this.RERA = RERA;
    }

    public void setCategory(int Category) {
        this.Category = Category;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public void setFloor(int Floor){
        this.Floor = Floor;
    }
    
    public P_PROPERTY(){}
    
    public P_PROPERTY(String name, int size, int status, int HouseNo, int Floor, String StreetName, String Locality, String City, String State, int PostalCode, int Bedrooms, boolean RERA, int Category, String Description) {
        this.name = name;
        this.size = size;
        this.status = status;
        this.HouseNo = HouseNo;
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
    
    public boolean addNewProperty(P_PROPERTY property)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO Property (House_Name, Size, Status, House_No, Floor, Street_Name, Locality, City, State, Postal_Code, Description, Listing_Category, BHK, Is_RERA_Approved) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
            ps = THE_CONNECTION.getTheConnection().prepareStatement(addQuery);
            //doubt
            ps.setString(1, property.getName());
            ps.setInt(2, property.getSize());
            ps.setInt(3, property.getStatus());
            ps.setInt(4, property.getHouseNo());
            ps.setInt(5, property.getFloor());
            ps.setString(6, property.getStreetName());
            ps.setString(7, property.getLocality());
            ps.setString(8, property.getCity());
            ps.setString(9, property.getState());
            ps.setInt(10, property.getPostalCode());
            ps.setString(11, property.getDescription());
            ps.setInt(12, property.getCategory());
            ps.setInt(13, property.getBedrooms());
            ps.setBoolean(14, property.isRERA());
            
                 
            return (ps.executeUpdate() > 0);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(P_PROPERTY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
        
    }
    public boolean editProperty(P_PROPERTY property)
    {
    return true;
    }
    public boolean removeProperty(P_PROPERTY property)
    {
    return true;
    }
    
    //funciton to return an arralist of properties
    
    public ArrayList<P_PROPERTY> propertiesList()
    {
        return new ArrayList<P_PROPERTY>(); 
    }

}
