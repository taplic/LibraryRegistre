package org.example;

// Класс для микрофильма
class Microfilm extends AbstractLibraryItem {
    private String description;

    public Microfilm(String author, String inventoryNumber, String description) {
        super(author, inventoryNumber);
        this.description = description;
    }

    // Дополнительный метод для микрофильма
    public String getDescription() {
        return description;
    }
}