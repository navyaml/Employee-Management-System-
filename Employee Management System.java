import java.util.*;

class StudentManagement {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        int marks[] = new int[10];
        int id[] = new int[10];

        int count = 0;

        while(true) {

            System.out.println("\n1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if(choice == 1) {

                System.out.print("Enter ID: ");
                id[count] = sc.nextInt();

                System.out.print("Enter Name: ");
                name[count] = sc.next();

                System.out.print("Enter Marks: ");
                marks[count] = sc.nextInt();

                count++;

                System.out.println("Student Added");
            }


            else if(choice == 2) {

                for(int i=0;i<count;i++) {

                    System.out.println(
                    id[i]+" "+
                    name[i]+" "+
                    marks[i]);
                }
            }


            else if(choice == 3) {
                break;
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}