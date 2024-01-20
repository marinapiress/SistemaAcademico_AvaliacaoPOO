/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provapoo;
public class AlunoPosGraduacao extends Aluno {
    private String projetoPesquisa;

    public String getProjetoPesquisa() {
        return projetoPesquisa;
    }

    public void setProjetoPesquisa(String projetoPesquisa) {
        this.projetoPesquisa = projetoPesquisa;
    }

//    @Override
//    public void Informacao() {
//        System.out.println("O aluno de Pós-Graduação " + this.getNome() + " com a pesquisa " + this.getProjetoPesquisa()
//                + " teve uma média de " + this.calcularMedia());
//    }


    @Override
    public String toString() {
        return "Aluno Pós Graduação | " +
                "Projeto de Pesquisa= " + projetoPesquisa + "\n" +
                super.toString();
    }
}