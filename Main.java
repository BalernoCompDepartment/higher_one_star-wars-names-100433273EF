import java.util.Scanner; 
class Main {


  public static void main(String[] args) {

    String forename = Keyboard.getText("Please enter your first name.");
    String surname = Keyboard.getText("Please enter your surname.");
    String maiden = Keyboard.getText("Please enter your mother's maiden name.");
    String city = Keyboard.getText("Please enter the city you were born in.");

    String starWarsName = surname.substring(0,3) + forename.substring(0,2).toLowerCase() + " " + maiden.substring(0,3) + city.substring(0,2).toLowerCase();

    System.out.println("Your Star Wars name is " + starWarsName);


    
    
  }
}