package org.ffmpeg.avfilter;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
/**
 * <i>native declaration : libavfilter/buffersink.h:16</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avfilter") 
public class AVBufferSinkParams extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < list of allowed pixel formats, terminated by AV_PIX_FMT_NONE<br>
	 * C type : AVPixelFormat*
	 */
	@Field(0) 
	public Pointer<IntValuedEnum<AVPixelFormat > > pixel_fmts() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < list of allowed pixel formats, terminated by AV_PIX_FMT_NONE<br>
	 * C type : AVPixelFormat*
	 */
	@Field(0) 
	public AVBufferSinkParams pixel_fmts(Pointer<IntValuedEnum<AVPixelFormat > > pixel_fmts) {
		this.io.setPointerField(this, 0, pixel_fmts);
		return this;
	}
	public AVBufferSinkParams() {
		super();
	}
	public AVBufferSinkParams(Pointer pointer) {
		super(pointer);
	}
}
