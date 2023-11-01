package testSuite;

import activities.clock.MainClock;
import control.Label;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

public class Clocktest {
    MainClock mainClock = new MainClock();
    String hours = "17";
    String minutes = "29";
    @Test
    public void verifyAddAlarm() throws InterruptedException{
        mainClock.addAlarmBtn.click();
        mainClock.hourSetTb.click();
        mainClock.hourSetTb.setText(hours);
        mainClock.minuteSetTb.click();
        mainClock.minuteSetTb.setText(minutes);
        mainClock.selectMondays.click();
        mainClock.saveAlarmBtn.click();
        String time = hours+":"+minutes;
        Label createdAlarm = mainClock.alarmObject(time);
        Assertions.assertTrue(createdAlarm.isControlDisplayed(),  "ERROR No se pudo crear la alarma");
    }
    @Test
    public void verifyStopwatchTest() throws InterruptedException{
        mainClock.stopwatchBtn.click();
        mainClock.startStopwatchBtn.click();
        Thread.sleep(2000);
        mainClock.stopStopwatchBtn.click();
        Assertions.assertTrue(mainClock.resumeStopwatchBtn.isControlDisplayed(),  "ERROR No se pudo usar el cronometro correctamente");
    }
    @Test
    public void verifyTimer() throws InterruptedException{
        mainClock.timerBtn.click();
        mainClock.timerSeconds.click();
        mainClock.timerSeconds.setText("30");
        mainClock.startTimerBtn.click();
        mainClock.stopTimerBtn.click();

        Assertions.assertTrue(mainClock.resumeTimerBtn.isControlDisplayed(),  "ERROR No se pudo usar el temporizador");
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeApp();
    }

}

