package lab9_part1.problem1.dataaccess;

import lab9_part1.problem1.business.Book;
import lab9_part1.problem1.business.LibraryMember;

import java.util.HashMap;



public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
