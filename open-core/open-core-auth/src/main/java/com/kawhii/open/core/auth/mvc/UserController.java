/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.kawhii.open.core.auth.mvc;

import com.kawhii.open.core.auth.feign.FeignWikiServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * 当前用户
 *
 * @author Carl
 * @since 1.0.0
 */
@RequestMapping("/me")
@Controller
public class UserController {

    @Autowired
    private FeignWikiServer wikiServer;

    //通过oauth2，采用access_token才能获取到当前数据
    @ResponseBody
    @RequestMapping("")
    public Principal getPhotoServiceUser(Principal principal) {
        return principal;
    }


    //通过表单登录才能获取到数据
    @ResponseBody
    @RequestMapping("/info")
    public Principal getUserInfo(Principal principal) {
        return principal;
    }

    @RequestMapping("wiki/{name}")
    @ResponseBody
    public String wikiName(@PathVariable String name) {
        return "wikiName:" + wikiServer.name(name);
    }
}
