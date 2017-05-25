package edu.rit.goal.sdg.java.visitor;

import edu.rit.goal.sdg.java.antlr.Java8BaseVisitor;
import edu.rit.goal.sdg.java.antlr.Java8Parser;
import edu.rit.goal.sdg.java.statement.FormalParameter;

public class FormalParameterVisitor extends Java8BaseVisitor<FormalParameter> {

    @Override
    public FormalParameter visitFormalParameter(final Java8Parser.FormalParameterContext ctx) {
	final String variableDeclaratorId = ctx.variableDeclaratorId().Identifier().getText();
	final FormalParameter result = new FormalParameter(variableDeclaratorId);
	return result;
    }

}
