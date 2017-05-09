	/** 
  * file: PPCalculator
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: Project 2
  * due date: May, 9, 2017
  *
  *This file contians the declaration of the 
  * PPCalculator abstract data type.
  */
	 
import java.util.HashMap;
import java.util.Scanner;

public class PPCalculator {
public static void main(String[] args) {
	
//Points to club	
  Scanner input = new Scanner(System.in);
  HashMap<String, Integer> clubs = new HashMap<>();
  HashMap<String, Integer> murals = new HashMap<>();
  HashMap<String, Integer> service = new HashMap<>();

// Entering all clubs and how many weeks
while (true) {
  System.out.println("Enter the name of a Club / Intercollegiate Sport (enter ONE at a time, or type 'none' to continue)");
  String in = input.next();
  if (in.equals("none")) {
  break;
  } else {
  System.out.println("How many meetings have you attended?");
  int meetings = input.nextInt();
  if (meetings > 8 && meetings < 16) {
  clubs.put(in, 1); // inputting one point with the club name
  } else if (meetings >= 16) {
  clubs.put(in, 2); // inputting 2
  } else {
  clubs.put(in, 0);
        }
      }
   }

// Entering all intramural and how many weeks
while (true) {
  System.out.println("Enter the name of a Intramural / Fitness & Leisure (enter ONE at a time, or type 'none' to continue)");
  String in = input.next();
  if (in.equals("none")) {
  break;
  } else {
  System.out.println("How many meetings have you attended?");
  int meetings = input.nextInt();
  if (meetings > 8 && meetings < 16) {
  murals.put(in, 1); // inputting one point with the club name
  } else if (meetings >= 16) {
  murals.put(in, 2); // inputting 2
  } else {
  murals.put(in, 0);
        }
      }
    }
		
// Entering all community service
while (true) {
  System.out.println("Enter the name of a Community Service (enter ONE at a time, or type 'none' to continue)");
  String in = input.next();
  if (in.equals("none")) {
  break;
  } else {
  System.out.println("How many hours have you attended?");
  int hours = input.nextInt();
  if (hours > 8 && hours < 16) {
  service.put(in, 1); // inputting one point with the club name
  } else if (hours >= 16) {
  service.put(in, 2); // inputting 2
  } else {
  service.put(in, 0);
        }
      }
    }
//User inputs GPA
System.out.print("Enter GPA:  ");
  double GPA = input.nextDouble();
  int gpaPoints; 

  if (GPA >= 3.85) {
  gpaPoints = 12;
  } else if (GPA >= 3.60) {
  gpaPoints = 11;
  } else if (GPA >= 3.25) {
  gpaPoints = 10;
  } else if (GPA >= 3.00) {
			gpaPoints = 9;
  } else if (GPA >= 2.75) {
  gpaPoints = 7;
  } else if (GPA >= 2.50) {
  gpaPoints = 6;
  } else if (GPA >= 2.25) {
  gpaPoints = 5;
  } else if (GPA >= 2.00) {
  gpaPoints = 4;
  } else if (GPA >= 0.50) {
  gpaPoints = 1;
  } else {
  gpaPoints = 0;
  }

//Finds Discipline and Room Condition
  System.out.println("Enter how many discelpine points you have (Max is 6). If you have not been written up for discipline you will receive the full 6 points.  :");
  int dpoints = input.nextInt();
		
  System.out.println("Enter how many Fall Room Condition points you have recieved (Max is 4). If you were not present for Fall Semester put 0.  :");
  int fall = input.nextInt();
		
  System.out.println("Enter how many Spring Room Condition points you have recieved (Max is 4). If you were not present for Spring Semester put 0.  :");
  int spring = input.nextInt();
		
//Makes sure each club category does not go over the limit
  int clubSum = 0;
  for(int i : clubs.values()){
  clubSum += i; 
  if(clubSum >= 3){
  clubSum = 3;
  break;
    }
  }
		
  int muralSum = 0;
  for(int i : murals.values()){
  muralSum += i; 
  if(muralSum >= 2){
  muralSum = 2;
  break;
    }
  }
		
  int serviceSum = 0; 
  for(int i : service.values()){
  serviceSum += i;
  if(serviceSum >= 2){
  serviceSum = 2;
  break;
    }
  }
		
//Adds all of the categories together
  int activityPoints = serviceSum + muralSum + clubSum;
  if(activityPoints >= 4){
  activityPoints = 4;
  }
		
//Prints total Priority Point
  int total = activityPoints + gpaPoints + dpoints + fall + spring;
  System.out.println("You have " + total + " priority points!");
    }
  }
