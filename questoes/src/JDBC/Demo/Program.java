package JDBC.Demo;

import JDBC.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection conn = null; // Para conectar com o banco de dados
        Statement st = null; // Para executar comandos SQL
        ResultSet rs = null; // Para armazenar o resultado de uma consulta


        // Bloco try-catch para tratar exceções
        try {
        conn = DB.getConnection(); // Conectando com o banco de dados

        st = conn.createStatement(); // Instanciando o objeto Statement

        rs = st.executeQuery("select * from department"); // Executando um comando SQL

        // Enquanto houverem linhas no ResultSet, o programa imprime o Id e o Name de cada linha.
        while (rs.next()){
            System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));

        }

        }
        catch (SQLException e){
            e.printStackTrace();
        }

        // Bloco finally para fechar as conexões com o banco de dados
        finally {
        DB.closeResultSet(rs);
        DB.closeStatement(st);
        DB.closeConnection();
        }


    }
}
