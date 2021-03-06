package org.ffmpeg.avutil;
import org.bridj.BridJ;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
import org.ffmpeg.avutil.AvutilLibrary.AVOptionType;
/**
 * <i>native declaration : libavutil/opt.h:59</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avutil") 
public class AVOption extends StructObject {
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
	public AVOption name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/**
	 * short English help text<br>
	 * @todo What about other languages?<br>
	 * C type : const char*
	 */
	@Field(1) 
	public Pointer<Byte > help() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * short English help text<br>
	 * @todo What about other languages?<br>
	 * C type : const char*
	 */
	@Field(1) 
	public AVOption help(Pointer<Byte > help) {
		this.io.setPointerField(this, 1, help);
		return this;
	}
	/**
	 * The offset relative to the context structure where the option<br>
	 * value is stored. It should be 0 for named constants.
	 */
	@Field(2) 
	public int offset() {
		return this.io.getIntField(this, 2);
	}
	/**
	 * The offset relative to the context structure where the option<br>
	 * value is stored. It should be 0 for named constants.
	 */
	@Field(2) 
	public AVOption offset(int offset) {
		this.io.setIntField(this, 2, offset);
		return this;
	}
	/** C type : AVOptionType */
	@Field(3) 
	public IntValuedEnum<AVOptionType > type() {
		return this.io.getEnumField(this, 3);
	}
	/** C type : AVOptionType */
	@Field(3) 
	public AVOption type(IntValuedEnum<AVOptionType > type) {
		this.io.setEnumField(this, 3, type);
		return this;
	}
	/**
	 * the default value for scalar options<br>
	 * C type : default_val_union
	 */
	@Field(4) 
	public AVOption.default_val_union default_val() {
		return this.io.getNativeObjectField(this, 4);
	}
	/**
	 * the default value for scalar options<br>
	 * C type : default_val_union
	 */
	@Field(4) 
	public AVOption default_val(AVOption.default_val_union default_val) {
		this.io.setNativeObjectField(this, 4, default_val);
		return this;
	}
	/** < minimum valid value for the option */
	@Field(5) 
	public double min() {
		return this.io.getDoubleField(this, 5);
	}
	/** < minimum valid value for the option */
	@Field(5) 
	public AVOption min(double min) {
		this.io.setDoubleField(this, 5, min);
		return this;
	}
	/** < maximum valid value for the option */
	@Field(6) 
	public double max() {
		return this.io.getDoubleField(this, 6);
	}
	/** < maximum valid value for the option */
	@Field(6) 
	public AVOption max(double max) {
		this.io.setDoubleField(this, 6, max);
		return this;
	}
	@Field(7) 
	public int flags() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public AVOption flags(int flags) {
		this.io.setIntField(this, 7, flags);
		return this;
	}
	/**
	 * The logical unit to which the option belongs. Non-constant<br>
	 * options and corresponding named constants share the same<br>
	 * unit. May be NULL.<br>
	 * C type : const char*
	 */
	@Field(8) 
	public Pointer<Byte > unit() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * The logical unit to which the option belongs. Non-constant<br>
	 * options and corresponding named constants share the same<br>
	 * unit. May be NULL.<br>
	 * C type : const char*
	 */
	@Field(8) 
	public AVOption unit(Pointer<Byte > unit) {
		this.io.setPointerField(this, 8, unit);
		return this;
	}
	/** <i>native declaration : libavutil/opt.h:58</i> */
	@Union 
	public static class default_val_union extends StructObject {
		static {
			BridJ.register();
		}
		@Field(0) 
		public long i64() {
			return this.io.getLongField(this, 0);
		}
		@Field(0) 
		public default_val_union i64(long i64) {
			this.io.setLongField(this, 0, i64);
			return this;
		}
		@Field(1) 
		public double dbl() {
			return this.io.getDoubleField(this, 1);
		}
		@Field(1) 
		public default_val_union dbl(double dbl) {
			this.io.setDoubleField(this, 1, dbl);
			return this;
		}
		/** C type : const char* */
		@Field(2) 
		public Pointer<Byte > str() {
			return this.io.getPointerField(this, 2);
		}
		/** C type : const char* */
		@Field(2) 
		public default_val_union str(Pointer<Byte > str) {
			this.io.setPointerField(this, 2, str);
			return this;
		}
		/**
		 * TODO those are unused now<br>
		 * C type : AVRational
		 */
		@Field(3) 
		public AVRational q() {
			return this.io.getNativeObjectField(this, 3);
		}
		/**
		 * TODO those are unused now<br>
		 * C type : AVRational
		 */
		@Field(3) 
		public default_val_union q(AVRational q) {
			this.io.setNativeObjectField(this, 3, q);
			return this;
		}
		public default_val_union() {
			super();
		}
		public default_val_union(Pointer pointer) {
			super(pointer);
		}
	};
	public AVOption() {
		super();
	}
	public AVOption(Pointer pointer) {
		super(pointer);
	}
}
