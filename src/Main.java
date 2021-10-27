public class Main {
    // Will probably handle running the title screen and the main game loop.
    // New stuff
    //i am adding a thing
    //i am adding another thing, primarily to determine the difficulty of adding things wooo
    public static void main(String[] args) {
        SampleClass meme = new SampleClass(55, "Jimmy");
        System.out.println(meme.getNumber());
        System.out.println(meme.getName());
        meme.setName("Bob");
        meme.setNumber(555);
        System.out.println(meme.getNumber());
        System.out.println(meme.getName());
    }
}
