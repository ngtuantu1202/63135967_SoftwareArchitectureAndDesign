package decorator.tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements MyTokenize {
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        String[] list = s.split(" ");
        List<String> arrlist = new ArrayList<>(Arrays.asList(list));
        return arrlist;
    }
}
