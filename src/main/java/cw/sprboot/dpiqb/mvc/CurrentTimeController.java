package cw.sprboot.dpiqb.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class CurrentTimeController {
  // @RequestMapping - загальна аннотація, можна налаштувать на пачку запитів
//  @RequestMapping(
//    method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE},
//    value = {"/current-time", "/another"}
//  )

//  @RequestMapping(method = RequestMethod.GET, value = "current-time")
  // А можно просто @GetMapping
  @GetMapping("/current-time")
  public ModelAndView getCurrentTime(){
    ModelAndView result = new ModelAndView("current-time");
    result.addObject("time", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    return result;
  }
}
