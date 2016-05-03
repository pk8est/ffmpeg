package org.ffmpeg.avfilter;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.util.DefaultParameterizedType;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AVDictionary;
/**
 * <i>native declaration : libavfilter/avfilter.h:168</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avfilter") 
public class AVFilter extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * Filter name. Must be non-NULL and unique among filters.<br>
	 * C type : const char*
	 */
	@Field(0) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * Filter name. Must be non-NULL and unique among filters.<br>
	 * C type : const char*
	 */
	@Field(0) 
	public AVFilter name(Pointer<Byte > name) {
		this.io.setPointerField(this, 0, name);
		return this;
	}
	/**
	 * A description of the filter. May be NULL.<br>
	 * * You should use the NULL_IF_CONFIG_SMALL() macro to define it.<br>
	 * C type : const char*
	 */
	@Field(1) 
	public Pointer<Byte > description() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * A description of the filter. May be NULL.<br>
	 * * You should use the NULL_IF_CONFIG_SMALL() macro to define it.<br>
	 * C type : const char*
	 */
	@Field(1) 
	public AVFilter description(Pointer<Byte > description) {
		this.io.setPointerField(this, 1, description);
		return this;
	}
	/**
	 * List of inputs, terminated by a zeroed element.<br>
	 * * NULL if there are no (static) inputs. Instances of filters with<br>
	 * AVFILTER_FLAG_DYNAMIC_INPUTS set may have more inputs than present in<br>
	 * this list.<br>
	 * C type : const AVFilterPad*
	 */
	@Field(2) 
	public Pointer<AVFilterPad > inputs() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * List of inputs, terminated by a zeroed element.<br>
	 * * NULL if there are no (static) inputs. Instances of filters with<br>
	 * AVFILTER_FLAG_DYNAMIC_INPUTS set may have more inputs than present in<br>
	 * this list.<br>
	 * C type : const AVFilterPad*
	 */
	@Field(2) 
	public AVFilter inputs(Pointer<AVFilterPad > inputs) {
		this.io.setPointerField(this, 2, inputs);
		return this;
	}
	/**
	 * List of outputs, terminated by a zeroed element.<br>
	 * * NULL if there are no (static) outputs. Instances of filters with<br>
	 * AVFILTER_FLAG_DYNAMIC_OUTPUTS set may have more outputs than present in<br>
	 * this list.<br>
	 * C type : const AVFilterPad*
	 */
	@Field(3) 
	public Pointer<AVFilterPad > outputs() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * List of outputs, terminated by a zeroed element.<br>
	 * * NULL if there are no (static) outputs. Instances of filters with<br>
	 * AVFILTER_FLAG_DYNAMIC_OUTPUTS set may have more outputs than present in<br>
	 * this list.<br>
	 * C type : const AVFilterPad*
	 */
	@Field(3) 
	public AVFilter outputs(Pointer<AVFilterPad > outputs) {
		this.io.setPointerField(this, 3, outputs);
		return this;
	}
	/**
	 * A class for the private data, used to declare filter private AVOptions.<br>
	 * This field is NULL for filters that do not declare any options.<br>
	 * * If this field is non-NULL, the first member of the filter private data<br>
	 * must be a pointer to AVClass, which will be set by libavfilter generic<br>
	 * code to this class.<br>
	 * C type : const AVClass*
	 */
	@Field(4) 
	public Pointer<AVClass > priv_class() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * A class for the private data, used to declare filter private AVOptions.<br>
	 * This field is NULL for filters that do not declare any options.<br>
	 * * If this field is non-NULL, the first member of the filter private data<br>
	 * must be a pointer to AVClass, which will be set by libavfilter generic<br>
	 * code to this class.<br>
	 * C type : const AVClass*
	 */
	@Field(4) 
	public AVFilter priv_class(Pointer<AVClass > priv_class) {
		this.io.setPointerField(this, 4, priv_class);
		return this;
	}
	/** A combination of AVFILTER_FLAG_* */
	@Field(5) 
	public int flags() {
		return this.io.getIntField(this, 5);
	}
	/** A combination of AVFILTER_FLAG_* */
	@Field(5) 
	public AVFilter flags(int flags) {
		this.io.setIntField(this, 5, flags);
		return this;
	}
	/**
	 * Filter initialization function.<br>
	 * * This callback will be called only once during the filter lifetime, after<br>
	 * all the options have been set, but before links between filters are<br>
	 * established and format negotiation is done.<br>
	 * * Basic filter initialization should be done here. Filters with dynamic<br>
	 * inputs and/or outputs should create those inputs/outputs here based on<br>
	 * provided options. No more changes to this filter's inputs/outputs can be<br>
	 * done after this callback.<br>
	 * * This callback must not assume that the filter links exist or frame<br>
	 * parameters are known.<br>
	 * * @ref AVFilter.uninit "uninit" is guaranteed to be called even if<br>
	 * initialization fails, so this callback does not have to clean up on<br>
	 * failure.<br>
	 * * @return 0 on success, a negative AVERROR on failure<br>
	 * C type : init_callback*
	 */
	@Field(6) 
	public Pointer<AVFilter.init_callback > init() {
		return this.io.getPointerField(this, 6);
	}
	/**
	 * Filter initialization function.<br>
	 * * This callback will be called only once during the filter lifetime, after<br>
	 * all the options have been set, but before links between filters are<br>
	 * established and format negotiation is done.<br>
	 * * Basic filter initialization should be done here. Filters with dynamic<br>
	 * inputs and/or outputs should create those inputs/outputs here based on<br>
	 * provided options. No more changes to this filter's inputs/outputs can be<br>
	 * done after this callback.<br>
	 * * This callback must not assume that the filter links exist or frame<br>
	 * parameters are known.<br>
	 * * @ref AVFilter.uninit "uninit" is guaranteed to be called even if<br>
	 * initialization fails, so this callback does not have to clean up on<br>
	 * failure.<br>
	 * * @return 0 on success, a negative AVERROR on failure<br>
	 * C type : init_callback*
	 */
	@Field(6) 
	public AVFilter init(Pointer<AVFilter.init_callback > init) {
		this.io.setPointerField(this, 6, init);
		return this;
	}
	/**
	 * Should be set instead of @ref AVFilter.init "init" by the filters that<br>
	 * want to pass a dictionary of AVOptions to nested contexts that are<br>
	 * allocated during init.<br>
	 * * On return, the options dict should be freed and replaced with one that<br>
	 * contains all the options which could not be processed by this filter (or<br>
	 * with NULL if all the options were processed).<br>
	 * * Otherwise the semantics is the same as for @ref AVFilter.init "init".<br>
	 * C type : init_dict_callback*
	 */
	@Field(7) 
	public Pointer<AVFilter.init_dict_callback > init_dict() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * Should be set instead of @ref AVFilter.init "init" by the filters that<br>
	 * want to pass a dictionary of AVOptions to nested contexts that are<br>
	 * allocated during init.<br>
	 * * On return, the options dict should be freed and replaced with one that<br>
	 * contains all the options which could not be processed by this filter (or<br>
	 * with NULL if all the options were processed).<br>
	 * * Otherwise the semantics is the same as for @ref AVFilter.init "init".<br>
	 * C type : init_dict_callback*
	 */
	@Field(7) 
	public AVFilter init_dict(Pointer<AVFilter.init_dict_callback > init_dict) {
		this.io.setPointerField(this, 7, init_dict);
		return this;
	}
	/**
	 * Filter uninitialization function.<br>
	 * * Called only once right before the filter is freed. Should deallocate any<br>
	 * memory held by the filter, release any buffer references, etc. It does<br>
	 * not need to deallocate the AVFilterContext.priv memory itself.<br>
	 * * This callback may be called even if @ref AVFilter.init "init" was not<br>
	 * called or failed, so it must be prepared to handle such a situation.<br>
	 * C type : uninit_callback*
	 */
	@Field(8) 
	public Pointer<AVFilter.uninit_callback > uninit() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * Filter uninitialization function.<br>
	 * * Called only once right before the filter is freed. Should deallocate any<br>
	 * memory held by the filter, release any buffer references, etc. It does<br>
	 * not need to deallocate the AVFilterContext.priv memory itself.<br>
	 * * This callback may be called even if @ref AVFilter.init "init" was not<br>
	 * called or failed, so it must be prepared to handle such a situation.<br>
	 * C type : uninit_callback*
	 */
	@Field(8) 
	public AVFilter uninit(Pointer<AVFilter.uninit_callback > uninit) {
		this.io.setPointerField(this, 8, uninit);
		return this;
	}
	/**
	 * Query formats supported by the filter on its inputs and outputs.<br>
	 * * This callback is called after the filter is initialized (so the inputs<br>
	 * and outputs are fixed), shortly before the format negotiation. This<br>
	 * callback may be called more than once.<br>
	 * * This callback must set AVFilterLink.out_formats on every input link and<br>
	 * AVFilterLink.in_formats on every output link to a list of pixel/sample<br>
	 * formats that the filter supports on that link. For audio links, this<br>
	 * filter must also set @ref AVFilterLink.in_samplerates "in_samplerates" /<br>
	 * @ref AVFilterLink.out_samplerates "out_samplerates" and<br>
	 * @ref AVFilterLink.in_channel_layouts "in_channel_layouts" /<br>
	 * @ref AVFilterLink.out_channel_layouts "out_channel_layouts" analogously.<br>
	 * * This callback may be NULL for filters with one input, in which case<br>
	 * libavfilter assumes that it supports all input formats and preserves<br>
	 * them on output.<br>
	 * * @return zero on success, a negative value corresponding to an<br>
	 * AVERROR code otherwise<br>
	 * C type : query_formats_callback*
	 */
	@Field(9) 
	public Pointer<AVFilter.query_formats_callback > query_formats() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * Query formats supported by the filter on its inputs and outputs.<br>
	 * * This callback is called after the filter is initialized (so the inputs<br>
	 * and outputs are fixed), shortly before the format negotiation. This<br>
	 * callback may be called more than once.<br>
	 * * This callback must set AVFilterLink.out_formats on every input link and<br>
	 * AVFilterLink.in_formats on every output link to a list of pixel/sample<br>
	 * formats that the filter supports on that link. For audio links, this<br>
	 * filter must also set @ref AVFilterLink.in_samplerates "in_samplerates" /<br>
	 * @ref AVFilterLink.out_samplerates "out_samplerates" and<br>
	 * @ref AVFilterLink.in_channel_layouts "in_channel_layouts" /<br>
	 * @ref AVFilterLink.out_channel_layouts "out_channel_layouts" analogously.<br>
	 * * This callback may be NULL for filters with one input, in which case<br>
	 * libavfilter assumes that it supports all input formats and preserves<br>
	 * them on output.<br>
	 * * @return zero on success, a negative value corresponding to an<br>
	 * AVERROR code otherwise<br>
	 * C type : query_formats_callback*
	 */
	@Field(9) 
	public AVFilter query_formats(Pointer<AVFilter.query_formats_callback > query_formats) {
		this.io.setPointerField(this, 9, query_formats);
		return this;
	}
	/** < size of private data to allocate for the filter */
	@Field(10) 
	public int priv_size() {
		return this.io.getIntField(this, 10);
	}
	/** < size of private data to allocate for the filter */
	@Field(10) 
	public AVFilter priv_size(int priv_size) {
		this.io.setIntField(this, 10, priv_size);
		return this;
	}
	/**
	 * Used by the filter registration system. Must not be touched by any other<br>
	 * code.<br>
	 * C type : AVFilter*
	 */
	@Field(11) 
	public Pointer<AVFilter > next() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * Used by the filter registration system. Must not be touched by any other<br>
	 * code.<br>
	 * C type : AVFilter*
	 */
	@Field(11) 
	public AVFilter next(Pointer<AVFilter > next) {
		this.io.setPointerField(this, 11, next);
		return this;
	}
	/**
	 * Make the filter instance process a command.<br>
	 * * @param cmd    the command to process, for handling simplicity all commands must be alphanumeric only<br>
	 * @param arg    the argument for the command<br>
	 * @param res    a buffer with size res_size where the filter(s) can return a response. This must not change when the command is not supported.<br>
	 * @param flags  if AVFILTER_CMD_FLAG_FAST is set and the command would be<br>
	 *               time consuming then a filter should treat it like an unsupported command<br>
	 * * @returns >=0 on success otherwise an error code.<br>
	 *          AVERROR(ENOSYS) on unsupported commands<br>
	 * C type : process_command_callback*
	 */
	@Field(12) 
	public Pointer<AVFilter.process_command_callback > process_command() {
		return this.io.getPointerField(this, 12);
	}
	/**
	 * Make the filter instance process a command.<br>
	 * * @param cmd    the command to process, for handling simplicity all commands must be alphanumeric only<br>
	 * @param arg    the argument for the command<br>
	 * @param res    a buffer with size res_size where the filter(s) can return a response. This must not change when the command is not supported.<br>
	 * @param flags  if AVFILTER_CMD_FLAG_FAST is set and the command would be<br>
	 *               time consuming then a filter should treat it like an unsupported command<br>
	 * * @returns >=0 on success otherwise an error code.<br>
	 *          AVERROR(ENOSYS) on unsupported commands<br>
	 * C type : process_command_callback*
	 */
	@Field(12) 
	public AVFilter process_command(Pointer<AVFilter.process_command_callback > process_command) {
		this.io.setPointerField(this, 12, process_command);
		return this;
	}
	/**
	 * Filter initialization function, alternative to the init()<br>
	 * callback. Args contains the user-supplied parameters, opaque is<br>
	 * used for providing binary data.<br>
	 * C type : init_opaque_callback*
	 */
	@Field(13) 
	public Pointer<AVFilter.init_opaque_callback > init_opaque() {
		return this.io.getPointerField(this, 13);
	}
	/**
	 * Filter initialization function, alternative to the init()<br>
	 * callback. Args contains the user-supplied parameters, opaque is<br>
	 * used for providing binary data.<br>
	 * C type : init_opaque_callback*
	 */
	@Field(13) 
	public AVFilter init_opaque(Pointer<AVFilter.init_opaque_callback > init_opaque) {
		this.io.setPointerField(this, 13, init_opaque);
		return this;
	}
	/** <i>native declaration : libavfilter/avfilter.h:162</i> */
	public static abstract class init_callback extends Callback<init_callback > {
		public int apply(Pointer<AVFilterContext > ctx) {
			return apply(Pointer.getPeer(ctx));
		}
		public int apply(@Ptr long ctx) {
			return apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
		}
	};
	/** <i>native declaration : libavfilter/avfilter.h:163</i> */
	public static abstract class init_dict_callback extends Callback<init_dict_callback > {
		public int apply(Pointer<AVFilterContext > ctx, Pointer<Pointer > options) {
			return apply(Pointer.getPeer(ctx), Pointer.getPeer(options));
		}
		public int apply(@Ptr long ctx, @Ptr long options) {
			return apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(options, Pointer.class));
		}
	};
	/** <i>native declaration : libavfilter/avfilter.h:164</i> */
	public static abstract class uninit_callback extends Callback<uninit_callback > {
		public void apply(Pointer<AVFilterContext > ctx) {
			apply(Pointer.getPeer(ctx));
		}
		public void apply(@Ptr long ctx) {
			apply(Pointer.pointerToAddress(ctx, AVFilterContext.class));
		}
	};
	/** <i>native declaration : libavfilter/avfilter.h:165</i> */
	public static abstract class query_formats_callback extends Callback<query_formats_callback > {
		public int apply(Pointer<AVFilterContext > AVFilterContextPtr1) {
			return apply(Pointer.getPeer(AVFilterContextPtr1));
		}
		public int apply(@Ptr long AVFilterContextPtr1) {
			return apply(Pointer.pointerToAddress(AVFilterContextPtr1, AVFilterContext.class));
		}
	};
	/** <i>native declaration : libavfilter/avfilter.h:166</i> */
	public static abstract class process_command_callback extends Callback<process_command_callback > {
		public int apply(Pointer<AVFilterContext > AVFilterContextPtr1, Pointer<Byte > cmd, Pointer<Byte > arg, Pointer<Byte > res, int res_len, int flags) {
			return apply(Pointer.getPeer(AVFilterContextPtr1), Pointer.getPeer(cmd), Pointer.getPeer(arg), Pointer.getPeer(res), res_len, flags);
		}
		public int apply(@Ptr long AVFilterContextPtr1, @Ptr long cmd, @Ptr long arg, @Ptr long res, int res_len, int flags) {
			return apply(Pointer.pointerToAddress(AVFilterContextPtr1, AVFilterContext.class), Pointer.pointerToAddress(cmd, Byte.class), Pointer.pointerToAddress(arg, Byte.class), Pointer.pointerToAddress(res, Byte.class), res_len, flags);
		}
	};
	/** <i>native declaration : libavfilter/avfilter.h:167</i> */
	public static abstract class init_opaque_callback extends Callback<init_opaque_callback > {
		public int apply(Pointer<AVFilterContext > ctx, Pointer<? > opaque) {
			return apply(Pointer.getPeer(ctx), Pointer.getPeer(opaque));
		}
		public int apply(@Ptr long ctx, @Ptr long opaque) {
			return apply(Pointer.pointerToAddress(ctx, AVFilterContext.class), Pointer.pointerToAddress(opaque));
		}
	};
	public AVFilter() {
		super();
	}
	public AVFilter(Pointer pointer) {
		super(pointer);
	}
}
