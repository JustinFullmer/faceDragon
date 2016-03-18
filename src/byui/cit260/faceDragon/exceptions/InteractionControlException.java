/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.exceptions;

/**
 *
 * @author Justin
 */
public class InteractionControlException extends Exception{

    public InteractionControlException() {
    }

    public InteractionControlException(String string) {
        super(string);
    }

    public InteractionControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public InteractionControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public InteractionControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
