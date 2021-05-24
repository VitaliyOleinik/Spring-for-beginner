package aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avgGradle;

    public Student(String nameSurname, int course, double avgGradle) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGradle = avgGradle;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGradle() {
        return avgGradle;
    }

    public void setAvgGradle(double avgGradle) {
        this.avgGradle = avgGradle;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGradle=" + avgGradle +
                '}';
    }
}
