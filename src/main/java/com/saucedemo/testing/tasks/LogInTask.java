package com.saucedemo.testing.tasks;
import com.saucedemo.testing.utils.Constants;
import com.saucedemo.testing.utils.ExcelUtils;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.saucedemo.testing.userinterfaces.SaucedemoPages.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LogInTask implements Task {
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

        //Actor fue capaz de ingresar los valores, y hacer clic en login
        actor.wasAbleTo(Enter.theValue(excelUtils.getCellData(1,0)).into(INP_USERNAME),
        Enter.theValue(excelUtils.getCellData(1,1)).into(INP_PASSWORD),
        Click.on(BTN_LOGIN));


    }
    //Constructor
    public  static LogInTask logInTask(){
        return Tasks.instrumented(LogInTask.class);
    }
}
