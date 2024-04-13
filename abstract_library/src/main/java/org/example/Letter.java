package org.example;

// Класс для письма
class Letter extends AbstractLibraryItem {
    private String recipient;

    public Letter(String author, String inventoryNumber, String recipient) {
        super(author, inventoryNumber);
        this.recipient = recipient;
    }

    // Дополнительный метод для письма
    public String getRecipient() {
        return recipient;
    }
}
