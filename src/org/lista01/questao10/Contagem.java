package org.lista01.questao10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Contagem {
    public static int[] caracteres(String cadeiaCaracteres) {

        Pattern patternVogais = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Matcher matcherVogais = patternVogais.matcher(cadeiaCaracteres);

        Pattern patternEspacos = Pattern.compile("\\s");
        Matcher matcherEspacos = patternEspacos.matcher(cadeiaCaracteres);

        Pattern patternConsoante = Pattern.compile("[bcdfghjklmnpqrstvwxyz]", Pattern.CASE_INSENSITIVE);
        Matcher matcherConsoante = patternConsoante.matcher(cadeiaCaracteres);

        int countVogais = 0;
        int countEspacos = 0;
        int countConsoantes = 0;

        while (matcherVogais.find()) {
            countVogais++;
        }

        while (matcherEspacos.find()) {
            countEspacos++;
        }

        while (matcherConsoante.find()) {
            countConsoantes++;
        }

        return new int[] { countVogais, countEspacos, countConsoantes };
    }
}
