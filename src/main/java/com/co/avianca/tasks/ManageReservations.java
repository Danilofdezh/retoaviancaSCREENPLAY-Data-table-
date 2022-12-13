package com.co.avianca.tasks;

import com.co.avianca.models.Data;
import com.co.avianca.userinterfaces.MenuComponent;
import com.co.avianca.userinterfaces.ReservaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ManageReservations implements Task {
    Data dataReserva;

    public ManageReservations(Data dataReserva) {
        this.dataReserva = dataReserva;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_GESTIONA_RESERVA));
        actor.attemptsTo(Enter.theValue(dataReserva.getNumeroreserva()).into(ReservaPage.TEXT_NUMERO_RESERVA));
        actor.attemptsTo(Enter.theValue(dataReserva.getApellidospasajero()).into(ReservaPage.TEXT_APELLIDOS_PASAJERO));
        actor.attemptsTo(Click.on(ReservaPage.BTN_CONTINUAR));


    }

    public static ManageReservations Click(Data dataReserva){
        return Tasks.instrumented(ManageReservations.class, dataReserva);
    }
}
