package decision.tree.main;
import decision.tree.*;

public class Main {
    public static void main(String[] args) {
        Letter letterA = new Letter("letterA", "src\\resources\\a1.png");
        Letter letterT = new Letter("letterA", "src\\resources\\t1.png");

        DecisionTree<Letter, String> root = new Question<>(letter-> LetterUtils.percentUpBlackOfAllBlack(letter, 0.3) > 0.5);
        DecisionTree<Letter, String> answerPositiveT = new Answer<>("This is letter T");
        root.setYesDecisionTree(answerPositiveT);
        DecisionTree<Letter, String> isletterA = new Question<>(letter -> LetterUtils.percentMiddleBlackOfAllBlack(letter) > 0.45);
        root.setNoDecisionTree(isletterA);
        DecisionTree<Letter, String> answerPositiveA = new Answer<>("This is letter A");
        isletterA.setYesDecisionTree(answerPositiveA);
        DecisionTree<Letter, String> answerNotAOrT = new Answer<>("This is NOT letter A or T");
        isletterA.setNoDecisionTree(answerNotAOrT);

        System.out.println(root.proceedWithInput(new Letter("letterA1", "src\\resources\\a1.png")));
        System.out.println(root.proceedWithInput(new Letter("letterA2", "src\\resources\\a2.png")));
        System.out.println(root.proceedWithInput(new Letter("letterA3", "src\\resources\\a3.png")));
        System.out.println(root.proceedWithInput(new Letter("letterC1", "src\\resources\\c1.png")));
        System.out.println(root.proceedWithInput(new Letter("letterC2", "src\\resources\\c2.png")));
        System.out.println(root.proceedWithInput(new Letter("letterC3", "src\\resources\\c3.png")));
        System.out.println(root.proceedWithInput(new Letter("letterK1", "src\\resources\\k1.png")));
        System.out.println(root.proceedWithInput(new Letter("letterK2", "src\\resources\\k2.png")));
        System.out.println(root.proceedWithInput(new Letter("letterK3", "src\\resources\\k3.png")));
        System.out.println(root.proceedWithInput(new Letter("letterT1", "src\\resources\\t1.png")));
        System.out.println(root.proceedWithInput(new Letter("letterT2", "src\\resources\\t1.png")));
        System.out.println(root.proceedWithInput(new Letter("letterT2", "src\\resources\\t2.png")));


    }
}
