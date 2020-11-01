package org.alanlau.cor;

/**
 * 模拟Servlet响应
 *
 * @author alan
 * @version 1.0
 * @date 2020/11/1 10:39
 */
public class Response {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Response{" +
                "content='" + content + '\'' +
                '}';
    }
}
