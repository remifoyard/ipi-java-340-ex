package com.ipiecoles.java.java340.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)//org.junit.runners.Parameterized
public class CommercialTest
{
    @Parameterized.Parameter(value = 0)//org.junit.runners.Parameterized.Parameter
    public Double caAnnuel;
    @Parameterized.Parameter(value = 1)//org.junit.runners.Parameterized.Parameter
    public Double caAnnuel2;


    //org.junit.runners.Parameterized.Parameters
    @Parameterized.Parameters(name = "caAnnuel mata est nul {0} {1} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {null,500d}, {10000d,500d},{100000d,5000d}
        });
    }

    @Test
    public void testGetPrimeAnnuelleWithCaNull(){
        //Given
        Commercial commercial = new Commercial();
        commercial.setCaAnnuel(caAnnuel);

        //When
        Double prime = commercial.getPrimeAnnuelle();

        //Then
        Assertions.assertThat(prime).isEqualTo(caAnnuel2);
    }

}
