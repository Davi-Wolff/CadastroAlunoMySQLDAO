package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Aluno extends Pessoa {
    
    //Atributos
    
    private String curso;
    private int fase;

    // Método Construtor de Objeto Vazio
    
    public Aluno() {
    }

    public Aluno(String curso, int fase) {
        this.curso = curso;
        this.fase = fase;
    }

    // Método Construtor de Objeto, inserindo dados
    
    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }
    
    // Métodos GET e SET

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    public void setFase(String fase){
        this.fase = Integer.parseInt(fase);
    }
    
    // Método adicional
    
    public boolean verificarFormando(){
        
         String resposta = JOptionPane.showInputDialog(null,"Voce vai se formar este ano?");
         resposta = resposta.toLowerCase();
         resposta = resposta.trim();
         if (resposta == "s" || resposta == "sim"){
             return true;
         }else{
             return false;
         }
    }

    @Override
    public String toString() {
        return super.toString() + "\nAluno: " + "\nCurso: " + curso + "\nFase: " + fase;
    }
}

