package pruebaqa.certification.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class WaitForElement implements Task {
    private final Target targetToWait;
    private final Long time;

    public WaitForElement(Target targetToWait, Long time) {
        this.targetToWait = targetToWait;
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(targetToWait, isPresent()).forNoMoreThan(time).seconds()
        );
    }
    public static WaitForElement by(Target _targetToWait, Long _time){
        return instrumented(WaitForElement.class, _targetToWait, _time);
    }
}
