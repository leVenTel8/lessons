package ru.leventel8.lessons;

public class LinkInsertionSortApp {

    public static void main(String[] args){

        int size = 10;                                          //размер массива

        Link[] linkArray = new Link[size];                      // новый массив размера size

        for(int j=0; j<size; j++){                              // передача рандомных аргументов в конструктор Link

            int n = (int)(java.lang.Math.random()*99);
            Link newLink = new Link(n);
            linkArray[j] = newLink;                             // вставка объектов типа Link в массив

        }

        System.out.print("Несортированный массив: ");           // вывод несортированного массива
        for(int j=0; j<size; j++)
            System.out.print(linkArray[j].dData+ " ");
        System.out.println("");

        SortedList theSortedList = new SortedList(linkArray);   // вставка массива в сортированный список

        for(int j=0; j<size; j++)
            linkArray[j] = theSortedList.remove();
        System.out.print("сортированный массив: ");             // вывод содержимого списка
        for(int j=0; j<size; j++)
            System.out.print(linkArray[j].dData+" ");
        System.out.println("");

    }//end main()

}//end class LinkInsertionSortApp
