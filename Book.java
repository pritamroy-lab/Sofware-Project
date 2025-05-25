/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package baba;
public class Book {
    private String bookID;
    private String bookName;
    private String department;
    private String levelTerm;

    // Constructor
    public Book(String bookID,String bookName, String department, String levelTerm) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.department = department;
        this.levelTerm = levelTerm;
    }

    public String getBookID(){
        return bookID;
    }


// Getters
    public String getBookName() {
        return bookName;
    }

    public String getDepartment() {
        return department;
    }

    public String getLevelTerm() {
        return levelTerm;
    }

    // For displaying in console or UI
    @Override
    public String toString() {
        return "Book ID: " + bookID + ", Book Name: " + bookName + ", Department: " + department + ", Level-Term: " + levelTerm;
    }
    
}
