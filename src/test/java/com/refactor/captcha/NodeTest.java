package com.refactor.captcha;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class NodeTest {

    @Test
    public void display_ValueNode_printsTheValue() {
        Node valueNode = OperatorNode.valueNode(1);
        assertEquals("1", valueNode.display());
    }

    @Test
    public void display_OperatorNode_printsTheEquation() {
        Node operatorNode = OperatorNode.operatorNode(Operator.plus(), OperatorNode.valueNode(1), OperatorNode.valueNode(2));
        assertEquals("1 + 2", operatorNode.display());
    }

    @Test
    public void display_complexOperatorNodes() {
        Node f = OperatorNode.operatorNode(Operator.multiply(), OperatorNode.valueNode(2), OperatorNode.valueNode(5));
        Node g = OperatorNode.operatorNode(Operator.plus(), f, OperatorNode.valueNode(3));

        assertEquals("2 * 5 + 3", g.display());
    }

    @Test
    public void compute_ValueNode_givesTheValueBack() {
        Node valueNode = OperatorNode.valueNode(2);
        assertEquals(2, valueNode.compute().intValue());
    }

    @Test
    public void compute_OperatorNode_givesTheComputedResult() {
        Node opsNode = OperatorNode.operatorNode(Operator.minus(), OperatorNode.valueNode(5), OperatorNode.valueNode(3));
        assertEquals(2, opsNode.compute().intValue());
    }


    @Test
    public void compute_complexOperatorNodes() {
        Node f = OperatorNode.operatorNode(Operator.multiply(), OperatorNode.valueNode(2), OperatorNode.valueNode(5));
        Node g = OperatorNode.operatorNode(Operator.plus(), f, OperatorNode.valueNode(3));

        assertEquals(13, g.compute().intValue());
    }
}
