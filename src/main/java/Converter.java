import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Converter {
    private String text;

    public Converter(String text){
        this.text = text;
    }
    public void replace(String regex, String replaceWith){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        text = matcher.replaceAll(replaceWith);
    }
    @Override
    public String toString(){
        return text;
    }
}
