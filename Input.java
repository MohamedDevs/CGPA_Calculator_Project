import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    String subjects[] = {"Programming in C","Programming in C - practical","Discrete Mathemetics","Professional English - I","Programming in C++","Programming in C++ - practical","Professional English - II","Linux","Java Programming","Java Programming - practical","Scripting Languages","Scripting Languages - practical","Digital Design","Data Structures","Data Structures - practical","Machine Learning Techniques","Computer Architecture","RDBMS","Computer Networks","PHP and MySQL","PHP - practical","Machine Learning - practical","Greent Foot Lab","Cloud Computing","Personality Development","Operating System","Software Engineering & Testing","Computer Graphics","Computer Graphics - practical","MySQL - practical","Neural Networks","Digital Image Processing"};
    int n = 0;
    Scanner scan = new Scanner(System.in);
    public int getSemester() {
        int semester = 0;
        System.out.println("\nEnter the Number of Semesters to be considered: ");
        semester = scan.nextInt();
        switch(semester) {
            case 1:
                {
                    n = 4;
                    break;
                }
            case 2:
                {
                    n = 8;
                    break;
                }
            case 3:
                {
                    n = 13;
                    break;
                }
            case 4:
                {
                    n = 17;
                    break;
                }
            case 5:
                {
                    n = 25;
                    break;
                }
            case 6:
                {
                    n = 32;
                    break;
                }
            default: 
                {
                System.out.println("Enter a valid Number");
                getSemester();
                }
        }
       return n;
    }

    public double[] getGrades() {
        double gradePoints[] = new double[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter your Grades in " + subjects[i]);
            try {
            gradePoints[i] = scan.nextDouble();
            }
            catch(InputMismatchException e) {
                System.out.println("Type a valid Grade");
            }
        }
        return gradePoints;
    }
}
