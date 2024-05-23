package pruebaqa.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class WaitForVisibility implements Task {

    private final Target targetToWait;
    private final Long time;

    public WaitForVisibility(Target targetToWait, Long time) {
        this.targetToWait = targetToWait;
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(targetToWait, isVisible()).forNoMoreThan(time).seconds()
        );
    }
    public static WaitForVisibility by(Target _targetToWait, Long _time){
        return instrumented(WaitForVisibility.class, _targetToWait, _time);
    }
}
