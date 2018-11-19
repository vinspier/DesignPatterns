package Test;

public class DeleteHtml {
    public static void main(String[] args) {
        String s = "<p>1983.&nbsp; &nbsp; &nbsp; &nbsp;西泠印社80週年展</p><p>1984.85.&nbsp; 讀賣書法展新聞社賞受賞<br/></p><p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;85.&nbsp; 第17回日展特選受賞</p><p>1987.&nbsp; &nbsp; &nbsp; &nbsp;西泠印社展參加</p><p>1989.&nbsp; &nbsp; &nbsp; &nbsp;第51回謙慎展梅華賞受賞</p><p>1990.&nbsp; &nbsp; &nbsp; &nbsp;謙慎書道會常任理事推舉</p><p>1994.&nbsp; &nbsp; &nbsp; &nbsp;第26回日展特選受賞</p><p>1994.&nbsp; &nbsp; &nbsp; &nbsp;北京中國美術館篆刻藝術展</p><p>1996.&nbsp; &nbsp; &nbsp; &nbsp;日展委囑</p><p>1996.&nbsp; &nbsp; &nbsp; &nbsp;北京中國歷史博物館日、中篆刻展</p><p>";
        String newS = s.replaceAll("<.*?>","").replaceAll("&nbsp;","");
        System.out.println(newS);
    }
}
