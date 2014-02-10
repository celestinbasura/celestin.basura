/*
 * This is free software; you can redistribute it and/or modify it under
 * the terms of version 3 of the GNU General Public License as published
 * by the Free Software Foundation.
 *
 * Copyright 2011 Milan Draganic - NetAkademija
 */
package Poglavlje13.Primjeri.p1320;

/**
 * Primjer p1223
 * Java7, vidi catch statement
 *
 * @see http://download.oracle.com/javase/7/docs/technotes/guides/language/catch-multiple.html
 */
public class p1323 {

    public static void main(String[] args) throws Exception {

        new p1323().rethrowException("Druga");

    }

    public static class PrviException extends Exception {
    }

    public static class DrugiException extends Exception {
    }

    public void rethrowException(String exceptionName)
            throws PrviException, DrugiException {

        try {
            if(exceptionName.equals("Prva")) {
                throw new PrviException();
            }
            else {
                throw new DrugiException();
            }
        }
        catch(Exception ex) {
            System.out.println("Uhvatio iznimku: " + ex.getClass().getSimpleName());
            /*
             * However, in Java SE 7, you can specify the exception types
             * FirstException and SecondException in the throws clause in the
             * rethrowException method declaration. The Java SE 7 compiler can
             * determine that the exception thrown by the statement throw e must
             * have come from the try block, and the only exceptions thrown by
             * the try block can be FirstException and SecondException. Even
             * though the exception parameter of the catch clause, e, is type
             * Exception, the compiler can determine that it is an instance of
             * either FirstException or SecondException.
             *
             * This analysis is disabled if the catch parameter is assigned to
             * another value in the catch block. However, if the catch parameter
             * is assigned to another value, you must specify the exception type
             * Exception in the throws clause of the method declaration.
             *
             * In detail, in Java SE 7 and later, when you declare one or more
             * exception types in a catch clause, and rethrow the exception
             * handled by this catch block, the compiler verifies that the type
             * of the rethrown exception meets the following conditions:
             *  - The try block is able to throw it.
             *  - There are no other preceding catch blocks that can handle it.
             *  - It is a subtype or supertype of one of the catch clause's
             *    exception parameters.
             *
             * The Java SE 7 compiler allows you to specify the exception types
             * FirstException and SecondException in the throws clause in the
             * rethrowException method declaration because you can rethrow an
             * exception that is a supertype of any of the types declared in
             * the throws.
             *
             */
            throw ex;
        }

    }
}
