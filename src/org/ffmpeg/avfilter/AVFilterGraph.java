package org.ffmpeg.avfilter;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.ffmpeg.avfilter.AvfilterLibrary.avfilter_execute_func;
import org.ffmpeg.avutil.AVClass;
/**
 * <i>native declaration : libavfilter/avfilter.h:602</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avfilter") 
public class AVFilterGraph extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : const AVClass* */
	@Field(0) 
	public Pointer<AVClass > av_class() {
		return this.io.getPointerField(this, 0);
	}
	/** C type : const AVClass* */
	@Field(0) 
	public AVFilterGraph av_class(Pointer<AVClass > av_class) {
		this.io.setPointerField(this, 0, av_class);
		return this;
	}
	/** C type : AVFilterContext** */
	@Field(1) 
	public Pointer<Pointer<AVFilterContext > > filters() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : AVFilterContext** */
	@Field(1) 
	public AVFilterGraph filters(Pointer<Pointer<AVFilterContext > > filters) {
		this.io.setPointerField(this, 1, filters);
		return this;
	}
	@Field(2) 
	public int nb_filters() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public AVFilterGraph nb_filters(int nb_filters) {
		this.io.setIntField(this, 2, nb_filters);
		return this;
	}
	/**
	 * < sws options to use for the auto-inserted scale filters<br>
	 * C type : char*
	 */
	@Field(3) 
	public Pointer<Byte > scale_sws_opts() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * < sws options to use for the auto-inserted scale filters<br>
	 * C type : char*
	 */
	@Field(3) 
	public AVFilterGraph scale_sws_opts(Pointer<Byte > scale_sws_opts) {
		this.io.setPointerField(this, 3, scale_sws_opts);
		return this;
	}
	/**
	 * < libavresample options to use for the auto-inserted resample filters<br>
	 * C type : char*
	 */
	@Field(4) 
	public Pointer<Byte > resample_lavr_opts() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * < libavresample options to use for the auto-inserted resample filters<br>
	 * C type : char*
	 */
	@Field(4) 
	public AVFilterGraph resample_lavr_opts(Pointer<Byte > resample_lavr_opts) {
		this.io.setPointerField(this, 4, resample_lavr_opts);
		return this;
	}
	/**
	 * Type of multithreading allowed for filters in this graph. A combination<br>
	 * of AVFILTER_THREAD_* flags.<br>
	 * * May be set by the caller at any point, the setting will apply to all<br>
	 * filters initialized after that. The default is allowing everything.<br>
	 * * When a filter in this graph is initialized, this field is combined using<br>
	 * bit AND with AVFilterContext.thread_type to get the final mask used for<br>
	 * determining allowed threading types. I.e. a threading type needs to be<br>
	 * set in both to be allowed.
	 */
	@Field(5) 
	public int thread_type() {
		return this.io.getIntField(this, 5);
	}
	/**
	 * Type of multithreading allowed for filters in this graph. A combination<br>
	 * of AVFILTER_THREAD_* flags.<br>
	 * * May be set by the caller at any point, the setting will apply to all<br>
	 * filters initialized after that. The default is allowing everything.<br>
	 * * When a filter in this graph is initialized, this field is combined using<br>
	 * bit AND with AVFilterContext.thread_type to get the final mask used for<br>
	 * determining allowed threading types. I.e. a threading type needs to be<br>
	 * set in both to be allowed.
	 */
	@Field(5) 
	public AVFilterGraph thread_type(int thread_type) {
		this.io.setIntField(this, 5, thread_type);
		return this;
	}
	/**
	 * Maximum number of threads used by filters in this graph. May be set by<br>
	 * the caller before adding any filters to the filtergraph. Zero (the<br>
	 * default) means that the number of threads is determined automatically.
	 */
	@Field(6) 
	public int nb_threads() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * Maximum number of threads used by filters in this graph. May be set by<br>
	 * the caller before adding any filters to the filtergraph. Zero (the<br>
	 * default) means that the number of threads is determined automatically.
	 */
	@Field(6) 
	public AVFilterGraph nb_threads(int nb_threads) {
		this.io.setIntField(this, 6, nb_threads);
		return this;
	}
	/**
	 * Opaque object for libavfilter internal use.<br>
	 * C type : AVFilterGraphInternal*
	 */
	@Field(7) 
	public Pointer<AVFilterGraphInternal > internal() {
		return this.io.getPointerField(this, 7);
	}
	/**
	 * Opaque object for libavfilter internal use.<br>
	 * C type : AVFilterGraphInternal*
	 */
	@Field(7) 
	public AVFilterGraph internal(Pointer<AVFilterGraphInternal > internal) {
		this.io.setPointerField(this, 7, internal);
		return this;
	}
	/**
	 * Opaque user data. May be set by the caller to an arbitrary value, e.g. to<br>
	 * be used from callbacks like @ref AVFilterGraph.execute.<br>
	 * Libavfilter will not touch this field in any way.<br>
	 * C type : void*
	 */
	@Field(8) 
	public Pointer<? > opaque() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * Opaque user data. May be set by the caller to an arbitrary value, e.g. to<br>
	 * be used from callbacks like @ref AVFilterGraph.execute.<br>
	 * Libavfilter will not touch this field in any way.<br>
	 * C type : void*
	 */
	@Field(8) 
	public AVFilterGraph opaque(Pointer<? > opaque) {
		this.io.setPointerField(this, 8, opaque);
		return this;
	}
	/**
	 * This callback may be set by the caller immediately after allocating the<br>
	 * graph and before adding any filters to it, to provide a custom<br>
	 * multithreading implementation.<br>
	 * * If set, filters with slice threading capability will call this callback<br>
	 * to execute multiple jobs in parallel.<br>
	 * * If this field is left unset, libavfilter will use its internal<br>
	 * implementation, which may or may not be multithreaded depending on the<br>
	 * platform and build options.<br>
	 * C type : avfilter_execute_func*
	 */
	@Field(9) 
	public Pointer<avfilter_execute_func > execute() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * This callback may be set by the caller immediately after allocating the<br>
	 * graph and before adding any filters to it, to provide a custom<br>
	 * multithreading implementation.<br>
	 * * If set, filters with slice threading capability will call this callback<br>
	 * to execute multiple jobs in parallel.<br>
	 * * If this field is left unset, libavfilter will use its internal<br>
	 * implementation, which may or may not be multithreaded depending on the<br>
	 * platform and build options.<br>
	 * C type : avfilter_execute_func*
	 */
	@Field(9) 
	public AVFilterGraph execute(Pointer<avfilter_execute_func > execute) {
		this.io.setPointerField(this, 9, execute);
		return this;
	}
	/**
	 * < swr options to use for the auto-inserted aresample filters, Access ONLY through AVOptions<br>
	 * C type : char*
	 */
	@Field(10) 
	public Pointer<Byte > aresample_swr_opts() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * < swr options to use for the auto-inserted aresample filters, Access ONLY through AVOptions<br>
	 * C type : char*
	 */
	@Field(10) 
	public AVFilterGraph aresample_swr_opts(Pointer<Byte > aresample_swr_opts) {
		this.io.setPointerField(this, 10, aresample_swr_opts);
		return this;
	}
	/** C type : AVFilterLink** */
	@Field(11) 
	public Pointer<Pointer<AVFilterLink > > sink_links() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : AVFilterLink** */
	@Field(11) 
	public AVFilterGraph sink_links(Pointer<Pointer<AVFilterLink > > sink_links) {
		this.io.setPointerField(this, 11, sink_links);
		return this;
	}
	@Field(12) 
	public int sink_links_count() {
		return this.io.getIntField(this, 12);
	}
	@Field(12) 
	public AVFilterGraph sink_links_count(int sink_links_count) {
		this.io.setIntField(this, 12, sink_links_count);
		return this;
	}
	@Field(13) 
	public int disable_auto_convert() {
		return this.io.getIntField(this, 13);
	}
	@Field(13) 
	public AVFilterGraph disable_auto_convert(int disable_auto_convert) {
		this.io.setIntField(this, 13, disable_auto_convert);
		return this;
	}
	public AVFilterGraph() {
		super();
	}
	public AVFilterGraph(Pointer pointer) {
		super(pointer);
	}
}
