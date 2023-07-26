package com.refactor.captcha;

class Minus extends Operator {

    public Minus() {
        super("-");
    }

    @Override
    Integer compute(Node left, Node right) {
        return left.compute() - right.compute();
    }
}
