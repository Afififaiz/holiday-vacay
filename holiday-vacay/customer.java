package appsholiday;

public class customer {
    //declaration variable
    private String email;
    private String phoneNumber;
    private String name;
    private String IC;
    private String race;
 
//default constructor
 public customer(){
        name = null;
        email = null;
        phoneNumber = null;
        IC =null;  
        race= null;
      }
    // setter tempat simpan data
    //setters for all attributes inside one mutators
    //mutators for all attributes
     public void setCustomer(String n, String e, String pN, String i, String r)
    {
        name=n;
        email=e;
        phoneNumber=pN;
        IC=i;
        race=r;
    }
 
     //mutators for each attributes
     public void setName(String n)
    {
     name = n;
    }
     
     public void setEmail(String e)
    {
     email = e;
    }
     
     public void setPhoneNumber(String pN)
    {
     phoneNumber = pN;
    }
    
     public void setIC(String i)
    {
     IC= i;
    }
     public void setRace(String r)
    {
     race= r;
    }
    //accessor for each attributes
    public String getName(){
        return name;
    }
   
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getIC(){
        return IC;
    }
    public String getRace(String r){
        return race;
    }
    
    //to display customer information
    public String ToString(){
        return("\n Full Name : "+name+"\nEmail : "+email+"\nPhone Number : "+phoneNumber+"\nIC Number: "+IC+"\nRace: "+race);
    }
}
