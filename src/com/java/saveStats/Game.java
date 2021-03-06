//----------------------------------------------------------------------------------------------------------------------------------------------------
package com.java.saveStats;

import java.io.Serializable;

//----------------------------------------------------------------------------------------------------------------------------------------------------

/**
 * Desarrollado por Jhonny Trejos Barrios.
 * Tecnologia: Java.
 * Version: Java Development Kit 1.7.0_21, Standard Edition.
 * Entorno De Desarrollo: IntelliJ IDEA 12.1.6
 * Fecha: 27/02/14,  Hora: 14:32 Hrs.
 * ---------------------------------------------------------------------------------------------------------------------------------------------------
 * ---------------------------------------------------------------------------------------------------------------------------------------------------
 * Informacion Adicional.
 *
 * Objetivo Del Codigo:
 * Objeto 'Serializable' con la tarea de capturar los datos estadisticos por juego ganado; Este objeto sera guardado
 * en un archivo binario para futuras consultas.
 *
 * Licencia: Personal, no comercial.
 * Developer Contact: jtrejosb@live.com || jtrejosb@gmail.com
 */

//----------------------------------------------------------------------------------------------------------------------------------------------------

public class Game implements Serializable {
    String date, time;
    int movements, cheats;
    //------------------------------------------------------------------------------------------------------------------------------------------------

    public Game( String date, String time, int movements, int cheats ) {
        this.date = date;
        this.time = time;
        this.movements = movements;
        this.cheats = cheats;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------

    public String getDate() {
        return date;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------

    public String getTime() {
        return time;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------

    public int getMovements() {
        return movements;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------

    public int getCheats() {
        return cheats;
    }
    //------------------------------------------------------------------------------------------------------------------------------------------------
}
//----------------------------------------------------------------------------------------------------------------------------------------------------