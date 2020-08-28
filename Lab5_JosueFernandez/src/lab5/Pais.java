package lab5;

import java.awt.Color;
import java.util.Date;

public class Pais {
    
    private String nombrePais;
    private Date fechaFundacion;
    private String himnoNacional;
    private Color colorBandera;

    public Pais() {
    }

    public Pais(String nombrePais, Date fechaFundacion, String himnoNacional, Color colorBandera) {
        this.nombrePais = nombrePais;
        this.fechaFundacion = fechaFundacion;
        this.himnoNacional = himnoNacional;
        this.colorBandera = colorBandera;
    }

    public Color getColorBandera() {
        return colorBandera;
    }

    public void setColorBandera(Color colorBandera) {
        this.colorBandera = colorBandera;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String getHimnoNacional() {
        return himnoNacional;
    }

    public void setHimnoNacional(String himnoNacional) {
        this.himnoNacional = himnoNacional;
    }

    @Override
    public String toString() {
        return nombrePais;
    }
    
}
