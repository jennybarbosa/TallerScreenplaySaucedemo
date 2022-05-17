package com.saucedemo.testing.tasks;

import com.saucedemo.testing.utils.Constants;
import com.saucedemo.testing.utils.ExcelUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.saucedemo.testing.userinterfaces.SaucedemoPages.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class CheckOutTask implements Task {

    static ExcelUtils excelUtils = new ExcelUtils();
    static String excelFilePath = Constants.Path_TestData + Constants.File_TestData;

    @Override
    public <T extends Actor> void performAs(T actor) {

        //Abre y lee el archivo excel
        try {
            excelUtils.setExcelFile(excelFilePath, Constants.Sheet_TestData);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //Actor intenta obtener e ingresar la data del archivo excel
        actor.attemptsTo(Enter.theValue(excelUtils.getCellData(1,2)).into(INP_FIRST_NAME),
                Enter.theValue(excelUtils.getCellData(1,3)).into(INP_LAST_NAME),
                Enter.theValue(excelUtils.getCellData(1,4)).into(INP_POSTAL_CODE));

        //Actor intenta dar click en el botón Continue
        actor.attemptsTo(Click.on(BTN_CONTINUE), Click.on(BTN_FINISH));
    }
    //Constructor
    public static CheckOutTask doCheckOut(){
        return Tasks.instrumented(CheckOutTask.class);
    }

}
