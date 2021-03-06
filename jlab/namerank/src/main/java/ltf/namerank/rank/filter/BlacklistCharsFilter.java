package ltf.namerank.rank.filter;

import ltf.namerank.rank.RankFilter;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import static ltf.namerank.utils.FileUtils.file2Lines;

/**
 * @author ltf
 * @since 16/7/12, 上午9:13
 */
public class BlacklistCharsFilter implements RankFilter {

    private Set<String> bannedWords = new HashSet<>();

    @Override
    public boolean banned(String givenName) {
        for (char c : givenName.toCharArray()) {
            if (bannedWords.contains(c + "")) return true;
        }
        return false;
    }

    public BlacklistCharsFilter addChars(String fn) {
        try {
            file2Lines(fn, bannedWords);
            for (String s : bannedWords) {
                if (s.length() > 1) {
                    throw new IllegalStateException("'" + s + "' in file '" + fn + "' is more than a char length");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }
}
