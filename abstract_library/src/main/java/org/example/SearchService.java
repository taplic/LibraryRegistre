package org.example;

import java.util.List;

// Интерфейс для определения методов поиска
interface SearchService {
    List<LibraryItem> searchByAuthor(String author);
    List<LibraryItem> searchByInventoryNumber(String inventoryNumber);
}