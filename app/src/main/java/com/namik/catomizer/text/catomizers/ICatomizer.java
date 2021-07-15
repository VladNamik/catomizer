package com.namik.catomizer.text.catomizers;

import com.namik.catomizer.data.CatomizedWord;

public interface ICatomizer {
    CatomizedWord catomize(CatomizedWord word);
}
