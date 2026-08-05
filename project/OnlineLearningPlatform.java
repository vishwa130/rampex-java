
import java.util.ArrayList;
import java.util.Scanner;
class User {
    private int id;
    private String name;
    private String email;
    private String password;

    public User(int id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void displayUser() {
        System.out.println("User ID   : " + id);
        System.out.println("Name      : " + name);
        System.out.println("Email     : " + email);
    }
}


class Course {
    private int courseId;
    private String courseName;
    private String instructor;
    private double price;

    public Course(int courseId, String courseName, String instructor, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.price = price;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourse() {
        System.out.println("--------------------------------");
        System.out.println("Course ID   : " + courseId);
        System.out.println("Course Name : " + courseName);
        System.out.println("Instructor  : " + instructor);
        System.out.println("Price       : $" + price);
        System.out.println("--------------------------------");
    }
}


public class OnlineLearningPlatform {

    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        
        users.add(new User(1, "Vishwa", "vishwa@gmail.com", "1234"));

        
        courses.add(new Course(101, "Java Programming", "John", 49.99));
        courses.add(new Course(102, "Python Programming", "David", 39.99));
        courses.add(new Course(103, "Web Development", "Alex", 59.99));

        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("   ONLINE LEARNING PLATFORM");
            System.out.println("================================");
            System.out.println("1. Register User");
            System.out.println("2. Login");
            System.out.println("3. View Courses");
            System.out.println("4. Add New Course");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    registerUser();
                    break;

                case 2:
                    loginUser();
                    break;

                case 3:
                    viewCourses();
                    break;

                case 4:
                    addCourse();
                    break;

                case 5:
                    System.out.println("Thank you for using Online Learning Platform!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    
    public static void registerUser() {

        System.out.println("\n--- User Registration ---");

        System.out.print("Enter User ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        User newUser = new User(id, name, email, password);
        users.add(newUser);

        System.out.println("Registration successful!");
    }

    
    public static void loginUser() {

        System.out.println("\n--- User Login ---");

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        boolean loginSuccess = false;

        for (User user : users) {

            if (user.login(email, password)) {
                System.out.println("\nLogin successful!");
                System.out.println("Welcome, " + user.getName() + "!");
                user.displayUser();
                loginSuccess = true;
                break;
            }
        }

        if (!loginSuccess) {
            System.out.println("Invalid email or password.");
        }
    }

    
    public static void viewCourses() {

        System.out.println("\n--- Available Courses ---");

        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        for (Course course : courses) {
            course.displayCourse();
        }
    }

    
    public static void addCourse() {

        System.out.println("\n--- Add New Course ---");

        System.out.print("Enter Course ID: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();


        System.out.print("Enter Instructor Name: ");
        String instructor = scanner.nextLine();

        System.out.print("Enter Course Price: ");
        double price = scanner.nextDouble();

        Course newCourse = new Course(
                courseId,
                courseName,
                instructor,
                price
        );

        courses.add(newCourse);

        System.out.println("Course added successfully!");
    }
}