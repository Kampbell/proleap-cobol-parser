/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure;

import java.util.List;

import io.proleap.cobol.Cobol85Parser.ProcedureDivisionByValueContext;
import io.proleap.cobol.asg.metamodel.CobolDivisionElement;

public interface ByValuePhrase extends CobolDivisionElement {

	ByValue addByValue(ProcedureDivisionByValueContext ctx);

	List<ByValue> getByValues();

}
