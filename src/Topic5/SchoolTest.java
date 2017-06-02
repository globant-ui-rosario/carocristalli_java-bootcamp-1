package Topic5;


public class SchoolTest {
    public static void main(String[] args) {

        try {

            SchoolQuery schoolQuery = new SchoolQuery();

            schoolQuery.getTeacherAndStudentsOfACourse();
            schoolQuery.getFinalNotesOfAStudent();


        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
