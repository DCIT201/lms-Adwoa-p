package org.example;

public class Book {

    // This is your working class.
    private String title;
    private String author;
    private int yearPublished;
//    private String bookStatus;

    public Book(String title, String author, int yearPublished){
        this.title=title;
        this.author=author;
        this.yearPublished=yearPublished;
//        this.bookStatus="in_library";

    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getYearPublished(){
        return yearPublished;
    }

//    public String getBookStatus(){
//        return bookStatus;
//    }

//    public void setBookStatus(String status){
//        this.bookStatus=status;
//    }
}
