/*
 * Copyright (C) 2017, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.procedure;

import io.proleap.cobol.asg.metamodel.CobolDivisionElement;
import io.proleap.cobol.asg.metamodel.call.Call;

public interface ByReference extends CobolDivisionElement {

	Call getReferenceCall();

	boolean isAny();

	boolean isOptional();

	void setAny(boolean any);

	void setReferenceCall(Call fileCall);

	void setOptional(boolean optional);

}
