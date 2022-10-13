
package javaapplication46;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Agenda {
    private Connection conn;
    private PreparedStatement pstm;

    public void inserir(Pessoa pessoa){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com a base de dados");
        
        try {
            pstm = conn.prepareStatement("INSERT INTO AULABCD1 (NOME,IDADE,CPF) VALUES (?, ?, ?)");
            pstm.setString(1, pessoa.getNome());
            pstm.setString(3, pessoa.getCpf());
            pstm.setInt(2, pessoa.getIdade());
            pstm.execute();
            System.out.println("Inserido com sucesso");
            conexao.desconectar();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
    public void remover(String nome){
        Conecta conexao = new Conecta();
        this.conn = conexao.conectar();
        if (conn==null)
            System.out.println("Erro na conexão");
        else
            System.out.println("Conectado com a base de dados");
        
        try {
            pstm = conn.prepareStatement("DELETE FROM AULABCD1 WHERE NOME = ?");
            pstm.setString(1, nome);
            pstm.execute();
            System.out.println("Removido com sucesso");
            conexao.desconectar();
        } catch (SQLException ex) {
            System.out.println("Falha ao inserir no DB: " + ex.getMessage());
        }
    }
}
