package example;

public class Person {
    private int id;
    private String name;
    private String stuclass;
    private int age;
    public Person(){

    }
    public Person(int id,String name,String studentclass,int age){
        this.id=id;
        this.name=name;
        this.stuclass=studentclass;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return  id;
    }

}
