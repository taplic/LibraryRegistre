package org.example;

import java.util.ArrayList;
import java.util.List;

// Класс Main для инициализации реестра и сервиса поиска
public class Main {
    public static void main(String[] args) {
        // Инициализация реестра (генерирование экземпляров объектов)
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("Автор 1", "INV001", "Книга 1", 250));
        libraryItems.add(new Magazine("Автор 2", "INV002", "Журнал 1, выпуск 1"));
        libraryItems.add(new Letter("Автор 3", "INV003", "Получатель 1"));
        libraryItems.add(new Microfilm("Автор 4", "INV004", "Описание микрофильма"));

        // Инициализация сервиса поиска
        SearchService searchService = new LibrarySearchService(libraryItems);

        // Поиск и вывод результатов
        List<LibraryItem> foundByAuthor = searchService.searchByAuthor("Автор 1");
        System.out.println("Найдено по автору 'Автор 1':");
        for (LibraryItem item : foundByAuthor) {
            System.out.println(item.getInventoryNumber() + ": " + item.getAuthor());
        }

        List<LibraryItem> foundByInventoryNumber = searchService.searchByInventoryNumber("INV002");
        System.out.println("Найдено по инвентарному номеру 'INV002':");
        for (LibraryItem item : foundByInventoryNumber) {
            System.out.println(item.getInventoryNumber() + ": " + item.getAuthor());
        }
    }
}