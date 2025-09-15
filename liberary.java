public class liberary {
    public static void main(String[] args) {
        Book b1 = new Book("xyz", "Shyamlal");

        b1.showDetails();
        b1.issueBook();
        b1.showDetails();
        b1.returnBook();
        b1.showDetails();
    }

}
class Book {
     String title;
     String author;
     boolean isAvailable; 
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

   
    public void issueBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

   
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }


    public void showDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}



