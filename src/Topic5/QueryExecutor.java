package Topic5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by developer on 6/2/17.
 */
public class QueryExecutor {
    private Statement statement;
    private Connection connection;

    public QueryExecutor(Connection connection) throws SQLException, Exception {
        this.connection = connection;
        this.statement = (Statement) connection.createStatement();
    }

    public void createTable(String query) throws SQLException {
        statement.executeUpdate(query);
    }

    public void executeStatement(String myStatement) throws SQLException {
        statement.executeUpdate(myStatement);
    }

    public Statement getStatement() {
        return statement;
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect () throws SQLException{
        connection.close();
    }

}




