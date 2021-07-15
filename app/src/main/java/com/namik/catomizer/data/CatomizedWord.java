package com.namik.catomizer.data;

public class CatomizedWord {
    private final String mCatWord;
    private StringBuilder mWord;
    private boolean mIsCatomized;

    public CatomizedWord(String catWord) {
        mCatWord = catWord;
        mWord = new StringBuilder();
        mIsCatomized = false;
    }

    public CatomizedWord(String catWord, String wordToCatomize) {
        mCatWord = catWord;
        mWord = new StringBuilder(wordToCatomize);
        mIsCatomized = false;
    }

    public CatomizedWord(String catWord, String wordToCatomize, boolean isCatomized) {
        mCatWord = catWord;
        mWord = new StringBuilder(wordToCatomize);
        mIsCatomized = isCatomized;
    }

    public boolean isCatomized() {
        return mIsCatomized;
    }

    public void setCatomized(boolean isCatomized) {
        mIsCatomized = isCatomized;
    }

    public StringBuilder getWord() {
        return mWord;
    }

    public void setWord(StringBuilder word) {
        mWord = word;
    }

    @Override
    public String toString() {
        return mWord.toString();
    }
}
