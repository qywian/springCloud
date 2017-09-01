/**
 * @Title: [ConsumerZuulFilter.java]
 * @Package: [com.qyw.cloud.config]
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 11:10 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 11:10 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
package com.qyw.cloud.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: ConsumerZuulFilter
 * @author: [YanweiQin]
 * @CreateDate: [9/1/2017 11:10 AM]
 * @UpdateUser: [YanweiQin]
 * @UpdateDate: [9/1/2017 11:10 AM]
 * @UpdateRemark: [说明本次修改内容]
 * @Description: [TODO(用一句话描述该文件做什么)]
 * @version: [V1.0]
 */
public class ConsumerZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.DEBUG_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        return null;
    }
}
