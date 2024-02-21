package service;

import model.Library;
import model.User;

     public interface LibraryService {

          public  void addUserToQueue(User user);


          public String giveBook(Library library);

          public String giveBookFIFO(Library library);

     }
