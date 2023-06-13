class CustomConversionException extends RuntimeException {
    public CustomConversionException(String message) {
        super(message);
    }
}

public class Convert {
    public int convertToInteger(String str) throws CustomConversionException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new CustomConversionException("Error: Failed to convert the string to an integer");
        }
    }

    public static void main(String[] args) {
        Convert converter = new Convert();

        String[] inputs = {"23", "45.67", "test", "123f"};

        for (String str : inputs) {
            try {
                int result = converter.convertToInteger(str);
                System.out.println("Converted value of '" + str + "': " + result);
            } catch (CustomConversionException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
