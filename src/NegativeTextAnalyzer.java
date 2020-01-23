import interfaces.Label;
import interfaces.TextAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords_negative = {":(", ":|", "=("};

    @Override
    protected String[] getKeywords() {
        return keywords_negative;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

}
