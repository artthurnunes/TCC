
package classes;

public class ClasseCatraca {
    
    private static int cd_registro;
    private static String data_entrada;
    private static String horario_entrada;
    private static String horario_saida;
    private static boolean on_off;

    public boolean isOn_off() {
        return on_off;
    }

    public void setOn_off(boolean on_off) {
        this.on_off = on_off;
    }

    public int getCd_registro() {
        return cd_registro;
    }

    public void setCd_registro(int cd_registro) {
        this.cd_registro = cd_registro;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getHorario_entrada() {
        return horario_entrada;
    }

    public void setHorario_entrada(String horario_entrada) {
        this.horario_entrada = horario_entrada;
    }

    public String getHorario_saida() {
        return horario_saida;
    }

    public void setHorario_saida(String horario_saida) {
        this.horario_saida = horario_saida;
    }
    
    
    
}
