package Day_9;

 class Book {
     static int totalBook;
     String title;
     String author;
     String isbn;
     boolean isBorrowed;

   static {
       totalBook=0;
       }
     { // Object Init
         totalBook++;
     }
   Book(String title, String author, String isbn){
      this.title=title;
      this.author=author;
      this.isbn=isbn;
   }
   Book(String isbn){
       this("UNKNOWN","UNKNOWN",isbn);
   }
     public static int getTotalBook(){
         return totalBook;
     }
     public  void borrowBook(){
       if (isBorrowed){
           System.out.println("Book Already Borrowed...");
       }else{
           this.isBorrowed=true;
           System.out.println("Enjoy Borrow Book..");
       }
     }
     public void  returnBook(){
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Hope Enjoy Book, Plz review...");
        }else{
             System.out.println("This Book is Already Present in Library..");
         }
        }

     static void main() {
         Book b1=new Book("Design","Bhasker","121");
         Book b2=new Book("123");
         System.out.println(Book.getTotalBook());
         b1.borrowBook();
         b2.borrowBook();

         b1.borrowBook();
         b1.returnBook();
     }
     }