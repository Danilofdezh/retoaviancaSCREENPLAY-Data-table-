package com.co.avianca.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservaPage {

    public static final Target TEXT_NUMERO_RESERVA = Target.the("ingresa el numero de reserva")
            .located(By.id("numeroReserva"));
    public static final Target TEXT_APELLIDOS_PASAJERO = Target.the("ingresa el apellido del pasajero")
            .located(By.id("apellidoReserva"));
    public static final Target BTN_CONTINUAR = Target.the("presione el boton continuar")
            .locatedBy("//input[@class = 'btn primary boton-submit rojo']");
    public static final Target LBL_CAPTURE_MESSAGE = Target.the("capture mensaje de confirmación")
            .located(By.id("descError-dataValidation"));
}
