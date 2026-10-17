public class ThisKeywordDemo {

    static class StudentProfile {
        String name;
        int rollNo;
        int marks;

        StudentProfile(String name, int rollNo, int marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        void displayStudent() {
            System.out.println("Name        : " + name);
            System.out.println("Roll Number : " + rollNo);
            System.out.println("Marks       : " + marks);

            if (this.isPassed()) {
                System.out.println("Result      : Passed");
            }else {
                System.out.println("Result      : Failed");
            }
        }

        boolean isPassed() {
            return this.marks >= 35;
        }

        StudentProfile getStudent() {
            return this;
        }
    }
        public static void main(String[] args) {

            StudentProfile sp1 = new StudentProfile("Krish", 21, 32);
            System.out.println("\n=== Profile of Student 1 ===\n");
            sp1.displayStudent();

            StudentProfile sp2 = new StudentProfile("Radha", 18, 97);
            System.out.println("\n\n=== Profile of Student 2 ===\n");
            sp2.displayStudent();

            StudentProfile ref = sp1.getStudent();
            System.out.println("\ngetStudent() returned object with name: " + ref.name);

            if (ref == sp1) {
                System.out.println("ref and sp1 refer to the SAME object.");
            } else {
                System.out.println("ref and sp1 refer to DIFFERENT objects.");
            }

        }
    }
