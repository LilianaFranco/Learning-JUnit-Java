public class Persona {

    //Properties
    private String name;
    private int age;


    //Methods
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasLegalAge() {
        return this.age >= 0 && this.age <= 120;
    }

    public boolean validCharacterLength(){
        return (this.name.length() >= 5);
    }

    public boolean validCharactersName(){
        return this.name.matches("^[a-zA-Z]*$");
    }

}
