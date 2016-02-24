package com.learn.se;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.renderable.RenderableImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

public class ImageUtils {
	
	public static BufferedImage genrateImage(String code) {
		
		BufferedImage bi = new BufferedImage(70, 35, BufferedImage.TYPE_INT_RGB);
		Graphics gp=bi.getGraphics();
		//gp.setColor(Color.RED);
		gp.fillRect(0, 0, 70, 35);
		gp.setColor(Color.RED);
		gp.drawString(code, 2, 33);
		return bi;
	}
	
	public static void writeImage(BufferedImage in,OutputStream os){
		try {
			ImageIO.write(in, "JPEG", os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		int i=5;
		int j=i;
		j-=3;
		System.out.println(j);
		System.out.println(i);
	}
	
}
