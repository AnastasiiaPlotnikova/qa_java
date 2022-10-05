package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(feline);
        assertEquals("Кот говорит не Мяу", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnsExpectedFoodList() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals("Список продуктов не соответствует", cat.getFood(), Arrays.asList("Животные", "Птицы", "Рыба"));
    }
}