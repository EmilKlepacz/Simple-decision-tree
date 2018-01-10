package decision.tree;

public class Answer<Input, Output> implements DecisionTree<Input, Output> {

    private Output answer;

    public Answer(Output answer) {
        this.answer = answer;
    }

    @Override
    public Output proceedWithInput(Input input) {
        return answer;
    }

    @Override
    public void setYesDecisionTree(DecisionTree<Input, Output> decisionTree) {

    }

    @Override
    public void setNoDecisionTree(DecisionTree<Input, Output> decisionTree) {

    }
}
