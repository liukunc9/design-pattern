package org.alanlau.cor.v2;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

/**
 * 过滤器
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/1 10:46
 */
public interface Filter {
    /**
     * 过滤器方法
     * @param request 请求
     * @param response 响应
     * @param chain 过滤器链
     */
    void doFilter(Request request, Response response, FilterChain chain);
}
