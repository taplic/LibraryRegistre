package org.example;

class Book extends AbstractLibraryItem {
    private String title;
    private int pages;

    public Book(String author, String inventoryNumber, String title, int pages) {
        super(author, inventoryNumber);
        this.title = title;
        this.pages = pages;
    }

    // Дополнительные методы для книги
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
}