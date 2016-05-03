package org.ffmpeg.avformat;
import org.bridj.BridJ;
import org.bridj.Callback;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Ptr;
import org.ffmpeg.avutil.AVClass;
/**
 * <i>native declaration : libavformat/avio.h:188</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("avformat") 
public class AVIOContext extends StructObject {
	static {
		BridJ.register();
	}
	/**
	 * A class for private options.<br>
	 * * If this AVIOContext is created by avio_open2(), av_class is set and<br>
	 * passes the options down to protocols.<br>
	 * * If this AVIOContext is manually allocated, then av_class may be set by<br>
	 * the caller.<br>
	 * * warning -- this field can be NULL, be sure to not pass this AVIOContext<br>
	 * to any av_opt_* functions in that case.<br>
	 * C type : const AVClass*
	 */
	@Field(0) 
	public Pointer<AVClass > av_class() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * A class for private options.<br>
	 * * If this AVIOContext is created by avio_open2(), av_class is set and<br>
	 * passes the options down to protocols.<br>
	 * * If this AVIOContext is manually allocated, then av_class may be set by<br>
	 * the caller.<br>
	 * * warning -- this field can be NULL, be sure to not pass this AVIOContext<br>
	 * to any av_opt_* functions in that case.<br>
	 * C type : const AVClass*
	 */
	@Field(0) 
	public AVIOContext av_class(Pointer<AVClass > av_class) {
		this.io.setPointerField(this, 0, av_class);
		return this;
	}
	/**
	 * The following shows the relationship between buffer, buf_ptr, buf_end, buf_size,<br>
	 * and pos, when reading and when writing (since AVIOContext is used for both):<br>
	 * **********************************************************************************<br>
	 *                                   READING<br>
	 * *********************************************************************************<br>
	 * *                            |              buffer_size              |<br>
	 *                            |---------------------------------------|<br>
	 *                            |                                       |<br>
	 * *                         buffer          buf_ptr       buf_end<br>
	 *                            +---------------+-----------------------+<br>
	 *                            |/ / / / / / / /|/ / / / / / /|         |<br>
	 *  read buffer:              |/ / consumed / | to be read /|         |<br>
	 *                            |/ / / / / / / /|/ / / / / / /|         |<br>
	 *                            +---------------+-----------------------+<br>
	 * *                                                         pos<br>
	 *              +-------------------------------------------+-----------------+<br>
	 *  input file: |                                           |                 |<br>
	 *              +-------------------------------------------+-----------------+<br>
	 * *<br>
	 * *********************************************************************************<br>
	 *                                   WRITING<br>
	 * *********************************************************************************<br>
	 * *                                          |          buffer_size          |<br>
	 *                                          |-------------------------------|<br>
	 *                                          |                               |<br>
	 * *                                       buffer              buf_ptr     buf_end<br>
	 *                                          +-------------------+-----------+<br>
	 *                                          |/ / / / / / / / / /|           |<br>
	 *  write buffer:                           | / to be flushed / |           |<br>
	 *                                          |/ / / / / / / / / /|           |<br>
	 *                                          +-------------------+-----------+<br>
	 * *                                         pos<br>
	 *               +--------------------------+-----------------------------------+<br>
	 *  output file: |                          |                                   |<br>
	 *               +--------------------------+-----------------------------------+<br>
	 * < Start of the buffer.<br>
	 * C type : unsigned char*
	 */
	@Field(1) 
	public Pointer<Byte > buffer() {
		return this.io.getPointerField(this, 1);
	}
	/**
	 * The following shows the relationship between buffer, buf_ptr, buf_end, buf_size,<br>
	 * and pos, when reading and when writing (since AVIOContext is used for both):<br>
	 * **********************************************************************************<br>
	 *                                   READING<br>
	 * *********************************************************************************<br>
	 * *                            |              buffer_size              |<br>
	 *                            |---------------------------------------|<br>
	 *                            |                                       |<br>
	 * *                         buffer          buf_ptr       buf_end<br>
	 *                            +---------------+-----------------------+<br>
	 *                            |/ / / / / / / /|/ / / / / / /|         |<br>
	 *  read buffer:              |/ / consumed / | to be read /|         |<br>
	 *                            |/ / / / / / / /|/ / / / / / /|         |<br>
	 *                            +---------------+-----------------------+<br>
	 * *                                                         pos<br>
	 *              +-------------------------------------------+-----------------+<br>
	 *  input file: |                                           |                 |<br>
	 *              +-------------------------------------------+-----------------+<br>
	 * *<br>
	 * *********************************************************************************<br>
	 *                                   WRITING<br>
	 * *********************************************************************************<br>
	 * *                                          |          buffer_size          |<br>
	 *                                          |-------------------------------|<br>
	 *                                          |                               |<br>
	 * *                                       buffer              buf_ptr     buf_end<br>
	 *                                          +-------------------+-----------+<br>
	 *                                          |/ / / / / / / / / /|           |<br>
	 *  write buffer:                           | / to be flushed / |           |<br>
	 *                                          |/ / / / / / / / / /|           |<br>
	 *                                          +-------------------+-----------+<br>
	 * *                                         pos<br>
	 *               +--------------------------+-----------------------------------+<br>
	 *  output file: |                          |                                   |<br>
	 *               +--------------------------+-----------------------------------+<br>
	 * < Start of the buffer.<br>
	 * C type : unsigned char*
	 */
	@Field(1) 
	public AVIOContext buffer(Pointer<Byte > buffer) {
		this.io.setPointerField(this, 1, buffer);
		return this;
	}
	/** < Maximum buffer size */
	@Field(2) 
	public int buffer_size() {
		return this.io.getIntField(this, 2);
	}
	/** < Maximum buffer size */
	@Field(2) 
	public AVIOContext buffer_size(int buffer_size) {
		this.io.setIntField(this, 2, buffer_size);
		return this;
	}
	/**
	 * < Current position in the buffer<br>
	 * C type : unsigned char*
	 */
	@Field(3) 
	public Pointer<Byte > buf_ptr() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * < Current position in the buffer<br>
	 * C type : unsigned char*
	 */
	@Field(3) 
	public AVIOContext buf_ptr(Pointer<Byte > buf_ptr) {
		this.io.setPointerField(this, 3, buf_ptr);
		return this;
	}
	/**
	 * < End of the data, may be less than<br>
	 * buffer+buffer_size if the read function returned<br>
	 * less data than requested, e.g. for streams where<br>
	 * no more data has been received yet.<br>
	 * C type : unsigned char*
	 */
	@Field(4) 
	public Pointer<Byte > buf_end() {
		return this.io.getPointerField(this, 4);
	}
	/**
	 * < End of the data, may be less than<br>
	 * buffer+buffer_size if the read function returned<br>
	 * less data than requested, e.g. for streams where<br>
	 * no more data has been received yet.<br>
	 * C type : unsigned char*
	 */
	@Field(4) 
	public AVIOContext buf_end(Pointer<Byte > buf_end) {
		this.io.setPointerField(this, 4, buf_end);
		return this;
	}
	/**
	 * < A private pointer, passed to the read/write/seek/...<br>
	 * functions.<br>
	 * C type : void*
	 */
	@Field(5) 
	public Pointer<? > opaque() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * < A private pointer, passed to the read/write/seek/...<br>
	 * functions.<br>
	 * C type : void*
	 */
	@Field(5) 
	public AVIOContext opaque(Pointer<? > opaque) {
		this.io.setPointerField(this, 5, opaque);
		return this;
	}
	/** C type : read_packet_callback* */
	@Field(6) 
	public Pointer<org.ffmpeg.avformat.AVInputFormat.read_packet_callback > read_packet() {
		return this.io.getPointerField(this, 6);
	}
	/** C type : read_packet_callback* */
	@Field(6) 
	public AVIOContext read_packet(Pointer<org.ffmpeg.avformat.AVInputFormat.read_packet_callback > read_packet) {
		this.io.setPointerField(this, 6, read_packet);
		return this;
	}
	/** C type : write_packet_callback* */
	@Field(7) 
	public Pointer<org.ffmpeg.avformat.AVOutputFormat.write_packet_callback > write_packet() {
		return this.io.getPointerField(this, 7);
	}
	/** C type : write_packet_callback* */
	@Field(7) 
	public AVIOContext write_packet(Pointer<org.ffmpeg.avformat.AVOutputFormat.write_packet_callback > write_packet) {
		this.io.setPointerField(this, 7, write_packet);
		return this;
	}
	/** C type : seek_callback* */
	@Field(8) 
	public Pointer<AVIOContext.seek_callback > seek() {
		return this.io.getPointerField(this, 8);
	}
	/** C type : seek_callback* */
	@Field(8) 
	public AVIOContext seek(Pointer<AVIOContext.seek_callback > seek) {
		this.io.setPointerField(this, 8, seek);
		return this;
	}
	/** < position in the file of the current buffer */
	@Field(9) 
	public long pos() {
		return this.io.getLongField(this, 9);
	}
	/** < position in the file of the current buffer */
	@Field(9) 
	public AVIOContext pos(long pos) {
		this.io.setLongField(this, 9, pos);
		return this;
	}
	/** < true if the next seek should flush */
	@Field(10) 
	public int must_flush() {
		return this.io.getIntField(this, 10);
	}
	/** < true if the next seek should flush */
	@Field(10) 
	public AVIOContext must_flush(int must_flush) {
		this.io.setIntField(this, 10, must_flush);
		return this;
	}
	/** < true if eof reached */
	@Field(11) 
	public int eof_reached() {
		return this.io.getIntField(this, 11);
	}
	/** < true if eof reached */
	@Field(11) 
	public AVIOContext eof_reached(int eof_reached) {
		this.io.setIntField(this, 11, eof_reached);
		return this;
	}
	/** < true if open for writing */
	@Field(12) 
	public int write_flag() {
		return this.io.getIntField(this, 12);
	}
	/** < true if open for writing */
	@Field(12) 
	public AVIOContext write_flag(int write_flag) {
		this.io.setIntField(this, 12, write_flag);
		return this;
	}
	@Field(13) 
	public int max_packet_size() {
		return this.io.getIntField(this, 13);
	}
	@Field(13) 
	public AVIOContext max_packet_size(int max_packet_size) {
		this.io.setIntField(this, 13, max_packet_size);
		return this;
	}
	@CLong 
	@Field(14) 
	public long checksum() {
		return this.io.getCLongField(this, 14);
	}
	@CLong 
	@Field(14) 
	public AVIOContext checksum(long checksum) {
		this.io.setCLongField(this, 14, checksum);
		return this;
	}
	/** C type : unsigned char* */
	@Field(15) 
	public Pointer<Byte > checksum_ptr() {
		return this.io.getPointerField(this, 15);
	}
	/** C type : unsigned char* */
	@Field(15) 
	public AVIOContext checksum_ptr(Pointer<Byte > checksum_ptr) {
		this.io.setPointerField(this, 15, checksum_ptr);
		return this;
	}
	/** C type : update_checksum_callback* */
	@Field(16) 
	public Pointer<AVIOContext.update_checksum_callback > update_checksum() {
		return this.io.getPointerField(this, 16);
	}
	/** C type : update_checksum_callback* */
	@Field(16) 
	public AVIOContext update_checksum(Pointer<AVIOContext.update_checksum_callback > update_checksum) {
		this.io.setPointerField(this, 16, update_checksum);
		return this;
	}
	/** < contains the error code or 0 if no error happened */
	@Field(17) 
	public int error() {
		return this.io.getIntField(this, 17);
	}
	/** < contains the error code or 0 if no error happened */
	@Field(17) 
	public AVIOContext error(int error) {
		this.io.setIntField(this, 17, error);
		return this;
	}
	/**
	 * Pause or resume playback for network streaming protocols - e.g. MMS.<br>
	 * C type : read_pause_callback*
	 */
	@Field(18) 
	public Pointer<org.ffmpeg.avformat.AVInputFormat.read_pause_callback > read_pause() {
		return this.io.getPointerField(this, 18);
	}
	/**
	 * Pause or resume playback for network streaming protocols - e.g. MMS.<br>
	 * C type : read_pause_callback*
	 */
	@Field(18) 
	public AVIOContext read_pause(Pointer<org.ffmpeg.avformat.AVInputFormat.read_pause_callback > read_pause) {
		this.io.setPointerField(this, 18, read_pause);
		return this;
	}
	/**
	 * Seek to a given timestamp in stream with the specified stream_index.<br>
	 * Needed for some network streaming protocols which don't support seeking<br>
	 * to byte position.<br>
	 * C type : read_seek_callback*
	 */
	@Field(19) 
	public Pointer<org.ffmpeg.avformat.AVInputFormat.read_seek_callback > read_seek() {
		return this.io.getPointerField(this, 19);
	}
	/**
	 * Seek to a given timestamp in stream with the specified stream_index.<br>
	 * Needed for some network streaming protocols which don't support seeking<br>
	 * to byte position.<br>
	 * C type : read_seek_callback*
	 */
	@Field(19) 
	public AVIOContext read_seek(Pointer<org.ffmpeg.avformat.AVInputFormat.read_seek_callback > read_seek) {
		this.io.setPointerField(this, 19, read_seek);
		return this;
	}
	/** A combination of AVIO_SEEKABLE_ flags or 0 when the stream is not seekable. */
	@Field(20) 
	public int seekable() {
		return this.io.getIntField(this, 20);
	}
	/** A combination of AVIO_SEEKABLE_ flags or 0 when the stream is not seekable. */
	@Field(20) 
	public AVIOContext seekable(int seekable) {
		this.io.setIntField(this, 20, seekable);
		return this;
	}
	/**
	 * max filesize, used to limit allocations<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(21) 
	public long maxsize() {
		return this.io.getLongField(this, 21);
	}
	/**
	 * max filesize, used to limit allocations<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(21) 
	public AVIOContext maxsize(long maxsize) {
		this.io.setLongField(this, 21, maxsize);
		return this;
	}
	/**
	 * avio_read and avio_write should if possible be satisfied directly<br>
	 * instead of going through a buffer, and avio_seek will always<br>
	 * call the underlying seek function directly.
	 */
	@Field(22) 
	public int direct() {
		return this.io.getIntField(this, 22);
	}
	/**
	 * avio_read and avio_write should if possible be satisfied directly<br>
	 * instead of going through a buffer, and avio_seek will always<br>
	 * call the underlying seek function directly.
	 */
	@Field(22) 
	public AVIOContext direct(int direct) {
		this.io.setIntField(this, 22, direct);
		return this;
	}
	/**
	 * Bytes read statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(23) 
	public long bytes_read() {
		return this.io.getLongField(this, 23);
	}
	/**
	 * Bytes read statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(23) 
	public AVIOContext bytes_read(long bytes_read) {
		this.io.setLongField(this, 23, bytes_read);
		return this;
	}
	/**
	 * seek statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(24) 
	public int seek_count() {
		return this.io.getIntField(this, 24);
	}
	/**
	 * seek statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(24) 
	public AVIOContext seek_count(int seek_count) {
		this.io.setIntField(this, 24, seek_count);
		return this;
	}
	/**
	 * writeout statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(25) 
	public int writeout_count() {
		return this.io.getIntField(this, 25);
	}
	/**
	 * writeout statistic<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(25) 
	public AVIOContext writeout_count(int writeout_count) {
		this.io.setIntField(this, 25, writeout_count);
		return this;
	}
	/**
	 * Original buffer size<br>
	 * used internally after probing and ensure seekback to reset the buffer size<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(26) 
	public int orig_buffer_size() {
		return this.io.getIntField(this, 26);
	}
	/**
	 * Original buffer size<br>
	 * used internally after probing and ensure seekback to reset the buffer size<br>
	 * This field is internal to libavformat and access from outside is not allowed.
	 */
	@Field(26) 
	public AVIOContext orig_buffer_size(int orig_buffer_size) {
		this.io.setIntField(this, 26, orig_buffer_size);
		return this;
	}
	/**
	 * Threshold to favor readahead over seek.<br>
	 * This is current internal only, do not use from outside.
	 */
	@Field(27) 
	public int short_seek_threshold() {
		return this.io.getIntField(this, 27);
	}
	/**
	 * Threshold to favor readahead over seek.<br>
	 * This is current internal only, do not use from outside.
	 */
	@Field(27) 
	public AVIOContext short_seek_threshold(int short_seek_threshold) {
		this.io.setIntField(this, 27, short_seek_threshold);
		return this;
	}
	/**
	 * ',' separated list of allowed protocols.<br>
	 * C type : const char*
	 */
	@Field(28) 
	public Pointer<Byte > protocol_whitelist() {
		return this.io.getPointerField(this, 28);
	}
	/**
	 * ',' separated list of allowed protocols.<br>
	 * C type : const char*
	 */
	@Field(28) 
	public AVIOContext protocol_whitelist(Pointer<Byte > protocol_whitelist) {
		this.io.setPointerField(this, 28, protocol_whitelist);
		return this;
	}
	/** <i>native declaration : libavformat/avio.h:182</i> */
	public static abstract class read_packet_callback extends Callback<read_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : libavformat/avio.h:183</i> */
	public static abstract class write_packet_callback extends Callback<write_packet_callback > {
		public int apply(Pointer<? > opaque, Pointer<Byte > buf, int buf_size) {
			return apply(Pointer.getPeer(opaque), Pointer.getPeer(buf), buf_size);
		}
		public int apply(@Ptr long opaque, @Ptr long buf, int buf_size) {
			return apply(Pointer.pointerToAddress(opaque), Pointer.pointerToAddress(buf, Byte.class), buf_size);
		}
	};
	/** <i>native declaration : libavformat/avio.h:184</i> */
	public static abstract class seek_callback extends Callback<seek_callback > {
		public long apply(Pointer<? > opaque, long offset, int whence) {
			return apply(Pointer.getPeer(opaque), offset, whence);
		}
		public long apply(@Ptr long opaque, long offset, int whence) {
			return apply(Pointer.pointerToAddress(opaque), offset, whence);
		}
	};
	/** <i>native declaration : libavformat/avio.h:185</i> */
	public static abstract class update_checksum_callback extends Callback<update_checksum_callback > {
		@CLong 
		public long apply(@CLong long checksum, Pointer<Byte > buf, int size) {
			return apply(checksum, Pointer.getPeer(buf), size);
		}
		@CLong 
		public long apply(@CLong long checksum, @Ptr long buf, int size) {
			return apply(checksum, Pointer.pointerToAddress(buf, Byte.class), size);
		}
	};
	/** <i>native declaration : libavformat/avio.h:186</i> */
	public static abstract class read_pause_callback extends Callback<read_pause_callback > {
		public int apply(Pointer<? > opaque, int pause) {
			return apply(Pointer.getPeer(opaque), pause);
		}
		public int apply(@Ptr long opaque, int pause) {
			return apply(Pointer.pointerToAddress(opaque), pause);
		}
	};
	/** <i>native declaration : libavformat/avio.h:187</i> */
	public static abstract class read_seek_callback extends Callback<read_seek_callback > {
		public long apply(Pointer<? > opaque, int stream_index, long timestamp, int flags) {
			return apply(Pointer.getPeer(opaque), stream_index, timestamp, flags);
		}
		public long apply(@Ptr long opaque, int stream_index, long timestamp, int flags) {
			return apply(Pointer.pointerToAddress(opaque), stream_index, timestamp, flags);
		}
	};
	public AVIOContext() {
		super();
	}
	public AVIOContext(Pointer pointer) {
		super(pointer);
	}
}
