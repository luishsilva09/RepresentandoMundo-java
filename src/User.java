
public class User {
    private String name;
    private int age;
    Course course = new Course();

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public Course getCourse(){
        return this.course;
    }

    public void setName(String name){
         this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }
}
