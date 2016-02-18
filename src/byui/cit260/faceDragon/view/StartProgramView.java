/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.view;

import java.util.Scanner;

/**
 *
 * @author breecarrick
 */
public class StartProgramView {

    private String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\n Please enter your name";
        
        this.displayBanner();
    }
    
    public void displayBanner() {
        System.out.println(
         "\n**************************************************************"
        +"\n*                                                            *"
        +"\n*This is the game Face the Dragon.                           *"
        +"\n*In this game, you will be taking on the role of a farm boy. *"
        +"\n*Recently a dragon has invaded the kingdom. Many knights have*"
        +"\n*died trying to kill the dragon. As a final effort to save   *"
        +"\n*the kingdom the King has issued a proclamation that whoever *"
        +"\n*slays the dragon and brings back its head will be knighted  *"
        +"\n*and marry the Princess.                                     *"
        +"\n*                                                            *"
        +"\n*To be able to face this dragon you will need to gain        *"
        +"\n*experience and equipment. You will have to complete various *"
        +"\n*tasks in order to gain the experience and the gold you need.*"
        +"\n*Good luck, hope you don't die ;)                            *"
        +"\n*                                                            *"
        +"\n**************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
        } while (!done);
        
    }

    private String getPlayersName() {
        /*getInput(): value
            BEGIN
            WHILE a valid value has not been entered
             DISPLAY a message prompting the user to enter a value
            GET the value entered from keyboard
            Trim front and trailing blanks off of the value
            IF the length of the value is blank THEN
            DISPLAY “Invalid value: The value cannot be blank”
            CONTINUE
            ENDIF
            BREAK
            ENDWHILE
            RETURN value
        END */
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
        
            System.out.println("\n" + this.promptMessage);
            
            value= keyboard.nextLine();
            value= value.trim();
            
            if (value.length() <1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            
            break;
        }
        return value;
    }
        private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
}