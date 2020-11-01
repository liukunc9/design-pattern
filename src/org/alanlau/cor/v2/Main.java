package org.alanlau.cor.v2;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/1 15:49
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();

        FilterChain chain1 = new FilterChain();
        chain1.add(new HtmlFilter());

        FilterChain chain2 = new FilterChain();
        chain2.add(new SensitiveFilter());

        // 这种过滤器链的实现方式相较与上一种， add 方法支持添加 过滤器链
        chain1.add(chain2);

        chain1.doFilter(request, response, chain1);
        System.out.println(request);
        System.out.println(response);
    }
}
