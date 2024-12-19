//package org.example;
//
//import com.google.common.base.Strings;
//import java.util.List;
//
//public class Library {
//    private String name;
//    private String location;
//    private boolean isOpen;
//    private List<Book> bookList;
//    private int bookCount;
//
//    public Library(String name, String location, List<String> bookList){
//        this.name=name;
//        this.location=location;
//        this.bookList=bookList;
//        this.isOpen=false;
//        this.bookCount=bookList.size();
//
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public String getLocation(){
//        return location;
//    }
//
//    public void setIsOpen(boolean isOpen){
//        this.isOpen=isOpen;
//    }
//
//    public List<String> getBookList() {
//        return bookList;
//    }
//
//    public String addBook(String bookTitle) {
//        this.bookList.add(bookTitle);
//        this.bookCount++;
//        return "Book added successfully";
//    }
//
//
//    public String removeBook(String bookTitle) {
//        this.bookList.remove(bookTitle);
//        this.bookCount--;
//        return "Book deleted successfully";
//    }
//
//
//    public int getBookCount() {
//        return this.bookCount;
//    }
//}
