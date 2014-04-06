package org.ffmpeg.avutil;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
/**
 * Wrapper for library <b>avutil</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avutil") 
@Runtime(CRuntime.class) 
public class AvutilLibrary {
	static {
		BridJ.register();
	}
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/avutil.h:13</i>
	 */
	public enum AVMediaType implements IntValuedEnum<AVMediaType > {
		/** < Usually treated as AVMEDIA_TYPE_DATA */
		AVMEDIA_TYPE_UNKNOWN(-1),
		AVMEDIA_TYPE_VIDEO(0),
		AVMEDIA_TYPE_AUDIO(1),
		/** < Opaque data information usually continuous */
		AVMEDIA_TYPE_DATA(2),
		AVMEDIA_TYPE_SUBTITLE(3),
		/** < Opaque data information usually sparse */
		AVMEDIA_TYPE_ATTACHMENT(4),
		AVMEDIA_TYPE_NB(5);
		AVMediaType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVMediaType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVMediaType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/avutil.h:33</i>
	 */
	public enum AVPictureType implements IntValuedEnum<AVPictureType > {
		/** < Undefined */
		AV_PICTURE_TYPE_NONE(0),
		/** < Intra */
		AV_PICTURE_TYPE_I(1),
		/** < Predicted */
		AV_PICTURE_TYPE_P(2),
		/** < Bi-dir predicted */
		AV_PICTURE_TYPE_B(3),
		/** < S(GMC)-VOP MPEG4 */
		AV_PICTURE_TYPE_S(4),
		/** < Switching Intra */
		AV_PICTURE_TYPE_SI(5),
		/** < Switching Predicted */
		AV_PICTURE_TYPE_SP(6),
		/** < BI type */
		AV_PICTURE_TYPE_BI(7);
		AVPictureType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVPictureType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVPictureType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/samplefmt.h:24</i>
	 */
	public enum AVSampleFormat implements IntValuedEnum<AVSampleFormat > {
		AV_SAMPLE_FMT_NONE(-1),
		/** < unsigned 8 bits */
		AV_SAMPLE_FMT_U8(0),
		/** < signed 16 bits */
		AV_SAMPLE_FMT_S16(1),
		/** < signed 32 bits */
		AV_SAMPLE_FMT_S32(2),
		/** < float */
		AV_SAMPLE_FMT_FLT(3),
		/** < double */
		AV_SAMPLE_FMT_DBL(4),
		/** < unsigned 8 bits, planar */
		AV_SAMPLE_FMT_U8P(5),
		/** < signed 16 bits, planar */
		AV_SAMPLE_FMT_S16P(6),
		/** < signed 32 bits, planar */
		AV_SAMPLE_FMT_S32P(7),
		/** < float, planar */
		AV_SAMPLE_FMT_FLTP(8),
		/** < double, planar */
		AV_SAMPLE_FMT_DBLP(9),
		/** < Number of sample formats. DO NOT USE if linking dynamically */
		AV_SAMPLE_FMT_NB(10);
		AVSampleFormat(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVSampleFormat > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVSampleFormat > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/frame.h:19</i>
	 */
	public enum AVColorSpace implements IntValuedEnum<AVColorSpace > {
		AVCOL_SPC_RGB(0),
		/** < also ITU-R BT1361 / IEC 61966-2-4 xvYCC709 / SMPTE RP177 Annex B */
		AVCOL_SPC_BT709(1),
		AVCOL_SPC_UNSPECIFIED(2),
		AVCOL_SPC_FCC(4),
		/** < also ITU-R BT601-6 625 / ITU-R BT1358 625 / ITU-R BT1700 625 PAL & SECAM / IEC 61966-2-4 xvYCC601 */
		AVCOL_SPC_BT470BG(5),
		/** < also ITU-R BT601-6 525 / ITU-R BT1358 525 / ITU-R BT1700 NTSC / functionally identical to above */
		AVCOL_SPC_SMPTE170M(6),
		AVCOL_SPC_SMPTE240M(7),
		/** < Used by Dirac / VC-2 and H.264 FRext, see ITU-T SG16 */
		AVCOL_SPC_YCOCG(8),
		/** < ITU-R BT2020 non-constant luminance system */
		AVCOL_SPC_BT2020_NCL(9),
		/** < ITU-R BT2020 constant luminance system */
		AVCOL_SPC_BT2020_CL(10),
		/** < Not part of ABI */
		AVCOL_SPC_NB(11);
		AVColorSpace(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVColorSpace > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVColorSpace > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/frame.h:28</i>
	 */
	public enum AVColorRange implements IntValuedEnum<AVColorRange > {
		AVCOL_RANGE_UNSPECIFIED(0),
		/** < the normal 219*2^(n-8) "MPEG" YUV ranges */
		AVCOL_RANGE_MPEG(1),
		/** < the normal     2^n-1   "JPEG" YUV ranges */
		AVCOL_RANGE_JPEG(2),
		/** < Not part of ABI */
		AVCOL_RANGE_NB(3);
		AVColorRange(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVColorRange > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVColorRange > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/frame.h:35</i>
	 */
	public enum AVFrameSideDataType implements IntValuedEnum<AVFrameSideDataType > {
		AV_FRAME_DATA_PANSCAN(0),
		AV_FRAME_DATA_A53_CC(1),
		AV_FRAME_DATA_STEREO3D(2),
		AV_FRAME_DATA_MATRIXENCODING(3),
		AV_FRAME_DATA_DOWNMIX_INFO(4);
		AVFrameSideDataType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVFrameSideDataType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVFrameSideDataType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/opt.h:20</i>
	 */
	public enum AVOptionType implements IntValuedEnum<AVOptionType > {
		AV_OPT_TYPE_FLAGS(0),
		AV_OPT_TYPE_INT(1),
		AV_OPT_TYPE_INT64(2),
		AV_OPT_TYPE_DOUBLE(3),
		AV_OPT_TYPE_FLOAT(4),
		AV_OPT_TYPE_STRING(5),
		AV_OPT_TYPE_RATIONAL(6),
		/** < offset must point to a pointer immediately followed by an int for the length */
		AV_OPT_TYPE_BINARY(7),
		AV_OPT_TYPE_CONST(128),
		/** < offset must point to two consecutive integers */
		AV_OPT_TYPE_IMAGE_SIZE((('E') | (('Z') << 8) | (('I') << 16) | ('S' << 24))),
		AV_OPT_TYPE_PIXEL_FMT((('T') | (('M') << 8) | (('F') << 16) | ('P' << 24))),
		AV_OPT_TYPE_SAMPLE_FMT((('T') | (('M') << 8) | (('F') << 16) | ('S' << 24))),
		/** < offset must point to AVRational */
		AV_OPT_TYPE_VIDEO_RATE((('T') | (('A') << 8) | (('R') << 16) | ('V' << 24))),
		AV_OPT_TYPE_DURATION(((' ') | (('R') << 8) | (('U') << 16) | ('D' << 24))),
		AV_OPT_TYPE_COLOR((('R') | (('L') << 8) | (('O') << 16) | ('C' << 24))),
		AV_OPT_TYPE_CHANNEL_LAYOUT((('A') | (('L') << 8) | (('H') << 16) | ('C' << 24)));
		AVOptionType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVOptionType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVOptionType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/log.h:13</i>
	 */
	public enum AVClassCategory implements IntValuedEnum<AVClassCategory > {
		AV_CLASS_CATEGORY_NA(0),
		AV_CLASS_CATEGORY_INPUT(1),
		AV_CLASS_CATEGORY_OUTPUT(2),
		AV_CLASS_CATEGORY_MUXER(3),
		AV_CLASS_CATEGORY_DEMUXER(4),
		AV_CLASS_CATEGORY_ENCODER(5),
		AV_CLASS_CATEGORY_DECODER(6),
		AV_CLASS_CATEGORY_FILTER(7),
		AV_CLASS_CATEGORY_BITSTREAM_FILTER(8),
		AV_CLASS_CATEGORY_SWSCALER(9),
		AV_CLASS_CATEGORY_SWRESAMPLER(10),
		AV_CLASS_CATEGORY_NB(11);
		AVClassCategory(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVClassCategory > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVClassCategory > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavutil/pixfmt.h:315</i>
	 */
	public enum AVPixelFormat implements IntValuedEnum<AVPixelFormat > {
		AV_PIX_FMT_NONE(-1),
		/** < planar YUV 4:2:0, 12bpp, (1 Cr & Cb sample per 2x2 Y samples) */
		AV_PIX_FMT_YUV420P(0),
		/** < packed YUV 4:2:2, 16bpp, Y0 Cb Y1 Cr */
		AV_PIX_FMT_YUYV422(1),
		/** < packed RGB 8:8:8, 24bpp, RGBRGB... */
		AV_PIX_FMT_RGB24(2),
		/** < packed RGB 8:8:8, 24bpp, BGRBGR... */
		AV_PIX_FMT_BGR24(3),
		/** < planar YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples) */
		AV_PIX_FMT_YUV422P(4),
		/** < planar YUV 4:4:4, 24bpp, (1 Cr & Cb sample per 1x1 Y samples) */
		AV_PIX_FMT_YUV444P(5),
		/** < planar YUV 4:1:0,  9bpp, (1 Cr & Cb sample per 4x4 Y samples) */
		AV_PIX_FMT_YUV410P(6),
		/** < planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples) */
		AV_PIX_FMT_YUV411P(7),
		/** <        Y        ,  8bpp */
		AV_PIX_FMT_GRAY8(8),
		/** <        Y        ,  1bpp, 0 is white, 1 is black, in each byte pixels are ordered from the msb to the lsb */
		AV_PIX_FMT_MONOWHITE(9),
		/** <        Y        ,  1bpp, 0 is black, 1 is white, in each byte pixels are ordered from the msb to the lsb */
		AV_PIX_FMT_MONOBLACK(10),
		/** < 8 bit with PIX_FMT_RGB32 palette */
		AV_PIX_FMT_PAL8(11),
		/** < planar YUV 4:2:0, 12bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV420P and setting color_range */
		AV_PIX_FMT_YUVJ420P(12),
		/** < planar YUV 4:2:2, 16bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV422P and setting color_range */
		AV_PIX_FMT_YUVJ422P(13),
		/** < planar YUV 4:4:4, 24bpp, full scale (JPEG), deprecated in favor of PIX_FMT_YUV444P and setting color_range */
		AV_PIX_FMT_YUVJ444P(14),
		/** < XVideo Motion Acceleration via common packet passing */
		AV_PIX_FMT_XVMC_MPEG2_MC(15),
		AV_PIX_FMT_XVMC_MPEG2_IDCT(16),
		/** < packed YUV 4:2:2, 16bpp, Cb Y0 Cr Y1 */
		AV_PIX_FMT_UYVY422(17),
		/** < packed YUV 4:1:1, 12bpp, Cb Y0 Y1 Cr Y2 Y3 */
		AV_PIX_FMT_UYYVYY411(18),
		/** < packed RGB 3:3:2,  8bpp, (msb)2B 3G 3R(lsb) */
		AV_PIX_FMT_BGR8(19),
		/** < packed RGB 1:2:1 bitstream,  4bpp, (msb)1B 2G 1R(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits */
		AV_PIX_FMT_BGR4(20),
		/** < packed RGB 1:2:1,  8bpp, (msb)1B 2G 1R(lsb) */
		AV_PIX_FMT_BGR4_BYTE(21),
		/** < packed RGB 3:3:2,  8bpp, (msb)2R 3G 3B(lsb) */
		AV_PIX_FMT_RGB8(22),
		/** < packed RGB 1:2:1 bitstream,  4bpp, (msb)1R 2G 1B(lsb), a byte contains two pixels, the first pixel in the byte is the one composed by the 4 msb bits */
		AV_PIX_FMT_RGB4(23),
		/** < packed RGB 1:2:1,  8bpp, (msb)1R 2G 1B(lsb) */
		AV_PIX_FMT_RGB4_BYTE(24),
		/** < planar YUV 4:2:0, 12bpp, 1 plane for Y and 1 plane for the UV components, which are interleaved (first byte U and the following byte V) */
		AV_PIX_FMT_NV12(25),
		/** < as above, but U and V bytes are swapped */
		AV_PIX_FMT_NV21(26),
		/** < packed ARGB 8:8:8:8, 32bpp, ARGBARGB... */
		AV_PIX_FMT_ARGB(27),
		/** < packed RGBA 8:8:8:8, 32bpp, RGBARGBA... */
		AV_PIX_FMT_RGBA(28),
		/** < packed ABGR 8:8:8:8, 32bpp, ABGRABGR... */
		AV_PIX_FMT_ABGR(29),
		/** < packed BGRA 8:8:8:8, 32bpp, BGRABGRA... */
		AV_PIX_FMT_BGRA(30),
		/** <        Y        , 16bpp, big-endian */
		AV_PIX_FMT_GRAY16BE(31),
		/** <        Y        , 16bpp, little-endian */
		AV_PIX_FMT_GRAY16LE(32),
		/** < planar YUV 4:4:0 (1 Cr & Cb sample per 1x2 Y samples) */
		AV_PIX_FMT_YUV440P(33),
		/** < planar YUV 4:4:0 full scale (JPEG), deprecated in favor of PIX_FMT_YUV440P and setting color_range */
		AV_PIX_FMT_YUVJ440P(34),
		/** < planar YUV 4:2:0, 20bpp, (1 Cr & Cb sample per 2x2 Y & A samples) */
		AV_PIX_FMT_YUVA420P(35),
		/** < packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as big-endian */
		AV_PIX_FMT_RGB48BE(36),
		/** < packed RGB 16:16:16, 48bpp, 16R, 16G, 16B, the 2-byte value for each R/G/B component is stored as little-endian */
		AV_PIX_FMT_RGB48LE(37),
		/** < packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), big-endian */
		AV_PIX_FMT_RGB565BE(38),
		/** < packed RGB 5:6:5, 16bpp, (msb)   5R 6G 5B(lsb), little-endian */
		AV_PIX_FMT_RGB565LE(39),
		/** < packed RGB 5:5:5, 16bpp, (msb)1A 5R 5G 5B(lsb), big-endian, most significant bit to 0 */
		AV_PIX_FMT_RGB555BE(40),
		/** < packed RGB 5:5:5, 16bpp, (msb)1A 5R 5G 5B(lsb), little-endian, most significant bit to 0 */
		AV_PIX_FMT_RGB555LE(41),
		/** < packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), big-endian */
		AV_PIX_FMT_BGR565BE(42),
		/** < packed BGR 5:6:5, 16bpp, (msb)   5B 6G 5R(lsb), little-endian */
		AV_PIX_FMT_BGR565LE(43),
		/** < packed BGR 5:5:5, 16bpp, (msb)1A 5B 5G 5R(lsb), big-endian, most significant bit to 1 */
		AV_PIX_FMT_BGR555BE(44),
		/** < packed BGR 5:5:5, 16bpp, (msb)1A 5B 5G 5R(lsb), little-endian, most significant bit to 1 */
		AV_PIX_FMT_BGR555LE(45),
		/** < HW acceleration through VA API at motion compensation entry-point, Picture.data[3] contains a vaapi_render_state struct which contains macroblocks as well as various fields extracted from headers */
		AV_PIX_FMT_VAAPI_MOCO(46),
		/** < HW acceleration through VA API at IDCT entry-point, Picture.data[3] contains a vaapi_render_state struct which contains fields extracted from headers */
		AV_PIX_FMT_VAAPI_IDCT(47),
		/** < HW decoding through VA API, Picture.data[3] contains a vaapi_render_state struct which contains the bitstream of the slices as well as various fields extracted from headers */
		AV_PIX_FMT_VAAPI_VLD(48),
		/** < planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
		AV_PIX_FMT_YUV420P16LE(49),
		/** < planar YUV 4:2:0, 24bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
		AV_PIX_FMT_YUV420P16BE(50),
		/** < planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_YUV422P16LE(51),
		/** < planar YUV 4:2:2, 32bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_YUV422P16BE(52),
		/** < planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
		AV_PIX_FMT_YUV444P16LE(53),
		/** < planar YUV 4:4:4, 48bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
		AV_PIX_FMT_YUV444P16BE(54),
		/** < HW decoding through DXVA2, Picture.data[3] contains a LPDIRECT3DSURFACE9 pointer */
		AV_PIX_FMT_DXVA2_VLD(55),
		/** < packed RGB 4:4:4, 16bpp, (msb)4A 4R 4G 4B(lsb), little-endian, most significant bits to 0 */
		AV_PIX_FMT_RGB444LE(56),
		/** < packed RGB 4:4:4, 16bpp, (msb)4A 4R 4G 4B(lsb), big-endian, most significant bits to 0 */
		AV_PIX_FMT_RGB444BE(57),
		/** < packed BGR 4:4:4, 16bpp, (msb)4A 4B 4G 4R(lsb), little-endian, most significant bits to 1 */
		AV_PIX_FMT_BGR444LE(58),
		/** < packed BGR 4:4:4, 16bpp, (msb)4A 4B 4G 4R(lsb), big-endian, most significant bits to 1 */
		AV_PIX_FMT_BGR444BE(59),
		/** < 8bit gray, 8bit alpha */
		AV_PIX_FMT_GRAY8A(60),
		/** < packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as big-endian */
		AV_PIX_FMT_BGR48BE(61),
		/** < packed RGB 16:16:16, 48bpp, 16B, 16G, 16R, the 2-byte value for each R/G/B component is stored as little-endian */
		AV_PIX_FMT_BGR48LE(62),
		/**
		 * The following 12 formats have the disadvantage of needing 1 format for each bit depth.<br>
		 * Notice that each 9/10 bits sample is stored in 16 bits with extra padding.<br>
		 * If you want to support multiple bit depths, then using AV_PIX_FMT_YUV420P16* with the bpp stored separately is better.<br>
		 * < planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian
		 */
		AV_PIX_FMT_YUV420P9BE(63),
		/** < planar YUV 4:2:0, 13.5bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
		AV_PIX_FMT_YUV420P9LE(64),
		/** < planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
		AV_PIX_FMT_YUV420P10BE(65),
		/** < planar YUV 4:2:0, 15bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
		AV_PIX_FMT_YUV420P10LE(66),
		/** < planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_YUV422P10BE(67),
		/** < planar YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_YUV422P10LE(68),
		/** < planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
		AV_PIX_FMT_YUV444P9BE(69),
		/** < planar YUV 4:4:4, 27bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
		AV_PIX_FMT_YUV444P9LE(70),
		/** < planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
		AV_PIX_FMT_YUV444P10BE(71),
		/** < planar YUV 4:4:4, 30bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
		AV_PIX_FMT_YUV444P10LE(72),
		/** < planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_YUV422P9BE(73),
		/** < planar YUV 4:2:2, 18bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_YUV422P9LE(74),
		/** < hardware decoding through VDA */
		AV_PIX_FMT_VDA_VLD(75),
		/** < planar GBR 4:4:4 24bpp */
		AV_PIX_FMT_GBRP(76),
		/** < planar GBR 4:4:4 27bpp, big-endian */
		AV_PIX_FMT_GBRP9BE(77),
		/** < planar GBR 4:4:4 27bpp, little-endian */
		AV_PIX_FMT_GBRP9LE(78),
		/** < planar GBR 4:4:4 30bpp, big-endian */
		AV_PIX_FMT_GBRP10BE(79),
		/** < planar GBR 4:4:4 30bpp, little-endian */
		AV_PIX_FMT_GBRP10LE(80),
		/** < planar GBR 4:4:4 48bpp, big-endian */
		AV_PIX_FMT_GBRP16BE(81),
		/** < planar GBR 4:4:4 48bpp, little-endian */
		AV_PIX_FMT_GBRP16LE(82),
		/**
		 * duplicated pixel formats for compatibility with libav.<br>
		 * FFmpeg supports these formats since May 8 2012 and Jan 28 2012 (commits f9ca1ac7 and 143a5c55)<br>
		 * Libav added them Oct 12 2012 with incompatible values (commit 6d5600e85)<br>
		 * < planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples)
		 */
		AV_PIX_FMT_YUVA422P_LIBAV(83),
		/** < planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples) */
		AV_PIX_FMT_YUVA444P_LIBAV(84),
		/** < planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), big-endian */
		AV_PIX_FMT_YUVA420P9BE(85),
		/** < planar YUV 4:2:0 22.5bpp, (1 Cr & Cb sample per 2x2 Y & A samples), little-endian */
		AV_PIX_FMT_YUVA420P9LE(86),
		/** < planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), big-endian */
		AV_PIX_FMT_YUVA422P9BE(87),
		/** < planar YUV 4:2:2 27bpp, (1 Cr & Cb sample per 2x1 Y & A samples), little-endian */
		AV_PIX_FMT_YUVA422P9LE(88),
		/** < planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), big-endian */
		AV_PIX_FMT_YUVA444P9BE(89),
		/** < planar YUV 4:4:4 36bpp, (1 Cr & Cb sample per 1x1 Y & A samples), little-endian */
		AV_PIX_FMT_YUVA444P9LE(90),
		/** < planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA420P10BE(91),
		/** < planar YUV 4:2:0 25bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA420P10LE(92),
		/** < planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA422P10BE(93),
		/** < planar YUV 4:2:2 30bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA422P10LE(94),
		/** < planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA444P10BE(95),
		/** < planar YUV 4:4:4 40bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA444P10LE(96),
		/** < planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA420P16BE(97),
		/** < planar YUV 4:2:0 40bpp, (1 Cr & Cb sample per 2x2 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA420P16LE(98),
		/** < planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA422P16BE(99),
		/** < planar YUV 4:2:2 48bpp, (1 Cr & Cb sample per 2x1 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA422P16LE(100),
		/** < planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, big-endian) */
		AV_PIX_FMT_YUVA444P16BE(101),
		/** < planar YUV 4:4:4 64bpp, (1 Cr & Cb sample per 1x1 Y & A samples, little-endian) */
		AV_PIX_FMT_YUVA444P16LE(102),
		/** < HW acceleration through VDPAU, Picture.data[3] contains a VdpVideoSurface */
		AV_PIX_FMT_VDPAU(103),
		/** < packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as little-endian, the 4 lower bits are set to 0 */
		AV_PIX_FMT_XYZ12LE(104),
		/** < packed XYZ 4:4:4, 36 bpp, (msb) 12X, 12Y, 12Z (lsb), the 2-byte value for each X/Y/Z is stored as big-endian, the 4 lower bits are set to 0 */
		AV_PIX_FMT_XYZ12BE(105),
		/** < interleaved chroma YUV 4:2:2, 16bpp, (1 Cr & Cb sample per 2x1 Y samples) */
		AV_PIX_FMT_NV16(106),
		/** < interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_NV20LE(107),
		/** < interleaved chroma YUV 4:2:2, 20bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_NV20BE(108),
		/** < packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
		AV_PIX_FMT_RGBA64BE(0x123),
		/** < packed RGBA 16:16:16:16, 64bpp, 16R, 16G, 16B, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
		AV_PIX_FMT_RGBA64LE((0x123 + 1)),
		/** < packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as big-endian */
		AV_PIX_FMT_BGRA64BE((0x123 + 2)),
		/** < packed RGBA 16:16:16:16, 64bpp, 16B, 16G, 16R, 16A, the 2-byte value for each R/G/B/A component is stored as little-endian */
		AV_PIX_FMT_BGRA64LE((0x123 + 3)),
		/** < packed RGB 8:8:8, 32bpp, 0RGB0RGB... */
		AV_PIX_FMT_0RGB(0x123 + 4),
		/** < packed RGB 8:8:8, 32bpp, RGB0RGB0... */
		AV_PIX_FMT_RGB0((0x123 + 4 + 1)),
		/** < packed BGR 8:8:8, 32bpp, 0BGR0BGR... */
		AV_PIX_FMT_0BGR((0x123 + 4 + 2)),
		/** < packed BGR 8:8:8, 32bpp, BGR0BGR0... */
		AV_PIX_FMT_BGR0((0x123 + 4 + 3)),
		/** < planar YUV 4:4:4 32bpp, (1 Cr & Cb sample per 1x1 Y & A samples) */
		AV_PIX_FMT_YUVA444P((0x123 + 4 + 4)),
		/** < planar YUV 4:2:2 24bpp, (1 Cr & Cb sample per 2x1 Y & A samples) */
		AV_PIX_FMT_YUVA422P((0x123 + 4 + 5)),
		/** < planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
		AV_PIX_FMT_YUV420P12BE((0x123 + 4 + 6)),
		/** < planar YUV 4:2:0,18bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
		AV_PIX_FMT_YUV420P12LE((0x123 + 4 + 7)),
		/** < planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), big-endian */
		AV_PIX_FMT_YUV420P14BE((0x123 + 4 + 8)),
		/** < planar YUV 4:2:0,21bpp, (1 Cr & Cb sample per 2x2 Y samples), little-endian */
		AV_PIX_FMT_YUV420P14LE((0x123 + 4 + 9)),
		/** < planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_YUV422P12BE((0x123 + 4 + 10)),
		/** < planar YUV 4:2:2,24bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_YUV422P12LE((0x123 + 4 + 11)),
		/** < planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), big-endian */
		AV_PIX_FMT_YUV422P14BE((0x123 + 4 + 12)),
		/** < planar YUV 4:2:2,28bpp, (1 Cr & Cb sample per 2x1 Y samples), little-endian */
		AV_PIX_FMT_YUV422P14LE((0x123 + 4 + 13)),
		/** < planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
		AV_PIX_FMT_YUV444P12BE((0x123 + 4 + 14)),
		/** < planar YUV 4:4:4,36bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
		AV_PIX_FMT_YUV444P12LE((0x123 + 4 + 15)),
		/** < planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), big-endian */
		AV_PIX_FMT_YUV444P14BE((0x123 + 4 + 16)),
		/** < planar YUV 4:4:4,42bpp, (1 Cr & Cb sample per 1x1 Y samples), little-endian */
		AV_PIX_FMT_YUV444P14LE((0x123 + 4 + 17)),
		/** < planar GBR 4:4:4 36bpp, big-endian */
		AV_PIX_FMT_GBRP12BE((0x123 + 4 + 18)),
		/** < planar GBR 4:4:4 36bpp, little-endian */
		AV_PIX_FMT_GBRP12LE((0x123 + 4 + 19)),
		/** < planar GBR 4:4:4 42bpp, big-endian */
		AV_PIX_FMT_GBRP14BE((0x123 + 4 + 20)),
		/** < planar GBR 4:4:4 42bpp, little-endian */
		AV_PIX_FMT_GBRP14LE((0x123 + 4 + 21)),
		/** < planar GBRA 4:4:4:4 32bpp */
		AV_PIX_FMT_GBRAP((0x123 + 4 + 22)),
		/** < planar GBRA 4:4:4:4 64bpp, big-endian */
		AV_PIX_FMT_GBRAP16BE((0x123 + 4 + 23)),
		/** < planar GBRA 4:4:4:4 64bpp, little-endian */
		AV_PIX_FMT_GBRAP16LE((0x123 + 4 + 24)),
		/** < planar YUV 4:1:1, 12bpp, (1 Cr & Cb sample per 4x1 Y samples) full scale (JPEG), deprecated in favor of PIX_FMT_YUV411P and setting color_range */
		AV_PIX_FMT_YUVJ411P((0x123 + 4 + 25)),
		/** < bayer, BGBG..(odd line), GRGR..(even line), 8-bit samples * / */
		AV_PIX_FMT_BAYER_BGGR8((0x123 + 4 + 26)),
		/** < bayer, RGRG..(odd line), GBGB..(even line), 8-bit samples * / */
		AV_PIX_FMT_BAYER_RGGB8((0x123 + 4 + 27)),
		/** < bayer, GBGB..(odd line), RGRG..(even line), 8-bit samples * / */
		AV_PIX_FMT_BAYER_GBRG8((0x123 + 4 + 28)),
		/** < bayer, GRGR..(odd line), BGBG..(even line), 8-bit samples * / */
		AV_PIX_FMT_BAYER_GRBG8((0x123 + 4 + 29)),
		/** < bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, little-endian * / */
		AV_PIX_FMT_BAYER_BGGR16LE((0x123 + 4 + 30)),
		/** < bayer, BGBG..(odd line), GRGR..(even line), 16-bit samples, big-endian * / */
		AV_PIX_FMT_BAYER_BGGR16BE((0x123 + 4 + 31)),
		/** < bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, little-endian * / */
		AV_PIX_FMT_BAYER_RGGB16LE((0x123 + 4 + 32)),
		/** < bayer, RGRG..(odd line), GBGB..(even line), 16-bit samples, big-endian * / */
		AV_PIX_FMT_BAYER_RGGB16BE((0x123 + 4 + 33)),
		/** < bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, little-endian * / */
		AV_PIX_FMT_BAYER_GBRG16LE((0x123 + 4 + 34)),
		/** < bayer, GBGB..(odd line), RGRG..(even line), 16-bit samples, big-endian * / */
		AV_PIX_FMT_BAYER_GBRG16BE((0x123 + 4 + 35)),
		/** < bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, little-endian * / */
		AV_PIX_FMT_BAYER_GRBG16LE((0x123 + 4 + 36)),
		/** < bayer, GRGR..(odd line), BGBG..(even line), 16-bit samples, big-endian * / */
		AV_PIX_FMT_BAYER_GRBG16BE((0x123 + 4 + 37)),
		/** < number of pixel formats, DO NOT USE THIS if you want to link with shared libav* because the number of formats might differ between versions */
		AV_PIX_FMT_NB((0x123 + 4 + 38));
		AVPixelFormat(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVPixelFormat > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVPixelFormat > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_CONTEXT_SIZE = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final int LIBAVUTIL_VERSION_INT = (int)(52 << 16 | 66 << 8 | 100);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_OLD_AVOPTIONS = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_SAMPLES_UTILS_RETURN_ZERO = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_IGNORE_SUFFIX = (int)2;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_PIX_FMT = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/frame.h</i> */
	public static final int FF_DECODE_ERROR_INVALID_BITSTREAM = (int)1;
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_APPEND = (int)32;
	/** <i>native declaration : libavutil/frame.h</i> */
	public static final int AV_NUM_DATA_POINTERS = (int)8;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_LLS1 = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final int LIBAVUTIL_BUILD = (int)(52 << 16 | 66 << 8 | 100);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_GET_CHANNEL_LAYOUT_COMPAT = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_CPU_FLAG_MMX2 = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/frame.h</i> */
	public static final int FF_DECODE_ERROR_MISSING_REFERENCE = (int)2;
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_MATCH_CASE = (int)1;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final int LIBAVUTIL_VERSION_MICRO = (int)100;
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_DONT_OVERWRITE = (int)16;
	/** <i>native declaration : libavutil/frame.h</i> */
	public static final int AV_FRAME_FLAG_CORRUPT = (int)(1 << 0);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_AUDIOCONVERT = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_OPT_TYPE_METADATA = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_OLD_OPENCL = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_LLS_PRIVATE = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_XVMC = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_PIX_FMT_DESC = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_DONT_STRDUP_KEY = (int)4;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_AV_REVERSE = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_INTFLOAT = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_AVFRAME_LAVC = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_GET_BITS_PER_SAMPLE_FMT = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/dict.h</i> */
	public static final int AV_DICT_DONT_STRDUP_VAL = (int)8;
	/**
	 * define<br>
	 * Conversion Error : 52.66.<br>
	 * SKIPPED:<br>
	 * <i>native declaration : libavutil/version.h:0</i><br>
	 * 52.66.
	 */
	/** <i>native declaration : libavutil/version.h</i> */
	public static final int LIBAVUTIL_VERSION_MINOR = (int)66;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_VDPAU = (boolean)(52 < 54);
	/** <i>native declaration : libavutil/version.h</i> */
	public static final String LIBAVUTIL_IDENT = (String)"Lavu52.66.100";
	/** <i>native declaration : libavutil/version.h</i> */
	public static final int LIBAVUTIL_VERSION_MAJOR = (int)52;
	/** <i>native declaration : libavutil/version.h</i> */
	public static final boolean FF_API_FIND_OPT = (boolean)(52 < 54);
	/**
	 * Original signature : <code>int avutil_version()</code><br>
	 * <i>native declaration : libavutil/avutil.h:1</i>
	 */
	public static native int avutil_version();
	/**
	 * Original signature : <code>char* av_get_media_type_string(AVMediaType)</code><br>
	 * <i>native declaration : libavutil/avutil.h:15</i>
	 */
	public static Pointer<Byte > av_get_media_type_string(IntValuedEnum<AvutilLibrary.AVMediaType > media_type) {
		return Pointer.pointerToAddress(av_get_media_type_string((int)media_type.value()), Byte.class);
	}
	@Ptr 
	protected native static long av_get_media_type_string(int media_type);
	/**
	 * Original signature : <code>void av_dict_copy(AVDictionary**, AVDictionary*, int)</code><br>
	 * <i>native declaration : libavutil/dict.h:5</i>
	 */
	public static void av_dict_copy(Pointer<Pointer<AVDictionary > > dst, Pointer<AVDictionary > src, int flags) {
		av_dict_copy(Pointer.getPeer(dst), Pointer.getPeer(src), flags);
	}
	protected native static void av_dict_copy(@Ptr long dst, @Ptr long src, int flags);
	/**
	 * Original signature : <code>void av_dict_free(AVDictionary**)</code><br>
	 * <i>native declaration : libavutil/dict.h:7</i>
	 */
	public static void av_dict_free(Pointer<Pointer<AVDictionary > > m) {
		av_dict_free(Pointer.getPeer(m));
	}
	protected native static void av_dict_free(@Ptr long m);
	/**
	 * Original signature : <code>int av_reduce(int*, int*, int64_t, int64_t, int64_t)</code><br>
	 * <i>native declaration : libavutil/rational.h:7</i>
	 */
	public static int av_reduce(Pointer<Integer > dst_num, Pointer<Integer > dst_den, long num, long den, long max) {
		return av_reduce(Pointer.getPeer(dst_num), Pointer.getPeer(dst_den), num, den, max);
	}
	protected native static int av_reduce(@Ptr long dst_num, @Ptr long dst_den, long num, long den, long max);
	/**
	 * Original signature : <code>char* av_get_sample_fmt_name(AVSampleFormat)</code><br>
	 * <i>native declaration : libavutil/samplefmt.h:26</i>
	 */
	public static Pointer<Byte > av_get_sample_fmt_name(IntValuedEnum<AvutilLibrary.AVSampleFormat > sample_fmt) {
		return Pointer.pointerToAddress(av_get_sample_fmt_name((int)sample_fmt.value()), Byte.class);
	}
	@Ptr 
	protected native static long av_get_sample_fmt_name(int sample_fmt);
	/**
	 * Original signature : <code>int av_sample_fmt_is_planar(AVSampleFormat)</code><br>
	 * <i>native declaration : libavutil/samplefmt.h:28</i>
	 */
	public static int av_sample_fmt_is_planar(IntValuedEnum<AvutilLibrary.AVSampleFormat > sample_fmt) {
		return av_sample_fmt_is_planar((int)sample_fmt.value());
	}
	protected native static int av_sample_fmt_is_planar(int sample_fmt);
	/**
	 * Original signature : <code>int av_get_bytes_per_sample(AVSampleFormat)</code><br>
	 * <i>native declaration : libavutil/samplefmt.h:30</i>
	 */
	public static int av_get_bytes_per_sample(IntValuedEnum<AvutilLibrary.AVSampleFormat > sample_fmt) {
		return av_get_bytes_per_sample((int)sample_fmt.value());
	}
	protected native static int av_get_bytes_per_sample(int sample_fmt);
	/**
	 * Original signature : <code>AVSampleFormat av_get_sample_fmt(const char*)</code><br>
	 * <i>native declaration : libavutil/samplefmt.h:32</i>
	 */
	public static IntValuedEnum<AvutilLibrary.AVSampleFormat > av_get_sample_fmt(Pointer<Byte > name) {
		return FlagSet.fromValue(av_get_sample_fmt(Pointer.getPeer(name)), AvutilLibrary.AVSampleFormat.class);
	}
	protected native static int av_get_sample_fmt(@Ptr long name);
	/**
	 * Original signature : <code>AVSampleFormat av_get_packed_sample_fmt(AVSampleFormat)</code><br>
	 * <i>native declaration : libavutil/samplefmt.h:34</i>
	 */
	public static IntValuedEnum<AvutilLibrary.AVSampleFormat > av_get_packed_sample_fmt(IntValuedEnum<AvutilLibrary.AVSampleFormat > sample_fmt) {
		return FlagSet.fromValue(av_get_packed_sample_fmt((int)sample_fmt.value()), AvutilLibrary.AVSampleFormat.class);
	}
	protected native static int av_get_packed_sample_fmt(int sample_fmt);
	/**
	 * Original signature : <code>void av_opt_set_defaults(void*)</code><br>
	 * <i>native declaration : libavutil/opt.h:25</i>
	 */
	public static void av_opt_set_defaults(Pointer<? > s) {
		av_opt_set_defaults(Pointer.getPeer(s));
	}
	protected native static void av_opt_set_defaults(@Ptr long s);
	/**
	 * Original signature : <code>void av_opt_free(void*)</code><br>
	 * <i>native declaration : libavutil/opt.h:27</i>
	 */
	public static void av_opt_free(Pointer<? > obj) {
		av_opt_free(Pointer.getPeer(obj));
	}
	protected native static void av_opt_free(@Ptr long obj);
	/**
	 * Original signature : <code>int av_opt_set_dict(void*, AVDictionary**)</code><br>
	 * <i>native declaration : libavutil/opt.h:29</i>
	 */
	public static int av_opt_set_dict(Pointer<? > obj, Pointer<Pointer<AVDictionary > > options) {
		return av_opt_set_dict(Pointer.getPeer(obj), Pointer.getPeer(options));
	}
	protected native static int av_opt_set_dict(@Ptr long obj, @Ptr long options);
	/**
	 * Original signature : <code>void* av_malloc(size_t)</code><br>
	 * <i>native declaration : libavutil/mem.h:1</i>
	 */
	public static Pointer<? > malloc(@CLong long size) {
		return Pointer.pointerToAddress(av_malloc(size));
	}
	@Ptr 
	protected native static long av_malloc(@CLong long size);
	/**
	 * Original signature : <code>void av_free(void*)</code><br>
	 * <i>native declaration : libavutil/mem.h:3</i>
	 */
	public static void av_free(Pointer<? > ptr) {
		av_free(Pointer.getPeer(ptr));
	}
	protected native static void av_free(@Ptr long ptr);
	/**
	 * Original signature : <code>void av_freep(void*)</code><br>
	 * <i>native declaration : libavutil/mem.h:5</i>
	 */
	public static void av_freep(Pointer<? > ptr) {
		av_freep(Pointer.getPeer(ptr));
	}
	protected native static void av_freep(@Ptr long ptr);
	/**
	 * Original signature : <code>int av_image_alloc(uint8_t*[4], int[4], int, int, AVPixelFormat, int)</code><br>
	 * <i>native declaration : libavutil/imgutils.h:1</i>
	 */
	public static int av_image_alloc(Pointer<Pointer<Byte > > pointers, Pointer<Integer > linesizes, int w, int h, IntValuedEnum<AvutilLibrary.AVPixelFormat > pix_fmt, int align) {
		return av_image_alloc(Pointer.getPeer(pointers), Pointer.getPeer(linesizes), w, h, (int)pix_fmt.value(), align);
	}
	protected native static int av_image_alloc(@Ptr long pointers, @Ptr long linesizes, int w, int h, int pix_fmt, int align);
	/**
	 * Original signature : <code>void av_image_copy(uint8_t*[4], int[4], const uint8_t*[4], const int[4], AVPixelFormat, int, int)</code><br>
	 * <i>native declaration : libavutil/imgutils.h:3</i>
	 */
	public static void av_image_copy(Pointer<Pointer<Byte > > dst_data, Pointer<Integer > dst_linesizes, Pointer<Pointer<Byte > > src_data, Pointer<Integer > src_linesizes, IntValuedEnum<AvutilLibrary.AVPixelFormat > pix_fmt, int width, int height) {
		av_image_copy(Pointer.getPeer(dst_data), Pointer.getPeer(dst_linesizes), Pointer.getPeer(src_data), Pointer.getPeer(src_linesizes), (int)pix_fmt.value(), width, height);
	}
	protected native static void av_image_copy(@Ptr long dst_data, @Ptr long dst_linesizes, @Ptr long src_data, @Ptr long src_linesizes, int pix_fmt, int width, int height);
	/**
	 * Original signature : <code>char* av_get_pix_fmt_name(AVPixelFormat)</code><br>
	 * <i>native declaration : libavutil/pixdesc.h:1</i>
	 */
	public static Pointer<Byte > av_get_pix_fmt_name(IntValuedEnum<AvutilLibrary.AVPixelFormat > pix_fmt) {
		return Pointer.pointerToAddress(av_get_pix_fmt_name((int)pix_fmt.value()), Byte.class);
	}
	@Ptr 
	protected native static long av_get_pix_fmt_name(int pix_fmt);
}
