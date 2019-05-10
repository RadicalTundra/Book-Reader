package templatemethod;

public class Main {

    public static void main(String[] args) {
        //You can uncomment these if you want. It's just super slow sense it's two entire books!
//        BookReader book1 = new ReadfromFile();
//        book1.readBook();
//
//        BookReader book2 = new ReadfromArray();
//        book2.readBook();
        
        BookReader book3 = new ReadfromUser();
        book3.readBook();
    }
}
