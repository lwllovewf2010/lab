package ltf.namerank;

import ltf.namerank.dataprepare.WordFeelings;

/**
 * @author ltf
 * @since 16/6/12, 下午5:26
 */
public class Runner {
    public static void main(String[] args) {
        // new HanziWuxing().run();
        new WordFeelings().go();
    }
}