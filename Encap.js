class Student {
    private String name;   // hidden
    private int marks;     // hidden

    // Getter methods (to read values)
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Setter methods (to update values)
    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {   // validation ✅
            marks = m;
        } else {
            System.out.println("Invalid marks!");
        }
    }
}

class Encap {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Chandu");
        s.setMarks(90);       // valid
        // s.setMarks(-50);   // invalid ❌

        System.out.println(s.getName() + " got " + s.getMarks());
    }
}
