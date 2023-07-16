   
package appsholiday;

//Class header
public class holiday
{
    //Data member
    private double budget;
    private int numAdult;
    private int numChild;  
    private int numRoom;
    private String typeRoom;
    private String nameRoom;
    private int dayRoom;
    private String typeActivity;
    private boolean membership;
    private String levelRoom;
    private String checkIn;
    private customer cust;
    
    //Default constructor
    public holiday()
    {
     budget = 0.0;
     numAdult = 0;
     numChild = 0;
     numRoom = 0;
     typeRoom = null;
     nameRoom = null;
     dayRoom = 0;     
     typeActivity = null; 
     membership = false;
     levelRoom = null; 
     checkIn = null;
     cust = null;
    }
   
    //Normal constructor
    public holiday(int nA,int nC,int nR,String tR,String nameR, int dR,String tA,boolean m,String lR,String cI,double b,customer c)
    {

     budget = b;
     numAdult = nA;
     numChild = nC;  
     numRoom = nR;
     typeRoom = tR;
     nameRoom = nameR;
     dayRoom = dR;
     typeActivity = tA; 
     membership = m;
     levelRoom = lR;
     checkIn = cI;
     cust = c;
    }
     
    //All mutators
    public void setHoliday(int nA,int nC,int nR,String tR,String nameR,int dR,String tA,boolean m,String lR,String cI,double b,customer c)
    {
     budget = b;
     numAdult = nA;
     numChild = nC;  
     numRoom = nR;
     typeRoom = tR;
     nameRoom = nameR;
     dayRoom = dR;
     typeActivity = tA;
     membership = m;
     levelRoom = lR;
     checkIn = cI;
     cust = c;
    }
    
    //Mutators for each attributes
    public void setBudget(double b)
    {
     budget = b;
    }

     public void setNumAdult(int nA)
    {
     numAdult = nA;
    }
    
    public void setNumChild( int nC)
    {    
     numChild = nC;
    }     
    
     public void setNumRoom(int nR)
    {
     numRoom = nR;
    }
    
    public void setTypeRoom(String tR)
    {
     typeRoom = tR;     
    }
    
    public void setNameRoom(String nameR)
    {
     nameRoom = nameR;     
    }
 
    public void setDayRoom(int dR)
    {
     dayRoom = dR;     
    }    
    
    public void setTypeActivity(String tA)
    {
     typeActivity = tA;     
    }    
    
    public void setMembership(boolean m)
    {
     membership = m;     
    } 
    
    public void setLevelRoom(String lR)
    {
     levelRoom = lR;     
    }
    
    public void setCheckIn(String cI)
    {
     checkIn = cI;     
    }
    
    public void setCustomer(customer c)
    {
     cust = c;    
    }

    //acessors for each attributes    
    public double getBudget()
    {
     return budget;
    }

    public int getNumAdult()
    {
     return numAdult;
    }
    
    public int getNumChild()
    {    
     return numChild;
    }   
    
     public int getNumRoom()
    {
     return numRoom ;
    }
    
    public String getTypeRoom()
    {
     return typeRoom ;     
    }
    
    public String getNameRoom()
    {
     return nameRoom ;     
    }

    public int getDayRoom()
    {
     return dayRoom;     
    }    
    
    public String getTypeActivity()
    {
     return typeActivity ;     
    }
    
    public boolean getMembership()
    {
      return membership ;     
    } 
        
    public String getLevelRoom()
    {
     return levelRoom ;     
    }
    
    public String getCheckIn()
    {
     return checkIn;     
    }
    
    public customer getCustomer()
    {
     return cust;    
    }
    
    //Processor to calculate normal price of room before discount
    public double calculateNormalRoomPrice()
    {
        double normalPrice = 0.0, roomPrice = 0.0;
        
           if(getTypeRoom().equalsIgnoreCase("No"))
           {
               roomPrice = 0.0;
               normalPrice = getDayRoom() * (getNumRoom() * roomPrice)  ;
           }
        
           if(getTypeRoom().equalsIgnoreCase("Studio Room"))
           {
               roomPrice = 400.00;
               normalPrice = getDayRoom() * (getNumRoom() * roomPrice)  ;
           }
           
           if(getTypeRoom().equalsIgnoreCase("Fressno Family Suite"))
           {
               roomPrice = 600.00;
               normalPrice = getDayRoom() * (getNumRoom() * roomPrice) ;
           }
           
            if(getTypeRoom().equalsIgnoreCase("Penthouse"))
           {
               roomPrice = 800.00;
               normalPrice = getDayRoom() * (getNumRoom() * roomPrice);
           }
           
        return normalPrice ;
    }
    
