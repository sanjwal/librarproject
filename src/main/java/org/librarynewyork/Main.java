package org.librarynewyork;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.librarynewyork.models.Book;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Book book1 = new Book("id1", "Harry", "2014", "JK",4);
        //Book book2 = new Book("id2", "Harry 2", "2014", "JK",2);

        //System.out.println(book1.name);
        //System.out.println(Book.sampleData());

        Utils utils = new Utils();
      //  Gson gson = new GsonBuilder().setPrettyPrinting().create();

        utils.landingFlow();





       // String bookName =  utils.scanStringValue("Enter book name:");
      //  String authorName =  utils.scanStringValue("Enter author name:");
      //  String bookDate= utils.scanStringValue("Enter book date:");
     //   int bookQuantity= utils.scanIntValue("Enter book quantity");

    //    Book enterFromCli = new Book("1", bookName, bookDate, authorName, bookQuantity);


      //  String readFile = utils.readContent();
       // ArrayList<Book> allBook = gson.fromJson(readFile, new TypeToken<ArrayList<Book>>(){}.getType());
       // allBook.add(enterFromCli);


       // String thisIsJsonString = gson.toJson(allBook);
       // utils.dumpContent(thisIsJsonString);




//        System.out.println("------------");
//
//        System.out.println("You enter following details");
//        System.out.println("Book Name:"+bookName);
//        System.out.println("Published By:"+authorName);
//        System.out.println("Book Publish Date:"+bookDate);
//        System.out.println("Available Quantity:"+bookQuantity);


        //utils.close();


    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;


    }



}