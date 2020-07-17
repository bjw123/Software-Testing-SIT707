package org.example.untitled;

import java.util.Iterator;
import java.util.LinkedList;

public class MessAround {
    public static void main(String[] args)
    {
        LinkedList<String> threeMultiples = new LinkedList<String>();
        int threeCounter = 3;
        int threeMax = 1000;
        int threeIndex = 0;
        int threeTotal = 0;

        while (threeCounter < threeMax){
            threeMultiples.add(Integer.toString(threeCounter));
            threeCounter +=3;
            threeIndex++;
        }
        Iterator<String> threeIterator=threeMultiples.iterator();
        while(threeIterator.hasNext()) {
            threeTotal +=Integer.parseInt(threeIterator.next());
        }





        LinkedList<String> fiveMultiples = new LinkedList<String>();
        int fiveCounter = 5;
        int fiveMax = 1000;
        int fiveIndex = 0;
        int fiveTotal = 0;

        while (fiveCounter < fiveMax){
            fiveMultiples.add(Integer.toString(fiveCounter));
            fiveCounter +=5;
            fiveIndex++;
        }
        Iterator<String> fiveIterator=fiveMultiples.iterator();
        while(fiveIterator.hasNext()) {
            fiveTotal +=Integer.parseInt(fiveIterator.next());
        }
        System.out.println(fiveTotal + threeTotal);

    }
}
