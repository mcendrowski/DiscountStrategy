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
public class NotFoundInDatabaseException extends NullPointerException {
    private static final String MSG = "Item not found in the relevant database";

    public NotFoundInDatabaseException() {
    super(MSG);
    }

    public NotFoundInDatabaseException(String string) {
        this();
    }


    
    
}
