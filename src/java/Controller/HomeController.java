
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jorge Rojas
 */

@Controller
public class HomeController {
    @RequestMapping("home.htm") //informa que este metodo va a ser vista
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;        
    }
    
    
}
