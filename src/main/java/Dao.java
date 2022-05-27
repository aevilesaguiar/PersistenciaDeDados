import java.sql.*;

public class Dao {

    Connection connection;  // Conexao ao Banco de Dados
    PreparedStatement statement; // Acessa a Tabela ( insert, update, delete , select)
    ResultSet resultSet; // Consulta a Tabela( select )
    CallableStatement call; // Procedures e Function

    public void open() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
    }

    public void close() throws Exception{
        connection.close();
    }
}


