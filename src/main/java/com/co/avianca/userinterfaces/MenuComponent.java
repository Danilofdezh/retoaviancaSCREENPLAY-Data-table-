package com.co.avianca.userinterfaces;

import com.co.avianca.tasks.ManageReservations;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuComponent {

    public static final Target BTN_GESTIONA_RESERVA = Target.the("da clic al boton gestiona tu reserva")
            .located(By.xpath("//a[@id = 'misviajes']"));




}