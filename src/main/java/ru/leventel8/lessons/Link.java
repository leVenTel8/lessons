package ru.leventel8.lessons;

class Link {

    public long dData;      //Переменная приватного типа, поле Link
    public Link next;       //Переменная приватного типа, ссылка на следующий элемент


    /**
     * Конструктор при инициализации
     * принимает параметр dd
     * @param dd
     *      поле dData
     */
    public  Link(long dd){

        dData = dd;

    }


}// end class Link
