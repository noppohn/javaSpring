package ProjectSpring.model;

public class Projectmodel {
    public int id;
    public String name;
    public int age;

    public Projectmodel(String name, int age, int id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Projectmodel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
