package org.alanlau.cor.v2;

import org.alanlau.cor.Request;
import org.alanlau.cor.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器链
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/1 15:46
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filters.size()) {
            return;
        }
        filters.get(index++).doFilter(request, response, chain);
    }
}
