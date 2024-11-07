public class Main {
    public static void main(String[] args) {
        // Valores predefinidos (quemados)
        byte valorByte = 10;
        short valorShort = 1000;
        int valorInt = 50000;
        long valorLong = 100000L;
        float valorFloat = 12.345f;
        double valorDouble = 12345.6789;
        char valorChar = 'E';  // valorChar es un carácter, por ejemplo, 'A'

        // Mostrar las conversiones de cada valor a otro tipo

        // Conversion de byte
        System.out.println("Conversión de Byte:");
        System.out.println("Byte -> Short: " + (short) valorByte);
        System.out.println("Byte -> Int: " + (int) valorByte);
        System.out.println("Byte -> Long: " + (long) valorByte);
        System.out.println("Byte -> Float: " + (float) valorByte);
        System.out.println("Byte -> Double: " + (double) valorByte);
        System.out.println("Byte -> Char: " + (char) valorByte); // byte -> char

        // Conversion de short
        System.out.println("\nConversión de Short:");
        System.out.println("Short -> Byte: " + (byte) valorShort);
        System.out.println("Short -> Int: " + (int) valorShort);
        System.out.println("Short -> Long: " + (long) valorShort);
        System.out.println("Short -> Float: " + (float) valorShort);
        System.out.println("Short -> Double: " + (double) valorShort);
        System.out.println("Short -> Char: " + (char) valorShort); // short -> char

        // Conversion de int
        System.out.println("\nConversión de Int:");
        System.out.println("Int -> Byte: " + (byte) valorInt);
        System.out.println("Int -> Short: " + (short) valorInt);
        System.out.println("Int -> Long: " + (long) valorInt);
        System.out.println("Int -> Float: " + (float) valorInt);
        System.out.println("Int -> Double: " + (double) valorInt);
        System.out.println("Int -> Char: " + (char) valorInt); // int -> char

        // Conversion de long
        System.out.println("\nConversión de Long:");
        System.out.println("Long -> Byte: " + (byte) valorLong);
        System.out.println("Long -> Short: " + (short) valorLong);
        System.out.println("Long -> Int: " + (int) valorLong);
        System.out.println("Long -> Float: " + (float) valorLong);
        System.out.println("Long -> Double: " + (double) valorLong);
        System.out.println("Long -> Char: " + (char) valorLong); // long -> char

        // Conversion de float
        System.out.println("\nConversión de Float:");
        System.out.println("Float -> Byte: " + (byte) valorFloat);
        System.out.println("Float -> Short: " + (short) valorFloat);
        System.out.println("Float -> Int: " + (int) valorFloat);
        System.out.println("Float -> Long: " + (long) valorFloat);
        System.out.println("Float -> Double: " + (double) valorFloat);
        System.out.println("Float -> Char: " + (char) valorFloat); // float -> char

        // Conversion de double
        System.out.println("\nConversión de Double:");
        System.out.println("Double -> Byte: " + (byte) valorDouble);
        System.out.println("Double -> Short: " + (short) valorDouble);
        System.out.println("Double -> Int: " + (int) valorDouble);
        System.out.println("Double -> Long: " + (long) valorDouble);
        System.out.println("Double -> Float: " + (float) valorDouble);
        System.out.println("Double -> Char: " + (char) valorDouble); // double -> char

        // Conversión de Char
        System.out.println("\nConversión de Char:");
        System.out.println("Char -> Byte: " + (byte) valorChar); // char -> byte
        System.out.println("Char -> Short: " + (short) valorChar); // char -> short
        System.out.println("Char -> Int: " + (int) valorChar); // char -> int
        System.out.println("Char -> Long: " + (long) valorChar); // char -> long
        System.out.println("Char -> Float: " + (float) valorChar); // char -> float
        System.out.println("Char -> Double: " + (double) valorChar); // char -> double
    }
}
