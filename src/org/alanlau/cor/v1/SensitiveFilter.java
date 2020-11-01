package org.alanlau.cor.v1;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

/**
 * 敏感文字过滤器
 * @author alan
 * @version 1.0
 * @date 2020/11/1 10:48
 */
public class SensitiveFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setContent(request.getContent() + " >> Sensitive过滤器");

        chain.doFilter(request, response);

        response.setContent(response.getContent() + " >> Sensitive过滤器");
    }
}
