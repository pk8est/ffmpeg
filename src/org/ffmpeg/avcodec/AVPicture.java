package org.ffmpeg.avcodec;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : ./libavcodec/avcodec.h:2366</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVPicture extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < pointers to the image data planes<br>
	 * C type : uint8_t*[8]
	 */
	@Array({8}) 
	@Field(0) 
	public Pointer<Pointer<Byte > > data() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < number of bytes per line<br>
	 * C type : int[8]
	 */
	@Array({8}) 
	@Field(1) 
	public Pointer<Integer > linesize() {
		return this.io.getPointerField(this, 1);
	}
	public AVPicture() {
		super();
	}
	public AVPicture(Pointer pointer) {
		super(pointer);
	}
}
