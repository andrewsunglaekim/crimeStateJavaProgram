import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andrewkim on 10/10/17.
 */
public class CrimeStateProgram {
  public static void main(String args[]) throws FileNotFoundException, java.io.IOException {
    Scanner scannerIn = new Scanner(System.in);
    BufferedReader inputStream = null;
    String fileLine;
    UsCrimeClass tempCrimeObj;
    String userInput = "";
    long startTime;
    long endTime = 0;

    try {
      inputStream = new BufferedReader(new FileReader(args[0]));
      List<UsCrimeClass> crimeObjects = new ArrayList<>();
      while ((fileLine = inputStream.readLine() ) != null) {
        if(fileLine.substring(0, 1).equals("Y")){
          continue;
        }

        String[] lineArray = fileLine.split("\\s*,\\s*");
        tempCrimeObj = new UsCrimeClass(
                Double.parseDouble(lineArray[0]),
                Double.parseDouble(lineArray[1]),
                Double.parseDouble(lineArray[2]),
                Double.parseDouble(lineArray[3]),
                Double.parseDouble(lineArray[4]),
                Double.parseDouble(lineArray[5]),
                Double.parseDouble(lineArray[6]),
                Double.parseDouble(lineArray[7]),
                Double.parseDouble(lineArray[8]),
                Double.parseDouble(lineArray[9]),
                Double.parseDouble(lineArray[10]),
                Double.parseDouble(lineArray[11]),
                Double.parseDouble(lineArray[12]),
                Double.parseDouble(lineArray[13]),
                Double.parseDouble(lineArray[14]),
                Double.parseDouble(lineArray[15]),
                Double.parseDouble(lineArray[16]),
                Double.parseDouble(lineArray[17]),
                Double.parseDouble(lineArray[18]),
                Double.parseDouble(lineArray[19])
        );
        crimeObjects.add(tempCrimeObj);
      }
      startTime = System.nanoTime();
      while(!userInput.equals("Q")){
        System.out.println(getMenu());
        userInput = scannerIn.nextLine();
        switch(userInput){
          case "Q": endTime = System.nanoTime();
            break;
          case "1": System.out.println(getPopGrowths(crimeObjects));
            break;
          case "2": System.out.println(getHighestMurderRate(crimeObjects));
            break;
          case "3": System.out.println(getLowestMurderRate(crimeObjects));
            break;
          case "4": System.out.println(getHighestRobberyRate(crimeObjects));
            break;
          case "5": System.out.println(getLowestRobberyRate(crimeObjects));
            break;
        }
      }
      System.out.println("Thank you for trying the US Crimes Statistics Program.");
      System.out.println("Elapsed Time in Seconds was: " + ((endTime - startTime)/ 1000000000));
    }  catch (IOException io) {
      System.out.println("File IO exception: " + io.getMessage());

    }

  }

  public static String getMenu(){
    String menu = "1. What were the percentages in population growth for each consecutive year from 1994 – 2013?\n2. What year was the Murder rate the highest?\n3. What year was the Murder rate the lowest?\n4. What year was the Robbery rate the highest?\n5. What year was the Robbery rate the lowest?\nQ. Quit the program";
    return menu;
  }

  public static String getPopGrowths(List<UsCrimeClass> crimeObjects){
    String popGrowths = "";
    for(int i = 1; i < crimeObjects.size(); i++){
      if(i + 1 > crimeObjects.size()){
        break;
      }
      String year = "Year: " + (int)crimeObjects.get(i).getYear();
      popGrowths += year;
      popGrowths += " Population Growth Percentage: " + getGrowthPercentage(crimeObjects.get(i - 1), crimeObjects.get(i)) + "\n";
    }

    return popGrowths;
  }

  public static double getGrowthPercentage(UsCrimeClass firstCrimeObj, UsCrimeClass nextCrimeObj){
    double growthPercentage;
    double popDiff = nextCrimeObj.getPopulation() - firstCrimeObj.getPopulation();
    growthPercentage = popDiff / firstCrimeObj.getPopulation();
    return growthPercentage;
  }

  public static String getHighestMurderRate(List<UsCrimeClass> crimeObjects){
    UsCrimeClass highestMurderRateCrimeObj = crimeObjects.get(0);
    for (UsCrimeClass crimeObj: crimeObjects) {
      if(crimeObj.getMurderManslaughterRate() > highestMurderRateCrimeObj.getMurderManslaughterRate()){
        highestMurderRateCrimeObj = crimeObj;
      }
    }
    return "The Murder rate was highest in " + (int)highestMurderRateCrimeObj.getYear();
  }

  public static String getLowestMurderRate(List<UsCrimeClass> crimeObjects){
    UsCrimeClass lowestMurderRateCrimeObj = crimeObjects.get(0);
    for (UsCrimeClass crimeObj: crimeObjects) {
      if(crimeObj.getMurderManslaughterRate() < lowestMurderRateCrimeObj.getMurderManslaughterRate()){
        lowestMurderRateCrimeObj = crimeObj;
      }
    }
    return "The Murder rate was lowest in " + (int)lowestMurderRateCrimeObj.getYear();
  }

  public static String getHighestRobberyRate(List<UsCrimeClass> crimeObjects){
    UsCrimeClass highestRobberyRateCrimeObj = crimeObjects.get(0);
    for (UsCrimeClass crimeObj: crimeObjects) {
      if(crimeObj.getRobberyRate() > highestRobberyRateCrimeObj.getRobberyRate()){
        highestRobberyRateCrimeObj = crimeObj;
      }
    }
    return "The Robbery rate was highest in " + (int)highestRobberyRateCrimeObj.getYear();
  }

  public static String getLowestRobberyRate(List<UsCrimeClass> crimeObjects){
    UsCrimeClass lowestRobberyRateCrimeObj = crimeObjects.get(0);
    for (UsCrimeClass crimeObj: crimeObjects) {
      if(crimeObj.getRobberyRate() < lowestRobberyRateCrimeObj.getRobberyRate()){
        lowestRobberyRateCrimeObj = crimeObj;
      }
    }
    return "The Robbery rate was lowest in " + (int)lowestRobberyRateCrimeObj.getYear();
  }
}
