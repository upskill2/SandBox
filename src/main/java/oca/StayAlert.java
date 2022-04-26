package oca;

import java.io.IOException;

public class StayAlert {
  public static void main(String args[]) {
         IOException ioe = null;
         try {
             throw null;
             }
         catch(NullPointerException npe){ System.out.print("Caught NPE ");}
         try {
             throw ioe;
             }
         catch(IOException ioe2){System.out.print("+ Caught IOE");}
         }
  }