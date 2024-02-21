package service.impl;
import model.Library;
import model.User;
import model.UserComparator;
import service.LibraryService;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

    public class LibraryServiceImpl implements LibraryService {

        PriorityQueue<User> userQueue;
        Queue<User> userQueueFIFO;

        public LibraryServiceImpl(){
            userQueue = new PriorityQueue<>(new UserComparator());

            userQueueFIFO = new LinkedList<>();
        }

        @Override
        public void addUserToQueue(User user){
            userQueue.add(user);
            userQueueFIFO.add(user);

        }

        @Override
        public String giveBook(Library library) {
            if (userQueue.isEmpty()) {
                return "No user is on the queue";
            }
            User user = userQueue.poll();
            return user.getName() + " has taken " + library.getBooks() + " Book";
        }

        @Override
        public String giveBookFIFO(Library library) {
            if (userQueueFIFO.isEmpty()) {
                return "No user is on the queue";
            }
            User user = userQueueFIFO.poll();
            return user.getName() + " has taken " + library.getBooks() + " Book";
        }

    }