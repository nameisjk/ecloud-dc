package com.xm.dc.controller;




import com.xm.dc.service.impl.CreatPdfServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URLDecoder;


@RestController
@RequestMapping("/pdf")
public class CPdfController {

    private CreatPdfServiceImpl creatpdf=new CreatPdfServiceImpl();

    @PostMapping("/cpdf.do")
    @ResponseBody
    public String cpdf(String code,String xmlpath,String pdfpath) throws Exception {
        // http://localhost:8080/dc/pdf/cpdf.do
        String c = URLDecoder.decode(code, "utf-8");
        String x = URLDecoder.decode(xmlpath, "utf-8");
        String p = URLDecoder.decode(pdfpath, "utf-8");
        String time=creatpdf.CreatPdf(c,x,p);

        return "生成时间： "+time+"秒";
    }

    @PostMapping("/cpdf.liu")
    @ResponseBody
    public byte[] pdfliu(String code,byte[] xml) throws Exception {
        // http://localhost:8080/dc/pdf/cpdf.liu
        byte[] out=null;
        String c = URLDecoder.decode(code, "utf-8");
        out=creatpdf.CreatPdfliu(c,xml);
        return out;
    }



    @RequestMapping("/cpdf")
    @ResponseBody // spring mvc返回ajax json格式数据的注解
    public String cpdf()  {
        // http://localhost:8080/dc/pdf/cpdf.do

        return "http://localhost:8080/dc/pdf/cpdf.do";
    }
}
