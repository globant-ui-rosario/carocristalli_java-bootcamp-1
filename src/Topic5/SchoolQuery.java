package Topic5;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SchoolQuery {
    private QueryExecutor queryExecutor;
    private ResultSet resultSet;
    private Statement statement;

    public SchoolQuery() throws Exception {

        ConnectToServer server = new ConnectToServer();
        this.queryExecutor = new QueryExecutor(server.connectTo());

    }


    public void getTeacherAndStudentsOfACourse() throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter course:");
        String input = reader.readLine();

        String query1 = "select * from highSchool.teachers t inner join highSchool.courses c on t.id = c.teacher where c.name = '" + input + "'";
        String query2 = "select * from highSchool.students s inner join highSchool.inscriptions i on s.registrationNumber = i.student";


        PreparedStatement preparedStatement = queryExecutor.getConnection().prepareStatement(query1);
        ResultSet resultSet = preparedStatement.executeQuery();
        writeResultForKeyPointFour(resultSet);

        PreparedStatement preparedStatement2 = queryExecutor.getConnection().prepareStatement(query2);
        ResultSet resultSet2 = preparedStatement2.executeQuery();
        writeResultForKeyPointFour2(resultSet2);


    }

    public void getFinalNotesOfAStudent() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter student:");
        String student = reader.readLine();

        String query1 = "select * from highSchool.inscriptions i inner join highSchool.students s on i.student = s.registrationNumber where i.student=" + student + ";";


        PreparedStatement preparedStatement = queryExecutor.getConnection().prepareStatement(query1);
        ResultSet resultSet = preparedStatement.executeQuery();
        writeResultForKeyPointFive(resultSet);


    }


    public void disconnect() throws SQLException {
        queryExecutor.disconnect();
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

            String studentLastName = resultSet.getString("s.lastName");
            String studentFirstName = resultSet.getString("s.firstName");

            System.out.println("\n " + studentLastName + ", " + studentFirstName);


        }
    }

    private void writeResultForKeyPointFive(ResultSet resultSet) throws SQLException {

        while (resultSet.next()) {

            String studentLastName = resultSet.getString("s.lastName");
            String studentFirstName = resultSet.getString("s.firstName");
            String name = resultSet.getString("i.name");
            Double average = resultSet.getDouble("i.note1") + resultSet.getDouble("i.note2") + resultSet.getDouble("i.note3") / 3;

            System.out.println("For  " + studentLastName + ", " + studentFirstName + "\n In course " + name + ": " + average + " points" );


        }
    }

}



