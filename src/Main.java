public class Main {
    public static void main(String[] args) {

        // task 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // task 2
        String fullName2 = "Ivanov Ivan Ivanovich";
        String upFullName = fullName2.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upFullName);

        //task 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");

        System.out.println(fullName);


    }
}