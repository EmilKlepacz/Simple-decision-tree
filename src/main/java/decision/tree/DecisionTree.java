package decision.tree;

public interface DecisionTree<Input, Output> {

    Output proceedWithInput(Input input); //ask

    void setYesDecisionTree(DecisionTree<Input, Output> decisionTree);

    void setNoDecisionTree(DecisionTree<Input, Output> decisionTree);
}
