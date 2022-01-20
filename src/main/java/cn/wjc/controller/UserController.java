/**
 * @autheor: Mason
 * @date:2022/1/18 14:28
 */

package cn.wjc.controller;

import cn.wjc.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 测试JSON数据
     * @return 对象JSON
     */
    @GetMapping
    public User getUser(){
        return User.builder()
                .sex("nan")
                .age(21)
                .id(117481L)
                .name("zhangsang")
                .build();
    }

}
