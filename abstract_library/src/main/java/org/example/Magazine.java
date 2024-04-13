package org.example;

class Magazine extends AbstractLibraryItem {
    private String issue;

    public Magazine(String author, String inventoryNumber, String issue) {
        super(author, inventoryNumber);
        this.issue = issue;
    }

    // Дополнительный метод для журнала
    public String getIssue() {
        return issue;
    }
}

