package decision.tree;

import java.util.function.Predicate;

public class Question<Input, Output> implements DecisionTree<Input, Output> {

    private Predicate<Input> question;
    private DecisionTree<Input, Output> no;
    private DecisionTree<Input, Output> yes;

    public Question(Predicate<Input> question) {
        this.question = question;
    }

    @Override
    public Output proceedWithInput (Input input) {
        if (question.test(input)) {
            if (yes != null) return yes.proceedWithInput(input);
        } else {
            if (no != null) return no.proceedWithInput(input);
        }
        throw new IllegalStateException("Bad tree construction");
    }

    @Override
    public void setYesDecisionTree(DecisionTree<Input, Output> yesDecisionTree) {
        this.yes = yesDecisionTree;
    }

    @Override
    public void setNoDecisionTree(DecisionTree<Input, Output> noDecisionTree) {
        this.no = noDecisionTree;
    }
}
