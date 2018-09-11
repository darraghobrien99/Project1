import javax.swing.JOptionPane;

public class Exercise1 {

    public static void main(String[] args) {

        String name = getName();
        int snacks = getSnacks();
        String classes = getClasses();
        int total = getTotal();

        JOptionPane.showMessageDialog(null, "Your name is " + name + "/nYour class is " + classes +
                "\nYou will have to pay" + total, "Snack Deal", JOptionPane.INFORMATION_MESSAGE);


        public static String getClasses() {

            classes = JOptionPane.showInputDialog("Please enter your class");
        }

        public static String getName() {

            name = JOptionPane.showInputDialog("Please enter your name");

        }

        public static int getTotal (int snacks){

            return snacks * 2;


        }

        public static int getSnacks () {
            String snacksAsString = "";
            snacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");
            return Integer.parseInt(snacksAsString);

        }
    }
    }
