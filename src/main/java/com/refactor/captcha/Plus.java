package com.refactor.captcha;

class Plus extends Operator {

    public Plus() {
        super("+");
    }

    @Override
    Integer compute(Node left, Node right) {
        return left.compute() + right.compute();
    }
}
