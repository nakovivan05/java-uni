package Lab6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
class Book
{
    private String name;
    private String author;
    private int year;
    public Book(String name, String author, int year)
    {
        setName(name);
        setAuthor(author);
        setYear(year);
    }
    public String getName()
    {
        return this.name;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public int getYear()
    {
        return this.year;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    @Override
    public boolean equals(Object o)
    {
        if(!(o instanceof Book))
        {
            return false;
        }
        Book b = (Book)o;
        return b.getName().equals(this.name) && b.getAuthor().equals(this.author);
    }
    @Override
    public int hashCode()
    {
        return Objects.hash(name,author);
    }
    @Override
    public String toString()
    {
        return "Book: " + name + " Author: " + author + " Year of creation: " + year;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Book> books = new HashSet<>();
        HashMap<String,Book> titles = new HashMap<>();
        sc.nextLine();
        for(int i = 0 ; i<n;i++)
        {
            String name = sc.next();
            String author = sc.next();
            int year = sc.nextInt();
            sc.nextLine();
            Book newBook = new Book(name,author,year);
            books.add(newBook);
        }
        for(Book book:books)
        {
            titles.put(book.getName(),book);
        }
        String searchTitle = sc.next();
        Book found = titles.get(searchTitle);
        if(found!=null)
        {
            System.out.println(found.toString());
        }
        else {
            System.out.println("Book not found!");
        }
    }
}
