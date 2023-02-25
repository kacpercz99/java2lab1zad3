import java.util.ArrayList;

public class Student {
    private String imie;
    private String nazwisko;
    private ArrayList<Double> listaOcen;

    public Student(String imie, String nazwisko, ArrayList<Double> listaOcen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaOcen = listaOcen;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaOcen = new ArrayList<>();
    }

    public double calculateFinalGrade(){
        double sum=0;
        for (int i = 0; i < listaOcen.size(); i++) {
            sum+= listaOcen.get(i);
        }
        return sum/listaOcen.size();
    }



    public double betterCalculateFinalGrade(){
        return listaOcen.stream().mapToDouble(e -> e).average().orElse(0.0);
    }

    public ArrayList<Double> getListaOcen() {
        return listaOcen;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return nazwisko + " " + imie + listaOcen.toString();
    }
}
