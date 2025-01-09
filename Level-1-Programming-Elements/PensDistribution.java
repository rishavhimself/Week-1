// Creating a class named PensDistribution for Pen Distribution 
public class PensDistribution {
    public static void main(String[] args) {
        // Total pens and number of students
        int totalPens = 14, students = 3;

        // Calculate number of pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Dispalying the results
        System.out.println("The Pen Per Student is " + pensPerStudent + 
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
