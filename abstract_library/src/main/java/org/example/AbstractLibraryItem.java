package org.example;

// Абстрактный класс для общих свойств и методов объектов библиотечного фонда
abstract class AbstractLibraryItem implements LibraryItem {
    private String author;
    private String inventoryNumber;

    public AbstractLibraryItem(String author, String inventoryNumber) {
        this.author = author;
        this.inventoryNumber = inventoryNumber;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getInventoryNumber() {
        return inventoryNumber;
    }
}
