import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BookSerializationDemo {
    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell", 1949);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("book.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(book);
            System.out.println("Serialized data is saved in book.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("book.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Book deserializedBook = (Book) in.readObject();
            System.out.println("Deserialized Book: " + deserializedBook);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
