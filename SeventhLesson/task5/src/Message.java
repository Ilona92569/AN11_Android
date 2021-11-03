public class Message {
    public static String message(Patient patient, Test test) {

        if (test.test == true) {
            return "Уважаемый " + patient.surname + " " + patient.name + ", результат вашего теста на короновирус положительный. Вам необходимо соблюдать режим самоизоляции в течении 7-ми дней. Антител на короновирус в вашем организме не обнаружено.";
        }
        return "Уважаемый  " + patient.surname + " " + patient.name + ", результат вашего теста на короновирус отрицательный. Антитела на короновирус в вашем организме обнаружены. Поздравляем)";
    }
}
