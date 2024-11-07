public class Main {
    public static void main(String[] args) {
        // Valores predefinidos (quemados)
        byte valorByte = 50;
        short valorShort = 5000;
        int valorInt = 50000;
        long valorLong = 500000L;
        float valorFloat = 55.345f;
        double valorDouble = 55242.6789;

        // Mostrar las conversiones de cada valor a otro tipo

        // Conversion de byte
        System.out.println("Conversión de Byte:");
        System.out.println("Byte -> Short: " + (short) valorByte);
        System.out.println("Byte -> Int: " + (int) valorByte);
        System.out.println("Byte -> Long: " + (long) valorByte);
        System.out.println("Byte -> Float: " + (float) valorByte);
        System.out.println("Byte -> Double: " + (double) valorByte);

        // Conversion de short
        System.out.println("\nConversión de Short:");
        System.out.println("Short -> Byte: " + (byte) valorShort);
        System.out.println("Short -> Int: " + (int) valorShort);
        System.out.println("Short -> Long: " + (long) valorShort);
        System.out.println("Short -> Float: " + (float) valorShort);
        System.out.println("Short -> Double: " + (double) valorShort);

        // Conversion de int
        System.out.println("\nConversión de Int:");
        System.out.println("Int -> Byte: " + (byte) valorInt);
        System.out.println("Int -> Short: " + (short) valorInt);
        System.out.println("Int -> Long: " + (long) valorInt);
        System.out.println("Int -> Float: " + (float) valorInt);
        System.out.println("Int -> Double: " + (double) valorInt);

        // Conversion de long
        System.out.println("\nConversión de Long:");
        System.out.println("Long -> Byte: " + (byte) valorLong);
        System.out.println("Long -> Short: " + (short) valorLong);
        System.out.println("Long -> Int: " + (int) valorLong);
        System.out.println("Long -> Float: " + (float) valorLong);
        System.out.println("Long -> Double: " + (double) valorLong);

        // Conversion de float
        System.out.println("\nConversión de Float:");
        System.out.println("Float -> Byte: " + (byte) valorFloat);
        System.out.println("Float -> Short: " + (short) valorFloat);
        System.out.println("Float -> Int: " + (int) valorFloat);
        System.out.println("Float -> Long: " + (long) valorFloat);
        System.out.println("Float -> Double: " + (double) valorFloat);

        // Conversion de double
        System.out.println("\nConversión de Double:");
        System.out.println("Double -> Byte: " + (byte) valorDouble);
        System.out.println("Double -> Short: " + (short) valorDouble);
        System.out.println("Double -> Int: " + (int) valorDouble);
        System.out.println("Double -> Long: " + (long) valorDouble);
        System.out.println("Double -> Float: " + (float) valorDouble);

    }
}
