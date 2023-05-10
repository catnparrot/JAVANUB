package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyEx {
	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Temp/브로콜리너마저 (Broccoli, you too$) - 이웃에 방해가 되지 않는 선에서 (Dancing In The Moonlight).mp3";
		String targetFileName = "C:/Temp/musictest.mp3";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if(num == -1)	break;
			os.write(data, 0, num);
		}
		
		os.flush();
		os.close();
		is.close();
	}
}
