import java.io.*;

public class Main {
    // Shared variable, marked as volatile to ensure visibility between threads
    static volatile boolean flag=false;

    public static void main(String[] args) {
        try{
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file.sc"));
            oos.writeObject(new Student(1,"ABhi","Password"));
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file.sc"));
            Student sc=(Student)ois.readObject();
            System.out.println(sc);
        }catch (Exception e){

        }
    }
}

class Student implements Serializable{
    private int id;
    private String name;
    private transient String passwoed;

    public Student(int id, String name, String passwoed) {
        this.id = id;
        this.name = name;
        this.passwoed = passwoed;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwoed='" + passwoed + '\'' +
                '}';
    }
}