public class Police {
    private String gender;
    private int age;

    //오버 로딩
    public Police(String gender) {
        this.gender = gender;
    }

    public Police(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public void info(String gender, int age) {
        System.out.println("이 경찰은" + gender + "이고 나이는 " + age + "살 입니다.");
    }

    public void info() {
        System.out.println("경찰 입니다.");
    }
}

class Student extends Police {
    private String gender;
    private int age;

    public Student(String gender) {
        super(gender);
    }

    public Student(String types, int price) {
        super(types, price);
    }
    @Override
    public void info() {
        System.out.println("경찰 준비생 입니다.");
    }
}