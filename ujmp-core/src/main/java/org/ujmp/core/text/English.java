/*
 * Copyright (C) 2008-2016 by Holger Arndt
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

package org.ujmp.core.text;

import org.ujmp.core.Matrix;

public abstract class English {

	public static final double AVERAGE_WORD_LENGTH = 5.1;

	public static final char[] ALPHABET = new char[] { ' ', '-', '\'', 'a', 'b', 'c', 'd', 'e',
			'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z' };

	public static final char[] ALLOWEDCHARACTERS = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
			'y', 'z', '\'', '"', ',', '.', ':', ';', '-', '!', '?', '1', '2', '3', '4', '5', '6',
			'7', '8', '9', '0', '(', ')', '´', '`' };

	public static final char[] PUNCTUATIONCHARACTERS = new char[] { '\'', '"', ',', '.', ':', ';',
			'!', '?', '(', ')', '´', '`' };

	public static final Matrix CHARFREQUENCIES = Matrix.Factory.zeros(256, 1);
	public static final Matrix CHARBIGRAMFREQUENCIES = Matrix.Factory.zeros(65536, 1);

	static {
		CHARFREQUENCIES.setAsDouble(0.08167, 'a', 0);
		CHARFREQUENCIES.setAsDouble(0.01492, 'b', 0);
		CHARFREQUENCIES.setAsDouble(0.02782, 'c', 0);
		CHARFREQUENCIES.setAsDouble(0.04253, 'd', 0);
		CHARFREQUENCIES.setAsDouble(0.13000, 'e', 0);
		CHARFREQUENCIES.setAsDouble(0.02228, 'f', 0);
		CHARFREQUENCIES.setAsDouble(0.02015, 'g', 0);
		CHARFREQUENCIES.setAsDouble(0.06094, 'h', 0);
		CHARFREQUENCIES.setAsDouble(0.06966, 'i', 0);
		CHARFREQUENCIES.setAsDouble(0.00153, 'j', 0);
		CHARFREQUENCIES.setAsDouble(0.00772, 'k', 0);
		CHARFREQUENCIES.setAsDouble(0.04025, 'l', 0);
		CHARFREQUENCIES.setAsDouble(0.02406, 'm', 0);
		CHARFREQUENCIES.setAsDouble(0.06749, 'n', 0);
		CHARFREQUENCIES.setAsDouble(0.07507, 'o', 0);
		CHARFREQUENCIES.setAsDouble(0.01929, 'p', 0);
		CHARFREQUENCIES.setAsDouble(0.00095, 'q', 0);
		CHARFREQUENCIES.setAsDouble(0.05987, 'r', 0);
		CHARFREQUENCIES.setAsDouble(0.06327, 's', 0);
		CHARFREQUENCIES.setAsDouble(0.09056, 't', 0);
		CHARFREQUENCIES.setAsDouble(0.02758, 'u', 0);
		CHARFREQUENCIES.setAsDouble(0.00978, 'v', 0);
		CHARFREQUENCIES.setAsDouble(0.02360, 'w', 0);
		CHARFREQUENCIES.setAsDouble(0.00150, 'x', 0);
		CHARFREQUENCIES.setAsDouble(0.01974, 'y', 0);
		CHARFREQUENCIES.setAsDouble(0.00074, 'z', 0);

		CHARBIGRAMFREQUENCIES.setAsDouble(2.8060866E-4, ' ' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.020360328, ' ' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008650844, ' ' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008948168, ' ' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005505589, ' ' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0039254674, ' ' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007631157, ' ' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0038785285, ' ' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008474319, ' ' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0121289715, ' ' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014460547, ' ' * 256 + 'j', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011504593, ' ' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004633046, ' ' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00682508, ' ' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0037931788, ' ' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.010459131, ' ' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007361105, ' ' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.8097525E-4, ' ' * 256 + 'q', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00504962, ' ' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.012851064, ' ' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.027711712, ' ' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001984129, ' ' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011974283, ' ' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.010847298, ' ' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021406454, ' ' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0089898E-4, ' ' * 256 + 'z', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.3907887E-4, '\'' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.128823E-4, '\'' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001221877, '\'' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.991913E-4, '\'' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.9860873E-4, '-' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0386216E-4, '-' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.08121116E-4, '-' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0802067E-4, '-' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0325948E-4, '-' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.26975E-4, '-' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2040578E-4, '-' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.605243E-4, '-' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.5297068E-4, '-' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.02415725E-4, '-' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005642136, 'a' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013808042, 'a' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0028557978, 'a' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0025591978, 'a' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.8422465E-4, 'a' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014263268, 'a' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8721305E-4, 'a' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0027494244, 'a' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001074893, 'a' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0065610753, 'a' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0025473048, 'a' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.012705838, 'a' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001112872, 'a' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007470462, 'a' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.006074902, 'a' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008872541, 'a' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.687859E-4, 'a' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0016750436, 'a' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.5924354E-4, 'a' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.4898294E-4, 'a' * 256 + 'x', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0026293902, 'a' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.26975E-4, 'a' * 256 + 'z', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.298528E-4, 'b' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0017354926, 'b' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.1665911E-4, 'b' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0037851632, 'b' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.698506E-4, 'b' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013731603, 'b' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0016084573, 'b' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.1474544E-4, 'b' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.2951128E-4, 'b' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0017186375, 'b' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.821203E-4, 'b' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.5752584E-4, 'c' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0035531307, 'c' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.419365E-4, 'c' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0036823256, 'c' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003624458, 'c' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014381394, 'c' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0015447036, 'c' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010092912, 'c' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0050446577, 'c' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.8432E-4, 'c' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.44051E-4, 'c' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0019955297, 'c' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.596954E-4, 'c' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.2092306E-4, 'c' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.015211659, 'd' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.4221281E-4, 'd' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0016006626, 'd' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.3358438E-4, 'd' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0044900095, 'd' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.0452007E-4, 'd' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0026827978, 'd' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.4332273E-4, 'd' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.14017355E-4, 'd' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.5951478E-4, 'd' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0017884282, 'd' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.785594E-4, 'd' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.9039205E-4, 'd' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.317863E-4, 'd' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2247499E-4, 'd' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.4474404E-4, 'd' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.031001922, 'e' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.2602073E-4, 'e' * 256 + '\'', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.873386E-4, 'e' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005505187, 'e' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.6744506E-4, 'e' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0027746465, 'e' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.006967072, 'e' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0029325292, 'e' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.6961454E-4, 'e' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.2175165E-4, 'e' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.9655463E-4, 'e' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011949573, 'e' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.9299376E-4, 'e' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0033142075, 'e' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0019685999, 'e' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008520897, 'e' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.932599E-4, 'e' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001031751, 'e' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6617947E-4, 'e' * 256 + 'q', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.013118765, 'e' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0077335928, 'e' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0029548483, 'e' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.7538041E-4, 'e' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0017027368, 'e' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.2637213E-4, 'e' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010807391, 'e' * 256 + 'x', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014191751, 'e' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005050152, 'f' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010764098, 'f' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0015139668, 'f' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011125606, 'f' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0020918483, 'f' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.969363E-4, 'f' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0035193202, 'f' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013986437, 'f' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.037515E-4, 'f' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.5257883E-4, 'f' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0058833295, 'g' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013720855, 'g' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0026299828, 'g' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.364622E-4, 'g' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0017355428, 'g' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.733964E-4, 'g' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.656571E-4, 'g' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.4089692E-4, 'g' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001466144, 'g' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011658779, 'g' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.179297E-4, 'g' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.02214835E-4, 'g' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.9595186E-4, 'g' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2807993E-4, 'g' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0039585247, 'h' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0070678606, 'h' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.018724218, 'h' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004920023, 'h' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2016471E-4, 'h' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6644063E-4, 'h' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003710521, 'h' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.18231E-4, 'h' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2457433E-4, 'h' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.664706E-4, 'h' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.639344E-4, 'h' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.5065537E-4, 'h' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014463961, 'i' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.4748628E-4, 'i' * 256 + '\'', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0014887345, 'i' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.1239508E-4, 'i' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0037607446, 'i' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002808236, 'i' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021827829, 'i' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011258699, 'i' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001858299, 'i' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.6893163E-4, 'i' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0035444621, 'i' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0018663047, 'i' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.016556853, 'i' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0035856052, 'i' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.6331663E-4, 'i' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0020836217, 'i' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0066038356, 'i' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007134005, 'i' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001621425, 'i' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6492387E-4, 'i' * 256 + 'x', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.321078E-4, 'i' * 256 + 'z', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.7899144E-4, 'j' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.532469E-4, 'j' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.325095E-4, 'j' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.8874477E-4, 'j' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0018128066, 'k' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.2760278E-4, 'k' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0024060565, 'k' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010269597, 'k' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.331525E-4, 'k' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.5879656E-4, 'k' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.1976292E-4, 'k' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.3230865E-4, 'k' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005034673, 'l' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.09075365E-4, 'l' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003552297, 'l' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0019997284, 'l' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0056979046, 'l' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.9061316E-4, 'l' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004149956, 'l' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.1912505E-4, 'l' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004976916, 'l' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.7485808E-4, 'l' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0026203701, 'l' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.1640294E-4, 'l' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010920896, 'l' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.844557E-4, 'l' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.146701E-4, 'l' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.736929E-4, 'l' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0025180648, 'l' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0023378127, 'm' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003595469, 'm' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.471447E-4, 'm' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0267689E-4, 'm' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0052540493, 'm' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021462603, 'm' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.6588807E-4, 'm' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0023267234, 'm' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013563052, 'm' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.388076E-4, 'm' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.3633156E-4, 'm' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.2743198E-4, 'm' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.013336936, 'n' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.1865285E-4, 'n' * 256 + '\'', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.4115812E-4, 'n' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002109075, 'n' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021359746, 'n' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008159388, 'n' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004897131, 'n' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.6084568E-4, 'n' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007536807, 'n' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021930786, 'n' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.977699E-4, 'n' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.0728232E-4, 'n' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.0580579E-4, 'n' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.6881103E-4, 'n' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0028542709, 'n' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0029065837, 'n' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.006223081, 'n' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.018029E-4, 'n' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.2915466E-4, 'n' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.8027206E-4, 'n' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00810363, 'o' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.192205E-4, 'o' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.0435926E-4, 'o' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.743608E-4, 'o' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.1178727E-4, 'o' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010420469, 'o' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.321078E-4, 'o' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0049162866, 'o' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.8663543E-4, 'o' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6156894E-4, 'o' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.049519E-4, 'o' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.3642196E-4, 'o' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0022678515, 'o' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003667379, 'o' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.010605302, 'o' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0019292749, 'o' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001650866, 'o' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008320264, 'o' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0019342771, 'o' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002859042, 'o' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.006850403, 'o' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001353101, 'o' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0025109332, 'o' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0677513E-4, 'o' * 256 + 'x', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.8182406E-4, 'o' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.001298026, 'p' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021317357, 'p' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0030924508, 'p' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.290994E-4, 'p' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.26111E-4, 'p' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0020006222, 'p' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0021351208, 'p' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.210886E-4, 'p' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0024331068, 'p' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.5825415E-4, 'p' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(4.4207714E-4, 'p' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.8380276E-4, 'p' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.289386E-4, 'q' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00933531, 'r' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8252218E-4, 'r' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0038488365, 'r' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8481238E-4, 'r' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.0926605E-4, 'r' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0013691826, 'r' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.01154664, 'r' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8214049E-4, 'r' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.4217753E-4, 'r' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004290361, 'r' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.2103343E-4, 'r' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.034854E-4, 'r' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.073927E-4, 'r' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011152024, 'r' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.004636471, 'r' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.0729241E-4, 'r' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.3728076E-4, 'r' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.003319963, 'r' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0024270096, 'r' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.0050703E-4, 'r' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.9223535E-4, 'r' * 256 + 'v', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0824165E-4, 'r' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0015329513, 'r' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.020247467, 's' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0023029377, 's' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.632161E-4, 's' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.5498967E-4, 's' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00549241, 's' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0023247146, 's' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.00317318, 's' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.5405546E-4, 's' * 256 + 'k', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.7240714E-4, 's' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.3191696E-4, 's' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.762191E-4, 's' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0027921041, 's' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0011958614, 's' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6085578E-4, 's' * 256 + 'q', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002177881, 's' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007559739, 's' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0016014561, 's' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8447086E-4, 's' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.3697449E-4, 's' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.016409459, 't' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.788759E-4, 't' * 256 + '\'', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.7986033E-4, 't' * 256 + '-', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0033039618, 't' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.6894172E-4, 't' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007269066, 't' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.021921787, 't' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0064309863, 't' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.967956E-4, 't' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.8292398E-4, 't' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.007900255, 't' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0024278434, 't' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002522615, 't' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0012888351, 't' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0012973328, 't' * 256 + 'u', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.582842E-4, 't' * 256 + 'w', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0012421673, 't' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.536787E-4, 'u' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.120083E-4, 'u' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.247751E-4, 'u' * 256 + 'b', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.5086114E-4, 'u' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.820902E-4, 'u' * 256 + 'd', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(8.8760967E-4, 'u' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.1446937E-4, 'u' * 256 + 'f', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(9.01612E-4, 'u' * 256 + 'g', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(5.878659E-4, 'u' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0020283156, 'u' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.0159195E-4, 'u' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0028323433, 'u' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6299529E-4, 'u' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0010968607, 'u' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0033076482, 'u' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0028571035, 'u' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0032440955, 'u' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.4221281E-4, 'u' * 256 + 'y', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.6038856E-4, 'v' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.005884987, 'v' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0016738684, 'v' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.9930682E-4, 'v' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0015171912, 'w' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002895404, 'w' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002664858, 'w' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.002470232, 'w' * 256 + 'h', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0030437137, 'w' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(6.55316E-4, 'w' * 256 + 'n', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0018397967, 'w' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.7667617E-4, 'w' * 256 + 'r', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.884636E-4, 'w' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.8200485E-4, 'x' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.1906983E-4, 'x' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.11666894E-4, 'x' * 256 + 'c', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2313794E-4, 'x' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2774846E-4, 'x' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.778815E-4, 'x' * 256 + 'p', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.6882623E-4, 'x' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.008689316, 'y' * 256 + ' ', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.6110689E-4, 'y' * 256 + '\'', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.0665959E-4, 'y' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0012076438, 'y' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(3.0409315E-4, 'y' * 256 + 'i', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.1341467E-4, 'y' * 256 + 'l', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.2684443E-4, 'y' * 256 + 'm', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(0.0015621613, 'y' * 256 + 'o', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(7.623623E-4, 'y' * 256 + 's', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.3243932E-4, 'y' * 256 + 't', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.3702975E-4, 'z' * 256 + 'a', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(2.9878956E-4, 'z' * 256 + 'e', 0);
		CHARBIGRAMFREQUENCIES.setAsDouble(1.0203403E-4, 'z' * 256 + 'i', 0);
	}

}
