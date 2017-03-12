package ru.leventel8.lessons;

public class LinkInsertionSortApp {

    public static void main(String[] args){

        int size = 10;

        Link[] linkArray = new Link[size];

        for(int j=0; j<size; j++){

            int n = (int)(java.lang.Math.random()*99);
            Link newLink = new Link(n);
            linkArray[j] = newLink;

        }
        System.out.print("Несортированный массив: ");
        for(int j=0; j<size; j++)
            System.out.print(linkArray[j].dData+ " ");
        System.out.println("");

        SortedList theSortedList = new SortedList(linkArray);

        for(int j=0; j<size; j++)
            linkArray[j] = theSortedList.remove();
        System.out.print("сортированный массив: ");
        for(int j=0; j<size; j++)
            System.out.print(linkArray[j].dData+" ");
        System.out.println("");

    }

}
