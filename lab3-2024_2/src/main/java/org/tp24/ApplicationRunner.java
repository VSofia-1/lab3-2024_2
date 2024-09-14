package org.tp24;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;

public class ApplicationRunner {
    public static final Logger logger = LogManager.getLogger();

    void run() {
        logger.info("aplicacion iniciada correctamente ");
    }

    //estructura de un metodo contructor en java.
    public class Cliente {
        private String numeroCedula;
        private String nombres;
        private String apellidos;
        private LocalDate fechaNacimiento;
        private String direccion;
        private double cupoMaximo;
    }

}
