package Test;

public class GetString {
    public static void main(String[] args) {
        String s = "万学远  冯 远  叶 明  史济煊  乔 石  刘 枫  孙家正  李从军\n" +
                "  李铁映  李瑞环  杨招棣  沈 鹏  沈者寿  张 飚  张 曦  陈敏尔\n" +
                "  邵华泽  梁平波  覃志刚  高占祥";
        String[] translate = s.split("  ");
        for(int i=0; i < translate.length; i++){
           translate[i] = translate[i].replace(" ","  ");
               System.out.print("<li>"+ translate[i]+"</li>");
        }
    }
}
