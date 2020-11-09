package kh.chaptes11_IO.kh.io.subStream.obj.run;

import kh.chaptes11_IO.kh.io.subStream.obj.model.dao.TestObjectStream;

public class Main {

	public static void main(String[] args) {
		TestObjectStream tos = new TestObjectStream();
		
		tos.fileSave();
		tos.fileOpen();
		
	}

}
