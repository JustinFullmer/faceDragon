/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.exceptions;

/**
 *
 * @author breecarrick
 */
public class ExperienceControlException extends Exception {

    public ExperienceControlException() {
    }

    public ExperienceControlException(String message) {
        super(message);
    }

    public ExperienceControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExperienceControlException(Throwable cause) {
        super(cause);
    }

    public ExperienceControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
