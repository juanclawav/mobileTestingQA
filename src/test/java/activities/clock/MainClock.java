package activities.clock;

import control.Button;
import control.Label;
import control.TextBox;
import org.openqa.selenium.By;

public class MainClock {

    public Button addAlarmBtn = new Button(By.id("com.sec.android.app.clockpackage:id/menu_alarm_add"));
    public TextBox alarmNameTb = new TextBox(By.id("com.sec.android.app.clockpackage:id/menu_alarm_add"));
    public Button selectMondays = new Button(By.id("com.sec.android.app.clockpackage:id/repeat_1"));
    public TextBox minuteSetTb = new TextBox(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.sec.android.app.clockpackage:id/sesl_timepicker_minute\"]//android.widget.EditText[@resource-id=\"com.sec.android.app.clockpackage:id/numberpicker_input\" and @text=\"00, Minute\"]"));
    public TextBox hourSetTb = new TextBox(By.id("com.sec.android.app.clockpackage:id/numberpicker_input"));
    public Button saveAlarmBtn = new Button(By.xpath("//android.widget.TextView[@resource-id=\"com.sec.android.app.clockpackage:id/navigation_bar_item_small_label_view\" and @text=\"Save\"]"));

    public Label alarmObject(String content) {
        return new Label(By.xpath("//android.widget.TextView[@text=\"" + content + "\"]"));
    }

    public Button stopwatchBtn = new Button(By.xpath("//android.widget.TextView[@resource-id=\"com.sec.android.app.clockpackage:id/title\" and @text=\"Stopwatch\"]"));
    public Button startStopwatchBtn = new Button(By.id("com.sec.android.app.clockpackage:id/stopwatch_startButton"));

    public Button stopStopwatchBtn = new Button(By.id("com.sec.android.app.clockpackage:id/stopwatch_stopButton"));

    public Button resumeStopwatchBtn = new Button(By.id("com.sec.android.app.clockpackage:id/stopwatch_resumeButton"));

    public Label stopWatchTime(String content) {
        return new Label(By.xpath("//android.view.ViewGroup[@content-desc=\"" + content + "\"]"));
    }

    public Button timerBtn = new Button(By.xpath("//android.widget.TextView[@resource-id=\"com.sec.android.app.clockpackage:id/title\" and @text=\"Timer\"]"));
    public TextBox timerSeconds = new TextBox(By.xpath("//android.widget.EditText[@resource-id=\"com.sec.android.app.clockpackage:id/numberpicker_input\" and @text=\"00, Second\"]"));
    public Button startTimerBtn = new Button(By.id("com.sec.android.app.clockpackage:id/timer_start_button"));

    public Button stopTimerBtn = new Button(By.id("com.sec.android.app.clockpackage:id/timer_pause_button"));
    public Button resumeTimerBtn = new Button(By.id("com.sec.android.app.clockpackage:id/timer_resume_button"));
}

