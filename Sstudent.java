class Student {
    private String name;
    private int age;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if(a > 0) {
            age = a;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public int getAge() {
        return age;
    }
}

class Sstudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("chandu");
        s.setAge(20);

        System.out.println("Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}
