package Topic5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {

    private Connection connect = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    public void readDataBase() throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/highSchool?"
                            + "user=root&password=Suborder.7");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter course:");
            String input = reader.readLine();

            resultSet = statement
                    .executeQuery("select * from highSchool.teachers t inner join highSchool.courses c on t.id = c.teacher where c.name = '" + input + "'");
            writeResultForKeyPointFour(resultSet);
            resultSet = statement
                    .executeQuery("select * from highSchool.students s inner join highSchool.inscriptions i on s.registrationNumber = i.student");
            writeResultForKeyPointFour2(resultSet);

            System.out.println("Enter student:");
            String student = reader.readLine();

            resultSet = statement
                    .executeQuery("select * from highSchool.inscriptions i inner join highSchool.students s on i.student = s.registrationNumber where i.student=" + student + ";");
            writeResultForKeyPointFive(resultSet);


        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            System.out.println("Column " + i + " " + resultSet.getMetaData().getColumnName(i));
        }
    }

    private void writeResultForKeyPointFour(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {

            String course = resultSet.getString("c.name");
            String teacherFirstName = resultSet.getString("t.lastName");
            String teacherLastName = resultSet.getString("t.firstName");

            System.out.println("Course: " + course);
            System.out.println("Teacher: " + teacherLastName + ", " + teacherFirstName);
            System.out.println("Students: ");

        }
    }

    private void writeResultForKeyPointFour2(ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {

            String studentFirstName = resultSet.getString("s.lastName");
            String studentLastName = resultSet.getString("s.firstName");

            System.out.println("\n " + studentLastName + ", " + studentFirstName);


        }
    }

    private void writeResultForKeyPointFive(ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {

            String studentFirstName = resultSet.getString("s.lastName");
            String studentLastName = resultSet.getString("s.firstName");
            Double average = resultSet.getDouble("i.note1") + resultSet.getDouble("i.note2") + resultSet.getDouble("i.note3") / 3;


            System.out.println("\n " + studentLastName + ", " + studentFirstName + ": " + average);


        }
    }

    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
}
