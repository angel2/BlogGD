package com.beingjavaguys.interceptors;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * Created by angel on 26/05/15.
 */
public class collaboratorInterceptor  extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null &&
                session.getAttribute("role") != null && (
                session.getAttribute("role").equals("admin") ||
                session.getAttribute("role").equals("collaborator") )
                ) {
            return true;
        }
        else {
            response.sendRedirect("../listPost");
            return false;
        }
    }
}
