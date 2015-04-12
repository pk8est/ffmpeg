package org.ffmpeg.avfilter;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avutil.AVFrame;
import org.ffmpeg.avutil.AVRational;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
/**
 * A link between two filters. This contains pointers to the source and<br>
 * destination filters between which this link exists, and the indexes of<br>
 * the pads involved. In addition, this link also contains the parameters<br>
 * which have been negotiated and agreed upon between the filter, such as<br>
 * image dimensions, format, etc.<br>
 * <i>native declaration : libavfilter/avfilter.h:659</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avfilter") 
public abstract class AVFilterLink extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * < source filter<br>
	 * C type : AVFilterContext*
	 */
	@Field(0) 
	public Pointer<AVFilterContext > src() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * < source filter<br>
	 * C type : AVFilterContext*
	 */
	@Field(0) 
	public AVFilterLink src(Pointer<AVFilterContext > src) {
		this.io.setPointerField(this, 0, src);
		return this;
	}
	/**
	 * < output pad on the source filter<br>
	 * C type : AVFilterPad*
	 */
	@Field(1) 
	public Pointer<AVFilterPad > srcpad() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * < output pad on the source filter<br>
	 * C type : AVFilterPad*
	 */
	@Field(1) 
	public AVFilterLink srcpad(Pointer<AVFilterPad > srcpad) {
		this.io.setPointerField(this, 1, srcpad);
		return this;
	}
	/**
	 * < dest filter<br>
	 * C type : AVFilterContext*
	 */
	@Field(2) 
	public Pointer<AVFilterContext > dst() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * < dest filter<br>
	 * C type : AVFilterContext*
	 */
	@Field(2) 
	public AVFilterLink dst(Pointer<AVFilterContext > dst) {
		this.io.setPointerField(this, 2, dst);
		return this;
	}
	/**
	 * < input pad on the dest filter<br>
	 * C type : AVFilterPad*
	 */
	@Field(3) 
	public Pointer<AVFilterPad > dstpad() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * < input pad on the dest filter<br>
	 * C type : AVFilterPad*
	 */
	@Field(3) 
	public AVFilterLink dstpad(Pointer<AVFilterPad > dstpad) {
		this.io.setPointerField(this, 3, dstpad);
		return this;
	}
	/**
	 * < filter media type<br>
	 * C type : AVMediaType
	 */
	@Field(4) 
	public IntValuedEnum<AVMediaType > type() {
		return this.io.getEnumField(this, 4);
	}
	/**
	 * < filter media type<br>
	 * C type : AVMediaType
	 */
	@Field(4) 
	public AVFilterLink type(IntValuedEnum<AVMediaType > type) {
		this.io.setEnumField(this, 4, type);
		return this;
	}
	/**
	 * These parameters apply only to video<br>
	 * < agreed upon image width
	 */
	@Field(5) 
	public int w() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * These parameters apply only to video<br>
	 * < agreed upon image width
	 */
	@Field(5) 
	public AVFilterLink w(int w) {
		this.io.setIntField(this, 5, w);
		return this;
	}
	/** < agreed upon image height */
	@Field(6) 
	public int h() {
		return this.io.getIntField(this, 6);
	}
	/** < agreed upon image height */
	@Field(6) 
	public AVFilterLink h(int h) {
		this.io.setIntField(this, 6, h);
		return this;
	}
	/**
	 * < agreed upon sample aspect ratio<br>
	 * C type : AVRational
	 */
	@Field(7) 
	public AVRational sample_aspect_ratio() {
		return this.io.getNativeObjectField(this, 7);
	}
	/**
	 * < agreed upon sample aspect ratio<br>
	 * C type : AVRational
	 */
	@Field(7) 
	public AVFilterLink sample_aspect_ratio(AVRational sample_aspect_ratio) {
		this.io.setNativeObjectField(this, 7, sample_aspect_ratio);
		return this;
	}
	/**
	 * These parameters apply only to audio<br>
	 * < channel layout of current buffer (see libavutil/channel_layout.h)
	 */
	@Field(8) 
	public long channel_layout() {
		return this.io.getLongField(this, 8);
	}
	/**
	 * These parameters apply only to audio<br>
	 * < channel layout of current buffer (see libavutil/channel_layout.h)
	 */
	@Field(8) 
	public AVFilterLink channel_layout(long channel_layout) {
		this.io.setLongField(this, 8, channel_layout);
		return this;
	}
	/** < samples per second */
	@Field(9) 
	public int sample_rate() {
		return this.io.getIntField(this, 9);
	}
	/** < samples per second */
	@Field(9) 
	public AVFilterLink sample_rate(int sample_rate) {
		this.io.setIntField(this, 9, sample_rate);
		return this;
	}
	/** < agreed upon media format */
	@Field(10) 
	public int format() {
		return this.io.getIntField(this, 10);
	}
	/** < agreed upon media format */
	@Field(10) 
	public AVFilterLink format(int format) {
		this.io.setIntField(this, 10, format);
		return this;
	}
	/**
	 * Define the time base used by the PTS of the frames/samples<br>
	 * which will pass through this link.<br>
	 * During the configuration stage, each filter is supposed to<br>
	 * change only the output timebase, while the timebase of the<br>
	 * input link is assumed to be an unchangeable property.<br>
	 * C type : AVRational
	 */
	@Field(11) 
	public AVRational time_base() {
		return this.io.getNativeObjectField(this, 11);
	}
	/**
	 * Define the time base used by the PTS of the frames/samples<br>
	 * which will pass through this link.<br>
	 * During the configuration stage, each filter is supposed to<br>
	 * change only the output timebase, while the timebase of the<br>
	 * input link is assumed to be an unchangeable property.<br>
	 * C type : AVRational
	 */
	@Field(11) 
	public AVFilterLink time_base(AVRational time_base) {
		this.io.setNativeObjectField(this, 11, time_base);
		return this;
	}
	/** Conversion Error : AVFilterFormats* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVFilterFormats* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVFilterFormats* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVFilterFormats* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVFilterChannelLayouts* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : AVFilterChannelLayouts* (failed to convert type to Java (undefined type)) */
	/**
	 * Audio only, the destination filter sets this to a non-zero value to<br>
	 * request that buffers with the given number of samples should be sent to<br>
	 * it. AVFilterPad.needs_fifo must also be set on the corresponding input<br>
	 * pad.<br>
	 * Last buffer before EOF will be padded with silence.
	 */
	@Field(18) 
	public int request_samples() {
		return this.io.getIntField(this, 18);
	}
	/**
	 * Audio only, the destination filter sets this to a non-zero value to<br>
	 * request that buffers with the given number of samples should be sent to<br>
	 * it. AVFilterPad.needs_fifo must also be set on the corresponding input<br>
	 * pad.<br>
	 * Last buffer before EOF will be padded with silence.
	 */
	@Field(18) 
	public AVFilterLink request_samples(int request_samples) {
		this.io.setIntField(this, 18, request_samples);
		return this;
	}
	/**
	 * stage of the initialization of the link properties (dimensions, etc)<br>
	 * C type : init_state_enum
	 */
	@Field(19) 
	public IntValuedEnum<AVFilterLink.init_state_enum > init_state() {
		return this.io.getEnumField(this, 19);
	}
	/**
	 * stage of the initialization of the link properties (dimensions, etc)<br>
	 * C type : init_state_enum
	 */
	@Field(19) 
	public AVFilterLink init_state(IntValuedEnum<AVFilterLink.init_state_enum > init_state) {
		this.io.setEnumField(this, 19, init_state);
		return this;
	}
	/** Conversion Error : AVFilterPool* (failed to convert type to Java (undefined type)) */
	/**
	 * Graph the filter belongs to.<br>
	 * C type : AVFilterGraph*
	 */
	@Field(21) 
	public Pointer<AVFilterGraph > graph() {
		return this.io.getPointerField(this, 21);
	}
	/**
	 * Graph the filter belongs to.<br>
	 * C type : AVFilterGraph*
	 */
	@Field(21) 
	public AVFilterLink graph(Pointer<AVFilterGraph > graph) {
		this.io.setPointerField(this, 21, graph);
		return this;
	}
	/**
	 * Current timestamp of the link, as defined by the most recent<br>
	 * frame(s), in AV_TIME_BASE units.
	 */
	@Field(22) 
	public long current_pts() {
		return this.io.getLongField(this, 22);
	}
	/**
	 * Current timestamp of the link, as defined by the most recent<br>
	 * frame(s), in AV_TIME_BASE units.
	 */
	@Field(22) 
	public AVFilterLink current_pts(long current_pts) {
		this.io.setLongField(this, 22, current_pts);
		return this;
	}
	/** Index in the age array. */
	@Field(23) 
	public int age_index() {
		return this.io.getIntField(this, 23);
	}
	/** Index in the age array. */
	@Field(23) 
	public AVFilterLink age_index(int age_index) {
		this.io.setIntField(this, 23, age_index);
		return this;
	}
	/**
	 * Frame rate of the stream on the link, or 1/0 if unknown;<br>
	 * if left to 0/0, will be automatically be copied from the first input<br>
	 * of the source filter if it exists.<br>
	 * * Sources should set it to the best estimation of the real frame rate.<br>
	 * Filters should update it if necessary depending on their function.<br>
	 * Sinks can use it to set a default output frame rate.<br>
	 * It is similar to the r_frame_rate field in AVStream.<br>
	 * C type : AVRational
	 */
	@Field(24) 
	public AVRational frame_rate() {
		return this.io.getNativeObjectField(this, 24);
	}
	/**
	 * Frame rate of the stream on the link, or 1/0 if unknown;<br>
	 * if left to 0/0, will be automatically be copied from the first input<br>
	 * of the source filter if it exists.<br>
	 * * Sources should set it to the best estimation of the real frame rate.<br>
	 * Filters should update it if necessary depending on their function.<br>
	 * Sinks can use it to set a default output frame rate.<br>
	 * It is similar to the r_frame_rate field in AVStream.<br>
	 * C type : AVRational
	 */
	@Field(24) 
	public AVFilterLink frame_rate(AVRational frame_rate) {
		this.io.setNativeObjectField(this, 24, frame_rate);
		return this;
	}
	/**
	 * Buffer partially filled with samples to achieve a fixed/minimum size.<br>
	 * C type : AVFrame*
	 */
	@Field(25) 
	public Pointer<AVFrame > partial_buf() {
		return this.io.getPointerField(this, 25);
	}
	/**
	 * Buffer partially filled with samples to achieve a fixed/minimum size.<br>
	 * C type : AVFrame*
	 */
	@Field(25) 
	public AVFilterLink partial_buf(Pointer<AVFrame > partial_buf) {
		this.io.setPointerField(this, 25, partial_buf);
		return this;
	}
	/**
	 * Size of the partial buffer to allocate.<br>
	 * Must be between min_samples and max_samples.
	 */
	@Field(26) 
	public int partial_buf_size() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * Size of the partial buffer to allocate.<br>
	 * Must be between min_samples and max_samples.
	 */
	@Field(26) 
	public AVFilterLink partial_buf_size(int partial_buf_size) {
		this.io.setIntField(this, 26, partial_buf_size);
		return this;
	}
	/**
	 * Minimum number of samples to filter at once. If filter_frame() is<br>
	 * called with fewer samples, it will accumulate them in partial_buf.<br>
	 * This field and the related ones must not be changed after filtering<br>
	 * has started.<br>
	 * If 0, all related fields are ignored.
	 */
	@Field(27) 
	public int min_samples() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * Minimum number of samples to filter at once. If filter_frame() is<br>
	 * called with fewer samples, it will accumulate them in partial_buf.<br>
	 * This field and the related ones must not be changed after filtering<br>
	 * has started.<br>
	 * If 0, all related fields are ignored.
	 */
	@Field(27) 
	public AVFilterLink min_samples(int min_samples) {
		this.io.setIntField(this, 27, min_samples);
		return this;
	}
	/**
	 * Maximum number of samples to filter at once. If filter_frame() is<br>
	 * called with more samples, it will split them.
	 */
	@Field(28) 
	public int max_samples() {
		return this.io.getIntField(this, 28);
	}
	/**
	 * Maximum number of samples to filter at once. If filter_frame() is<br>
	 * called with more samples, it will split them.
	 */
	@Field(28) 
	public AVFilterLink max_samples(int max_samples) {
		this.io.setIntField(this, 28, max_samples);
		return this;
	}
	/**
	 * The buffer reference currently being received across the link by the<br>
	 * destination filter. This is used internally by the filter system to<br>
	 * allow automatic copying of buffers which do not have sufficient<br>
	 * permissions for the destination. This should not be accessed directly<br>
	 * by the filters.<br>
	 * C type : AVFilterBufferRef*
	 */
	@Field(29) 
	public Pointer<AVFilterBufferRef > cur_buf_copy() {
		return this.io.getPointerField(this, 29);
	}
	/**
	 * The buffer reference currently being received across the link by the<br>
	 * destination filter. This is used internally by the filter system to<br>
	 * allow automatic copying of buffers which do not have sufficient<br>
	 * permissions for the destination. This should not be accessed directly<br>
	 * by the filters.<br>
	 * C type : AVFilterBufferRef*
	 */
	@Field(29) 
	public AVFilterLink cur_buf_copy(Pointer<AVFilterBufferRef > cur_buf_copy) {
		this.io.setPointerField(this, 29, cur_buf_copy);
		return this;
	}
	/**
	 * True if the link is closed.<br>
	 * If set, all attempts of start_frame, filter_frame or request_frame<br>
	 * will fail with AVERROR_EOF, and if necessary the reference will be<br>
	 * destroyed.<br>
	 * If request_frame returns AVERROR_EOF, this flag is set on the<br>
	 * corresponding link.<br>
	 * It can be set also be set by either the source or the destination<br>
	 * filter.
	 */
	@Field(30) 
	public int closed() {
		return this.io.getIntField(this, 30);
	}
	/**
	 * True if the link is closed.<br>
	 * If set, all attempts of start_frame, filter_frame or request_frame<br>
	 * will fail with AVERROR_EOF, and if necessary the reference will be<br>
	 * destroyed.<br>
	 * If request_frame returns AVERROR_EOF, this flag is set on the<br>
	 * corresponding link.<br>
	 * It can be set also be set by either the source or the destination<br>
	 * filter.
	 */
	@Field(30) 
	public AVFilterLink closed(int closed) {
		this.io.setIntField(this, 30, closed);
		return this;
	}
	/** Number of channels. */
	@Field(31) 
	public int channels() {
		return this.io.getIntField(this, 31);
	}
	/** Number of channels. */
	@Field(31) 
	public AVFilterLink channels(int channels) {
		this.io.setIntField(this, 31, channels);
		return this;
	}
	/**
	 * True if a frame is being requested on the link.<br>
	 * Used internally by the framework.
	 */
	@Field(32) 
	public int frame_requested() {
		return this.io.getIntField(this, 32);
	}
	/**
	 * True if a frame is being requested on the link.<br>
	 * Used internally by the framework.
	 */
	@Field(32) 
	public AVFilterLink frame_requested(int frame_requested) {
		this.io.setIntField(this, 32, frame_requested);
		return this;
	}
	/** Link processing flags. */
	@Field(33) 
	public int flags() {
		return this.io.getIntField(this, 33);
	}
	/** Link processing flags. */
	@Field(33) 
	public AVFilterLink flags(int flags) {
		this.io.setIntField(this, 33, flags);
		return this;
	}
	/** Number of past frames sent through the link. */
	@Field(34) 
	public long frame_count() {
		return this.io.getLongField(this, 34);
	}
	/** Number of past frames sent through the link. */
	@Field(34) 
	public AVFilterLink frame_count(long frame_count) {
		this.io.setLongField(this, 34, frame_count);
		return this;
	}
	/**
	 * enum values<br>
	 * <i>native declaration : libavfilter/avfilter.h:658</i>
	 */
	public enum init_state_enum implements IntValuedEnum<init_state_enum > {
		/** < not started */
		AVLINK_UNINIT(0),
		/** < started, but incomplete */
		AVLINK_STARTINIT(1),
		/** < complete */
		AVLINK_INIT(2);
		init_state_enum(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<init_state_enum > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<init_state_enum > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
}
