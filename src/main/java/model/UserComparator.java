package model;

import java.util.Comparator;

    public class UserComparator implements Comparator<User> {
        @Override
        public int compare(User u1, User u2) {
            if (u1.isTeacher() && !u2.isTeacher()) {
                return -1;
            } else if (!u1.isTeacher() && u2.isTeacher()) {
                return 1;
            } else if (u1.isSeniorStudent() && u2.isJuniorStudent()) {
                return -1;
            } else if (u1.isJuniorStudent() && u2.isSeniorStudent()) {
                return 1;
            } else if (u1.isSeniorStudent() && u2.isSeniorStudent()) {
                return 0;
            }else if (u1.isJuniorStudent() && u2.isJuniorStudent()) {
                return 0;
            } else {
                return 0;
            }
        }

    }

