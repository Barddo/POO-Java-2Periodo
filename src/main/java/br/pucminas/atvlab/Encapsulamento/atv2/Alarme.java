package br.pucminas.atvlab.Encapsulamento.atv2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Alarme
 */
public class Alarme {
    /**
     * Ser programado para hora e minuto determinados; • Ser programado para
     * despertar em quaisquer combinações de dias da semana; • Ser desprogramado
     * (cancelar a programação para despertar); • Ser adiado (função soneca) por
     * cinco minutos a partir da hora em que despertar; • Lembre-se de que deve
     * haver um método para verificar se é hora de despertar, recebendo hora, minuto
     * e dia da semana como parâmetros.
     */
    private final GregorianCalendar data;

    public Alarme(String nome, String data) {
        int[] datas = StringToData(data);
        this.data = new GregorianCalendar();
        this.data.set(Calendar.HOUR_OF_DAY, datas[0]);
        this.data.set(Calendar.MINUTE, datas[1]);
        this.data.set(Calendar.SECOND, datas[2]);
    }

    public void soneca() {
        this.data.set(Calendar.MINUTE, this.data.get(Calendar.MINUTE) + 5);
    }

    public int[] StringToData(String data) {
        int[] datas = new int[3];
        for (int i = 0; i < datas.length; i++) {
            datas[i] = Integer.parseInt(data.split("/")[i]);
        }
        return datas;
    }

    public int[] StringToTime(String data) {
        int[] datas = new int[3];
        for (int i = 0; i < datas.length; i++) {
            datas[i] = Integer.parseInt(data.split(":")[i]);
        }
        return datas;
    }

    public void cancelar() {
        data.clear();
    }

}
