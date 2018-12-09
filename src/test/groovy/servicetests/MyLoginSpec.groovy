package servicetests

import geb.Page
import geb.spock.GebSpec
import org.openqa.selenium.By

class SignupPage extends Page {
    static url = "https://login.yahoo.com/?.src=ym&.partner=none&.lang=de-DE&.intl=de&authMechanism=primary&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3F.intl%3Dde%26.lang%3Dde-DE%26.partner%3Dnone%26.src%3Dfp&eid=100&add=1"
}

class MyLoginSpec extends GebSpec{



    def 'when login then ok'(){

        when:
         to SignupPage

        and:
        $('form').username = "DEIN-BENUTZERNAME"

        and:
        $('#login-signin').click()

        and:
        Thread.sleep(2000)

        and:
        $('form').password = "DEIN-PASSWORT"

        and:
        $('#login-signin').click()

        and:
        Thread.sleep(3000)

        then:
        assert $(By.className('G_e J_x o_h H_6FIA')).value() == 'Posteingang'
    }
}
