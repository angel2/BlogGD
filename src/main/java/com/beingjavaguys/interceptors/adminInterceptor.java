package com.beingjavaguys.interceptors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * Created by angel on 26/05/15.
 */
public class adminInterceptor  extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("role") != null && session.getAttribute("role").equals("admin")) {
            return true;
        }
        else {
            response.sendRedirect("../listPost");
            return false;
        }
    }
}
