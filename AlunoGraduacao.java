/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapoo;
public class AlunoGraduacao extends Aluno {
    private int semestre;

    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Aluno Graduação |  Cursando " +
        semestre + "° semestre \n" +
        super.toString();
    }

    //    @Override
//    public void Informacao() {
//        System.out.println("O aluno " + this.getNome() + " do " + this.semestre + " semestre teve uma média de "
//                + this.mediaNova + " na matéria " + this.materia);
//        // opcao 2
////        System.out.println(String.format("O aluno %s do %s semestre teve uma média de %s na matéria %s",
////                this.getNome(), this.semestre, this.mediaNova, this.materia));
//    }
}
