public class Book{
String title; String author;int year;
public Book(String title,String author){
this.title=title;this.author=author;}
public Book(String title,String author,int year){
this.title=title;this.author=author,int year){
public void displayDetails(){
System.out.println("Title:"+title+",Author:"+author+",Year:"+year);
} public static void main(String[]args){
Book book1=new Book("1984","George")
Book book2=new Book("2001","Jungle book")
book1.DisplayDetails()
book2.dispalyDetails()

