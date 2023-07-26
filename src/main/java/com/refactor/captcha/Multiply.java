package com.refactor.captcha;

class Multiply extends Operator {

    public Multiply() {
        super("*");
    }

    @Override
    Integer compute(Node left, Node right) {
        return left.compute() * right.compute();
    }
}
