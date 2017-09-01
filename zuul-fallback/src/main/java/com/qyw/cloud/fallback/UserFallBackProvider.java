/**
 * @Title: [UserFallBackProvider.java]
 * @Package: [com.qyw.cloud.fallback]
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 05:39 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 05:39 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * @ClassName: UserFallBackProvider
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 05:39 PM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 05:39 PM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
public class UserFallBackProvider implements ZuulFallbackProvider {
    @Override
    public String getRoute() {
        //那个微服务提供回退
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException {
                return getStatusCode().getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("用户微服务不可用，请稍后再试.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application", "json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }
        };
    }
}
