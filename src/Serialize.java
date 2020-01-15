import java.io.*;

/**
 * @author Jack
 * @ClassName:
 * @Description:
 * @date
 */
public class Serialize implements Serializable {
    private String name;
    private int age;
    private String gender;
    private String mobile;

    public Serialize(String name, int age, String gender, String mobile) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serialize student = new Serialize("Jack",12,"男","188518888888");
        String path ="e:\\student.dat";
        //序列化
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        out.writeObject(student);
        out.close();
        //反序列
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(path));
        Serialize people = (Serialize) in.readObject();
        in.close();
        System.out.println("student"+student);
        System.out.println("people"+people);
    }
}
