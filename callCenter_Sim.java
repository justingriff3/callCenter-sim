  
import java.util.Random;
import java.util.*;
import java.io.*;


public class callCenter_Sim 
{ 

  String data;
  int count = 0;
  callCenter_Sim front = null;
  callCenter_Sim link;
  callCenter_Sim rear;
  Random randNum = new Random();
  int[] phoneNum = new int[20];        //Array to hold phone numbers
  String[] problem = new String[15];   //Array to hold problems which are generated randomly from a txt file
  int randProb;   
  callCenter_Sim location; 
  callCenter_Sim hold;    
  

  public callCenter_Sim(String initialData, callCenter_Sim initialLink)
  {
      data = initialData; 
      link = initialLink;   
  }
   int x;
   File fileNP;        
   Scanner inputFileTN ;
     //Method to generate 10 callers/names and places them in queue
   public void generateCallList() throws IOException
   { 
      String name; 
      File fileNP = new File("TechNames.txt");        //Initialization of "TechNames.txt" file
      Scanner inputFileTN = new Scanner(fileNP);     //Scanner to read from file
         rear = new callCenter_Sim(inputFileTN.nextLine(), null);
         front=rear;
         count++;
      for(int i=0; i<8; i++){
         rear.link=new callCenter_Sim(inputFileTN.nextLine(), null);
         rear=rear.link;
         hold=rear;
         count++;
      }
      x = randNum.nextInt(20);                          //value to generate random names from the names array
               
   }
   public void addCaller()throws IOException{
   fileNP = new File("TechNames.txt");        //Initialization of "TechNames.txt" file
   inputFileTN = new Scanner(fileNP);     //Scanner to read from file
   for(int i=-1; i<=count; i++){
      inputFileTN.nextLine();
   }
      if(inputFileTN.hasNext()){
         if(front==null){
            front=new callCenter_Sim(inputFileTN.nextLine(),null);
            rear=front;
            hold=rear;
            count=1;
         }else{
            rear.link=new callCenter_Sim(inputFileTN.nextLine(),null);
            rear=rear.link;
            hold=rear;
            count++;
          }
      }else{
         System.out.println("No more Customers right now!");
      }
   }
   
