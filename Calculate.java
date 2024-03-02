public class Calculate {
    static double credits[] = {4.0,2.0,3.0,4.0,4.0,2.0,4.0,2.0,4.0,2.0,3.0,2.0,4.0,4.0,2.0,3.0,4.0,4.0,4.0,4.0,2.0,2.0,2.0,4.0,2.0,4.0,4.0,4.0,2.0,2.0,4.0,6.0};
    public static double sumGrades(double gradePoints[]) {
        double sum = 0;
        for(int i=0;i<gradePoints.length;i++) {
            if(gradePoints[i]<5) {
                sum = 0;
                break;
            }
            else if(gradePoints[i]>10) {
                sum = -1;
                break;
            }
            else {
            sum = sum + (gradePoints[i] * credits[i]); 
            }
        }
        return sum;
    }

   public static double calculateCGPA(double sum,int n) {
        double sumCredits = 0;
        for(int i=0;i<n;i++) {
            sumCredits = sumCredits + credits[i];
        }
        return sum/sumCredits;
    }
}
