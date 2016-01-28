/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.faceDragon.model;

import java.util.Objects;

/**
 *
 * @author breecarrick
 */
public class Interaction extends Scene{
    //class instance variables
    private String prompt;
    private String result;
    
    //constructor function

    public Interaction() {
        super();
    }
    
    //getter and setter functions
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    //hashcode an equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.prompt);
        hash = 97 * hash + Objects.hashCode(this.result);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Interaction other = (Interaction) obj;
        if (!Objects.equals(this.prompt, other.prompt)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        return true;
    }
    
    //to string function

    @Override
    public String toString() {
        return "Interaction{" + "prompt=" + prompt + ", result=" + result + '}';
    }
    
}
