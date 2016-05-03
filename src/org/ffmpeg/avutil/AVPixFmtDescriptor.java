package org.ffmpeg.avutil;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : libavutil/pixdesc.h:69</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avutil") 
public class AVPixFmtDescriptor extends StructObject {
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
	public AVPixFmtDescriptor name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/** < The number of components each pixel has, (1-4) */
	@Field(1) 
	public byte nb_components() {
		return this.io.getByteField(this, 1);
	}
	/** < The number of components each pixel has, (1-4) */
	@Field(1) 
	public AVPixFmtDescriptor nb_components(byte nb_components) {
		this.io.setByteField(this, 1, nb_components);
		return this;
	}
	/**
	 * Amount to shift the luma width right to find the chroma width.<br>
	 * For YV12 this is 1 for example.<br>
	 * chroma_width = -((-luma_width) >> log2_chroma_w)<br>
	 * The note above is needed to ensure rounding up.<br>
	 * This value only refers to the chroma components.<br>
	 * < chroma_width = -((-luma_width )>>log2_chroma_w)
	 */
	@Field(2) 
	public byte log2_chroma_w() {
		return this.io.getByteField(this, 2);
	}
	/**
	 * Amount to shift the luma width right to find the chroma width.<br>
	 * For YV12 this is 1 for example.<br>
	 * chroma_width = -((-luma_width) >> log2_chroma_w)<br>
	 * The note above is needed to ensure rounding up.<br>
	 * This value only refers to the chroma components.<br>
	 * < chroma_width = -((-luma_width )>>log2_chroma_w)
	 */
	@Field(2) 
	public AVPixFmtDescriptor log2_chroma_w(byte log2_chroma_w) {
		this.io.setByteField(this, 2, log2_chroma_w);
		return this;
	}
	/**
	 * Amount to shift the luma height right to find the chroma height.<br>
	 * For YV12 this is 1 for example.<br>
	 * chroma_height= -((-luma_height) >> log2_chroma_h)<br>
	 * The note above is needed to ensure rounding up.<br>
	 * This value only refers to the chroma components.
	 */
	@Field(3) 
	public byte log2_chroma_h() {
		return this.io.getByteField(this, 3);
	}
	/**
	 * Amount to shift the luma height right to find the chroma height.<br>
	 * For YV12 this is 1 for example.<br>
	 * chroma_height= -((-luma_height) >> log2_chroma_h)<br>
	 * The note above is needed to ensure rounding up.<br>
	 * This value only refers to the chroma components.
	 */
	@Field(3) 
	public AVPixFmtDescriptor log2_chroma_h(byte log2_chroma_h) {
		this.io.setByteField(this, 3, log2_chroma_h);
		return this;
	}
	/** Combination of AV_PIX_FMT_FLAG_... flags. */
	@Field(4) 
	public long flags() {
		return this.io.getLongField(this, 4);
	}
	/** Combination of AV_PIX_FMT_FLAG_... flags. */
	@Field(4) 
	public AVPixFmtDescriptor flags(long flags) {
		this.io.setLongField(this, 4, flags);
		return this;
	}
	/**
	 * Parameters that describe how pixels are packed.<br>
	 * If the format has 1 or 2 components, then luma is 0.<br>
	 * If the format has 3 or 4 components:<br>
	 *   if the RGB flag is set then 0 is red, 1 is green and 2 is blue;<br>
	 *   otherwise 0 is luma, 1 is chroma-U and 2 is chroma-V.<br>
	 * * If present, the Alpha channel is always the last component.<br>
	 * C type : AVComponentDescriptor[4]
	 */
	@Array({4}) 
	@Field(5) 
	public Pointer<AVComponentDescriptor > comp() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * Alternative comma-separated names.<br>
	 * C type : const char*
	 */
	@Field(6) 
	public Pointer<Byte > alias() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * Alternative comma-separated names.<br>
	 * C type : const char*
	 */
	@Field(6) 
	public AVPixFmtDescriptor alias(Pointer<Byte > alias) {
		this.io.setPointerField(this, 6, alias);
		return this;
	}
	public AVPixFmtDescriptor() {
		super();
	}
	public AVPixFmtDescriptor(Pointer pointer) {
		super(pointer);
	}
}
