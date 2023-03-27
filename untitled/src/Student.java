public class Student {
        private String name;
        private String classes;

        public Student() {
            this.name = "John";
            this.classes = "C02";
        }

        private void setName(String name) {
            this.name = name;
        }

        private void setClasses(String classes) {
            this.classes = classes;
        }

        public String getName() {
            return name;
        }

        public String getClasses() {
            return classes;
        }
    }
    
