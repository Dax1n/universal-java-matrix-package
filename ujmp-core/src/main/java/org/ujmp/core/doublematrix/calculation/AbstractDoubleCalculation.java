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

package org.ujmp.core.doublematrix.calculation;

import org.ujmp.core.Coordinates;
import org.ujmp.core.Matrix;
import org.ujmp.core.calculation.AbstractCalculation;
import org.ujmp.core.doublematrix.DoubleMatrix;
import org.ujmp.core.doublematrix.DoubleMatrix2D;
import org.ujmp.core.doublematrix.impl.DoubleCalculationMatrix;
import org.ujmp.core.enums.ValueType;

public abstract class AbstractDoubleCalculation extends AbstractCalculation implements
		DoubleCalculation {

	private static final long serialVersionUID = -7509806754731040687L;

	public AbstractDoubleCalculation(Matrix... sources) {
		super(sources);
	}

	public AbstractDoubleCalculation(int dimension, Matrix... sources) {
		super(dimension, sources);
	}

	public DoubleMatrix calcLink() {
		return new DoubleCalculationMatrix(this);
	}

	public Matrix calcNew() {
		Matrix result = DoubleMatrix2D.Factory.zeros(getSize()[ROW], getSize()[COLUMN]);
		for (long[] c : result.allCoordinates()) {
			result.setAsDouble(getDouble(c), c);
		}
		if (getMetaData() != null) {
			result.setMetaData(getMetaData().clone());
		}
		return result;
	}

	public Matrix calcOrig() {
		if (!Coordinates.equals(getSource().getSize(), getSize())) {
			throw new RuntimeException(
					"Cannot change Matrix size. Use calc(Ret.NEW) or calc(Ret.LINK) instead.");
		}

		final Matrix matrix = getSource();
		for (final long[] c : getSource().allCoordinates()) {
			matrix.setAsDouble(getDouble(c), c);
		}
		getSource().fireValueChanged();
		return getSource();
	}

	// this method is doing nothing, but it has to be there for submatrix or
	// selection where it is overridden
	public void setDouble(double value, long... coordinates) {
	}

	public final ValueType getValueType() {
		return ValueType.DOUBLE;
	}

}
