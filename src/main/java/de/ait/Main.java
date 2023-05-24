package de.ait;

public class Main {
    public static void main(String[] args) {

        System.out.println("Parametrised Tests");
        // этот метод уже должен содержать в себе отпределенные параметры
        // odd number - нечетное число,
        // even number - четное число.

        System.out.println("Валидность логина");
        /* написать метод public static boolean isValidLogin(String login)
        Логин считается валидным, если отвечает характеристикам:
         - больше или равно 8 символам
         - короче чем 20 символов
         - обязательно должна быть '@'
        Сделайте   @ParameterizedTest для проверки корректности работы метода
         */
    }
    //--------первый вариант метода прописан и работает не корректно
//    public static boolean isEven(int number) {
//        if (number == 8) {
//            return false;
//        }
//        return true;
//    }

    //--------этот метод работает более корректно
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    //метод к валидности логина
    public static boolean isValidLogin (String login){
        return (login.length() >= 8) &&
                (login.length() < 20) &&
                (login.contains("@"));
    }
    public static String getRectangleArea (int a, int b){
        return "Rectangle area is " + (a * b);
    }
}