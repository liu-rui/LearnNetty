package com.liurui;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        List<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(3);
        a.add(6);

        final Iterator<Integer> iterator = a.iterator();

        while (iterator.hasNext()){
            final Integer next = iterator.next();

            if(next == 3){
                iterator.remove();
            }
        }

        System.out.println(a);
    }
}
