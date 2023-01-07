package section04_JavaCore.topic14_HashMap.practice.GetAuthorByBook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Author stephenKing = new Author();
        stephenKing.setName("Stephen King");

        Book bleeds = new Book();
        bleeds.setTitle("Bleeds");

        Author leoTolstoy = new Author();
        leoTolstoy.setName("Leo Tolstoy");

        Book annaKarenina = new Book();
        annaKarenina.setTitle("Anna Karenina");

        Book warAndPeace = new Book();
        warAndPeace.setTitle("War and Peace");

        Author danBrown = new Author();
        danBrown.setName("Dan Brown");

        Book theLostSymbol = new Book();
        theLostSymbol.setTitle("The Lost Symbol");

        Book deceptionPoint = new Book();
        deceptionPoint.setTitle("Deception Point");

        List<Book> stephenKingBooks = new LinkedList<>();
        stephenKingBooks.add(bleeds);

        List<Book> leoTolstoyBooks = new LinkedList<>();
        leoTolstoyBooks.add(annaKarenina);
        leoTolstoyBooks.add(warAndPeace);

        List<Book> danBrownBooks = new LinkedList<>();
        danBrownBooks.add(theLostSymbol);
        danBrownBooks.add(deceptionPoint);

        Map<Author, List<Book>> hashMap = new HashMap<>();

        hashMap.put(stephenKing, stephenKingBooks);
        hashMap.put(leoTolstoy, leoTolstoyBooks);
        hashMap.put(danBrown, danBrownBooks);

        GetAuthorByBook getAuthorByBook = new GetAuthorByBook();
        System.out.println("Author of " + bleeds.getTitle() + " — " + getAuthorByBook.getAuthorNameByBookTitle(hashMap, bleeds.getTitle()));
        System.out.println("Author of " + annaKarenina.getTitle() + " — " + getAuthorByBook.getAuthorNameByBookTitle(hashMap, annaKarenina.getTitle()));
        System.out.println("Author of " + warAndPeace.getTitle() + " — " + getAuthorByBook.getAuthorNameByBookTitle(hashMap, warAndPeace.getTitle()));
        System.out.println("Author of " + theLostSymbol.getTitle() + " — " + getAuthorByBook.getAuthorNameByBookTitle(hashMap, theLostSymbol.getTitle()));
        System.out.println("Author of " + deceptionPoint.getTitle() + " — " + getAuthorByBook.getAuthorNameByBookTitle(hashMap, deceptionPoint.getTitle()));
    }
}
