import java.text.DecimalFormat;
import java.util.Scanner;

public class grades {
    /*
     * Write a Java program that takes in a two-dimensional array of doubles representing the grades of a set of students. Each row in the array represents the grades for one student, and each column represents the grades for a particular assignment. Your program should compute and output the average grade for each assignment, as well as the average grade for each student.
     */
    public static void display(double[][] array){
        for (int i=0; i <array.length;i++){
            for (int j=0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        double[][] gradesArray = new double[3][5];
        double[] studentsAverage = new double[gradesArray.length];
        double[] gradesAverage = new double[gradesArray[0].length];
        Scanner input = new Scanner(System.in);

        for (int student=0; student<gradesArray.length; student++){
            System.out.printf("Write the scores of student %d: \n",student+1);
            int studentSum = 0;
            for (int grade=0; grade<gradesArray[student].length;grade++){
                System.out.printf("Grade%d: ",grade+1);
                gradesArray[student][grade]=input.nextInt();
                studentSum += gradesArray[student][grade];
            }

            double studentAverage = studentSum/gradesAverage.length;
            studentsAverage[student] = studentAverage;
        }
        
        for (int i=0; i<gradesAverage.length;i++){
            double gradeSum = 0;
            for(int j=0; j<studentsAverage.length;j++){
                gradeSum += gradesArray[j][i];
            }
            double gradeAverage = gradeSum/studentsAverage.length;
            gradesAverage[i] = gradeAverage;
        }
        String StudentlistBegin = "Student Averages: [";
        String StudentlistEnd = "]";
        String GradeListBegin = "Assignment Averages: [";
        String GradeListEnd = "]";
        for (int i=0; i<studentsAverage.length; i++){
            DecimalFormat df = new DecimalFormat("#.#");
            double roundedNum = Double.parseDouble(df.format(studentsAverage[i]));
            if (i == studentsAverage.length - 1){
                StudentlistBegin += roundedNum;
            }else{
            StudentlistBegin += roundedNum + ",";
            }
        }
        for (int j=0; j<gradesAverage.length; j++){
            DecimalFormat df = new DecimalFormat("#.#");
            double roundedNum = Double.parseDouble(df.format(gradesAverage[j]));
            if (j == gradesAverage.length - 1){
                GradeListBegin += roundedNum;
            }else{
                GradeListBegin += roundedNum + ",";
            }
        }
        System.out.println();
        System.out.println(StudentlistBegin + StudentlistEnd);
        System.out.println(GradeListBegin + GradeListEnd);
        System.out.println();
        display(gradesArray);

     }
}


