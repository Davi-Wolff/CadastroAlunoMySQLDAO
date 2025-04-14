package Model;

/**
 *
 * @author Davi Wolff
 */
public class Professor extends Pessoa {
    
    private double salario;
    private String titulo;

    public Professor() {
    }

    public Professor(double salario, String titulo) {
        this.salario = salario;
        this.titulo = titulo;
    }

    public Professor(double salario, String titulo, int id, String nome, int idade) {
        super(id, nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public double calcularImposto(){
        return salario = salario*0.1;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nProfessor: " + "\nSalario: " + getSalario() + "\nTitulo: " + getTitulo() + "\nImposto: " + calcularImposto();
    }
    
    
    
}
