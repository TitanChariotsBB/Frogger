public class SampleClass {
    //This is a sample class to make sure that things work
    private int number;
    private String name;
    public SampleClass(int number, String name){
        this.number = number;
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setNumber(int newNumber){
        this.number = newNumber;
    }
}
