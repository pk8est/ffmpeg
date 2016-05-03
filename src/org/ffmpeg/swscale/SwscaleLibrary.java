package org.ffmpeg.swscale;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avutil.AVClass;
import org.ffmpeg.avutil.AvutilLibrary.AVPixelFormat;
/**
 * Wrapper for library <b>swscale</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("swscale") 
@Runtime(CRuntime.class) 
public class SwscaleLibrary {
	static {
		BridJ.register();
	}
	/**
	 * Conversion Error : a.num<br>
	 * SKIPPED:<br>
	 * <i>native declaration : libavutil/rational.h:26</i><br>
	 * const int64_t tmp = a.num * (int64_t)b.den - b.num * (int64_t)a.den;
	 */
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_AREA = (int)0x20;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SINC = (int)0x100;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_GAUSS = (int)0x80;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final String LIBSWSCALE_IDENT = (String)"SwS4.0.100";
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SPLINE = (int)0x400;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SRC_V_CHR_DROP_SHIFT = (int)16;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_POINT = (int)0x10;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_SMPTE240M = (int)7;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_X = (int)8;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_DEFAULT = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_ACCURATE_RND = (int)0x40000;
	/**
	 * define<br>
	 * Conversion Error : 4.0.<br>
	 * SKIPPED:<br>
	 * <i>native declaration : libswscale/version.h:0</i><br>
	 * 4.0.
	 */
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FULL_CHR_H_INP = (int)0x4000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FULL_CHR_H_INT = (int)0x2000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BICUBIC = (int)4;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_SRC_V_CHR_DROP_MASK = (int)0x30000;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_BUILD = (int)((4) << 16 | (0) << 8 | (100));
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_ERROR_DIFFUSION = (int)0x800000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU709 = (int)1;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_INT = (int)((4) << 16 | (0) << 8 | (100));
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MICRO = (int)100;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MINOR = (int)0;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BILINEAR = (int)2;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_PARAM_DEFAULT = (int)123456;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BITEXACT = (int)0x80000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_FCC = (int)4;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_BICUBLIN = (int)0x40;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_DIRECT_BGR = (int)0x8000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU624 = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_PRINT_INFO = (int)0x1000;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final double SWS_MAX_REDUCE_CUTOFF = (double)0.002;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_ITU601 = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_CS_SMPTE170M = (int)5;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_FAST_BILINEAR = (int)1;
	/** <i>native declaration : libswscale/swscale.h</i> */
	public static final int SWS_LANCZOS = (int)0x200;
	/** <i>native declaration : libswscale/version.h</i> */
	public static final int LIBSWSCALE_VERSION_MAJOR = (int)4;
	/**
	 * @defgroup libsws Color conversion and scaling<br>
	 * @{<br>
	 * * Return the LIBSWSCALE_VERSION_INT constant.<br>
	 * Original signature : <code>int swscale_version()</code><br>
	 * <i>native declaration : libswscale/swscale.h:6</i>
	 */
	public static native int swscale_version();
	/**
	 * Return the libswscale build-time configuration.<br>
	 * Original signature : <code>char* swscale_configuration()</code><br>
	 * <i>native declaration : libswscale/swscale.h:11</i>
	 */
	public static Pointer<Byte > swscale__configuration() {
		return Pointer.pointerToAddress(swscale_configuration(), Byte.class);
	}
	@Ptr 
	protected native static long swscale_configuration();
	/**
	 * Return the libswscale license.<br>
	 * Original signature : <code>char* swscale_license()</code><br>
	 * <i>native declaration : libswscale/swscale.h:16</i>
	 */
	public static Pointer<Byte > swscale__license() {
		return Pointer.pointerToAddress(swscale_license(), Byte.class);
	}
	@Ptr 
	protected native static long swscale_license();
	/**
	 * Return a pointer to yuv<->rgb coefficients for the given colorspace<br>
	 * suitable for sws_setColorspaceDetails().<br>
	 * * @param colorspace One of the SWS_CS_* macros. If invalid,<br>
	 * SWS_CS_DEFAULT is used.<br>
	 * Original signature : <code>int* sws_getCoefficients(int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:24</i>
	 */
	public static Pointer<Integer > sws__getCoefficients(int colorspace) {
		return Pointer.pointerToAddress(sws_getCoefficients(colorspace), Integer.class);
	}
	@Ptr 
	protected native static long sws_getCoefficients(int colorspace);
	/**
	 * Return a positive value if pix_fmt is a supported input format, 0<br>
	 * otherwise.<br>
	 * Original signature : <code>int sws_isSupportedInput(AVPixelFormat)</code><br>
	 * <i>native declaration : libswscale/swscale.h:45</i>
	 */
	public static int sws_isSupportedInput(IntValuedEnum<AVPixelFormat > pix_fmt) {
		return sws_isSupportedInput((int)pix_fmt.value());
	}
	protected native static int sws_isSupportedInput(int pix_fmt);
	/**
	 * Return a positive value if pix_fmt is a supported output format, 0<br>
	 * otherwise.<br>
	 * Original signature : <code>int sws_isSupportedOutput(AVPixelFormat)</code><br>
	 * <i>native declaration : libswscale/swscale.h:51</i>
	 */
	public static int sws_isSupportedOutput(IntValuedEnum<AVPixelFormat > pix_fmt) {
		return sws_isSupportedOutput((int)pix_fmt.value());
	}
	protected native static int sws_isSupportedOutput(int pix_fmt);
	/**
	 * @param[in]  pix_fmt the pixel format<br>
	 * @return a positive value if an endianness conversion for pix_fmt is<br>
	 * supported, 0 otherwise.<br>
	 * Original signature : <code>int sws_isSupportedEndiannessConversion(AVPixelFormat)</code><br>
	 * <i>native declaration : libswscale/swscale.h:58</i>
	 */
	public static int sws_isSupportedEndiannessConversion(IntValuedEnum<AVPixelFormat > pix_fmt) {
		return sws_isSupportedEndiannessConversion((int)pix_fmt.value());
	}
	protected native static int sws_isSupportedEndiannessConversion(int pix_fmt);
	/**
	 * Allocate an empty SwsContext. This must be filled and passed to<br>
	 * sws_init_context(). For filling see AVOptions, options.c and<br>
	 * sws_setColorspaceDetails().<br>
	 * Original signature : <code>SwsContext* sws_alloc_context()</code><br>
	 * <i>native declaration : libswscale/swscale.h:65</i>
	 */
	public static Pointer<SwscaleLibrary.SwsContext > sws__alloc_context() {
		return Pointer.pointerToAddress(sws_alloc_context(), SwscaleLibrary.SwsContext.class);
	}
	@Ptr 
	protected native static long sws_alloc_context();
	/**
	 * Original signature : <code>int sws_init_context(SwsContext*, SwsFilter*, SwsFilter*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:67</i>
	 */
	public static int sws_init_context(Pointer<SwscaleLibrary.SwsContext > sws_context, Pointer<SwsFilter > srcFilter, Pointer<SwsFilter > dstFilter) {
		return sws_init_context(Pointer.getPeer(sws_context), Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter));
	}
	protected native static int sws_init_context(@Ptr long sws_context, @Ptr long srcFilter, @Ptr long dstFilter);
	/**
	 * Free the swscaler context swsContext.<br>
	 * If swsContext is NULL, then does nothing.<br>
	 * Original signature : <code>void sws_freeContext(SwsContext*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:73</i>
	 */
	public static void sws_freeContext(Pointer<SwscaleLibrary.SwsContext > swsContext) {
		sws_freeContext(Pointer.getPeer(swsContext));
	}
	protected native static void sws_freeContext(@Ptr long swsContext);
	/**
	 * Allocate and return an SwsContext. You need it to perform<br>
	 * scaling/conversion operations using sws_scale().<br>
	 * * @param srcW the width of the source image<br>
	 * @param srcH the height of the source image<br>
	 * @param srcFormat the source image format<br>
	 * @param dstW the width of the destination image<br>
	 * @param dstH the height of the destination image<br>
	 * @param dstFormat the destination image format<br>
	 * @param flags specify which algorithm and options to use for rescaling<br>
	 * @param param extra parameters to tune the used scaler<br>
	 *              For SWS_BICUBIC param[0] and [1] tune the shape of the basis<br>
	 *              function, param[0] tunes f(1) and param[1] f\u00b4(1)<br>
	 *              For SWS_GAUSS param[0] tunes the exponent and thus cutoff<br>
	 *              frequency<br>
	 *              For SWS_LANCZOS param[0] tunes the width of the window function<br>
	 * @return a pointer to an allocated context, or NULL in case of error<br>
	 * @note this function is to be removed after a saner alternative is<br>
	 *       written<br>
	 * Original signature : <code>SwsContext* sws_getContext(int, int, AVPixelFormat, int, int, AVPixelFormat, int, SwsFilter*, SwsFilter*, const double*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:95</i>
	 */
	public static Pointer<SwscaleLibrary.SwsContext > sws_getContext(int srcW, int srcH, IntValuedEnum<AVPixelFormat > srcFormat, int dstW, int dstH, IntValuedEnum<AVPixelFormat > dstFormat, int flags, Pointer<SwsFilter > srcFilter, Pointer<SwsFilter > dstFilter, Pointer<Double > param) {
		return Pointer.pointerToAddress(sws_getContext(srcW, srcH, (int)srcFormat.value(), dstW, dstH, (int)dstFormat.value(), flags, Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter), Pointer.getPeer(param)), SwscaleLibrary.SwsContext.class);
	}
	@Ptr 
	protected native static long sws_getContext(int srcW, int srcH, int srcFormat, int dstW, int dstH, int dstFormat, int flags, @Ptr long srcFilter, @Ptr long dstFilter, @Ptr long param);
	/**
	 * Scale the image slice in srcSlice and put the resulting scaled<br>
	 * slice in the image in dst. A slice is a sequence of consecutive<br>
	 * rows in an image.<br>
	 * * Slices have to be provided in sequential order, either in<br>
	 * top-bottom or bottom-top order. If slices are provided in<br>
	 * non-sequential order the behavior of the function is undefined.<br>
	 * * @param c         the scaling context previously created with<br>
	 *                  sws_getContext()<br>
	 * @param srcSlice  the array containing the pointers to the planes of<br>
	 *                  the source slice<br>
	 * @param srcStride the array containing the strides for each plane of<br>
	 *                  the source image<br>
	 * @param srcSliceY the position in the source image of the slice to<br>
	 *                  process, that is the number (counted starting from<br>
	 *                  zero) in the image of the first row of the slice<br>
	 * @param srcSliceH the height of the source slice, that is the number<br>
	 *                  of rows in the slice<br>
	 * @param dst       the array containing the pointers to the planes of<br>
	 *                  the destination image<br>
	 * @param dstStride the array containing the strides for each plane of<br>
	 *                  the destination image<br>
	 * @return          the height of the output slice<br>
	 * Original signature : <code>int sws_scale(SwsContext*, const const uint8_t*[], const int[], int, int, const uint8_t*[], const int[])</code><br>
	 * <i>native declaration : libswscale/swscale.h:121</i>
	 */
	public static int sws_scale(Pointer<SwscaleLibrary.SwsContext > c, Pointer<Pointer<Byte > > srcSlice, Pointer<Integer > srcStride, int srcSliceY, int srcSliceH, Pointer<Pointer<Byte > > dst, Pointer<Integer > dstStride) {
		return sws_scale(Pointer.getPeer(c), Pointer.getPeer(srcSlice), Pointer.getPeer(srcStride), srcSliceY, srcSliceH, Pointer.getPeer(dst), Pointer.getPeer(dstStride));
	}
	protected native static int sws_scale(@Ptr long c, @Ptr long srcSlice, @Ptr long srcStride, int srcSliceY, int srcSliceH, @Ptr long dst, @Ptr long dstStride);
	/**
	 * @param dstRange flag indicating the while-black range of the output (1=jpeg / 0=mpeg)<br>
	 * @param srcRange flag indicating the while-black range of the input (1=jpeg / 0=mpeg)<br>
	 * @param table the yuv2rgb coefficients describing the output yuv space, normally ff_yuv2rgb_coeffs[x]<br>
	 * @param inv_table the yuv2rgb coefficients describing the input yuv space, normally ff_yuv2rgb_coeffs[x]<br>
	 * @param brightness 16.16 fixed point brightness correction<br>
	 * @param contrast 16.16 fixed point contrast correction<br>
	 * @param saturation 16.16 fixed point saturation correction<br>
	 * @return -1 if not supported<br>
	 * Original signature : <code>int sws_setColorspaceDetails(SwsContext*, const int[4], int, const int[4], int, int, int, int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:133</i>
	 */
	public static int sws_setColorspaceDetails(Pointer<SwscaleLibrary.SwsContext > c, Pointer<Integer > inv_table, int srcRange, Pointer<Integer > table, int dstRange, int brightness, int contrast, int saturation) {
		return sws_setColorspaceDetails(Pointer.getPeer(c), Pointer.getPeer(inv_table), srcRange, Pointer.getPeer(table), dstRange, brightness, contrast, saturation);
	}
	protected native static int sws_setColorspaceDetails(@Ptr long c, @Ptr long inv_table, int srcRange, @Ptr long table, int dstRange, int brightness, int contrast, int saturation);
	/**
	 * @return -1 if not supported<br>
	 * Original signature : <code>int sws_getColorspaceDetails(SwsContext*, int**, int*, int**, int*, int*, int*, int*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:138</i>
	 */
	public static int sws_getColorspaceDetails(Pointer<SwscaleLibrary.SwsContext > c, Pointer<Pointer<Integer > > inv_table, Pointer<Integer > srcRange, Pointer<Pointer<Integer > > table, Pointer<Integer > dstRange, Pointer<Integer > brightness, Pointer<Integer > contrast, Pointer<Integer > saturation) {
		return sws_getColorspaceDetails(Pointer.getPeer(c), Pointer.getPeer(inv_table), Pointer.getPeer(srcRange), Pointer.getPeer(table), Pointer.getPeer(dstRange), Pointer.getPeer(brightness), Pointer.getPeer(contrast), Pointer.getPeer(saturation));
	}
	protected native static int sws_getColorspaceDetails(@Ptr long c, @Ptr long inv_table, @Ptr long srcRange, @Ptr long table, @Ptr long dstRange, @Ptr long brightness, @Ptr long contrast, @Ptr long saturation);
	/**
	 * Allocate and return an uninitialized vector with length coefficients.<br>
	 * Original signature : <code>SwsVector* sws_allocVec(int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:143</i>
	 */
	public static Pointer<SwsVector > sws__allocVec(int length) {
		return Pointer.pointerToAddress(sws_allocVec(length), SwsVector.class);
	}
	@Ptr 
	protected native static long sws_allocVec(int length);
	/**
	 * Return a normalized Gaussian curve used to filter stuff<br>
	 * quality = 3 is high quality, lower is lower quality.<br>
	 * Original signature : <code>SwsVector* sws_getGaussianVec(double, double)</code><br>
	 * <i>native declaration : libswscale/swscale.h:149</i>
	 */
	public static Pointer<SwsVector > sws__getGaussianVec(double variance, double quality) {
		return Pointer.pointerToAddress(sws_getGaussianVec(variance, quality), SwsVector.class);
	}
	@Ptr 
	protected native static long sws_getGaussianVec(double variance, double quality);
	/**
	 * Allocate and return a vector with length coefficients, all<br>
	 * with the same value c.<br>
	 * Original signature : <code>SwsVector* sws_getConstVec(double, int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:155</i>
	 */
	public static Pointer<SwsVector > sws__getConstVec(double c, int length) {
		return Pointer.pointerToAddress(sws_getConstVec(c, length), SwsVector.class);
	}
	@Ptr 
	protected native static long sws_getConstVec(double c, int length);
	/**
	 * Allocate and return a vector with just one coefficient, with<br>
	 * value 1.0.<br>
	 * Original signature : <code>SwsVector* sws_getIdentityVec()</code><br>
	 * <i>native declaration : libswscale/swscale.h:161</i>
	 */
	public static Pointer<SwsVector > sws__getIdentityVec() {
		return Pointer.pointerToAddress(sws_getIdentityVec(), SwsVector.class);
	}
	@Ptr 
	protected native static long sws_getIdentityVec();
	/**
	 * Scale all the coefficients of a by the scalar value.<br>
	 * Original signature : <code>void sws_scaleVec(SwsVector*, double)</code><br>
	 * <i>native declaration : libswscale/swscale.h:166</i>
	 */
	public static void sws_scaleVec(Pointer<SwsVector > a, double scalar) {
		sws_scaleVec(Pointer.getPeer(a), scalar);
	}
	protected native static void sws_scaleVec(@Ptr long a, double scalar);
	/**
	 * Scale all the coefficients of a so that their sum equals height.<br>
	 * Original signature : <code>void sws_normalizeVec(SwsVector*, double)</code><br>
	 * <i>native declaration : libswscale/swscale.h:171</i>
	 */
	public static void sws_normalizeVec(Pointer<SwsVector > a, double height) {
		sws_normalizeVec(Pointer.getPeer(a), height);
	}
	protected native static void sws_normalizeVec(@Ptr long a, double height);
	/**
	 * Original signature : <code>void sws_convVec(SwsVector*, SwsVector*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:173</i>
	 */
	public static void sws_convVec(Pointer<SwsVector > a, Pointer<SwsVector > b) {
		sws_convVec(Pointer.getPeer(a), Pointer.getPeer(b));
	}
	protected native static void sws_convVec(@Ptr long a, @Ptr long b);
	/**
	 * Original signature : <code>void sws_addVec(SwsVector*, SwsVector*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:175</i>
	 */
	public static void sws_addVec(Pointer<SwsVector > a, Pointer<SwsVector > b) {
		sws_addVec(Pointer.getPeer(a), Pointer.getPeer(b));
	}
	protected native static void sws_addVec(@Ptr long a, @Ptr long b);
	/**
	 * Original signature : <code>void sws_subVec(SwsVector*, SwsVector*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:177</i>
	 */
	public static void sws_subVec(Pointer<SwsVector > a, Pointer<SwsVector > b) {
		sws_subVec(Pointer.getPeer(a), Pointer.getPeer(b));
	}
	protected native static void sws_subVec(@Ptr long a, @Ptr long b);
	/**
	 * Original signature : <code>void sws_shiftVec(SwsVector*, int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:179</i>
	 */
	public static void sws_shiftVec(Pointer<SwsVector > a, int shift) {
		sws_shiftVec(Pointer.getPeer(a), shift);
	}
	protected native static void sws_shiftVec(@Ptr long a, int shift);
	/**
	 * Allocate and return a clone of the vector a, that is a vector<br>
	 * with the same coefficients as a.<br>
	 * Original signature : <code>SwsVector* sws_cloneVec(SwsVector*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:185</i>
	 */
	public static Pointer<SwsVector > sws_cloneVec(Pointer<SwsVector > a) {
		return Pointer.pointerToAddress(sws_cloneVec(Pointer.getPeer(a)), SwsVector.class);
	}
	@Ptr 
	protected native static long sws_cloneVec(@Ptr long a);
	/**
	 * Print with av_log() a textual representation of the vector a<br>
	 * if log_level <= av_log_level.<br>
	 * Original signature : <code>void sws_printVec2(SwsVector*, AVClass*, int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:191</i>
	 */
	public static void sws_printVec2(Pointer<SwsVector > a, Pointer<AVClass > log_ctx, int log_level) {
		sws_printVec2(Pointer.getPeer(a), Pointer.getPeer(log_ctx), log_level);
	}
	protected native static void sws_printVec2(@Ptr long a, @Ptr long log_ctx, int log_level);
	/**
	 * Original signature : <code>void sws_freeVec(SwsVector*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:193</i>
	 */
	public static void sws_freeVec(Pointer<SwsVector > a) {
		sws_freeVec(Pointer.getPeer(a));
	}
	protected native static void sws_freeVec(@Ptr long a);
	/**
	 * Original signature : <code>SwsFilter* sws_getDefaultFilter(float, float, float, float, float, float, int)</code><br>
	 * <i>native declaration : libswscale/swscale.h:195</i>
	 */
	public static Pointer<SwsFilter > sws__getDefaultFilter(float lumaGBlur, float chromaGBlur, float lumaSharpen, float chromaSharpen, float chromaHShift, float chromaVShift, int verbose) {
		return Pointer.pointerToAddress(sws_getDefaultFilter(lumaGBlur, chromaGBlur, lumaSharpen, chromaSharpen, chromaHShift, chromaVShift, verbose), SwsFilter.class);
	}
	@Ptr 
	protected native static long sws_getDefaultFilter(float lumaGBlur, float chromaGBlur, float lumaSharpen, float chromaSharpen, float chromaHShift, float chromaVShift, int verbose);
	/**
	 * Original signature : <code>void sws_freeFilter(SwsFilter*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:197</i>
	 */
	public static void sws_freeFilter(Pointer<SwsFilter > filter) {
		sws_freeFilter(Pointer.getPeer(filter));
	}
	protected native static void sws_freeFilter(@Ptr long filter);
	/**
	 * Check if context can be reused, otherwise reallocate a new one.<br>
	 * * If context is NULL, just calls sws_getContext() to get a new<br>
	 * context. Otherwise, checks if the parameters are the ones already<br>
	 * saved in context. If that is the case, returns the current<br>
	 * context. Otherwise, frees context and gets a new context with<br>
	 * the new parameters.<br>
	 * * Be warned that srcFilter and dstFilter are not checked, they<br>
	 * are assumed to remain the same.<br>
	 * Original signature : <code>SwsContext* sws_getCachedContext(SwsContext*, int, int, AVPixelFormat, int, int, AVPixelFormat, int, SwsFilter*, SwsFilter*, const double*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:209</i>
	 */
	public static Pointer<SwscaleLibrary.SwsContext > sws_getCachedContext(Pointer<SwscaleLibrary.SwsContext > context, int srcW, int srcH, IntValuedEnum<AVPixelFormat > srcFormat, int dstW, int dstH, IntValuedEnum<AVPixelFormat > dstFormat, int flags, Pointer<SwsFilter > srcFilter, Pointer<SwsFilter > dstFilter, Pointer<Double > param) {
		return Pointer.pointerToAddress(sws_getCachedContext(Pointer.getPeer(context), srcW, srcH, (int)srcFormat.value(), dstW, dstH, (int)dstFormat.value(), flags, Pointer.getPeer(srcFilter), Pointer.getPeer(dstFilter), Pointer.getPeer(param)), SwscaleLibrary.SwsContext.class);
	}
	@Ptr 
	protected native static long sws_getCachedContext(@Ptr long context, int srcW, int srcH, int srcFormat, int dstW, int dstH, int dstFormat, int flags, @Ptr long srcFilter, @Ptr long dstFilter, @Ptr long param);
	/**
	 * Convert an 8-bit paletted frame into a frame with a color depth of 32 bits.<br>
	 * * The output frame will have the same packed format as the palette.<br>
	 * * @param src        source frame buffer<br>
	 * @param dst        destination frame buffer<br>
	 * @param num_pixels number of pixels to convert<br>
	 * @param palette    array with [256] entries, which must match color arrangement (RGB or BGR) of src<br>
	 * Original signature : <code>void sws_convertPalette8ToPacked32(const uint8_t*, uint8_t*, int, const uint8_t*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:219</i>
	 */
	public static void sws_convertPalette8ToPacked32(Pointer<Byte > src, Pointer<Byte > dst, int num_pixels, Pointer<Byte > palette) {
		sws_convertPalette8ToPacked32(Pointer.getPeer(src), Pointer.getPeer(dst), num_pixels, Pointer.getPeer(palette));
	}
	protected native static void sws_convertPalette8ToPacked32(@Ptr long src, @Ptr long dst, int num_pixels, @Ptr long palette);
	/**
	 * Convert an 8-bit paletted frame into a frame with a color depth of 24 bits.<br>
	 * * With the palette format "ABCD", the destination frame ends up with the format "ABC".<br>
	 * * @param src        source frame buffer<br>
	 * @param dst        destination frame buffer<br>
	 * @param num_pixels number of pixels to convert<br>
	 * @param palette    array with [256] entries, which must match color arrangement (RGB or BGR) of src<br>
	 * Original signature : <code>void sws_convertPalette8ToPacked24(const uint8_t*, uint8_t*, int, const uint8_t*)</code><br>
	 * <i>native declaration : libswscale/swscale.h:229</i>
	 */
	public static void sws_convertPalette8ToPacked24(Pointer<Byte > src, Pointer<Byte > dst, int num_pixels, Pointer<Byte > palette) {
		sws_convertPalette8ToPacked24(Pointer.getPeer(src), Pointer.getPeer(dst), num_pixels, Pointer.getPeer(palette));
	}
	protected native static void sws_convertPalette8ToPacked24(@Ptr long src, @Ptr long dst, int num_pixels, @Ptr long palette);
	/**
	 * Get the AVClass for swsContext. It can be used in combination with<br>
	 * AV_OPT_SEARCH_FAKE_OBJ for examining options.<br>
	 * * @see av_opt_find().<br>
	 * Original signature : <code>AVClass* sws_get_class()</code><br>
	 * <i>native declaration : libswscale/swscale.h:236</i>
	 */
	public static Pointer<AVClass > sws__get_class() {
		return Pointer.pointerToAddress(sws_get_class(), AVClass.class);
	}
	@Ptr 
	protected native static long sws_get_class();
	/** Undefined type */
	public static interface SwsContext {
		
	};
}
