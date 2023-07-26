package com.refactor.captcha;

public class OperatorNode implements Node {

    private Operator operator;

    private Node leftOperand;
    private Node rightOperand;

    private OperatorNode(Operator operator, Node leftOperand, Node rightOperand) {
        this.operator = operator;
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public static Node operatorNode(Operator operator, Node leftOperand, Node rightOperand) {
        return new OperatorNode(operator, leftOperand, rightOperand);
    }

    public static Node valueNode(Integer value) {
        return new ValueNode(value);
    }

    @Override
    public Integer compute() {
        return this.operator.compute(leftOperand, rightOperand);
    }

    @Override
    public String display() {
        return this.operator.display(leftOperand, rightOperand);
    }

}
