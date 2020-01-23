import interfaces.Label;
import interfaces.TextAnalyzer;

abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    public Label processText(String text) {
        String[] words_spam = getKeywords();
        for (String key_i : words_spam) {
            boolean check = text.contains(key_i);
            if (check) return getLabel();
        }
        return Label.OK;
    }

}