   public void problemDisplay(){
   Scanner kb = new Scanner(System.in);
   System.out.println("Based on the customers needs, what is the BEST response you can give to help them");
   System.out.println("\t1. Call your manufacturer/company");
   System.out.println("\t2. Bring it to the store so we can fix it");
   System.out.println("\t3. Turn it off/on or change your batteries");
   System.out.println("\t4. Replace it"); 
   System.out.println("\t5. Call your cable/internet company");
   System.out.println("\t6. Back-up your data");
   System.out.println("\t7. Clear some old files and photos to make space");
   System.out.print("Please enter ONLY the number of your answer: ");
   try
   {
   int answer = kb.nextInt();
      switch (problem[randProb]){
         case "My phone battery is dying too quick.":
             switch (answer){
               case 1:
                  System.out.println("That is INCORRECT");               
                  break;
               case 2:
                  System.out.println("That is CORRECT. Keep up the good work!"); 
                  break;              
               case 3:
                  System.out.println("That is INCORRECT");               
                  break;
               case 4:
                  System.out.println("That is INCORRECT");               
                  break;
               case 5:
                  System.out.println("That is INCORRECT");               
                  break;
               case 6:               
                  System.out.println("That is INCORRECT");               
                  break;
               case 7:
                  System.out.println("That is INCORRECT");               
                  break;
               default:
                  System.out.println("Not a valid answer");
             }
         
            break;
         case "My Mac Book is running to slow.":
            switch (answer){
               case 1:
                  System.out.println("That is CORRECT. Way to go!");               
                  break;
               case 2:
                  System.out.println("That is INCORRECT");
                  break;               
               case 3:
                  System.out.println("That is INCORRECT");               
                  break;
               case 4:
                  System.out.println("That is INCORRECT");               
                  break;
               case 5:
                  System.out.println("That is INCORRECT");               
                  break;
               case 6:               
                  System.out.println("That is INCORRECT");               
                  break;
               case 7:
                  System.out.println("That is INCORRECT. It close but not quite. Keep trying!");               
                  break;
               default:
                  System.out.println("Not a valid answer");
             }
            break;
         case "My TV is not registering my HDMI cable.":
            switch (answer){
               case 1:
                  System.out.println("That is INCORRECT");               
                  break;
               case 2:
                  System.out.println("That is INCORRECT");
                  break;               
               case 3:
                  System.out.println("That is INCORRECT");               
                  break;
               case 4:
                  System.out.println("That is INCORRECT");               
                  break;
               case 5:
                  System.out.println("That is CORRECT. You are on a roll!");               
                  break;
               case 6:               
                  System.out.println("That is INCORRECT");               
                  break;
               case 7:
                  System.out.println("That is INCORRECT");               
                  break;
               default:
                  System.out.println("Not a valid answer");
             }
            break;
         case "My Siri keeps activating randomly in my pocket.":
            switch (answer){
               case 1:
                  System.out.println("That is INCORRECT");               
                  break;
               case 2:
                  System.out.println("That is INCORRECT");
                  break;               
               case 3:
                  System.out.println("That is CORRECT. You are killing this!");               
                  break;
               case 4:
                  System.out.println("That is INCORRECT");               
                  break;
               case 5:
                  System.out.println("That is INCORRECT");               
                  break;
               case 6:               
                  System.out.println("That is INCORRECT");               
                  break;
               case 7:
                  System.out.println("That is INCORRECT. Good idea, but not the best first option");               
                  break;
               default:
                  System.out.println("Not a valid answer");
             }
            break;
         case "My Xbox keeps ejecting my video games disc.":
            switch (answer){
               case 1:
                  System.out.println("That is CORRECT. Impressive work!");               
                  break;
               case 2:
                  System.out.println("That is INCORRECT");     
                  break;          
               case 3:
                  System.out.println("That is INCORRECT");               
                  break;
               case 4:
                  System.out.println("That is INCORRECT");               
                  break;
               case 5:
                  System.out.println("That is INCORRECT");               
                  break;
               case 6:               
                  System.out.println("That is INCORRECT");               
                  break;
               case 7:
                  System.out.println("That is INCORRECT");               
                  break;
               default:
                  System.out.println("Not a valid answer");
             }
            break; 
         } 
         }
         catch (Exception InputMismatchException){
            System.out.println("ERROR: MUST SUBMIT AN INTEGER (1-7)");
         }
        /* System.out.println("Callers Left:");
         location=front;
         hold=rear;
         do{
            if(location.data==hold.data){
               System.out.println("No callers left");
               rear.link= new callCenter_Sim(location.data, null);
               rear=rear.link;
               hold=rear;
            }else{
               System.out.println(location.data + " ");
               rear.link= new callCenter_Sim(location.data, rear.link);
               rear=rear.link;
               front=front.link;
               location=location.link;
            }
         }while(location!=hold);*/
   }
public void printInfo() throws IOException
  {
  
  location=front;
  System.out.println("Name: " + location.data);
  front=front.link;       
  location=location.link;                   //removing caller from front of queue
  File fileTP = new File("TechProblems.txt");        //Initialization of "TechProblems.txt."
  Scanner inputFileTP = new Scanner(fileTP);         //Scanner to read from file
   

  for(int i = 0; i < 20; i++)                        //for loop to place random numbers into array
  {  
     if(i > 14)                                      //xxx-xxx-yyyy = phone number format
     phoneNum[i] = randNum.nextInt(1000)+4000;     //generate yyyy numbers
         else
           phoneNum[i] = randNum.nextInt(200)+600; //generate xxx numbers
   } 
   System.out.println("Phone number: " + phoneNum[0] + "-" + phoneNum[1] + "-" + phoneNum[15]);              
    int scan=0;
   while(inputFileTP.hasNext()) {                     //while loop to place problems into array 
      problem[scan]=inputFileTP.nextLine();
      scan++;
   }
   randProb = randNum.nextInt(4);
      System.out.println("Problem: " + problem[randProb]);
}
   
   public static void main(String[] args) throws IOException
   {
   
   System.out.println("Welcome to the H&G Tech Support Company initial training.\nYou will be given customer information and a problem. \nYour goal is toanswer that question to the best of your ability.\nYou will be required to answer and least 8 question. After that feel free to continue training or step.\nYour progress will be recorded\nGet ready to be a excellent employee!!");
   System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><");
   System.out.println();
   callCenter_Sim callList = new callCenter_Sim("names", null);
       callList.generateCallList();

   for(int i=0; i<8; i++){
    callList.printInfo();
    callList.problemDisplay();
    System.out.println();
   }
  callList.addCaller();
   callList.printInfo();
    callList.problemDisplay();
    System.out.println();
    callList.addCaller();
   callList.printInfo();
   
   }
  }
  
