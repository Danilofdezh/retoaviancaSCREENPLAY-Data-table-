package com.co.avianca.questions;

import com.co.avianca.userinterfaces.ReservaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationMessage implements Question {

    @Override
    public Object answeredBy(Actor actor) { return Text.of(ReservaPage.LBL_CAPTURE_MESSAGE).viewedBy(actor).asString();}


        public static ValidationMessage compare(){
            return new ValidationMessage();


    }


}
