package com.zcwork.zfc.web;


import com.zcwork.zfc.api.ResultCode;
import com.zcwork.zfc.exception.BusinessException;
import com.zcwork.zfc.mbg.mapper.EUserMapper;
import com.zcwork.zfc.mbg.model.EUser;
import com.zcwork.zfc.mbg.model.EUserExample;
import com.zcwork.zfc.pojo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLDataException;
import java.util.List;

/**
 * @author Joe Grandja
 */
@Controller
@RequestMapping("/main")
public class  MainController{


    @Autowired
    private EUserMapper eUserMapper;

    @RequestMapping("/")
    @ResponseBody
    public List<EUser> root() {
        EUserExample eUserExample = new EUserExample();


        System.out.println(eUserExample.getOredCriteria());
        return eUserMapper.selectByExample(eUserExample);


    }


    @RequestMapping(value ="/index",method = RequestMethod.POST)
    @ResponseBody
    public String index(@RequestBody @Validated  Order order) throws Exception {

            //throw new BusinessException(ResultCode.USERNAMEEXIST);

        throw new IndexOutOfBoundsException();

      //  return "index";
    }

    @RequestMapping("/user/index")
    public String userIndex() {
        return "user/index";
    }



    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }

}