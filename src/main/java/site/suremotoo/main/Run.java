package site.suremotoo.main;

import site.suremotoo.doc.DocToHtml;

/**
 * 项目名：doc2html
 * 包名：site.suremotoo.main
 * 类名：Run
 * 描述：
 * word 文档转html
 *
 * @author Suremotoo
 * @create 2019-02-25 17:30
 */
public class Run {

    /**
     * Run 执行该方法即可
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        DocToHtml.wordToHtml("/Users/suremotoo/Desktop/doc2html/财政部 税务总局关于企业职工教育经费税前扣除政策的通知.doc",
                "/Users/suremotoo/Desktop/doc2html/",
                "财政部 税务总局关于企业职工教育经费税前扣除政策的通知.html");
    }
}
