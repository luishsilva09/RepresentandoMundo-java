public class Course {
    private String nameCourse;
    private static int students;
    

    public void setNameCouse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int oneMore() {
        this.students +=1;
        return this.students;
    }

    public int getStudents(){
        return this.students;
    }

}
