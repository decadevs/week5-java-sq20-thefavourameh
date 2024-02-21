package model;

    public class User {
        private String name;
        private boolean isTeacher;
        private boolean isJuniorStudent;
        private boolean isSeniorStudent;

        public User(String name, boolean isTeacher, boolean isJuniorStudent, boolean isSeniorStudent) {
            this.name = name;
            this.isTeacher = isTeacher;
            this.isJuniorStudent = isJuniorStudent;
            this.isSeniorStudent = isSeniorStudent;
        }

        public String getName() {
            return name;
        }

        public boolean isTeacher() {
            return isTeacher;
        }

        public boolean isJuniorStudent() {
            return isJuniorStudent;
        }

        public boolean isSeniorStudent() {
            return isSeniorStudent;
        }
    }
