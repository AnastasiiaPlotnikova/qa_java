package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class FelineTest {
    Feline feline;

    @Test
    public void eatMeatReturnsExpectedFoodList() throws Exception {
        feline = new Feline();
        assertEquals("Список продуктов не совпадает", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsCat() {
        feline = new Feline();
        assertEquals("Неверный класс", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturnsOneKitten() {
        Feline feline = new Feline();
        assertEquals("Количество должно быть равно 1", 1, feline.getKittens());
    }
}