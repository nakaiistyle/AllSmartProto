package jp.co.allsmart.proto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.allsmart.proto.dto.Sample;

/**
 * コントローラサンプル。
 *
 * @author Nakai
 *
 */
@Controller
@RequestMapping("/sample")
public class SampleController extends ControllerBase {

    /**
     * ロガー。
     */
    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping()
//    @RequestMapping(method=RequestMethod.GET)
    public String getSample(Model model){

        logger.debug("SampleController getSample start");

        Sample data = new Sample();
        data.setId(12345);
        data.setStr("abcde");
        model.addAttribute("data", data);

        logger.debug("SampleController getSample end");

        return "sample/index";
    }

}
