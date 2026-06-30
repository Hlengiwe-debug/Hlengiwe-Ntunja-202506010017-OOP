class Lecture extends Person {
    public Lecturer(String name, int id)
    {
        super(name, id);
    }
    @Override
    public void introduce()  {
        Sydtem.out.printIn("I am a lecturer.");
    }
}