import java.io.*;

/**
 * @program: RandomDigit
 * @description:
 * @author: Hu Yingjun
 * @create: 2020-01-14 14:33
 **/
public class PicCopy  {
    public static void main(String[] args) throws IOException {
        //复制文本——创建缓冲字符流
        BufferedReader br = new BufferedReader(new FileReader("e:\\study\\123.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\study\\456.txt"));
        String content = "";
        String line;
        while((line = br.readLine())!=null) {
            content += line;
        }
        bw.write(content);
        bw.close();
        br.close();
        //复制图片——创建缓冲字节流
        File oldfile = new File("e:\\study\\头像.jpg");
        File newfile =new File("e:\\study\\123.jpg");
        InputStream is = new FileInputStream(oldfile);
        OutputStream os =new FileOutputStream(newfile);
        BufferedInputStream bis = new BufferedInputStream(is);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        int bytes;
        while((bytes=bis.read())!=-1){
            bos.write(bytes);
        }
        bos.close();
        bis.close();
        os.close();
        is.close();
    }
}
