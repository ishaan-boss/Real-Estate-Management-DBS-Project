
//import java.lang.System.Logger.Level;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.*;



/**
 *
 * @author ishaa
 */
public class P_PROPERTY {
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
    
    public void setSID()
    {
        //create object to get particular SId
        SELLER_LOGIN_WINDOW obj = new SELLER_LOGIN_WINDOW();
        this.SID = obj.getSID();
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
    
    public P_PROPERTY(){}
    
    public P_PROPERTY(String name, int size, String status, String HouseNo, int Floor, String StreetName, String Locality, String City, String State, int PostalCode, int Bedrooms, boolean RERA, String Category, String Description) {
        setSID();
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
    
    public boolean addNewProperty(P_PROPERTY property)
    {
        PreparedStatement ps;
        
        String addQuery = "INSERT INTO Property (S_Id,House_Name, Size, Status, House_No, Floor, Street_Name, Locality, City, State, Postal_Code, Description, Listing_Category, BHK, Is_RERA_Approved) VALUES (?,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            
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
        ArrayList<P_PROPERTY> list  = new ArrayList<>();
        String selectQuery = "SELECT * FROM property;";
        PreparedStatement ps = null;
        ResultSet rs;
        
        try{
            ps = THE_CONNECTION.getTheConnection().prepareStatement(selectQuery);
        rs = ps.executeQuery();
        P_PROPERTY property;
        int i =0;
        while(rs.next()){
           property = new P_PROPERTY(rs.getString("House_Name"),
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
           list.add(property);
        }
        
        }catch(SQLException ex){
            Logger.getLogger(THE_CONNECTION.class.getName()).log(Level.SEVERE,null,ex);
        }
    
        return list;
    }
}
