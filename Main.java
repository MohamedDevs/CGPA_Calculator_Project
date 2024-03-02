public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\tCGPA Calculator for CS students - MS University");
        System.out.println("Instructions for User:");
        Display.displayInstruction();
        Input ip = new Input();
        int sem = ip.getSemester();
        double gradePoints[] = ip.getGrades();
        double sum = Calculate.sumGrades(gradePoints);
        if(sum==0) {
            System.out.println("You've failed and your CGPA cannot be calculated");
        }
        else if(sum<0) {
            System.out.println("Enter your Gradepoints below or equal to 10");
        }
        else {
        double cgpa = Calculate.calculateCGPA(sum, sem);
        System.out.println("\nYour CGPA:");
        System.out.println(cgpa);
        }
    }
}
