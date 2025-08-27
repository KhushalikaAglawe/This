class Student1 {
    int id;
    String name;

    // Constructor
     Student1(int id, String name) {
        this.id = id;         // 'this.id' refers to the instance variable
        this.name = name;     // 'name' is the parameter, 'this.name' is the field
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student1 s=new Student1(1,"khushi");
s.display();
	}

}
