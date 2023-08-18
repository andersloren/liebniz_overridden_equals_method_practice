package liebniz;

import java.util.Objects;

public class Student {

    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null && this.getClass() != obj.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return Objects.equals(this.studentId, student.studentId) && Objects.equals(this.name, student.name);
    }
}
