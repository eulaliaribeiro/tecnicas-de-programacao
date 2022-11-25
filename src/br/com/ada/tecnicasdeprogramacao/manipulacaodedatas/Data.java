package br.com.ada.tecnicasdeprogramacao.manipulacaodedatas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Data {
    public static void main(String[] args) {

        // Instanciando objetos - método now()

        LocalDate data = LocalDate.now();
        LocalTime horario = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.of(data, horario);
        System.out.println("Data e hora usando LocalDateTime.of(data, horario): " + dataHora);

        dataHora = LocalDateTime.now();
        System.out.println("Data e hora usando LocalDateTime.now(): " + dataHora);

        LocalDate testeData = LocalDate.of(2022, 12, 1);
        LocalTime testeHora = LocalTime.of(12,56);
        LocalDateTime testeDataHora = LocalDateTime.of(2022, 8, 19, 5, 32);

        System.out.println("Data usando LocalDate.of(ano, mes, dia) " + testeData);
        System.out.println("Hora usando LocalTime.of(hora, minuto) " + testeHora);
        System.out.println("Data e hora usando LocalDateTime.of(ano, mes, dia, hora, minuto) " + testeDataHora);
    }
}
