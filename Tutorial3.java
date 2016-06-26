/*
Author: Kuziwa Sachikonye
Date: 21 March 2013
Program Title: Tutorial 3
Program Description: This is the program that will calculate the 
        number of votes that a candidate at and election at UCT has recieved. The.
        program will also allow student to vote for their desired candidates

 */ 

import java.util.*;

public class Tutorial3 {
    


    public static void main(String[] args) {
        
        /*
        intitalising the variables and objects
         * Scanner
         * Read file Methods (Tutorial_Methods_Class methods)
         * Array List to hold candidates names
         */        
        
        Scanner input = new Scanner(System.in);
        Tutorial_Methods_Class methods = new Tutorial_Methods_Class();
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<B_Node> resultsList = new ArrayList<B_Node>();
        int userFaculty;
        int userChoice1;
        int userChoice = 0;
        
        /* read in the text file into an array (makes the program faster
           since we reduce the number of disk access calls.
         */
        
        arrayList = methods.ReadFile("candidates.txt");
        
        /* create a new binary search tree with no elements */
        
       BS_Tree bsTree = new BS_Tree(); 
       
       /* Build a binary search tree from the names and insert each name into the binary search tree*/
       
              int n = 0;
      for (n = 0; n < arrayList.size(); n++)
                {
                    bsTree.insert(arrayList.get(n));
                }
      
      
      
      /* Interface start: Present user with the options, await user  input and keep looping through
      options until user exits*/
      
      String i = "null";
      String vtagn = "Y";
      
      while (!(i.equals("3")))
      {
          
    System.out.println("=================================================");   
    System.out.println("            WELCOME TO THE UCT ELECTIONS");
    System.out.println("=================================================\n");
      
      System.out.println("Welcome to the UCT Elections. Please make a choice:");
      System.out.println("1. Student");
      System.out.println("2. EC Member");
      System.out.println("3. Exit\n");
      
      //    read input from the user

      i = input.nextLine();
      
      if (i.equals("1"))
      {
          
    System.out.println("=================================================");   
    System.out.println("                    STUDENT VOTER");
    System.out.println("=================================================");
          
      {
         
      /*take in input from user and store in variables tha will
       * be passed to create the node and update the number of votes
       */
          
      System.out.println("Enter your name (Firstname, Surname):");
      String studentName = input.nextLine();
      
      System.out.println("Enter your faculty (1 – 4):");
      userFaculty = Integer.parseInt(input.nextLine());

      System.out.println("Choose your candidate (1 – 20):");
      
      /*
       print out the list of candidate names
       */
      
      n = 0;
      for (n = 0; n < arrayList.size(); n++)
                {
                          System.out.printf("%-3s %-20s %n",n+1+".",arrayList.get(n));
                }
      
      System.out.println("");
      
      System.out.println("Choose your candidate (1 – 20):");
      
      
      
      userChoice1 = Integer.parseInt(input.nextLine());
      
// simple check to ensure that the candidate selected is a valid option
      
      while (userChoice1 > 20 || userChoice1 < 1)
      {
      System.out.println("That is not a valid choice. Try again\n");
      System.out.println("Choose your candidate (1 – 20):");
      n = 0;
      for (n = 0; n < arrayList.size(); n++)
                {
                          System.out.printf("%-3s %-20s %n",n+1+".",arrayList.get(n));
                }
      userChoice1 = Integer.parseInt(input.nextLine());
      }
      //userinterface to inform user of their choice
      {
          userChoice = userChoice1;
    System.out.println("=================================================");   
    System.out.println("        YOU VOTED FOR:  " + arrayList.get(userChoice-1));
    System.out.println("=================================================");
      }
      
      //update the votes of the candidate
      
      bsTree.find(arrayList.get(userChoice-1)).setVotes(userFaculty);
      
      System.out.println("Would you like to return to the main menu? (Y/N)");
      vtagn = input.nextLine();
      if ((vtagn.equalsIgnoreCase("n")))
      {
          System.out.println("Thank you for Voting");
      break;
      }
      
      else{
      continue;
      }
            
      }
      /*The EC section where the EC can check the votes
       */
      }
      if (i.equals("2"))
      {
      
    System.out.println("=================================================");   
    System.out.println("                    EC MEMBER");
    System.out.println("=================================================\n");
      System.out.println("Make your choice:");
      System.out.println("1. See election results");
      System.out.println("2. Print voter information");
      
      String eCChoice = (input.nextLine());
      
      if (eCChoice.equals("1"))
          
      {
      for (n = 0; n < arrayList.size(); n++)
                {
                          resultsList.add(bsTree.find(arrayList.get(n)));
                }
      }
      else
      {
      System.out.println("2. Printing  Voter Information .\n.\n.\n.\n.\n.\n.\n.\n DONE!");
      }
      // Sorting the array according to the Total number of votes
      Collections.sort(arrayList);
      
      // Printing out the election results
      
    System.out.println("========================================================================");   
    System.out.printf("%43s %n","Election Results");
    System.out.println("========================================================================\n");
    System.out.printf("%-20s %-10s %-10s %-10s %-10s %-10s %n","Candidate Name","Faculty1","Faculty2","Faculty3","Faculty4","Total");

    
          for (n = 0; n < arrayList.size(); n++)
                {
                    System.out.printf("%-23s %-10d %-10d %-10d %-9d %-10d %n",(resultsList.get(n).name).trim(),resultsList.get(n).faculty1,resultsList.get(n).faculty2,resultsList.get(n).faculty3,resultsList.get(n).faculty4,resultsList.get(n).Total);
                }
      }
      System.out.println("\nWould you like to return to the main menu? (Y/N)");
      vtagn = input.nextLine();
      if ((vtagn.equalsIgnoreCase("n")))
      {
          System.out.println("Thank you for Voting");
      break;
      }
      }
      }
      }