package decorator.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LoaiBoTuDung extends TokenizeDecorator {
    List<String> stopWords;

    public LoaiBoTuDung(MyTokenize token) {
        super(token);
        String[] stw = {"và", "hoặc", "thì", "mà", "là", "nhưng"};
        stopWords = new ArrayList<>(Arrays.asList(stw));
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        list.removeAll(stopWords);
        return list;
    }
}
