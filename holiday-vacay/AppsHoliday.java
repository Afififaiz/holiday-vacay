package appsholiday;


//Import the package : be able to use the pre-defined classes
import javax.swing.JOptionPane;
import java.util.Scanner;

//Class header : modifier, reserved word class and class name
public class AppsHoliday
{
    //Main method
    public static void main (String [] args)
    {
        //Create input object : to input using I/O console
        Scanner input = new Scanner(System.in);
        Scanner inputLine = new Scanner(System.in);
        
        //Declare variable 
        String typeRoom = null,nameRoom = null,inputRate= null,typeActivity = null, levelRoom = null; 
        int sizeIC ;
       
        //To create holiday’s object
        holiday booking = new holiday();
        
        System.out.println(); 
        System.out.println("                                                 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println("                                                 ||----------------------------------------------------------------|+");
        System.out.println("                                                 +| WELCOME TO ONLINE BOOKING HOLIDAY TRIP AT PULAU MUTIARA RESORT ||");
        System.out.println("                                                 ||----------------------------------------------------------------|+");
        System.out.println("                                                 +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
        System.out.println();
        System.out.println("                                       " + "RESORT PLAN :-");
        System.out.println("                                       " + "------------");
        System.out.println();
        
        /*Show the position (plan) of room
         for each type room either Studio Room , Fressno Family Suite or Penthouse */
        System.out.println("\n                                                    " + "                         MOUNTAIN                  " ); 
        System.out.println("\n                                                    " + "PA" + " FFS A" + " FFS 1" + " FFS 2" + " FFS 3" + " FFS 4" + " FFS 5" + " FFS 6" + " FFS 7" + " FFS 8" + " FFS B" +    
                           "\n                                                        " + "PB" + "                                              SR A" +
                           "\n                                                           " + "P1" + "                                       SR 1" + 
                           "\n                                                           " + "P2" + "                                       SR 2" + "        G     " +
                           "\n                                           B               " + "P3" + "                                       SR 3" + "        A     " +
                           "\n                                           E               " + "P4" + "                                       SR 4" + "        R     " +
                           "\n                                           A               " + "P5" + "                 POOL                  SR 5" + "        D     " +
                           "\n                                           C               " + "P6" + "                                       SR 6" + "        E     " +
                           "\n                                           H               " + "P7" + "                                       SR 7" + "        N     " +
                           "\n                                                           " + "P8" + "                                       SR 8" + "        S     " +
                           "\n                                                           " + "P9" + "                                       SR 9" + 
                           "\n                                                           " + "P10" + "                                      SR 10" + 
                           "\n                                                        " + "PC" + "                                              SR B" +                                                     
                           "\n                                                     " + "PD" + "                                                     SR C" +
                           "\n\n                                                         " + "                     GYM                             "); 
        System.out.println();
        
        //find customer budget
        System.out.print("   Enter your holiday budget : RM");
        double budget = input.nextDouble();
        booking.setBudget(budget);        
        System.out.println("\n" + booking.searchBudget());
        
        //Customer can continue for booking holiday trip or leave this site after find budget
        String choice4 = JOptionPane.showInputDialog("Do you want to continue ? (YES/NO) ?");
        while(!(choice4.equalsIgnoreCase("YES") || choice4.equalsIgnoreCase("NO")))
        {
             choice4 = JOptionPane.showInputDialog("Do you want to continue ? (YES/NO) ?");                 
        }
        
        if(choice4.equalsIgnoreCase("Yes"))
        {
            System.out.println();
        }
        
        else if(choice4.equalsIgnoreCase("No"))
        {
            System.exit(0);
        }
        
        //Explaination for position of room and instruction 
        System.out.println("   " +      "*******************************************");
        System.out.println("   " +      "*INFORMATION ABOUT PULAU MUTIARA RESORT :-*");
        System.out.println("   " +      "*******************************************");
        System.out.println();
        System.out.println("   " +      "INSTRUCTION :-");
        System.out.println("   " +      "~ ~ ~ ~ ~ ~ ");
        System.out.println();
        System.out.println("   " +      "<You need to choose room and activity because it is include in a package.>" + 
                                        "<If you fail to follow the rule, we will not take any risks.>");
        System.out.println("   " +      "<This apps customer can choose one type of room and activity only." + 
                                        "<Contact us at 1300-88-4244 or pulaumutiara@gmail,com.>" +
                                        "<If you want to choose more room and activity, you need to make new booking register.>");
        System.out.println();
        System.out.println("    We have 12 floors with 3 blocks by different room type :-");
        System.out.println();
        System.out.println("    1.SR A,SR B,SR C,and SR 1 until SR 10 is a block for Studio Room");
        System.out.println("    2.PA,PB,PC,PD and P1 until P10 is a block for Penthouse ");
        System.out.println("    3.FFS A,FFS B, and FFS 1 until FFS8 is a block for Fressno Family Suite");        
        System.out.println();
        
        //Tell customer about our latest promotion price for room 
        System.out.println("     Our latest promotion for room :-");        
        System.out.println();
        
        /*Call method sortRoomPrice() from holiday to sort price for each type room
         in descending order*/
        System.out.println(booking.sortRoomPrice());        
        System.out.println();
                            
        //Tell customer about our latest promotion price for activity 
        System.out.println("     Our latest promotion for activity :-" +
                           "\n" +
                           "\n    1. Snorkeling with RM20.00 per Adult and RM10.00 per Child. " + 
                           "\n    2. Jungle Tracking with RM15.00 per Adult and Rm10.00 per Child." +
                           "\n    3. Boat Trip with RM25.00 per Adult and RM15.00 per Child.");
        
        //Booking form
        System.out.println();
        System.out.println();
        System.out.println("\n                                                    " + "                     CUSTOMER BOOKING FORM                                " ); 
        System.out.println("============================================================================================================================================================================================");
        
        customer pelanggan = new customer();
        
        //Read the input entered by user using I/O console                   
        System.out.print("\n    Enter your full name : ");
        String name = inputLine.nextLine().toUpperCase();
        
        /*User must enter 14 digit number of IC include '-', if not 
        this part will repeat until user enter 14 digit number of IC include '-'*/ 
        System.out.print("\n    If you are citizen, enter 14 digit number of IC include '-' : " + 
                         "\n    If you are foreigner, enter passport number :");
        String IC = inputLine.nextLine();       
        sizeIC = IC.length();
        
        /*This part is to check condition either true or not
        about user's ic number*/
        while(sizeIC != 14)
        {
            System.out.print("\n    Your ic number is wrong  ");
            System.out.print("\n    If you are citizen, enter 14 digit number of IC include '-' : " + 
                             "\n    If you are foreigner, enter passport number : ");
            IC = inputLine.nextLine();
            sizeIC = IC.length();   
        }

        System.out.print("\n    Enter your phone number: ");
        String phoneNumber = inputLine.nextLine();
        
        System.out.print("\n    Enter your email address: ");
        String email = inputLine.nextLine();
             
        //Only malay will not get pass for join night party
        System.out.print("\n    Enter your race (Malay/Indian/Chinese/Christian/Atheis/etc): ");
        String race = inputLine.nextLine().toUpperCase();
        String substring = race.substring(0); 
        
        pelanggan.setCustomer(name, IC, phoneNumber, email, race);
            
        //If true user will get discount for member
        System.out.print("\n    Do you have membership(True/False) ?: ");
        boolean membership = input.nextBoolean();        
        
        System.out.print("\n    How many adult : ");
        int numAdult = input.nextInt();    
        
        System.out.print("\n    How many child : ");
        int numChild = input.nextInt();     
        
        System.out.print("\n    How many day : ");
        int dayRoom = input.nextInt();
        
        System.out.print("\n    Date Check In (EX: 23 MARCH 2020): ");
        String checkIn = inputLine.nextLine().toUpperCase();       
        
        /*User must choose 1 type of rooms only, if user ignore this part the program
         will repeat until user enter the type of rooms*/
 
        System.out.print("\n    Choose type of room (Studio Room/Fressno Family Suite/Penthouse/No) : ");
        typeRoom = inputLine.nextLine().toUpperCase();
        
        while(!(typeRoom.equalsIgnoreCase("No") ||
                typeRoom.equalsIgnoreCase("Studio Room") || 
                typeRoom.equalsIgnoreCase("Fressno Family Suite") ||
                typeRoom.equalsIgnoreCase("Penthouse") ))
        {
            System.out.print("\n    Your type of room are not valid.");
            System.out.print("\n    Choose type of room (Studio Room/Fressno Family Suite/Penthouse/No) : ");
            typeRoom = inputLine.nextLine().toUpperCase();  
            booking.setTypeRoom(typeRoom);
        }
        
        System.out.print("\n    How many room : ");
        int numRoom = input.nextInt();        
        
        /*This part for user to choose their name of room
        if Type room is Studio Room name of room is SR A,SR B,SR C,OR SR 1 until SR 10
        if Type room is Fressno Family suite, name of room are FFS A,FFS B, OR FFS 1 until FFS8
        if Type room is Penthouse, name of room are PA,PB,PC,PD OR P1 until P10
        if user enter a wrong name of room, this part will repeat until user enter the valid of room's name
        followed by type of room*/
        String[] x = new String[numRoom];//declaration variable array that contain value of number of room from user               
        
        for(int i = 0; i < x.length; i++)
        {
            /*x[i]= new String();*/                        //show user that looping start from 1
            System.out.print("\n    Enter name of room " + (i+1) + " (ex: SR A/FFS A/PA/No) : ");
            nameRoom = inputLine.nextLine().toUpperCase();//automatically made capital letters if user input small letters on the outpu
            x[i] = nameRoom;//insert name for each room that user choose
            
            if(typeRoom.equalsIgnoreCase("No"))
                    
              {
                  while(!(nameRoom.equalsIgnoreCase("No")))
                  {
                    System.out.print("\n    Please enter 'No'.");
                    System.out.print("\n    Enter name of room " + (i+1) + " : ");
                    nameRoom = inputLine.nextLine().toUpperCase();
                    x[i] = nameRoom;         //automatically made capital letters if user input small letters on the output 
                  }  //insert name for each room that user choose        
              }
            
            else if(typeRoom.equalsIgnoreCase("Studio Room"))
                    
              {
                  while(!(nameRoom.equalsIgnoreCase("SR A") || nameRoom.equalsIgnoreCase("SR B") || nameRoom.equalsIgnoreCase("SR C") || nameRoom.equalsIgnoreCase("SR 1") ||
                          nameRoom.equalsIgnoreCase("SR 2") || nameRoom.equalsIgnoreCase("SR 3") || nameRoom.equalsIgnoreCase("SR 4") || nameRoom.equalsIgnoreCase("SR 5") ||
                          nameRoom.equalsIgnoreCase("SR 6") || nameRoom.equalsIgnoreCase("SR 7") || nameRoom.equalsIgnoreCase("SR 8") || nameRoom.equalsIgnoreCase("SR 9") ||
                          nameRoom.equalsIgnoreCase("SR 10")))
                  {
                    System.out.print("\n    Valid name of room either SR A,SR B,SR C,OR SR 1 until SR 10 only.");
                    System.out.print("\n    Enter name of room " + (i+1) + " : ");
                    nameRoom = inputLine.nextLine().toUpperCase();
                    x[i] = nameRoom;          //automatically switch to capital letters if user input small letters on the output 
                  }          
              }
              
              else if(typeRoom.equalsIgnoreCase("Fressno Family Suite"))
                    
              {
                  while(!(nameRoom.equalsIgnoreCase("FFS A") || nameRoom.equalsIgnoreCase("FFS B") || nameRoom.equalsIgnoreCase("FFS 1") || nameRoom.equalsIgnoreCase("FFS 2") ||
                          nameRoom.equalsIgnoreCase("FFS 3") || nameRoom.equalsIgnoreCase("FFS 4") || nameRoom.equalsIgnoreCase("FFS 5") || nameRoom.equalsIgnoreCase("FFS 6") || 
                          nameRoom.equalsIgnoreCase("FFS 7") || nameRoom.equalsIgnoreCase("FFS 8") ))
                  {
                    System.out.print("\n    Valid name of room is either FFS A,FFS B, OR FFS 1 until FFS8 only.");
                    System.out.print("\n    Enter name of room " + (i+1) + " : ");
                    nameRoom = inputLine.nextLine().toUpperCase();   
                    x[i] = nameRoom;           //automatically switch to capital letters if user input small letters
                  }
              }
              
            else if(typeRoom.equalsIgnoreCase("Penthouse"))
                    
              {
                  while(!(nameRoom.equalsIgnoreCase("PA") || nameRoom.equalsIgnoreCase("PB") || nameRoom.equalsIgnoreCase("PC") || nameRoom.equalsIgnoreCase("PD") ||
                          nameRoom.equalsIgnoreCase("P1") || nameRoom.equalsIgnoreCase("P2") || nameRoom.equalsIgnoreCase("P3") || nameRoom.equalsIgnoreCase("P4") || 
                          nameRoom.equalsIgnoreCase("P5") || nameRoom.equalsIgnoreCase("P6") || nameRoom.equalsIgnoreCase("P7") || nameRoom.equalsIgnoreCase("P8") || 
                          nameRoom.equalsIgnoreCase("P9") || nameRoom.equalsIgnoreCase("P10") ))
                  {
                    System.out.print("\n    Valid name of room is either PA,PB,PC,PD OR P1 until P10 only.");
                    System.out.print("\n    Enter name of room " + (i+1) + " : ");
                    nameRoom = inputLine.nextLine().toUpperCase();   
                    x[i] = nameRoom;
                  }
              }
        }       
        
        /*User need to enter level of room in range level 1 - level 12 of their each room */
        String[] x1 = new String[numRoom];
        
        for(int i = 0; i < x1.length; i++)
        {
            
              System.out.print("\n    Enter level of room " + (i+1) + " (ex: LEVEL 1) : ");
              levelRoom = inputLine.nextLine().toUpperCase();
              x1[i] = levelRoom;
            
            if(typeRoom.equalsIgnoreCase("Studio Room") || typeRoom.equalsIgnoreCase("Fressno Family Suite") || typeRoom.equalsIgnoreCase("Penthouse") )
                    
              {
                  while(!(levelRoom.equalsIgnoreCase("level 1") || levelRoom.equalsIgnoreCase("level 2") || levelRoom.equalsIgnoreCase("level 3") ||
                          levelRoom.equalsIgnoreCase("level 4") || levelRoom.equalsIgnoreCase("level 5") || levelRoom.equalsIgnoreCase("level 6") ||
                          levelRoom.equalsIgnoreCase("level 7") || levelRoom.equalsIgnoreCase("level 8") || levelRoom.equalsIgnoreCase("level 9") ||
                          levelRoom.equalsIgnoreCase("level 10") || levelRoom.equalsIgnoreCase("level 11") || levelRoom.equalsIgnoreCase("level 12")))
                  {
                    System.out.print("\n    Valid level of room is level 1 until level 12 only.");
                    System.out.print("\n    Enter level of room " + (i+1) + " : ");
                    levelRoom = inputLine.nextLine().toUpperCase();
                    x1[i] = levelRoom;
                  }          
              }  
              
             else if(typeRoom.equalsIgnoreCase("No"))
                    
              {
                  while(!(levelRoom.equalsIgnoreCase("No")))
                  {
                    System.out.print("\n    Please enter 'No'.");
                    System.out.print("\n    Enter level of room " + (i+1) + " : ");
                    levelRoom = inputLine.nextLine().toUpperCase();
                    x1[i] = levelRoom;
                  }          
              }            
        }  
        //To set the object’s values (properties values) 
        pelanggan.setName(name);
        pelanggan.setEmail(email);
        pelanggan.setPhoneNumber(phoneNumber);
        pelanggan.setIC(IC);
        pelanggan.setRace(race);
        
        //To set the object’s values (properties values) 
        booking.setMembership(membership);
        booking.setNumAdult(numAdult);
        booking.setNumChild(numChild);
        booking.setCheckIn(checkIn);
        booking.setNumRoom(numRoom);
        booking.setTypeRoom(typeRoom);
        booking.setNameRoom(nameRoom);
        booking.setDayRoom(dayRoom);   
        booking.setLevelRoom(levelRoom);          
        
        /*User must choose 1 type of activity only, if user ignore this part the program
         will repeat until user enter the type of activity*/
        System.out.print("\n    Choose type of activity (Jungle Tracking/Snorkeling/Boat Trip/No) : ");
        typeActivity = inputLine.nextLine().toUpperCase();
        
        while(!(typeActivity.equalsIgnoreCase("No") || 
                typeActivity.equalsIgnoreCase("Jungle Tracking") || 
                typeActivity.equalsIgnoreCase("Snorkeling") ||
                typeActivity.equalsIgnoreCase("Boat Trip") ))
        {
            System.out.print("\n    Your type of activity are not valid.");
            System.out.print("\n    Choose type of activity (Jungle Tracking/Snorkeling/Boat Trip/No) : ");
            typeActivity = inputLine.nextLine().toUpperCase();  
            booking.setTypeActivity(typeActivity);
        }
        booking.setTypeActivity(typeActivity); 

        System.out.println(); 
        System.out.println("===============================================================================================================================================================================================================================");
        
        //To display customer booking information
        System.out.println("    ----------------------------- ");  
        System.out.println("   |Customer Booking Information.|"); 
        System.out.println("    ----------------------------- "); 
        
        //output full name for input user
        System.out.println("    Full Name: " + pelanggan.getName()); 
        
        //output email for input user
        System.out.println("    Email: " + pelanggan.getEmail()); 
        
        //output phone number for input user
        System.out.println("    Phone Number: " + pelanggan.getPhoneNumber());
        
        //output phone number for input user
        System.out.println("    Race: " + pelanggan.getRace(race)); 
        
        /*Call method toString() from holiday to display customer 
          booking information*/
        System.out.println(booking.toString());
        
        //Print name of each room that have choosen by customer 
        for(int i = 0; i<x.length; i++)
        {
            System.out.println("    Name Room "+ (i+1) + " : " + x[i]);
        } 
        
        //Print level of each room that have choosen by customer
        for(int i = 0; i<x1.length; i++)
        {
            System.out.println("    Level Room "+ (i+1) + " : " + x1[i]);
        } 
        
        //call calculatePeople() to calculate amount of people
        System.out.println("    Amount of people: " + booking.countPeople());
        System.out.println("    Amount breakfast coupun: 2 coupons" ); 
        System.out.println("========================================================================================================================================================================================================");  
        System.out.println();  
        
        System.out.println("    ----------------------");  
        System.out.println("    |Payment Information.| "); 
        System.out.println("    ----------------------");  
                
        //call calculateNormalRoomPrice() to calculate normal price for room
        System.out.println("    Normal price of room: RM" + booking.calculateNormalRoomPrice()); 
        
        //call calculateNormalActivityPrice() to calculate normal price for activity
        System.out.println("    Normal price of activity: RM"+ booking.calculateNormalActivityPrice());
        
        //call calculateTotalPriceBeforeDiscount() to calculate price for activity and room before discount
        System.out.println("    Total price before discount: RM"+ booking.calculateTotalPriceBeforeDiscount()); 
        
        //call calculateTotalPriceAfterDiscount() to calculate price for activity and room after discount 
        System.out.println("    Total price after discount: RM" + booking.calculateTotalPriceAfterDiscount());  
        
        //Tell to customer about price discount their get
        System.out.println("    Total price of discount: RM" + (booking.calculateTotalPriceBeforeDiscount()-booking.calculateTotalPriceAfterDiscount()));  
        
        System.out.println(); 
        
        //call method searchingMethodPayment() to display method payment for user
        System.out.println("    Method payment");
        System.out.println("    -------------------");
        System.out.println("    1. Online Banking");
        
        String choice3 = JOptionPane.showInputDialog("Find another method of  payment (YES/NO) ?");
        while(!(choice3.equalsIgnoreCase("YES") || choice3.equalsIgnoreCase("NO")))
        {
             choice3 = JOptionPane.showInputDialog("Find another method of  payment (YES/NO) ?");                 
        }
        
        if(choice3.equalsIgnoreCase("Yes"))
        {
            System.out.println(    "\n" + booking.searchingMethodPayment());
        }
        
        else if(choice3.equalsIgnoreCase("No"))
        {
            System.out.println("\n");
        }        
      
                
        System.out.println(); 
        
        System.out.println("==========================================================================================================================================================================================================");
        
        //Special offer for customer followed by type of race 
        System.out.println("\n    ==> Special offer get free pass to join night party ?");
        System.out.println("    -----------------------------------------------------");
                
        if(pelanggan.getRace(race).equalsIgnoreCase("Malay"))
        {
            System.out.print("\n\n    *Sorry you will not get any invitetation to join any night part because you are malay, " +
                             "but you will receive two more breakfast coupuns." +
                             "\n    Amount breakfast coupun: 4 coupons.");
        }
        
        else
        {
            System.out.print("\n    *You will get invitetation to join  night party" + 
                             "\n    Amount night party pass: 2 pass.");
        }

        System.out.println(); 
        System.out.println();      
        
        //Choice for customer either to continue their booking or not
        System.out.print("\n    Do you want to cancel this booking (Yes/No) : ");
        String choice1 = inputLine.nextLine();
        
        while(!(choice1.equalsIgnoreCase("YES") || choice1.equalsIgnoreCase("NO")))
        {
            System.out.print("\n    Do you want to cancel this booking (Yes/No) : ");
            choice1 = inputLine.nextLine();           
          
        }

        if(choice1.equalsIgnoreCase("YES"))
                 {
                     System.out.print("\n    Your boooking cancelled" +
                                      "\n    Your bill receipt will not be generated" +
                                      "\n    Thank you for using this application" +
                                      "\n    We will contact you either at your phone number (" + pelanggan.getPhoneNumber() + ") or at your email (" + pelanggan.getEmail() +
                                             ") for confirmation about your booking cancelation." +
                                      "\n");
                     
                 }
        
        if(choice1.equalsIgnoreCase("NO"))
                 {
                     System.out.print("\n    Your boooking accepted" +
                                      "\n    Your bill receipt will be generated soon" +
                                      "\n    Thank you for using this application" +
                                      "\n    We will contact you either at your phone number (" + pelanggan.getPhoneNumber() + ") or at your email (" + pelanggan.getEmail() +
                                             ") for confirmation about your booking information." +
                                      "\n");
                                      
                     
                 }
        
        System.out.println();         
        System.out.println("   " +      "<This apps customer can choose one type of room and activity only. " + 
                                        "If you want to choose more room and activity, you need to make new booking register.>" +
                                        "\n   <Contact us at 1300-88-4244 or pulaumutiara@gmail,com.>" );
        System.out.println();
        
        //To get customer feedback
        System.out.println("\n    Customer feedback");
        System.out.println("    ~ ~ ~ ~ ~ ~ ~ ~ ~  ");
        
        inputRate = JOptionPane.showInputDialog(null,"How much rate star (*) you want to give at this apps for your feedback : ");
        int numRate = Integer.parseInt(inputRate);
        
        if(numRate >= 1 && numRate <= 3 )
        {           
            System.out.print("\n    You give us rating at ");
             for(int i=0; i<numRate; i++)
             {
                System.out.print("*"); 
             }
             System.out.print("(" + numRate + ") Star. It's mean our apps still not good and need a lot of improvement.");
        }
        
        else if(numRate >= 4)
        {            
            System.out.print("\n    You give us rating at ");
             for(int i=0; i<numRate; i++)
             {
                System.out.print("*"); 
             }
             System.out.print("(" + numRate + ") Star. It's mean our apps are good and easy for you to make a booking.");
        }
        
        else
        {
            System.out.print("\n    You give us rating at ");
             for(int i=0; i<numRate; i++)
             {
                System.out.print("*"); 
             }
             System.out.print("(" + numRate + ") Star. It's mean our apps are too bad and difficult for you to make a booking.");
        }
        
        //if user want to leave, their will proceed to sign up from this apps
        //if user want to leave, their can check their booking information
        String choice2 = JOptionPane.showInputDialog("Do you want to 'STAY' at this apps or 'LEAVE' from this apps ?");
        
        while(!(choice2.equalsIgnoreCase("STAY") || choice2.equalsIgnoreCase("LEAVE")))
        {
            choice2 = JOptionPane.showInputDialog("Do you want to 'STAY' at this apps or 'LEAVE' from this apps ?");
        }
        
        if(choice2.equalsIgnoreCase("LEAVE"))
        {
            System.exit(0);
        }
        
        else if(choice2.equalsIgnoreCase("STAY"))
        {
            System.out.println("");
        }
    }
}