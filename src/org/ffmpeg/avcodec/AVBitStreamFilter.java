package org.ffmpeg.avcodec;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.util.DefaultParameterizedType;
/**
 * <i>native declaration : ./libavcodec/avcodec.h:3520</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avcodec") 
public class AVBitStreamFilter extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : const char* */
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const char* */
	@Field(0) 
	public AVBitStreamFilter name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	@Field(1) 
	public int priv_data_size() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public AVBitStreamFilter priv_data_size(int priv_data_size) {
		this.io.setIntField(this, 1, priv_data_size);
		return this;
	}
	/** C type : filter_callback* */
	@Field(2) 
	public Pointer<AVBitStreamFilter.filter_callback > filter() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : filter_callback* */
	@Field(2) 
	public AVBitStreamFilter filter(Pointer<AVBitStreamFilter.filter_callback > filter) {
		this.io.setPointerField(this, 2, filter);
		return this;
	}
	/** C type : close_callback* */
	@Field(3) 
	public Pointer<AVBitStreamFilter.close_callback > close() {
		return this.io.getPointerField(this, 3);
	}
	/** C type : close_callback* */
	@Field(3) 
	public AVBitStreamFilter close(Pointer<AVBitStreamFilter.close_callback > close) {
		this.io.setPointerField(this, 3, close);
		return this;
	}
	/** C type : AVBitStreamFilter* */
	@Field(4) 
	public Pointer<AVBitStreamFilter > next() {
		return this.io.getPointerField(this, 4);
	}
	/** C type : AVBitStreamFilter* */
	@Field(4) 
	public AVBitStreamFilter next(Pointer<AVBitStreamFilter > next) {
		this.io.setPointerField(this, 4, next);
		return this;
	}
	/** <i>native declaration : ./libavcodec/avcodec.h:3518</i> */
	public static abstract class filter_callback extends Callback<filter_callback > {
		public int apply(Pointer<AVBitStreamFilterContext > bsfc, Pointer<AVCodecContext > avctx, Pointer<Byte > args, Pointer<Pointer > poutbuf, Pointer<Integer > poutbuf_size, Pointer<Byte > buf, int buf_size, int keyframe) {
			return apply(Pointer.getPeer(bsfc), Pointer.getPeer(avctx), Pointer.getPeer(args), Pointer.getPeer(poutbuf), Pointer.getPeer(poutbuf_size), Pointer.getPeer(buf), buf_size, keyframe);
		}
		public int apply(@Ptr long bsfc, @Ptr long avctx, @Ptr long args, @Ptr long poutbuf, @Ptr long poutbuf_size, @Ptr long buf, int buf_size, int keyframe) {
			return apply(Pointer.pointerToAddress(bsfc, AVBitStreamFilterContext.class), Pointer.pointerToAddress(avctx, AVCodecContext.class), Pointer.pointerToAddress(args, Byte.class), Pointer.pointerToAddress(poutbuf, Pointer.class), Pointer.pointerToAddress(poutbuf_size, Integer.class), Pointer.pointerToAddress(buf, Byte.class), buf_size, keyframe);
		}
	};
	/** <i>native declaration : ./libavcodec/avcodec.h:3519</i> */
	public static abstract class close_callback extends Callback<close_callback > {
		public void apply(Pointer<AVBitStreamFilterContext > bsfc) {
			apply(Pointer.getPeer(bsfc));
		}
		public void apply(@Ptr long bsfc) {
			apply(Pointer.pointerToAddress(bsfc, AVBitStreamFilterContext.class));
		}
	};
	public AVBitStreamFilter() {
		super();
	}
	public AVBitStreamFilter(Pointer pointer) {
		super(pointer);
	}
}
