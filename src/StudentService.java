import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studenci;

    public StudentService(ArrayList<Student> studenci) {
        this.studenci = studenci;
    }

    public StudentService() {
        studenci = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studenci.add(student);
    }

    public ArrayList<String> fetchStudentNames() {
        ArrayList<String> nazwiska = new ArrayList<>();
        for (Student s : studenci) {
            nazwiska.add(s.getNazwisko());
        }
        return nazwiska;
    }

    public int ileStudentow() {
        return studenci.size();
    }

    public void showStudentNames() {
        for (int i = 0; i < studenci.size(); i++) {
            System.out.println((i + 1) + "_ " + studenci.get(i).getImie() + " " + studenci.get(i).getNazwisko());
        }
    }

    public void removeStudent(int index) {
        if (index < studenci.size() && index >= 1) {
            System.out.println("Podano zly index.");
            return;
        }
        studenci.remove(index - 1);
    }

    public void showStudentsWithSurname(String surname) {
        for (Student stud : studenci) {
            if (stud.getNazwisko().equals(surname)) {
                System.out.println(stud);
            }
        }
    }

    public void fetchStudentsWithGradeHigherThan(double grade) {
        //System.out.println(studenci.stream().filter(s -> s.calculateFinalGrade() > grade).toString());
        for (Student s : studenci) {
            if (s.calculateFinalGrade() > grade) {
                System.out.println(s.toString());
            }
        }
    }

    public ArrayList<ArrayList<Double>> fetchStudentsGrades() {
        ArrayList<ArrayList<Double>> oceny = new ArrayList<>();
        for (Student student : studenci) {
            oceny.add(student.getListaOcen());
        }
        return oceny;
    }
}