    //Processor to calculate normal price of activity before discount
    public double calculateNormalActivityPrice()
    {
        double normalPrice = 0.0, priceChild = 0.0, priceAdult = 0.0;
        
           if(getTypeActivity().equalsIgnoreCase("No"))
           {
               priceAdult = 0.0;
               priceChild = 0.0;
               normalPrice = (getNumAdult() * priceAdult) + (getNumChild() * priceChild) ;
           }
           

           else if(getTypeActivity().equalsIgnoreCase("Jungle Tracking"))
           {
               priceAdult = 15.00;
               priceChild = 10.00;
               normalPrice = (getNumAdult() * priceAdult) + (getNumChild() * priceChild) ;
           }
           
           else if(getTypeActivity().equalsIgnoreCase("Snorkerling"))
           {
               priceAdult = 20.00;
               priceChild = 10.00;
               normalPrice = (getNumAdult() * priceAdult) + (getNumChild() * priceChild) ;
           }
           
           else if(getTypeActivity().equalsIgnoreCase("Boat Trip"))
           {
               priceAdult = 25.00;
               priceChild = 15.00;
               normalPrice = (getNumAdult() * priceAdult) + (getNumChild() * priceChild) ;
           }
         
        return normalPrice ;
    }
    
    // processor to calculate people
    public int countPeople()
    {
        int totalPeople = 0;
        totalPeople = getNumAdult() + getNumChild();
        return totalPeople;
    }
    
    // Processor to calculate total price before discount
    public double calculateTotalPriceBeforeDiscount()
    {
        double totalPrice = 0.0;
        
        totalPrice =calculateNormalRoomPrice() + calculateNormalActivityPrice();
        
        return totalPrice;
        
    }
    
    /*discount for member = 30% 
     *discount for non member = 10%
     *Total price 
    */
    public double calculateTotalPriceAfterDiscount()
    {
        double totalPrice = 0.0, totalDiscount = 0.0;
        


        if(getMembership() == true)
        {
            totalDiscount = 0.3;
            totalPrice =calculateTotalPriceBeforeDiscount() - ((calculateNormalRoomPrice() + calculateNormalActivityPrice()) * totalDiscount);
        }
        
        else 
        {
            totalDiscount = 0.1;
            totalPrice =calculateTotalPriceBeforeDiscount() - ((calculateNormalRoomPrice() + calculateNormalActivityPrice()) * totalDiscount);
        }
        return totalPrice;
        
    }
    
    //Processor for searching method payment
    public String searchingMethodPayment()
    { 
    	String methodPayment = "";
        
        int [] array = {1,2,3}; //declaration array 
        int temp;//temporary
        
        //use searching method by array object to search all type payment method
           for (int i = 1; i < array.length; i++) 
            {
              for (int j = i; j > 0; j--)
               {
                 if (array[j] < array [j - 1]) 
                  {
                    temp = array[j];
                    array[j] = array[j - 1];//compare array value from bigger to lower 
                     array[j - 1] = temp;
                  }
               }
            }
            
           for (int i = 0; i < array.length; i++) 
            {
              if(array[i]==1)
              System.out.println("    " + 2 + ". Cash Payment(Walk in on check in date).");
              
              if(array[i]==2)
              System.out.println("    " + 3 + ". Credit Card Payment(Walk in on check in date).");            
            }           
        
        return methodPayment;
    }
    

    //Processor to sort room price in descending order
    public String sortRoomPrice()
    {
        String price = "",room = null; 
        
        int [] array = {600,400,800};  //declaration array   
        int temp;//temporary
        
        //use bubble sort method by array object to sort room by price in descending order
           for (int i = 1; i < array.length; i++) 
            {
              for (int j = i; j > 0; j--)
               {
                 if (array[j] < array [j - 1]) 
                  {
                    temp = array[j];      //compare array value from bigger to lower    
                    array[j] = array[j - 1];
                     array[j - 1] = temp;
                  }
               }
            }
            
           for (int i = 0; i < array.length; i++) 
            {
              if(array[i]==400)                            // call 400
              System.out.println("    1. Studio Room with RM" + array[i] + " perday." );
              
              if(array[i]==600)                                   //call 600
              System.out.println("    2. Fressno Family Suite with RM" + array[i] + " perday.");
              
              if(array[i]==800)                             //call 800
              System.out.println("    3. Penthouse with RM" + array[i] + " perday." );
            }           
        
        return price;
    }
    
    // search budget
    public String searchBudget()
    {
        String pakej = "";
        
        if(getBudget() < 400.00)
        {
            System.out.println("   Sorry your budget are too low.");
        }
        
        else if(getBudget() >= 400.00 && getBudget() <= 700.00)
        {
            System.out.println("   You can get one room for studio room and choose activity either snorkeling, boat trip or jungle tracking for 6 person.");
        }

        
        else if(getBudget() > 700.00 && getBudget() <= 900.00)
        {
            System.out.println("   You can get room either Studio Room or Fressno Family Suite and choose activity either snorkeling, boat trip or jungle tracking for 7 person and above.");
        }
        
        else if(getBudget() > 900.00 )
        {
            System.out.println("   You can get room either Studio Room, Fressno Family Suite or Penthouse and choose activity either snorkeling, boat trip or jungle tracking for 10 person and above.");
        }
        
        return pakej;
    }
    
    //To display customer booking information
    public String toString()
    {
        return("    Budget: " + budget +
               "\n    Membership: " + membership +
               "\n    Number of adult: " + numAdult +
               "\n    Number of child: " + numChild +
               "\n    Number of day: " + dayRoom + 
               "\n    Date Check In: " + checkIn +
               "\n    Number of room: " + numRoom +
               "\n    Type of room: " + typeRoom +              
               "\n    Type of activity: " + typeActivity);
    
    }   


}