package com.wlz.java.chapterEighteen_IOSystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class PathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = FileSystems.getDefault().getPath("d:\\FileTest", "file.txt");
		System.out.println(p.getNameCount());// 2
		// ���path�ĵڶ��ַ���
		File fl = new File("d:\\FileTest\\file.txt");
		Path pl = fl.toPath();
		System.out.println(p.equals(pl));// true
		// ���path�ĵ����ַ���
		Path p3 = Paths.get("d:\\FileTest\\file.txt");
		System.out.println(p3.toString());// d:\FileTest\file.txt

		if (Files.isReadable(p3)) {
			System.out.println("it is readable");
		} else {
			System.out.println("it is unreadable");
		}
		moveFile();
		fileAttributes();
		createDirectory();

	}

	// Files.move()
	// path.getParent().resolve()
	public static void moveFile() {
		Path from = Paths.get("d:\\FileTest", "abc.txt");
		Path to = from.getParent().resolve("test\\def.txt");

		try {
			System.out.println(Files.size(from));
			Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ƶ��ļ�����" + e.getMessage());
		}

	}

	// Files.isDirectory()
	// Files.readAttribute()
	public static void fileAttributes() {
		Path p = Paths.get("d:\\FileTest");
		System.out.println(Files.isDirectory(p, LinkOption.NOFOLLOW_LINKS));
		try {
			BasicFileAttributes attr = Files.readAttributes(p,
					BasicFileAttributes.class);
			System.out.println(attr.isDirectory());
			System.out.println(new Date(attr.lastModifiedTime().toMillis())
					.toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void createDirectory() {
		Path p = Paths.get("d:\\FileTest\\aaa");
		try {
			if (Files.notExists(p)) {

				Files.createDirectory(p);
			}else{
				System.out.println("dir exists");
			}
			Path a = p.resolve("A.java");
			Path b = p.resolve("b.java");
			Path c = p.resolve("c.java");
			Path d = p.resolve("d.java");
			Files.createFile(a);
			Files.createFile(b);
			Files.createFile(c);
			Files.createFile(d);
			//������������
			DirectoryStream<Path> paths = Files.newDirectoryStream(p);
			for(Path pp:paths){
				System.out.println(p.getFileName());
			}
			System.out.println();
			//����һ�����й������������ļ�����txt��β���ļ�
			DirectoryStream<Path> pathFilter = Files.newDirectoryStream(p,".{java,txt}");
			for(Path pf:pathFilter){
				System.out.println(pf.getFileName());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
