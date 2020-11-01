package org.alanlau.cor.v1;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/1 10:38
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();

        FilterChain chain = new FilterChain();
        chain.add(new HtmlFilter())
                .add(new SensitiveFilter());

        chain.doFilter(request, response);
        System.out.println(request);
        System.out.println(response);
    }
}
