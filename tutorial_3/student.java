class Student extends Person {
      public Student(String name, int id) 
      {
         super(name, id);

      }
      @Override 
      public void introduce()  {
           System.out.printIn("I am a student.");
      }
}