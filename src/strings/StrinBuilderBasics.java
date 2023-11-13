package strings;

public class StrinBuilderBasics {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        str.setCharAt(0, 'm');
        System.out.println(str);

        // Append into the string
        str.append("World");
        System.out.println(str);

        // insert character at particular place
        str.insert(1, 'f');
        System.out.println(str);

        // Delete a  particular value from the index
        str.deleteCharAt(0);
        System.out.println(str);

        // Delete the string
        str.delete(0,4);
        System.out.println(str);
        // Reverse the string
        str.reverse();
        System.out.println(str);


    }
}
