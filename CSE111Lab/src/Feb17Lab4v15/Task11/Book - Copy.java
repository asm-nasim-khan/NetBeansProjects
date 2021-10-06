package Feb17Lab4v15.Task11;
public class Book {
    public String title;
    public String author;
    public double price;
    public Book (String ti, String au, double p){
        title = ti;
        author = au;
        price = p;
    }
    public void setTitle(String t){
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setPrice(double p){
        price = p;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return "Title: "+title+" Author: "+author+" Price: "+price;
    }
    

}
