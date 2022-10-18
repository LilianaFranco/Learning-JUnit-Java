public class Persona {

    //Properties
    private String name;
    private int age;


    //Constructor

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Getter & Setters
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

    //Methods
    public boolean hasLegalAge() {
        return this.age >= 18 && this.age <= 120;
    }

    public boolean hasValidLengthName(){
        return (this.name.length() >= 5);
    }

    public boolean hasValidCharactersInName(){
        return this.name.matches("^[a-zA-Z]*$");
    }

}
