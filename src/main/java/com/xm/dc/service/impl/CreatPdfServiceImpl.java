package com.xm.dc.service.impl;

import com.xm.dc.XML2PDF.Factorypdf;
import com.xm.dc.service.CreatPdfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * 生成pdf 方法实现
 */
public class CreatPdfServiceImpl  implements CreatPdfService {

    private Factorypdf fpdf=new Factorypdf();
    private static final Logger logger = LoggerFactory.getLogger(CreatPdfServiceImpl.class.getName());

    @Override
    public String CreatPdf(String modelmode, String xmlpath, String pdfpath) throws Exception {
        long starttime=System.currentTimeMillis();
        fpdf.SavetoPdf(modelmode,xmlpath,pdfpath);
        long entime = System.currentTimeMillis();
        BigDecimal btime=new BigDecimal((entime-starttime));
        BigDecimal time=btime.divide(new BigDecimal("1000"),3,BigDecimal.ROUND_DOWN);
        logger.debug("生成用时： "+time.toString());
        return time.toString();
    }


    @Override
    public byte[] CreatPdfliu(String modelmode, byte[] xmlpath) throws Exception {
        byte[] out=null;
        long starttime=System.currentTimeMillis();
        out=fpdf.SavetoPdfliu(modelmode,xmlpath);
        long entime = System.currentTimeMillis();
        BigDecimal btime=new BigDecimal((entime-starttime));
        BigDecimal time=btime.divide(new BigDecimal("1000"),3,BigDecimal.ROUND_DOWN);
        return out;
    }

    public static void main(String[] args) throws Exception {
        /*Factorypdf fpdf=new Factorypdf();

        String c = URLDecoder.decode("Sample.xsl", "utf-8");
        String x = URLDecoder.decode("D:/Sample.xml", "utf-8");
        String p = URLDecoder.decode("D:/Sample.pdf", "utf-8");

        fpdf.SavetoPdf(c,x,p);*/
        long b=new Long(1000);
        long c=new Long(846);
        BigDecimal btime=new BigDecimal(c);
        BigDecimal miao=new BigDecimal(b);
        System.out.println(btime);
        BigDecimal time=btime.divide(miao,3,BigDecimal.ROUND_DOWN);
        System.out.println(time);
    }
}
