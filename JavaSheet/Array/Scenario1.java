// Scenario 1: Student Grades
// In a school grading system, create an array to store the grades of students in a class. Perform operations such as calculating the average grade, finding the highest and lowest grades, and identifying students who scored above a certain threshold.

public class Scenario1 {
    public static void main(String[] args) {
        int[] grade = {85, 70, 90, 60, 75, 95, 80};

        int total = 0;
        for (int i = 0; i < grade.length; i++) {
            total = total + grade[i];
        }
        int average = total/grade.length;
        System.out.println("The Average of the class marks : " + average);

        for (int i = 0; i < grade.length; i++) {
            for (int j = i + 1; j < grade.length; j++) {
                if(grade[i] > grade[j]){
                    int temp = grade[i];
                    grade[i] = grade[j];
                    grade[j] = temp; 
                }
            }
        }
        System.out.println("The highest marks of student : "+ grade[grade.length-1]);
        System.out.println("The lowerst marks of student : "+ grade[0]);
        
        System.out.print("The thresshold grade of class  : ");
        int threshold = 75;
        for (int i = 0; i < grade.length; i++) {
            if(grade[i] >= threshold){
                System.out.printf(" " + grade[i]);
            }
        }
    }
}
