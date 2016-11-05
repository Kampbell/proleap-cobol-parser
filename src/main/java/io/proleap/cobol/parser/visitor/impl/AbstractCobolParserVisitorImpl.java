/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.visitor.impl;

import org.antlr.v4.runtime.tree.ParseTree;

import io.proleap.cobol.Cobol85BaseVisitor;
import io.proleap.cobol.parser.applicationcontext.CobolParserContext;
import io.proleap.cobol.parser.metamodel.CobolScope;
import io.proleap.cobol.parser.metamodel.CopyBook;
import io.proleap.cobol.parser.metamodel.ASGElement;
import io.proleap.cobol.parser.registry.ASGElementRegistry;
import io.proleap.cobol.parser.visitor.ParserVisitor;

public abstract class AbstractCobolParserVisitorImpl extends Cobol85BaseVisitor<Boolean> implements ParserVisitor {

	protected CopyBook copyBook;

	public AbstractCobolParserVisitorImpl(final CopyBook copyBook) {
		this.copyBook = copyBook;
	}

	protected CobolScope findCobol85Scope(final ParseTree ctx) {
		final ASGElementRegistry registry = CobolParserContext.getInstance()
				.getASGElementRegistry();
		return CobolParserContext.getInstance().getAstTraverser().findParent(CobolScope.class, ctx, registry);
	}

	protected ASGElement getSemanticGraphElement(final ParseTree ctx) {
		final ASGElement result = CobolParserContext.getInstance().getASGElementRegistry()
				.getASGElement(ctx);
		return result;
	}

}
