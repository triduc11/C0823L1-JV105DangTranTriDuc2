package ss6;

public class Student extends Person {
    private String className;
    private float point;

    public Student() {
    }


    public Student(int id, String name, String className, float point) {
        super(id, name);
        this.point = point;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public void study(String subject){
        System.out.println("sinh viên học môn : "+ subject);
    }
    public void study(){
        System.out.println("sinh viên học môn gì đó");
    }

    @Override
    public void howToGo() {
        System.out.println("sinh viên đi bằng xe máy ");
    }

    @Override
    public void doTask(){
        System.out.println("Sinh viên " + super.getName()+ " phải học và làm bài tập");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id= " + super.getId()+
                "name= "+ super.getName()+
                "className= " + className + '\'' +
                ", point= " + point +
                '}';
    }
}
