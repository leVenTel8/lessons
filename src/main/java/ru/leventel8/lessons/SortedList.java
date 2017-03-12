package ru.leventel8.lessons;

public class SortedList {

    private Link first;         //Переменная приватного типа, поле Link


    /**
     * Конструктор при инициализации
     * присвает ссылке first значение null
     */
    public SortedList(){

        first = null;

    }

    /**
     * перегрузка конструктора
     * Конструктор при инициализации
     * присвает ссылке first значение null
     * и если передается массив Link[]
     * @param   linkArr
     *      вставляет их в список
     */
    public SortedList(Link[] linkArr){

        first = null;
        for(int j=0; j<linkArr.length; j++)         // в цикле вставляются значения массива в список
            insert(linkArr[j]);

    }

    /**
     * вставка в список
     * @param k
     */
    public void insert(Link k){

        Link previous = null;                               // переменные previous, current типа Link
        Link current = first;

        while(current !=null && k.dData> current.dData){   // реализация алгоритма вставки в связанный список

            previous = current;
            current = current.next;

        }
        if(previous==null)
            first = k;
        else
            previous.next = k;
        k.next = current;
    }// end insert()


    /**
     * удаление из списка
     * @return temp
     */
    public Link remove(){

        Link temp = first;          // переменная ссылка на ссылку первого элемента
        first = first.next;         // удаление ссылки
        return temp;                // выход возвращает temp

    }// end remove()


}// end class SortedList
