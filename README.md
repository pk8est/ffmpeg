ffmpeg-2.2
==========
parts of a java library interface to access ffmpeg 2.2 c library.
Only parts that are needed in opensourcephysics tracker are 
included.

example demuxing.c -> demuxing.java compiles

build
=====
ant build-jar builds the jar file and copies it with its bridj dependency
to the dist/ directory.

usage
=====
You need ffmpeg-2.2.jar, bridj-...jar installed in /usr/share/java/ffmpeg,
which are in the dist directory.

You need the ffmpeg c libraries
libavformat55, libavcodec55, libavutil52, libswscale2, which all belong to ffmpeg 2.2.

Copyright
=========
The jar ffmpeg-2.2.jar is copyright 2014 Frank Schütte.

the homepage of the bridj project is http://code.google.com/p/bridj/wiki/FAQ.