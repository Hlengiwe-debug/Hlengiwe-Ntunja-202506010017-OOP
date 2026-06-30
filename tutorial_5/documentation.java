1. Why are the variables declared as private?
   - The variables are declared as private to enforce Encapsulation. This hides the internal data of the Student object from outside classes. It prevents other code from directly accessing or modifying the fields, ensuring that the object maintains full control over its own state.

2. What happens if the variables are declared public?
   - If the variables are declared public, they become directly accessible from any other class. This breaks encapsulation. External code could then assign invalid or illogical values (e.g., a negative CGPA, an empty student ID, or a null name) without any validation. It also makes the code fragile, because if we later need to change how data is stored, we would have to modify every external class that uses those variables.

3. Why do we use getters and setters?
   - Getters and setters provide controlled access to private variables. They act as a middleman. With setters, we can add validation logic (e.g., checking if CGPA is between 0.0 and 4.0, or ensuring the name is not empty). With getters, we can decide to return a copy of the data or format it before returning. They also allow us to change the internal implementation (e.g., storing CGPA as a float instead of a double) without affecting the external code that uses the getter/setter methods.

4. Additional variable added:
   - I added a private String variable called "programme" to store the student's course of study.
   - Implementation:
       Declared: private String programme;
        Setter: public void setProgramme(String programme) { this.programme = programme; }
        Getter: public String getProgramme() { return programme; }
   - This follows the same encapsulation principle, keeping the data safe while allowing controlled access through the public methods.