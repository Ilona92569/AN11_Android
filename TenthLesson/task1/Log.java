package task1;

import java.util.Arrays;
import java.util.List;

public class Log {
    char[] log;

    public Log(int countLesson) {
        log = new char[countLesson];
        for (int i = 0; i < log.length; i++) {
            log[i] = '-';
        }
    }

    public static void showLog(List<String> student, List<char[]> log, int numberStudent) {
        for (int i = 0, j = 0; i < student.size(); i++, j++) {
            System.out.println(student.get(i) + " " + Arrays.toString(log.get(i)));
        }
    }

    public static void markThePresence(List<String> student, List<char[]> log, int numberLesson) {
        int indexStudent = Utils.indexStudent(student) - 1;
        int indexLesson = Utils.indexLesson(numberLesson) - 1;
        Log lodNew = new Log(3);
        lodNew.log[indexLesson] = '+';
        log.set(indexStudent, lodNew.log);
    }

    public static void deleteStudent(List<String> student, List<char[]> log) {
        int indexStudent = Utils.indexStudent(student) - 1;
        student.remove(indexStudent);
        log.remove(indexStudent);
    }

    public static void addStudent(List<String> student, List<char[]> log, int numberLesson) {
        student.add(Utils.interName());
        log.add(new Log(numberLesson).log);
    }
}
