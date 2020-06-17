package com.liyuqi.controller;



import com.liyuqi.result.CodeMsg;
import com.liyuqi.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/demo")
public class SampleController {

    @RequestMapping("/thymeleaf")
    @ResponseBody
    public Result<String> dbGet(){
        return Result.error(CodeMsg.ACCESS_LIMIT_REACHED);
    }
}
