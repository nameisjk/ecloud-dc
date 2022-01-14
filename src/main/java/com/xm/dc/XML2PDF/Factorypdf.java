package com.xm.dc.XML2PDF;

import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;

public class Factorypdf {
    private static FopFactory fopFactory = null;

    static {
        try {
            URL u= Thread.currentThread().getContextClassLoader().getResource("");
            //System.out.println(u.getPath());
            String s = URLDecoder.decode(u.getPath(), "utf-8");
            File con=new File(s+"fop.xml");
            fopFactory = FopFactory.newInstance(con);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *生成不同模板的pdf
     * @param modelmode
     * @param xmlFile
     * @param pdfpath
     * @throws Exception
     */
    public void SavetoPdf (String modelmode,String xmlFile,String pdfpath) throws Exception {
        URL u= Thread.currentThread().getContextClassLoader().getResource("");
        String s = URLDecoder.decode(u.getPath(), "utf-8");
        String xslpath=s+"templates/"+modelmode;
        try {
            ReportData data = transform(xslpath, xmlFile);
            FileOutputStream fos = new FileOutputStream(pdfpath);
            fos.write(data.getData());
            fos.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 返回一个byte数组
     * @param modelmode
     * @param xmlbyte
     * @return
     * @throws Exception
     */
    public byte[] SavetoPdfliu (String modelmode,byte[] xmlbyte) throws Exception {
        URL u= Thread.currentThread().getContextClassLoader().getResource("");
        String s = URLDecoder.decode(u.getPath(), "utf-8");
        String xslpath=s+"templates/"+modelmode;
        File xmlFile = File.createTempFile("FOP", ".tmp");
        FileOutputStream fos = new FileOutputStream(xmlFile);
        fos.write(xmlbyte);
        fos.close();
        ReportData data=new ReportData();
        try {
            data = transform(xslpath, xmlFile.getAbsolutePath());
        }catch (Exception e) {
            e.printStackTrace();
        }
        return data.getData();
    }



    /**
     * 根据xsl模板及xml数据文件生成pdf
     * @param xsltFile xsl模板
     * @param xmlFile  xml数据文件
     * @return ReportData(byte[])
     * @throws Exception
     * @author dxf 2021/12/18
     */
    private static ReportData transform(String xsltFile, String xmlFile) throws Exception {
        ReportData reportData = new ReportData();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(new File(xsltFile)));
            Source src = new StreamSource(new File(xmlFile));
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(src, res);
            reportData.setData(out.toByteArray());
        } catch (Exception e) {
            throw e;
        } finally {
            out.close();
        }
        return reportData;
    }

}
