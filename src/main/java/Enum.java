public class Enum {
    // Define an enum called Color
    enum Color {
        RED("FF0000"),
        GREEN("00FF00"),
        BLUE("0000FF"),
        YELLOW("FFFF00"),
        BLACK("000000");

        // Define color code variable
        private final String colorCode;

        // Constructor to initialize color code
        Color(String colorCode) {
            this.colorCode = colorCode;
        }

        // Method to get color code
        public String getColorCode() {
            return colorCode;
        }

        // Method to print color and its corresponding color code
        public static void printColorAndCode() {
            for (Color color : Color.values()) {
                System.out.println(color.name() + ": " + color.getColorCode());
            }
        }
    }

    // Example usage
    public class Main {
        public static void main(String[] args) {
            // Print color and its corresponding color code
            Color.printColorAndCode();
        }
    }

}
