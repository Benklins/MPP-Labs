package lab9_part1.problem1.business;

import lab9_part1.problem1.dataaccess.DataAccess;
import lab9_part1.problem1.dataaccess.DataAccessFacade;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(allWhoseZipContains3());
        System.out.println(allHavingMultipleAuthors());

    }

    //Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
    public static List<String> allWhoseZipContains3() {
        DataAccess da = new DataAccessFacade();
        Collection<LibraryMember> members = da.readMemberMap().values();
        return members.stream()
                .filter(member -> member.getAddress().getZip().contains("3"))
                .map(LibraryMember::getMemberId)
                .collect(Collectors.toList());

    }



    //Returns a list of all isbns of  Books that have multiple authors
    public static List<String> allHavingMultipleAuthors() {
        DataAccess da = new DataAccessFacade();
        Collection<Book> books = da.readBooksMap().values();
        return books.stream()
                .filter((book -> book.getAuthors().size() > 1))
                .map((Book::getIsbn))
                .collect(Collectors.toList());

    }

}
