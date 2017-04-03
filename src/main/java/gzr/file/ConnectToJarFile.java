package gzr.file;

import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.jar.Manifest;

/**
 * ���ӵ�jar�ļ�����ȡmanifest�ļ�
 * @author zengrong.gzr
 * @date 2017/03/22
 */
public class ConnectToJarFile {
    public static void main(String[] args) throws IOException {
        //�����Ǿ���·�� �����~/IdeaProjects����ʽ�����
        URL url = new URL("jar:file:/Users/gaozengrong/IdeaProjects/helloworld/target/helloworld-1.0-SNAPSHOT.jar!/");
        JarURLConnection jarConnection = (JarURLConnection)url.openConnection();
        Manifest manifest = jarConnection.getManifest();
        System.out.println(manifest);
    }
}

