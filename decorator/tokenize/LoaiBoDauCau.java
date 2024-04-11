package decorator.tokenize;

import java.util.List;
import java.util.stream.Collectors;

public class LoaiBoDauCau extends TokenizeDecorator{
    public LoaiBoDauCau(MyTokenize token) {
        super(token);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = token.tokenize();
        for(String s:list)
            s.replaceAll("\\p{Punct}+$", "");
        return list;
    }
}
