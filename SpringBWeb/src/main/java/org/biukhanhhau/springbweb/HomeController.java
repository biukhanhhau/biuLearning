package org.biukhanhhau.springbweb;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("head")
    public String header(){
        return "HELLO, I AM IS HEADER </3";
        //See it's useful in studentShow.jsp
        //Can be used for a lot of request conveniently
    }

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/cal")
    public String cal(@RequestParam("num1") int num, int num2, Model model){
        //        use @RequestParam() for setting para name
        //can use HttpSession session instead of Model model, but life cycle HttpSession will longer, so that it need more space compare to Model
        int sum = num + num2;
        System.out.println(sum);
        // session.setAttribute("result", sum);
        model.addAttribute("resultt", sum);
        //want to call result but more complex =)) <%= session.getAttribute("result")%>
        return "result";
        //basically we ll add .jsp but we config-ed it in application.properties(prefix), so never mind
        //if wanna move file jsp to another file which is not webapp, need to add url into suffix
    }

//    @RequestMapping("/cal")
//    public ModelAndView cal(@RequestParam("num1") int num, int num2, ModelAndView mv){
//        int sum = num + num2;
//        mv.addObject("resultt", sum);
//        mv.setViewName("result");
//        //this one use for opening jsp
//        return mv;
//    }

    @RequestMapping("/studentInfo")
    public String studentInfo(@ModelAttribute Student student){
                            //This one is optional,
        return "studentShow";
    }

    @RequestMapping("/studentTake")
    public String studentTake(){
        return "studentTake";
    }
}
