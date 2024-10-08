package org.lista01.questao05;

public class DiaDaSemana {
    public static String Converte (int dia) {
        String[] diasDaSemana = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };
        if (dia <= 7 && dia >= 1) {
            return diasDaSemana[dia - 1];
        }
        return "Valor incompativel com o calendario semanal";
    }
}
