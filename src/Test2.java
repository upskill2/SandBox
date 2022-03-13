/* File: Test.java
 * This is a simple illustration of the rules
 * that concern Java class structure
 */
//package host.igor;
import java.lang.*;
// package org.xlator; // INVALID
// import java.util.*; // VALID but the code uses another approach
import java.util.ArrayList;
import java.util.Date;
// import java.sql.Date; // INVALID
interface I1{}
// public interface I2{} // INVALID
class C1{ }
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().list.add("Hello")); // prints true
    }
    java.util.List<String> list = new ArrayList<String>();
}