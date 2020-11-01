package org.alanlau.cor.v1;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

/**
 * html脚本过滤器
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/1 10:47
 */
public class HtmlFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setContent(request.getContent() + " >> Html过滤器");

        chain.doFilter(request, response);

        response.setContent(response.getContent() + " >> Html过滤器");
    }
}
