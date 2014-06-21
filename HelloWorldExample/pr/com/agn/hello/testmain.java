package com.agn.hello;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by IntelliJ IDEA.
 * User: Andrey
 * Date: 14/06/14
 * Time: 00:43
 * Tos change this template use File | Settings | File Templates.
 */


public class testmain {
    public static void main(String [] arg){
        System.out.println("aaaaawewerwer3v3_4nnnb");

       String gfriend = "Maasha";
       if (gfriend == "Maasha") {
           //
           System.out.println("gfriend = Maasha");
       }

        AtomicReference<String> gfriend1 = new AtomicReference<String>(new String("Natasha"));
        String gfriend2 = new String("Natasha");
        if (gfriend1.get() == gfriend2) {
            System.out.println("gfriend1 = gfriend2");
        }
        if  (gfriend1.get().equals(gfriend2)) {
            System.out.println("gfriend1 equals gfriend2");
        }
        
        int hashFr1 = gfriend1.get().hashCode();
        int hashFr2 = gfriend2.hashCode();
        if (hashFr1 == hashFr2){
            System.out.println("hashFr1 == hashFr2");
        }
    }
}
