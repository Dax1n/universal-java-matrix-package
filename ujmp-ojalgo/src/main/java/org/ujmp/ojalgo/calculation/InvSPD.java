/*
 * Copyright (C) 2008-2015 by Holger Arndt
 *
 * This file is part of the Universal Java Matrix Package (UJMP).
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership and licensing.
 *
 * UJMP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * UJMP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with UJMP; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

package org.ujmp.ojalgo.calculation;

import org.ojalgo.matrix.decomposition.Cholesky;
import org.ojalgo.matrix.decomposition.CholeskyDecomposition;
import org.ojalgo.matrix.store.MatrixStore;
import org.ujmp.core.Matrix;
import org.ujmp.ojalgo.OjalgoDenseDoubleMatrix2D;

public class InvSPD implements org.ujmp.core.doublematrix.calculation.general.decomposition.InvSPD<Matrix> {

	public static InvSPD INSTANCE = new InvSPD();

	public Matrix calc(Matrix source) {
		MatrixStore<Double> matrix = null;
		if (source instanceof OjalgoDenseDoubleMatrix2D) {
			matrix = ((OjalgoDenseDoubleMatrix2D) source).getWrappedObject();
		} else {
			matrix = new OjalgoDenseDoubleMatrix2D(source).getWrappedObject();
		}
		Cholesky<Double> chol = CholeskyDecomposition.makePrimitive();
		chol.compute(matrix);
		return new OjalgoDenseDoubleMatrix2D(chol.getInverse());
	}
}
