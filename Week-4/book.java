class book
{
      public String title;
      public String author;
      public int year_of_publication;
 
      book(String title, String author, int year_of_publication)
      {
           this.title = title;
           this.author = author;
           this.year_of_publication = year_of_publication;
       
      }
      public void display()
      {
             System.out.println("Title of book is:"+title);
             System.out.println("Author of book is:"+author);
             System.out.println("Year of publication is:"+year_of_publication);
      }
    public static void main(String args[])
      {
           book b1 = new book("Python","Bhanu",2023);
           b1.display();
           book b2 = new book("Java","Sushanth",2024);
           b2.display();
       }

}           
            