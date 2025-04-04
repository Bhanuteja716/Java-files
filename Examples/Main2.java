//Create a Book class with a constructor that takes the title and author of the book. Then create a subclass Ebook that adds an additional feature, like file size, and invokes the Book class constructor.

class Book
{
    public String title;
    public String author;
   Book(String title, String author)
   {
       this.title = title;
       this.author = author;
       System.out.println("The Title of book is:"+title);
       System.out.println("The author of book is:"+author);
   }
}
class Ebook extends Book
{
     Ebook(String title, String author)
    {
        super(title, author);
       
    }
}
class Main2
{
    public static void main(String args[])
    {
               Book b = new Book("Java","Bhanu");
               Ebook eb = new Ebook("Python","Teja");
     }
}
    
