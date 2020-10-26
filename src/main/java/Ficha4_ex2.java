import java.util.Scanner;

public class Ficha4_ex2 {
    
    // módulo criado para elaborar o layout pedido no enunciado
    // Nos slides não diz um cu sobre static, public, private etc por isso fiz igual à main()
    // Apenas sei que temos de usar "void", porque o nosso módulo não vai devolver valores, 
    // vai imprimir para a tela
                                     //declaração das variáveis de entrada no módulo
    public static void disciplina (String nome,int nAlunos, int nPositivas){
        //declaração de variáveis usadas apenas dentro do módulo
        int i;
        // inicialização de strings vazias que irão acumular "*"
        String EstrelasPositivas = "";
        String EstrelasNegativas = "";
        
        // Acrescenta "*" à string EstrelasPositivas, tantas vezes quanto o
        // número de alunos aprovados
        for(i = 1; i <= nPositivas; i++){
                EstrelasPositivas = EstrelasPositivas + "*";
        }
        // Acrescenta "*" à string EstrelasPositivas, tantas vezes quanto o 
        // número de alunos reprovados (nAlunos - nPositivas)
        for(i = 1; i <= (nAlunos - nPositivas); i++){
                EstrelasNegativas = EstrelasNegativas + "*";
        }
        
        // imprime o layout pretendido    
        System.out.print("Disciplina: " + nome + "\n");
        System.out.print("- Positivas: " + EstrelasPositivas + "\n");
        System.out.print("- Negativas: " + EstrelasNegativas + "\n");
    }
    
    // MÓDULO PRINCIPAL 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nDisciplinas = 0, alunos = 0, aprovados = 0;
        String nomeDisciplina;
        
        //  pede ao utilizador que indique o número de disciplinas
        System.out.print("Indique o número de diciplinas: \n");
        nDisciplinas = ler.nextInt();
        
        // validação para o numero de disciplinas. não pode ser inferior a Zero
        while(nDisciplinas<=0){
                System.out.print("Número inválido, indique novamente o número de alunos da disciplina: \n");
                nDisciplinas = ler.nextInt();
        }
        
        /*  LOOP para fazer os pedidos de entrada ao utilizador, o número de vezes quanto 
            o número de disciplinas introduzido pelo utilizador */
        for(int x=0;x<nDisciplinas;x++){
            
            // pede ao utilizadro o nome da disciplina
            System.out.print("Indique o nome da disciplina: \n");
            nomeDisciplina = ler.next();
            
            // pede ao utilizador que introduza o número de alunos da disciplina
            System.out.print("Indique o número alunos da disciplina: \n");
            alunos = ler.nextInt();
            
            // validação para o numero de alunos. não pode ser inferior a Zero
            while(alunos<0){
                System.out.print("Número inválido, indique novamente o número de alunos da disciplina: \n");
                alunos = ler.nextInt();
            }
            
            // pede ao utilizado o número de alunos aprovados
            System.out.print("Indique o número alunos aprovados \n");
            aprovados = ler.nextInt();
            
            //validação do numero de alunos aprovados, tem de ser positivo e no máximo igual ao número de alunos
            while(aprovados<0 || aprovados >alunos){
                System.out.print("Número inválido, indique novamente o número de alunos aprovados: \n");
                aprovados = ler.nextInt();
            }
            // imprime o layout definido pelo enunciado, chamando o módulo, criado em cima, "disciplina"
            disciplina(nomeDisciplina, alunos, aprovados);
        }
    }
    
}
