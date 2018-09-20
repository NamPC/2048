import java.util.*;

public class StudentManagement {

        private static List<Student> Students = new ArrayList<Student>();

        public static boolean sameGroup(Student s1, Student s2) {
            if (s1.getGroup().equals(s2.getGroup())) return true;
            else return false;
        }

        public static void studentsByGroup() {
            List<String> countGroup = new ArrayList<String>();
            countGroup.add(Students.get(0).getGroup());

            for (int i=1;i<Students.size();i++) {
                if (!countGroup.contains(Students.get(i).getGroup())) countGroup.add(Students.get(i).getGroup());
            }

            for (int i=0;i<countGroup.size();i++) {
                System.out.println(countGroup.get(i));

                for (int j=0;j<Students.size();j++) {
                    if (Students.get(j).getGroup().equals(countGroup.get(i))) System.out.println(Students.get(j).getName());
                }
            }
        }

        public  static void removeStudent (String id) {
            ListIterator<Student> it = Students.listIterator();
            while (it.hasNext()) {
                if (it.next().getId().equals(id))
                {
                    it.remove();
                    System.out.println("Done");
                }
            }
        }

        public static void main(String[] args) {

            Student alambucu = new Student();
            Student nn = new Student(alambucu);
            Student nm = new Student("minh","17021069","wtf@gmail.com", "K62");

            alambucu.getInfo();
            nn.getInfo();
            nm.getInfo();
            if (sameGroup(alambucu,nm)) System.out.println("YES");
            else System.out.println("NO");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            for (int i=0;i<n;i++) {
                System.out.println("Student no " + (i+1));
                Student sample = new Student();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.println();

                System.out.print("ID: ");
                String id = sc.nextLine();
                System.out.println();

                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.println();

                System.out.print("Group: ");
                String group = sc.nextLine();
                sample.setStudent(name, id, email, group);
                Students.add(sample);
            }
            System.out.println("Done");

            System.out.println("Which one to delete ??");
            String deleteIndex  = sc.nextLine();
            removeStudent(deleteIndex);
            sc.close();

            for (int i=0; i<Students.size();i++) {
                System.out.println(Students.get(i).getName());
            }
            studentsByGroup();
        }
    }
