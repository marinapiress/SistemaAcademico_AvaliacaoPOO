package provapoo;

public class Materia {

    private String nome;
    private double peso;
    private double nota1;
    private double nota2;
    private double media;

    public Materia(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia() {
        switch (this.nome) {
            case "POO", "DWEB":
                this.peso = 3;
            break;
            case "FEF":
                this.peso = 2;
            break;
            default:
                this.peso = 1;
            break;
        }
        this.media = ((this.getNota1() * this.peso) + (this.getNota2() * this.peso)) / (2 * this.peso);
    }

    @Override
    public String toString() {
        return "|Nome= " + nome +
                ", Peso= " + peso +
                ", Nota 1= " + nota1 +
                ", Nota 2= " + nota2 +
                ", Média= " + media + "|";
    }
}
