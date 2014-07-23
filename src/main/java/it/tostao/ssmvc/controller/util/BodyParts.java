package it.tostao.ssmvc.controller.util;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Slawomir Leski <s.leski@e-media.de>
 *
 */

@Controller
@RequestMapping("/parts")
public class BodyParts {

    private static final Logger LOG = LoggerFactory.getLogger(BodyParts.class);

    /**
     * Head.
     * @return
     */
    @RequestMapping(value = {"/headHtml" }, method = RequestMethod.GET)
    public ModelAndView htmlHead() {
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    /**
     * Header
     */
    @RequestMapping(value = {"/header" }, method = RequestMethod.GET)
    public ModelAndView bodyHeader(Principal principal) {
        LOG.debug("header");
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    /**
     * Footer.
     * @return
     */
    @RequestMapping(value = {"/footer" }, method = RequestMethod.GET)
    public ModelAndView footer() {
        LOG.debug("footer");
        ModelAndView mav = new ModelAndView();
        return mav;
    }
}


