package io.jpress.web.front;

import io.jboot.web.controller.annotation.RequestMapping;
import io.jpress.web.base.TemplateControllerBase;
import io.jpress.web.handler.JPressHandler;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jpress.web
 */
@RequestMapping("/")
public class IndexController extends TemplateControllerBase {


    public void index() {

        if ("/".equals(JPressHandler.getCurrentTarget())) {
            render("index.html");
            return;
        }


        forwardAction("/page");
    }


}
