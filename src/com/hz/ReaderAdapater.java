package com.hz;

import java.util.Arrays;
import java.util.List;

class ReaderAdapter {
    public boolean contains(String answer) {
        // Create a list of all the answers
        String[] correctAnswers = new String[]{"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        List<String> correctList = Arrays.asList(correctAnswers);

        // If given answer is correct
        return correctList.contains(answer);
    }

}
