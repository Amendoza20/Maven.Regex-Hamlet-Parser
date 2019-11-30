public class Main {
    public static void main(String[] args) {
        HamletParser parser = new HamletParser();
        Converter converter = new Converter(parser.getHamletData());

        converter.replace("Hamlet","Leon");
        converter.replace("HAMLET","LEON");
        converter.replace("Horatio","Tariq");
        converter.replace("HORATIO","TARIQ");

        System.out.println(converter.toString());
    }
}
