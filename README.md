# SistemaAcademico

Contexto: Você está desenvolvendo um sistema acadêmico para uma instituição de
ensino. Os alunos têm diferentes cursos, notas e informações pessoais. O instanciamento
é necessário para criar objetos representando alunos. O encapsulamento será aplicado
para garantir que as notas dos alunos não possam ser alteradas diretamente. A herança
será usada para modelar diferentes tipos de cursos, como matemática e literatura, que
compartilham características comuns. O polimorfismo será aplicado para calcular
médias de notas de maneira única, independentemente do curso.
Objetivo: Desenvolver um sistema acadêmico em Java, aplicando conceitos de
programação orientada a objetos, como encapsulamento, herança e polimorfismo.
1. Classe Aluno:
 Crie a classe Aluno com os atributos nome (String), curso (String) e
notas (Double).
 Implemente os métodos getNome(), getCurso(), getNotas(),
adicionarNota(double nota), calcularMedia() para garantir o
encapsulamento das informações e calcular a média de notas de maneira
polimórfica.
2. Método Polimórfico:
 Adicione à classe Aluno o método calcularMedia(), um método
polimórfico para calcular a média de notas. Este método deve ser
implementado nas classes derivadas (AlunoPosGraduacao e
AlunoGraduacao).
 Aprimore o método c al c ul ar Medi a( ) para tratar diferentes pesos nas
disciplinas, permitindo que cada disciplina tenha um peso diferente no
cálculo da média.
3. Classes Derivadas (Herança):
 Crie as classes derivadas AlunoPosGraduacao e AlunoGraduacao que
herdam da classe Aluno.
 Adicione atributos específicos, como projetoPesquisa para
AlunoPosGraduacao e semestre para AlunoGraduacao.
 Implemente métodos adicionais, se necessário, para cada tipo de aluno.
4. Instanciamento de Objetos:
 Realize o instanciamento de objetos para representar diferentes alunos,
tanto de graduação quanto de pós-graduação.
5. Teste de Polimorfismo:
 Chame o método calcularMedia() para diferentes tipos de alunos,
observando como o polimorfismo permite que o mesmo método seja
chamado de maneira única, independentemente do tipo de aluno.
Obs: Lembrando que a existência da classe MAIN é fundamental para a criação do
MENU para que o usuário tenha condição de manipulação dos dados de forma
dinâmica.
