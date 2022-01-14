package com.xm.dc.service;

/**
 * 生成pdfservice,Autowired 无法注入，没有bean,这个直接类的静态方法就行
 */
public interface CreatPdfService {

    String CreatPdf(String modelmode,String xmlpath,String pdfpath) throws Exception;
    byte[] CreatPdfliu(String modelmode,byte[] xmlbyte) throws Exception;
}
