package pl.codecouple.web;

import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CodeCouple.pl
 */
@RestController
class CodeCoupleController {

    private final OAuth2ClientContext clientContext;

    CodeCoupleController(OAuth2ClientContext clientContext) {
        this.clientContext = clientContext;
    }

    @GetMapping("/for-all")
    String showCodeCouple(){
        return "Code Couple!";
    }

    @GetMapping("/not-for-all")
    String showCodeCoupleAwesome(){
        return "Code Couple is awesome!";
    }

    @GetMapping("/token")
    String showToken() {
        return clientContext.getAccessToken().getValue();
    }

}
