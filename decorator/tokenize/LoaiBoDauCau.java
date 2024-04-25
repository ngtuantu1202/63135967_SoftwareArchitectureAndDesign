package decorator.tokenize;

import decorator.tokenize.MyTokenize;
import decorator.tokenize.TokenizeDecorator;

import java.util.List;
import java.util.stream.Collectors;

public class LoaiBoDauCau extends TokenizeDecorator {
    public LoaiBoDauCau(MyTokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        list = list.stream()
                .map(word -> word.replaceAll("\\p{Punct}+$", ""))
                .collect(Collectors.toList());
        return list;
    }
}
