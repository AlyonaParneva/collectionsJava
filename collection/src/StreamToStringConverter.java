import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToStringConverter {
    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Stream", "to", "String", "Converter");
        String result = getStringFromStream(stream);
        System.out.println(result);
    }
}
