package keyPoint1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AmountConverter {
	
		private int number1;
	
		private static final String[] UNITS = { "", "ONE", "TWO ", "THREE ",
		    "FOUR ", "FIVE ", "SIX", "SEVEN ", "EIGHT ", "NINE ", "TEN ",
		    "ELEVEN ", "TWELVE", "THIRTEEN ", "FOURTEEN ", "FIFTEEN ", "SIXTEEN ",
		    "SEVENTEEN ", "EIGHTEEN ", "NINETEEN " };

	    private static final String[] DECENS = { "TWENTY", "THIRTY ", "FOURTY ",
		    "FIFTY ", "SIXTY ", "SEVENTY ", "EIGHTY ", "NINTY " };
	    
	    private static final String[] HUNDRES = { "ONE HUNDRED", "TWO HUNDRED ",
	    		"THREE HUNDRED ", "FOUR HUNDRED ", "FIVE HUNDRED ", "ONE HUNDRED ", "SIX HUNDRED ",
	    		"SEVEN HUNDRED ", "EIGHT HUNDRED ", "NINE HUNDRED " };

	    
	   
	    public static String convertNumberToLetter(String number){
		number = number.replaceAll("[.]", "").replaceAll(",", ".");
		return convertNumberToLetter(Double.parseDouble(number));
	    }

	  
	    public static String convertNumberToLetter(double doubleNumber){

		StringBuilder converted = new StringBuilder();

		String patternThreeDecimalPoints = "#.###";

		DecimalFormat format = new DecimalFormat(patternThreeDecimalPoints);
		format.setRoundingMode(RoundingMode.DOWN);

		String formatedDouble = format.format(doubleNumber);
		formatedDouble = formatedDouble.replaceAll("[.]", "").replaceAll(",",
			".");
		doubleNumber = Double.parseDouble(formatedDouble);

		
		if (doubleNumber < 0) {
		    throw new NumberFormatException("The number must be positive");
		}

		String splitNumber[] = String.format("%.2f", doubleNumber)
			.replace(',', '#').split("#");

		
		int millon = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
			8))
			+ String.valueOf(getDigitAt(splitNumber[0], 7))
			+ String.valueOf(getDigitAt(splitNumber[0], 6)));
		if (millon == 1) {
		    converted.append("ONE MILLON ");
		} else if (millon > 1) {
		    converted.append(convertNumber(String.valueOf(millon))
			    + "MILLONS ");
		}

		
		int thousands = Integer.parseInt(String.valueOf(getDigitAt(splitNumber[0],
			5))
			+ String.valueOf(getDigitAt(splitNumber[0], 4))
			+ String.valueOf(getDigitAt(splitNumber[0], 3)));
		if (thousands == 1) {
		    converted.append("THOUSAND ");
		} else if (thousands > 1) {
		    converted.append(convertNumber(String.valueOf(thousands)) + "THOUSANDS ");
		}

		
		int hundreds = Integer.parseInt(String.valueOf(getDigitAt(
			splitNumber[0], 2))
			+ String.valueOf(getDigitAt(splitNumber[0], 1))
			+ String.valueOf(getDigitAt(splitNumber[0], 0)));
		if (hundreds == 1) {
		    converted.append("ONE ");
		}

		if (millon + thousands + hundreds == 0) {
		    converted.append("ZERO ");
		}
		if (hundreds > 1) {
		    converted.append(convertNumber(String.valueOf(hundreds)));
		}

		converted.append("DOLLARS");

		
		int cents = Integer.parseInt(String.valueOf(getDigitAt(
			splitNumber[1], 2))
			+ String.valueOf(getDigitAt(splitNumber[1], 1))
			+ String.valueOf(getDigitAt(splitNumber[1], 0)));
		if (cents == 1) {
		    converted.append(" WITH ONE CENT");
		} else {
		    converted.append(" WITH " + convertNumber(String.valueOf(cents))
		    + "CENTS");
		}

		return converted.toString();
	    }

	    
	    private static String convertNumber(String number) {

		if (number.length() > 3) {
		    throw new NumberFormatException(
			    "The maximum length must be three digits");
		}

		// Caso especial con el 100
		if (number.equals("100")) {
		    return "THOUSAND ";
		}

		// Caso especial con el 0
		if (number.equals("0")) {
		    return "ZERO ";
		}
		if (number.equals("00")) {
		    return "ZERO ";
		}
		if (number.equals("000")) {
		    return "ZERO ";
		}

		StringBuilder output = new StringBuilder();
		if (getDigitAt(number, 2) != 0) {
		    output.append(HUNDRES[getDigitAt(number, 2) - 1]);
		}

		int k = Integer.parseInt(String.valueOf(getDigitAt(number, 1))
			+ String.valueOf(getDigitAt(number, 0)));

		if (k <= 20) {
		    output.append(UNITS[k]+ " ");
		} else if (k > 30 && getDigitAt(number, 0) != 0) {
		    output.append(DECENS[getDigitAt(number, 1) - 2] + "AND "
			    + UNITS[getDigitAt(number, 0)]);
		} else {
		    output.append(DECENS[getDigitAt(number, 1) - 2]+ " "
			    + UNITS[getDigitAt(number, 0)]);
		}

		return output.toString();
	    }

	    /**
	     * Retorna el digito numerico en la posicion indicada de derecha a izquierda
	     *
	     * @param origin
	     *            Cadena en la cual se busca el digito
	     * @param position
	     *            Posicion de derecha a izquierda a retornar
	     * @return Digito ubicado en la posicion indicada
	     */
	    private static int getDigitAt(String origin, int position) {
		if (origin.length() > position && position >= 0) {
		    return origin.charAt(origin.length() - position - 1) - 48;
		}
		return 0;
	    }
}


