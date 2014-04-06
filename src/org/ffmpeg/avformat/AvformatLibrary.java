package org.ffmpeg.avformat;
import java.util.Collections;
import java.util.Iterator;
import org.bridj.BridJ;
import org.bridj.CRuntime;
import org.bridj.Callback;
import org.bridj.FlagSet;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.ann.CLong;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.bridj.ann.Runtime;
import org.ffmpeg.avcodec.AVCodec;
import org.ffmpeg.avcodec.AVPacket;
import org.ffmpeg.avcodec.AvcodecLibrary.AVCodecID;
import org.ffmpeg.avutil.AVDictionary;
import org.ffmpeg.avutil.AvutilLibrary.AVMediaType;
/**
 * Wrapper for library <b>avformat</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
@Runtime(CRuntime.class) 
public class AvformatLibrary {
	static {
		BridJ.register();
	}
	/**
	 * enum values<br>
	 * <i>native declaration : libavformat/avformat.h:26</i>
	 */
	public enum AVStreamParseType implements IntValuedEnum<AVStreamParseType > {
		AVSTREAM_PARSE_NONE(0),
		/** < full parsing and repack */
		AVSTREAM_PARSE_FULL(1),
		/** < Only parse headers, do not repack. */
		AVSTREAM_PARSE_HEADERS(2),
		/** < full parsing and interpolation of timestamps for frames not starting on a packet boundary */
		AVSTREAM_PARSE_TIMESTAMPS(3),
		/** < full parsing and repack of the first frame only, only implemented for H.264 currently */
		AVSTREAM_PARSE_FULL_ONCE(4),
		/**
		 * < full parsing and repack with timestamp and position generation by parser for raw<br>
		 * this assumes that each packet in the file contains no demuxer level headers and<br>
		 * just codec level data, otherwise position generation would fail
		 */
		AVSTREAM_PARSE_FULL_RAW(((0) | (('R') << 8) | (('A') << 16) | ('W' << 24)));
		AVStreamParseType(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVStreamParseType > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVStreamParseType > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/**
	 * enum values<br>
	 * <i>native declaration : libavformat/avformat.h:118</i>
	 */
	public enum AVDurationEstimationMethod implements IntValuedEnum<AVDurationEstimationMethod > {
		/** < Duration accurately estimated from PTSes */
		AVFMT_DURATION_FROM_PTS(0),
		/** < Duration estimated from a stream with a known duration */
		AVFMT_DURATION_FROM_STREAM(1),
		/** < Duration estimated from bitrate (less accurate) */
		AVFMT_DURATION_FROM_BITRATE(2);
		AVDurationEstimationMethod(long value) {
			this.value = value;
		}
		public final long value;
		public long value() {
			return this.value;
		}
		public Iterator<AVDurationEstimationMethod > iterator() {
			return Collections.singleton(this).iterator();
		}
		public static IntValuedEnum<AVDurationEstimationMethod > fromValue(int value) {
			return FlagSet.fromValue(value, values());
		}
	};
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOBUFFER = (int)0x0040;
	/** <i>native declaration : libavformat/avio.h</i> */
	public static final int AVIO_FLAG_DIRECT = (int)0x8000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_MP4A_LATM = (int)0x8000;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_REFERENCE_DTS = (boolean)(55 < 56);
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_SET_PTS_INFO = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_FRAME = (int)8;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVPROBE_SCORE_RETRY = (int)(100 / 4);
	/** <i>native declaration : libavformat/avio.h</i> */
	public static final int AVIO_FLAG_WRITE = (int)2;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_SEEK_TO_PTS = (int)0x4000000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NOFILE = (int)0x0001;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int RAW_PACKET_BUFFER_SIZE = (int)2500000;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_READ_PACKET = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_GENERIC_INDEX = (int)0x0100;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_ALLOW_FLUSH = (int)0x10000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_BACKWARD = (int)1;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_ASS_SSA = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVPROBE_SCORE_STREAM_RETRY = (int)(100 / 4 - 1);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NONBLOCK = (int)0x0004;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_SHOW_IDS = (int)0x0008;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_DISCARD_CORRUPT = (int)0x0100;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_TS_DISCONT = (int)0x0200;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MICRO = (int)100;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_FORMAT_PARAMETERS = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOPARSE = (int)0x0020;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_PRIV_OPT = (int)0x20000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVPROBE_SCORE_MAX = (int)100;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int FF_FDEBUG_TS = (int)0x0001;
	/** <i>native declaration : libavformat/avio.h</i> */
	public static final int AVIO_FLAG_READ_WRITE = (int)(1 | 2);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NOSTREAMS = (int)0x1000;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MINOR = (int)33;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_ANY = (int)4;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int MAX_STD_TIMEBASES = (int)(60 * 12 + 6);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AV_PROGRAM_RUNNING = (int)1;
	/**
	 * define<br>
	 * Conversion Error : 55.33.<br>
	 * SKIPPED:<br>
	 * <i>native declaration : ./libavformat/version.h:0</i><br>
	 * 55.33.
	 */
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVSEEK_FLAG_BYTE = (int)2;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_CUSTOM_IO = (int)0x0080;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NOGENSEARCH = (int)0x4000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_IGNDTS = (int)0x0008;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_VARIABLE_FPS = (int)0x0400;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_KEEP_SIDE_DATA = (int)0x40000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVPROBE_PADDING_SIZE = (int)32;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NOTIMESTAMPS = (int)0x0080;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_NEW_STREAM = (boolean)(55 < 56);
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_INT = (int)(55 << 16 | 33 << 8 | 100);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NOBINSEARCH = (int)0x2000;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_ALLOC_OUTPUT_CONTEXT = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_NOFILLIN = (int)0x0010;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_FLUSH_PACKETS = (int)0x0200;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int LIBAVFORMAT_BUILD = (int)(55 << 16 | 33 << 8 | 100);
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final String LIBAVFORMAT_IDENT = (String)"Lavf55.33.100";
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_IGNIDX = (int)0x0002;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NODIMENSIONS = (int)0x0800;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVPROBE_SCORE_EXTENSION = (int)50;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int LIBAVFORMAT_VERSION_MAJOR = (int)55;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int MAX_PROBE_PACKETS = (int)2500;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int MAX_REORDER_DELAY = (int)16;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NO_BYTE_SEEK = (int)0x8000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_NEEDNUMBER = (int)0x0002;
	/** <i>native declaration : libavformat/avio.h</i> */
	public static final int AVIO_FLAG_READ = (int)1;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_GENPTS = (int)0x0001;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_RAWPICTURE = (int)0x0020;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final int FF_API_R_FRAME_RATE = (int)1;
	/** <i>native declaration : ./libavformat/version.h</i> */
	public static final boolean FF_API_CLOSE_INPUT_FILE = (boolean)(55 < 56);
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_TS_NEGATIVE = (int)0x40000;
	/** <i>native declaration : libavformat/avio.h</i> */
	public static final int AVIO_FLAG_NONBLOCK = (int)8;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_FLAG_SORT_DTS = (int)0x10000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_TS_NONSTRICT = (int)0x20000;
	/** <i>native declaration : libavformat/avformat.h</i> */
	public static final int AVFMT_GLOBALHEADER = (int)0x0040;
	/** <i>native declaration : libavformat/avio.h:16</i> */
	public static abstract class avio_alloc_context_read_packet_callback extends Callback<avio_alloc_context_read_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : libavformat/avio.h:17</i> */
	public static abstract class avio_alloc_context_write_packet_callback extends Callback<avio_alloc_context_write_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : libavformat/avio.h:18</i> */
	public static abstract class avio_alloc_context_seek_callback extends Callback<avio_alloc_context_seek_callback > {
		public long apply(Pointer<? > opaque, long offset, int whence) {
			return apply(Pointer.getPeer(opaque), offset, whence);
		}
		public long apply(@Ptr long opaque, long offset, int whence) {
			return apply(Pointer.pointerToAddress(opaque), offset, whence);
		}
	};
	/** <i>native declaration : libavformat/avformat.h:110</i> */
	public static abstract class av_format_control_message extends Callback<av_format_control_message > {
		public int apply(Pointer<AVFormatContext > s, int type, Pointer<? > data, @CLong long data_size) {
			return apply(Pointer.getPeer(s), type, Pointer.getPeer(data), data_size);
		}
		public int apply(@Ptr long s, int type, @Ptr long data, @CLong long data_size) {
			return apply(Pointer.pointerToAddress(s, AVFormatContext.class), type, Pointer.pointerToAddress(data), data_size);
		}
	};
	/**
	 * Original signature : <code>AVIOContext* avio_alloc_context(unsigned char*, int, int, void*, avio_alloc_context_read_packet_callback*, avio_alloc_context_write_packet_callback*, avio_alloc_context_seek_callback*)</code><br>
	 * <i>native declaration : libavformat/avio.h:7</i>
	 */
	public static Pointer<AVIOContext > avio_alloc_context(Pointer<Byte > buffer, int buffer_size, int write_flag, Pointer<? > opaque, Pointer<AvformatLibrary.avio_alloc_context_read_packet_callback > read_packet, Pointer<AvformatLibrary.avio_alloc_context_write_packet_callback > write_packet, Pointer<AvformatLibrary.avio_alloc_context_seek_callback > seek) {
		return Pointer.pointerToAddress(avio_alloc_context(Pointer.getPeer(buffer), buffer_size, write_flag, Pointer.getPeer(opaque), Pointer.getPeer(read_packet), Pointer.getPeer(write_packet), Pointer.getPeer(seek)), AVIOContext.class);
	}
	@Ptr 
	protected native static long avio_alloc_context(@Ptr long buffer, int buffer_size, int write_flag, @Ptr long opaque, @Ptr long read_packet, @Ptr long write_packet, @Ptr long seek);
	/**
	 * Original signature : <code>void avio_flush(AVIOContext*)</code><br>
	 * <i>native declaration : libavformat/avio.h:9</i>
	 */
	public static void avio_flush(Pointer<AVIOContext > s) {
		avio_flush(Pointer.getPeer(s));
	}
	protected native static void avio_flush(@Ptr long s);
	/**
	 * Original signature : <code>int avio_open(AVIOContext**, const char*, int)</code><br>
	 * <i>native declaration : libavformat/avio.h:11</i>
	 */
	public static int avio_open(Pointer<Pointer<AVIOContext > > s, Pointer<Byte > url, int flags) {
		return avio_open(Pointer.getPeer(s), Pointer.getPeer(url), flags);
	}
	protected native static int avio_open(@Ptr long s, @Ptr long url, int flags);
	/**
	 * Original signature : <code>int avio_open2(AVIOContext**, const char*, int, const AVIOInterruptCB*, AVDictionary**)</code><br>
	 * <i>native declaration : libavformat/avio.h:13</i>
	 */
	public static int avio_open2(Pointer<Pointer<AVIOContext > > s, Pointer<Byte > url, int flags, Pointer<AVIOInterruptCB > int_cb, Pointer<Pointer<AVDictionary > > options) {
		return avio_open2(Pointer.getPeer(s), Pointer.getPeer(url), flags, Pointer.getPeer(int_cb), Pointer.getPeer(options));
	}
	protected native static int avio_open2(@Ptr long s, @Ptr long url, int flags, @Ptr long int_cb, @Ptr long options);
	/**
	 * Original signature : <code>int avio_close(AVIOContext*)</code><br>
	 * <i>native declaration : libavformat/avio.h:15</i>
	 */
	public static int avio_close(Pointer<AVIOContext > s) {
		return avio_close(Pointer.getPeer(s));
	}
	protected native static int avio_close(@Ptr long s);
	/**
	 * Original signature : <code>int avformat_version()</code><br>
	 * <i>native declaration : libavformat/avformat.h:203</i>
	 */
	public static native int avformat_version();
	/**
	 * Original signature : <code>void av_register_all()</code><br>
	 * <i>native declaration : libavformat/avformat.h:205</i>
	 */
	public static native void av_register_all();
	/**
	 * Original signature : <code>AVFormatContext* avformat_alloc_context()</code><br>
	 * <i>native declaration : libavformat/avformat.h:207</i>
	 */
	public static Pointer<AVFormatContext > alloc_context() {
		return Pointer.pointerToAddress(avformat_alloc_context(), AVFormatContext.class);
	}
	@Ptr 
	protected native static long avformat_alloc_context();
	/**
	 * Original signature : <code>void avformat_free_context(AVFormatContext*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:209</i>
	 */
	public static void avformat_free_context(Pointer<AVFormatContext > s) {
		avformat_free_context(Pointer.getPeer(s));
	}
	protected native static void avformat_free_context(@Ptr long s);
	/**
	 * Original signature : <code>AVStream* avformat_new_stream(AVFormatContext*, const AVCodec*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:211</i>
	 */
	public static Pointer<AVStream > avformat_new_stream(Pointer<AVFormatContext > s, Pointer<AVCodec > c) {
		return Pointer.pointerToAddress(avformat_new_stream(Pointer.getPeer(s), Pointer.getPeer(c)), AVStream.class);
	}
	@Ptr 
	protected native static long avformat_new_stream(@Ptr long s, @Ptr long c);
	/**
	 * Original signature : <code>int avformat_alloc_output_context2(AVFormatContext**, AVOutputFormat*, const char*, const char*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:213</i>
	 */
	public static int avformat_alloc_output_context2(Pointer<Pointer<AVFormatContext > > ctx, Pointer<AVOutputFormat > oformat, Pointer<Byte > format_name, Pointer<Byte > filename) {
		return avformat_alloc_output_context2(Pointer.getPeer(ctx), Pointer.getPeer(oformat), Pointer.getPeer(format_name), Pointer.getPeer(filename));
	}
	protected native static int avformat_alloc_output_context2(@Ptr long ctx, @Ptr long oformat, @Ptr long format_name, @Ptr long filename);
	/**
	 * Original signature : <code>int avformat_open_input(AVFormatContext**, const char*, AVInputFormat*, AVDictionary**)</code><br>
	 * <i>native declaration : libavformat/avformat.h:215</i>
	 */
	public static int avformat_open_input(Pointer<Pointer<AVFormatContext > > ps, Pointer<Byte > filename, Pointer<AVInputFormat > fmt, Pointer<Pointer<AVDictionary > > options) {
		return avformat_open_input(Pointer.getPeer(ps), Pointer.getPeer(filename), Pointer.getPeer(fmt), Pointer.getPeer(options));
	}
	protected native static int avformat_open_input(@Ptr long ps, @Ptr long filename, @Ptr long fmt, @Ptr long options);
	/**
	 * Original signature : <code>int avformat_find_stream_info(AVFormatContext*, AVDictionary**)</code><br>
	 * <i>native declaration : libavformat/avformat.h:217</i>
	 */
	public static int avformat_find_stream_info(Pointer<AVFormatContext > ic, Pointer<Pointer<AVDictionary > > options) {
		return avformat_find_stream_info(Pointer.getPeer(ic), Pointer.getPeer(options));
	}
	protected native static int avformat_find_stream_info(@Ptr long ic, @Ptr long options);
	/**
	 * Original signature : <code>int av_find_best_stream(AVFormatContext*, AVMediaType, int, int, AVCodec**, int)</code><br>
	 * <i>native declaration : libavformat/avformat.h:219</i>
	 */
	public static int av_find_best_stream(Pointer<AVFormatContext > ic, IntValuedEnum<AVMediaType > type, int wanted_stream_nb, int related_stream, Pointer<Pointer<AVCodec > > decoder_ret, int flags) {
		return av_find_best_stream(Pointer.getPeer(ic), (int)type.value(), wanted_stream_nb, related_stream, Pointer.getPeer(decoder_ret), flags);
	}
	protected native static int av_find_best_stream(@Ptr long ic, int type, int wanted_stream_nb, int related_stream, @Ptr long decoder_ret, int flags);
	/**
	 * Original signature : <code>int av_read_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:221</i>
	 */
	public static int av_read_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_read_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	protected native static int av_read_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_seek_frame(AVFormatContext*, int, int64_t, int)</code><br>
	 * <i>native declaration : libavformat/avformat.h:223</i>
	 */
	public static int av_seek_frame(Pointer<AVFormatContext > s, int stream_index, long timestamp, int flags) {
		return av_seek_frame(Pointer.getPeer(s), stream_index, timestamp, flags);
	}
	protected native static int av_seek_frame(@Ptr long s, int stream_index, long timestamp, int flags);
	/**
	 * Original signature : <code>int avformat_seek_file(AVFormatContext*, int, int64_t, int64_t, int64_t, int)</code><br>
	 * <i>native declaration : libavformat/avformat.h:225</i>
	 */
	public static int avformat_seek_file(Pointer<AVFormatContext > s, int stream_index, long min_ts, long ts, long max_ts, int flags) {
		return avformat_seek_file(Pointer.getPeer(s), stream_index, min_ts, ts, max_ts, flags);
	}
	protected native static int avformat_seek_file(@Ptr long s, int stream_index, long min_ts, long ts, long max_ts, int flags);
	/**
	 * Original signature : <code>void avformat_close_input(AVFormatContext**)</code><br>
	 * <i>native declaration : libavformat/avformat.h:227</i>
	 */
	public static void avformat_close_input(Pointer<Pointer<AVFormatContext > > s) {
		avformat_close_input(Pointer.getPeer(s));
	}
	protected native static void avformat_close_input(@Ptr long s);
	/**
	 * Original signature : <code>int avformat_write_header(AVFormatContext*, AVDictionary**)</code><br>
	 * <i>native declaration : libavformat/avformat.h:229</i>
	 */
	public static int avformat_write_header(Pointer<AVFormatContext > s, Pointer<Pointer<AVDictionary > > options) {
		return avformat_write_header(Pointer.getPeer(s), Pointer.getPeer(options));
	}
	protected native static int avformat_write_header(@Ptr long s, @Ptr long options);
	/**
	 * Original signature : <code>int av_write_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:231</i>
	 */
	public static int av_write_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	protected native static int av_write_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_interleaved_write_frame(AVFormatContext*, AVPacket*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:233</i>
	 */
	public static int av_interleaved_write_frame(Pointer<AVFormatContext > s, Pointer<AVPacket > pkt) {
		return av_interleaved_write_frame(Pointer.getPeer(s), Pointer.getPeer(pkt));
	}
	protected native static int av_interleaved_write_frame(@Ptr long s, @Ptr long pkt);
	/**
	 * Original signature : <code>int av_write_trailer(AVFormatContext*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:235</i>
	 */
	public static int av_write_trailer(Pointer<AVFormatContext > s) {
		return av_write_trailer(Pointer.getPeer(s));
	}
	protected native static int av_write_trailer(@Ptr long s);
	/**
	 * Original signature : <code>AVOutputFormat* av_guess_format(const char*, const char*, const char*)</code><br>
	 * <i>native declaration : libavformat/avformat.h:237</i>
	 */
	public static Pointer<AVOutputFormat > av_guess_format(Pointer<Byte > short_name, Pointer<Byte > filename, Pointer<Byte > mime_type) {
		return Pointer.pointerToAddress(av_guess_format(Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type)), AVOutputFormat.class);
	}
	@Ptr 
	protected native static long av_guess_format(@Ptr long short_name, @Ptr long filename, @Ptr long mime_type);
	/**
	 * Original signature : <code>AVCodecID av_guess_codec(AVOutputFormat*, const char*, const char*, const char*, AVMediaType)</code><br>
	 * <i>native declaration : libavformat/avformat.h:239</i>
	 */
	public static IntValuedEnum<AVCodecID > av_guess_codec(Pointer<AVOutputFormat > fmt, Pointer<Byte > short_name, Pointer<Byte > filename, Pointer<Byte > mime_type, IntValuedEnum<AVMediaType > type) {
		return FlagSet.fromValue(av_guess_codec(Pointer.getPeer(fmt), Pointer.getPeer(short_name), Pointer.getPeer(filename), Pointer.getPeer(mime_type), (int)type.value()), AVCodecID.class);
	}
	protected native static int av_guess_codec(@Ptr long fmt, @Ptr long short_name, @Ptr long filename, @Ptr long mime_type, int type);
	/**
	 * Original signature : <code>void av_dump_format(AVFormatContext*, int, const char*, int)</code><br>
	 * <i>native declaration : libavformat/avformat.h:241</i>
	 */
	public static void av_dump_format(Pointer<AVFormatContext > ic, int index, Pointer<Byte > url, int is_output) {
		av_dump_format(Pointer.getPeer(ic), index, Pointer.getPeer(url), is_output);
	}
	protected native static void av_dump_format(@Ptr long ic, int index, @Ptr long url, int is_output);
}
