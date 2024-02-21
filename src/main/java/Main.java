import enums.Books;
import model.Library;
import model.User;
import service.LibraryService;
import service.impl.LibraryServiceImpl;

        public class Main {
            public static void main(String[] args) {

                //ADDING USERS
                User u1 = new User("Jnr student Favour Ameh",false,true,false);
                User u2 = new User("Teacher Manasseh Obaje",true,false,false);
                User u3 = new User("Snr student Destiny Etiko",false,false,true);
                User u5 = new User("Snr student Mercy Johnson",false,false,true);



                //IMPLEMENTATION 1

                LibraryServiceImpl libraryService = new LibraryServiceImpl();

                Library library1 = new Library(Books.JAVA);

                //ADDING USER TO QUEUE
                libraryService.addUserToQueue(u1);
                libraryService.addUserToQueue(u2);
                libraryService.addUserToQueue(u3);
                libraryService.addUserToQueue(u5);


                //GIVE BOOK
                System.out.println(libraryService.giveBook(library1));
                System.out.println(libraryService.giveBook(library1));
                System.out.println(libraryService.giveBook(library1));
                System.out.println(libraryService.giveBook(library1));
                System.out.println(libraryService.giveBook(library1));




                //IMPLEMENTATION 2


                libraryService.addUserToQueue(u1);
                libraryService.addUserToQueue(u2);
                libraryService.addUserToQueue(u3);

                System.out.println("*******************");
                System.out.println(libraryService.giveBookFIFO(library1));
                System.out.println(libraryService.giveBookFIFO(library1));
                System.out.println(libraryService.giveBookFIFO(library1));
                System.out.println(libraryService.giveBookFIFO(library1));
            }
        }