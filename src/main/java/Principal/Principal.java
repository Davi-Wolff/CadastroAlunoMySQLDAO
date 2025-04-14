package Principal;

import Model.Pessoa;
import Model.Aluno;
import Model.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        String resposta = JOptionPane.showInputDialog("Você é um Professor?");
        resposta = resposta.trim();

        // Checagem de Funcionário
        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
            String resposta2 = JOptionPane.showInputDialog(null, "Qual matéria você leciona?");
            resposta2 = resposta2.trim();

            if (resposta2.equalsIgnoreCase("matemática") || 
                resposta2.equalsIgnoreCase("matematica") || 
                resposta2.equalsIgnoreCase("mtm")) {
                
                Professor prof = new Professor(5000, "Professor", 1554, "Leonardo", 45);
                JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + prof.toString());
            }

            if (resposta2.equalsIgnoreCase("portugues") || 
                resposta2.equalsIgnoreCase("português") || 
                resposta2.equalsIgnoreCase("gramatica") || 
                resposta2.equalsIgnoreCase("gramática") || 
                resposta2.equalsIgnoreCase("pt") || 
                resposta2.equalsIgnoreCase("gra")) {
                
                Professor prof = new Professor(4500, "Professora", 1785, "Marcia", 62);
                JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + prof.toString());
            }

            if (resposta2.equalsIgnoreCase("história") || 
                resposta2.equalsIgnoreCase("historia") || 
                resposta2.equalsIgnoreCase("hst")) {
                
                Professor prof = new Professor(8000, "Diretor Acadêmico e Professor", 4561, "Rodrigo", 33);
                JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + prof.toString());
            }

            if (resposta2.equalsIgnoreCase("fisica") || 
                resposta2.equalsIgnoreCase("física") || 
                resposta2.equalsIgnoreCase("fsc")) {
                
                Professor prof = new Professor(7500, "Professora e Supervisora", 3333, "Fernanda", 40);
                JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + prof.toString());
            }

            if (resposta2.equalsIgnoreCase("geografia") || 
                resposta2.equalsIgnoreCase("geo")) {
                
                Professor prof = new Professor(4250, "Professora", 7405, "Amanda", 28);
                JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + prof.toString());
            }

        } else {
            Aluno alun = new Aluno();
            alun.setNome(JOptionPane.showInputDialog(null, "Insira seu Nome:"));
            alun.setCurso(JOptionPane.showInputDialog(null, "Insira seu Curso:"));
            alun.setFase(JOptionPane.showInputDialog(null, "Insira sua Fase:"));
            alun.setId(JOptionPane.showInputDialog(null, "Insira seu Id:"));
            alun.setIdade(JOptionPane.showInputDialog(null, "Insira sua Idade:"));
            JOptionPane.showMessageDialog(null, "Bem vindo(a):\n" + alun.toString());
        }

    }
}
