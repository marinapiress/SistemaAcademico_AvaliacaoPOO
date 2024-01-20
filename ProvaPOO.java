/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provapoo;


import java.util.Scanner;

public class ProvaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("DIGITE:");
        System.out.println("1 - Aluno Graduação ");
        System.out.println("2 - Aluno Pós-Graduação");
        System.out.println("3 - Sair");
        System.out.println("--------------------------------------------------------------------------------");
        int tipoAluno = scan.nextInt();

        while (tipoAluno > 2) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("OPÇÃO INVÁLIDA");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("DIGITE:");
            System.out.println("1 - Aluno Graduação ");
            System.out.println("2 - Aluno Pós-Graduação");
            System.out.println("3 - Sair");
            System.out.println("--------------------------------------------------------------------------------");
            tipoAluno = scan.nextInt();
        }

        if (tipoAluno == 1) {
            AlunoGraduacao alunoGraduacao = new AlunoGraduacao();

            System.out.println("Digite seu nome e sobrenome");
            String nome = scan.next();
            alunoGraduacao.setNome(nome);
            String sobrenome = scan.next();
            alunoGraduacao.setSobrenome(sobrenome);

            System.out.println("Digite seu curso");
            String curso = scan.next();
            alunoGraduacao.setCurso(curso);

            System.out.println("Digite seu semestre");
            int semestre = scan.nextInt();
            alunoGraduacao.setSemestre(semestre);

            System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
            String nomeMateria = scan.next();

            while (!nomeMateria.equals("0")) {

                while (!nomeMateria.equals("POO") && !nomeMateria.equals("DWEB") && !nomeMateria.equals("FEF")
                        && !nomeMateria.equals("AMS")) {
                    System.out.println("Matéria inválida");
                    System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
                    nomeMateria = scan.next();
                }

                System.out.println("Digite sua 1a nota");
                double nota1 = scan.nextDouble();

                System.out.println("Digite sua 2a nota");
                double nota2 = scan.nextDouble();

                Materia materia = new Materia(nomeMateria, nota1, nota2);
                materia.calcularMedia();
                alunoGraduacao.addMateria(materia);

                System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
                nomeMateria = scan.next();
            }
            System.out.println(alunoGraduacao.toString());

        } else {
            AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao();

            System.out.println("Digite seu nome e sobrenome");
            String nome = scan.next();
            alunoPosGraduacao.setNome(nome);
            String sobrenome = scan.next();
            alunoPosGraduacao.setSobrenome(sobrenome);

            System.out.println("Digite seu curso");
            String curso = scan.next();
            alunoPosGraduacao.setCurso(curso);

            System.out.println("Qual sua pesquisa para projeto?");
            String projeto = scan.next();
            alunoPosGraduacao.setProjetoPesquisa(projeto);

            System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
            String nomeMateria = scan.next();

            while (!nomeMateria.equals("0")) {

                while (!nomeMateria.equals("POO") && !nomeMateria.equals("DWEB") && !nomeMateria.equals("FEF")
                        && !nomeMateria.equals("AMS")) {
                    System.out.println("Matéria inválida");
                    System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
                    nomeMateria = scan.next();
                }

                System.out.println("Digite sua 1a nota");
                double nota1 = scan.nextDouble();

                System.out.println("Digite sua 2a nota");
                double nota2 = scan.nextDouble();

                Materia materia = new Materia(nomeMateria, nota1, nota2);
                materia.calcularMedia();
                alunoPosGraduacao.addMateria(materia);

                System.out.println("Digite a matéria (POO, DWEB, FEF ou AMS) ou 0 para finalizar");
                nomeMateria = scan.next();
            }

            System.out.println(alunoPosGraduacao.toString());

        }
    }

}
