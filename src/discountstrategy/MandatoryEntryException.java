/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author MCENDROWSKI
 */
public class MandatoryEntryException extends IllegalArgumentException {
    private static final String MSG = "You cannot provide an empty input.";
    public MandatoryEntryException() {
    super(MSG);
    }

    public MandatoryEntryException(String string) {
        this();
    }

    public MandatoryEntryException(String string, Throwable thrwbl) {
        this();
    }

    public MandatoryEntryException(Throwable thrwbl) {
        this();
    }

    
    
}
