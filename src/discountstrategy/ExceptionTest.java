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
public class ExceptionTest {

    public static void stringMandatoryEntryTest(String object) {
        if (object == null || object.isEmpty()) {
            throw new MandatoryEntryException();
        }
    }

    public static void positiveNumberMandatoryEntryTest(double number) {
        if (number <= 0) {
            throw new MandatoryEntryException();
        }
    }
     public static void zeroOrMoreNumberMandatoryEntryTest(double number) {
        if (number < 0) {
            throw new MandatoryEntryException();
        }
    }

    public static void objectMandatoryEntryTest(Object object, ExceptionSource exceptionSource) {
        if (object == null && exceptionSource == ExceptionSource.GENERAL) {
            throw new MandatoryEntryException();
        }
        if (object == null && exceptionSource == ExceptionSource.DATABASE) {
            throw new NotFoundInDatabaseException();
        }
    }

    public static void objectMandatoryEntryTest(Object object) {
        if (object == null) {
            throw new MandatoryEntryException();

        }
    }

    public static void objectNotFoundInDatabaseTest(Object object) {
        if (object == null) {
            throw new NotFoundInDatabaseException();
        }
    }

}
