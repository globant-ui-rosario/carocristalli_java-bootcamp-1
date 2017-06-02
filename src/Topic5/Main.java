package Topic5;


public class Main {
    public static void main(String[] args) throws Exception {




            try {
                ConnectToServer server = new ConnectToServer();
                QueryExecutor queryExecutor = new QueryExecutor(server.connectTo());

                String teacher1 = "INSERT INTO teachers (firstName, lastName, birthDate, id) VALUES ('Graciela','Nicastro',CURRENT_DATE,10)";
                String teacher2 = "INSERT INTO teachers (firstName, lastName, birthDate, id) VALUES ('Tomás','García',CURRENT_DATE,20)";
                String teacher3 = "INSERT INTO teachers (firstName, lastName, birthDate, id) VALUES ('Alejandro','Rozas',CURRENT_DATE,30)";

                queryExecutor.executeStatement(teacher1);
                queryExecutor.executeStatement(teacher2);
                queryExecutor.executeStatement(teacher3);

                String course1 = "INSERT INTO courses (name,teacher, hours, scheduledTime) VALUES ('JAVA',10,5,NULL)";
                String course2 = "INSERT INTO courses (name,teacher, hours, scheduledTime) VALUES ('.Net',20,5,NULL)";
                String course3 = "INSERT INTO courses (name,teacher, hours, scheduledTime) VALUES ('Angular',30,5,NULL)";
                String course4 = "INSERT INTO courses (name,teacher, hours, scheduledTime) VALUES ('SCRUM',10,5,NULL)";
                String course5 = "INSERT INTO courses (name,teacher, hours, scheduledTime) VALUES ('iOS',20,5,NULL)";

                queryExecutor.executeStatement(course1);
                queryExecutor.executeStatement(course2);
                queryExecutor.executeStatement(course3);
                queryExecutor.executeStatement(course4);
                queryExecutor.executeStatement(course5);

                String student1 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Carolina','Cristalli',39771,CURRENT_DATE))";
                String student2 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Josefina','Perez',39772,CURRENT_DATE))";
                String student3 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Milagros','Galassi',39773,CURRENT_DATE))";
                String student4 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Javier','Dorigoni',39774,CURRENT_DATE))";
                String student5 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('David','García',39775,CURRENT_DATE))";
                String student6 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Pablo','Rais',39776,CURRENT_DATE))";
                String student7 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Manuel','Arriete',39777,CURRENT_DATE))";
                String student8 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Lisandro','Baclini',39778,CURRENT_DATE))";
                String student9 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Agustina','Gramma',39779,CURRENT_DATE))";
                String student10 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Agustina','Guala',397710,CURRENT_DATE))";
                String student11 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Antonella','Vallaro',397711,CURRENT_DATE))";
                String student12 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Fernando','Momo',397712,CURRENT_DATE))";
                String student13 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Fernanda','Momo',397713,CURRENT_DATE))";
                String student14 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Julian','Pagano',397714,CURRENT_DATE))";
                String student15 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Ever','BLue',397715,CURRENT_DATE))";
                String student16 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Marial','Gia',397716,CURRENT_DATE))";
                String student17 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Adrian','Ta',397717,CURRENT_DATE))";
                String student18 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Belen','Gud',397718,CURRENT_DATE))";
                String student19 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Florencia','Cristalli',397719,CURRENT_DATE))";
                String student20 = "INSERT INTO students (firstName, lastName, registrationNumber, dateOfBirth) VALUES ('Ornella','Mangi',397720,CURRENT_DATE))";



                queryExecutor.executeStatement(student1);
                queryExecutor.executeStatement(student2);
                queryExecutor.executeStatement(student3);
                queryExecutor.executeStatement(student4);
                queryExecutor.executeStatement(student5);
                queryExecutor.executeStatement(student6);
                queryExecutor.executeStatement(student7);
                queryExecutor.executeStatement(student8);
                queryExecutor.executeStatement(student9);
                queryExecutor.executeStatement(student10);
                queryExecutor.executeStatement(student11);
                queryExecutor.executeStatement(student12);
                queryExecutor.executeStatement(student13);
                queryExecutor.executeStatement(student14);
                queryExecutor.executeStatement(student15);
                queryExecutor.executeStatement(student16);
                queryExecutor.executeStatement(student17);
                queryExecutor.executeStatement(student18);
                queryExecutor.executeStatement(student19);
                queryExecutor.executeStatement(student20);

                String evaluation1 = "INSERT INTO inscriptions (name, student, note1, note2, note3,id,finalNote)VALUES('JAVA',39771,6,6,8,10)";
                String evaluation2 = "INSERT INTO inscriptions (name, student, note1, note2, note3,id,finalNote)VALUES('JAVA',39772,6,6,0,10)";
                String evaluation3 = "INSERT INTO inscriptions (name, student, note1, note2, note3,id,finalNote)VALUES('JAVA',39773,6,4,8,10)";

                queryExecutor.executeStatement(evaluation1);
                queryExecutor.executeStatement(evaluation2);
                queryExecutor.executeStatement(evaluation3);

                server.disconnect();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
