package com.namik.catomizer.text.catomizers;

import com.namik.catomizer.data.CatomizedWord;

public class AddSomewhereCatomizer implements ICatomizer{
    ICatomizer catomizer = null;

    AddSomewhereCatomizer() {
    }

    AddSomewhereCatomizer(ICatomizer catomizer) {

    }

    @Override
    public CatomizedWord catomize(CatomizedWord word) {
        // TODO:
        return word;
    }
}
