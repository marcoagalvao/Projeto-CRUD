/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Marco
 */
public class Livro {
    private int id;
    private String nome;
    private int paginas;
    private String editora;
    private String emprestado;

    public Livro(){};
    public Livro(int id, String nome, int paginas, String editora, String emprestado) {
        this.id = id;
        this.nome = nome;
        this.paginas = paginas;
        this.editora = editora;
        this.emprestado = emprestado;
    }

    public Livro(String nome, int paginas, String editora, String emprestado) {
        this.nome = nome;
        this.paginas = paginas;
        this.editora = editora;
        this.emprestado = emprestado;
    }

    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }
    
    
}
