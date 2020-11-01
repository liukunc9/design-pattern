package org.alanlau.cor;

/**
 * 模拟servlet 请求
 * @author alan
 * @version 1.0
 * @date 2020/11/1 15:06
 */
public class Request {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Request{" +
                "content='" + content + '\'' +
                '}';
    }
}
