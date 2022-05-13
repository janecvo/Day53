public class Book {
    private String bookTitle;
    private int numOfPages;
    private int yearPub;

public Book (String bookTitle, int numOfPages, int yearPub){
    this.bookTitle = bookTitle;
    this.numOfPages = numOfPages;
    this.yearPub = yearPub;
}

public Book (String title) {
    this.bookTitle = title;
}

public Book(int yearPub){
    this.yearPub = yearPub;
}

public Book(String title, int pages){
    this.bookTitle = title;
    this.numOfPages = pages;
}

public String getTitle(){
    return bookTitle;
}

public int getPages(){
    return numOfPages;
}

public String getBookTitle() {
    return bookTitle;
}

public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
}

public int getNumOfPages() {
    return numOfPages;
}

public void setNumOfPages(int numOfPages) {
    this.numOfPages = numOfPages;
}

public int getYearPub() {
    return yearPub;
}

public void setYearPub(int yearPub) {
    this.yearPub = yearPub;
}

public int getYear(){
    return yearPub;
}

public String toString(String something){
    String blank = null;
    if (something.equalsIgnoreCase("everything")){
        blank = getTitle() + ", " +  getPages() + " pages, " + getYear();
    }else if (something.equalsIgnoreCase("name")){
        blank = getTitle();
    }
    return blank;
    
}

}
