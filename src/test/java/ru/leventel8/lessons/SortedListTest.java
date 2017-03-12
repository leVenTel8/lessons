package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortedListTest {
    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        int[] miniMassive;                              // создание массива подконтрольных чисел
        Link[] linkArray = new Link[5];                 // создание массива linkArray типа Link
        miniMassive = new int[5];                       // вставка значений в массив
        miniMassive[0]=10;
        miniMassive[1]=7;
        miniMassive[2]=2;
        miniMassive[3]=1;
        miniMassive[4]=5;
        for(int j=0; j<miniMassive.length; j++){

            int n = miniMassive[j];
            Link newLink = new Link(n);
            linkArray[j] = newLink;                             // вставка объектов типа Link в массив

        }

        SortedList sortedList = new SortedList(linkArray);     // при инициализации нового объекта типа SortedList,
                                                               // его конструктор вызывает метод insert() и сортирует вставленные элементы
        assertEquals(1, sortedList.remove().dData);    // проверка ожидаемого значения с возвращаемым


    }//end SortedList()

    /**
     * проверка удаления
     */
    @Test
    public void testRemove() {
        int[] miniMassive;                              // создание массива подконтрольных чисел
        Link[] linkArray = new Link[5];                 // создание массива linkArray типа Link
        miniMassive = new int[5];                       // вставка значений в массив
        miniMassive[0]=10;
        miniMassive[1]=7;
        miniMassive[2]=2;
        miniMassive[3]=1;
        miniMassive[4]=5;
        for(int j=0; j<miniMassive.length; j++){

            int n = miniMassive[j];
            Link newLink = new Link(n);
            linkArray[j] = newLink;                             // вставка объектов типа Link в массив

        }

        SortedList sortedList = new SortedList(linkArray);     // при инициализации нового объекта типа SortedList,
                                                               // его конструктор вызывает метод insert() и сортирует вставленные элементы
        assertEquals(1, sortedList.remove().dData);    // проверка ожидаемого значения с возвращаемым

    }//end testRemove()

}//end class SortedListTest