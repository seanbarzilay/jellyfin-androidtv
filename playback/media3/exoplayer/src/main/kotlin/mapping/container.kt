package org.jellyfin.playback.media3.exoplayer.mapping

import androidx.annotation.OptIn
import androidx.media3.common.MimeTypes
import androidx.media3.common.util.UnstableApi

@OptIn(UnstableApi::class)
fun getFfmpegContainerMimeType(codec: String, fallback: String = codec) = codec.lowercase().let { codec ->
	ffmpegContainerMimeTypes[codec]
		?: ffmpegVideoMimeTypes[codec]
		?: ffmpegAudioMimeTypes[codec]
		?: MimeTypes.getMediaMimeType(codec)
		?: fallback
}

@OptIn(UnstableApi::class)
val ffmpegContainerMimeTypes = mapOf(
	"aac" to MimeTypes.AUDIO_AAC,
	"alaw" to MimeTypes.AUDIO_ALAW,
	"amr" to MimeTypes.AUDIO_AMR,
	"avi" to MimeTypes.VIDEO_AVI,
	"dts" to MimeTypes.AUDIO_DTS,
	"flac" to MimeTypes.AUDIO_FLAC,
	"flv" to MimeTypes.VIDEO_FLV,
	"matroska" to MimeTypes.APPLICATION_MATROSKA,
	"mkv" to MimeTypes.APPLICATION_MATROSKA,
	"mjpeg" to MimeTypes.VIDEO_MJPEG,
	"mpeg" to MimeTypes.AUDIO_MPEG,
	"ogg" to MimeTypes.AUDIO_OGG,
	"opus" to MimeTypes.AUDIO_OPUS,
	"rtsp" to MimeTypes.APPLICATION_RTSP,
	"truehd" to MimeTypes.AUDIO_TRUEHD,
	"ttml" to MimeTypes.APPLICATION_TTML,
	"vobsub" to MimeTypes.APPLICATION_VOBSUB,
	"wav" to MimeTypes.AUDIO_WAV,
	"webm" to MimeTypes.APPLICATION_WEBM,
// TODO: Find mime types for all these formats...
//	"3dostr" to null,
//	"3g2" to null,
//	"3gp" to null,
//	"4xm" to null,
//	"a64" to null,
//	"aa" to null,
//	"aax" to null,
//	"ac3" to null,
//	"ace" to null,
//	"acm" to null,
//	"act" to null,
//	"adf" to null,
//	"adp" to null,
//	"ads" to null,
//	"adts" to null,
//	"adx" to null,
//	"aea" to null,
//	"afc" to null,
//	"aiff" to null,
//	"aix" to null,
//	"alias_pix" to null,
//	"alp" to null,
//	"amrnb" to null,
//	"amrwb" to null,
//	"amv" to null,
//	"anm" to null,
//	"apc" to null,
//	"ape" to null,
//	"apm" to null,
//	"apng" to null,
//	"aptx" to null,
//	"aptx_hd" to null,
//	"aqtitle" to null,
//	"argo_asf" to null,
//	"argo_brp" to null,
//	"argo_cvg" to null,
//	"asf" to null,
//	"asf_o" to null,
//	"asf_stream" to null,
//	"ass" to null,
//	"ast" to null,
//	"au" to null,
//	"av1" to null,
//	"avif" to null,
//	"avm2" to null,
//	"avr" to null,
//	"avs" to null,
//	"avs2" to null,
//	"avs3" to null,
//	"bethsoftvid" to null,
//	"bfi" to null,
//	"bfstm" to null,
//	"bin" to null,
//	"bink" to null,
//	"binka" to null,
//	"bit" to null,
//	"bitpacked" to null,
//	"bmp_pipe" to null,
//	"bmv" to null,
//	"boa" to null,
//	"brender_pix" to null,
//	"brstm" to null,
//	"c93" to null,
//	"caf" to null,
//	"cavsvideo" to null,
//	"cdg" to null,
//	"cdxl" to null,
//	"chromaprint" to null,
//	"cine" to null,
//	"codec2" to null,
//	"codec2raw" to null,
//	"concat" to null,
//	"crc" to null,
//	"cri_pipe" to null,
//	"dash" to null,
//	"data" to null,
//	"daud" to null,
//	"dcstr" to null,
//	"dds_pipe" to null,
//	"derf" to null,
//	"dfa" to null,
//	"dfpwm" to null,
//	"dhav" to null,
//	"dirac" to null,
//	"dnxhd" to null,
//	"dpx_pipe" to null,
//	"dsf" to null,
//	"dshow" to null,
//	"dsicin" to null,
//	"dss" to null,
//	"dtshd" to null,
//	"dv" to null,
//	"dvbsub" to null,
//	"dvbtxt" to null,
//	"dvd" to null,
//	"dxa" to null,
//	"ea" to null,
//	"ea_cdata" to null,
//	"eac3" to null,
//	"epaf" to null,
//	"exr_pipe" to null,
//	"f4v" to null,
//	"f32be" to null,
//	"f32le" to null,
//	"f64be" to null,
//	"f64le" to null,
//	"ffmetadata" to null,
//	"fifo" to null,
//	"fifo_test" to null,
//	"film_cpk" to null,
//	"filmstrip" to null,
//	"fits" to null,
//	"flic" to null,
//	"framecrc" to null,
//	"framehash" to null,
//	"framemd5" to null,
//	"frm" to null,
//	"fsb" to null,
//	"fwse" to null,
//	"g722" to null,
//	"g723_1" to null,
//	"g726" to null,
//	"g726le" to null,
//	"g729" to null,
//	"gdigrab" to null,
//	"gdv" to null,
//	"gem_pipe" to null,
//	"genh" to null,
//	"gif" to null,
//	"gif_pipe" to null,
//	"gsm" to null,
//	"gxf" to null,
//	"h261" to null,
//	"h263" to null,
//	"h264" to null,
//	"hash" to null,
//	"hca" to null,
//	"hcom" to null,
//	"hds" to null,
//	"hevc" to null,
//	"hls" to null,
//	"hnm" to null,
//	"ico" to null,
//	"idcin" to null,
//	"idf" to null,
//	"iff" to null,
//	"ifv" to null,
//	"ilbc" to null,
//	"image2" to null,
//	"image2pipe" to null,
//	"imf" to null,
//	"ingenient" to null,
//	"ipmovie" to null,
//	"ipod" to null,
//	"ipu" to null,
//	"ircam" to null,
//	"ismv" to null,
//	"iss" to null,
//	"iv8" to null,
//	"ivf" to null,
//	"ivr" to null,
//	"j2k_pipe" to null,
//	"jacosub" to null,
//	"jpeg_pipe" to null,
//	"jpegls_pipe" to null,
//	"jpegxl_pipe" to null,
//	"jv" to null,
//	"kux" to null,
//	"kvag" to null,
//	"latm" to null,
//	"lavfi" to null,
//	"libopenmpt" to null,
//	"live_flv" to null,
//	"lmlm4" to null,
//	"loas" to null,
//	"lrc" to null,
//	"luodat" to null,
//	"lvf" to null,
//	"lxf" to null,
//	"m4a" to null,
//	"m4v" to null,
//	"mca" to null,
//	"mcc" to null,
//	"md5" to null,
//	"mgsts" to null,
//	"microdvd" to null,
//	"mj2" to null,
//	"mjpeg_2000" to null,
//	"mkvtimestamp_v2" to null,
//	"mlp" to null,
//	"mlv" to null,
//	"mm" to null,
//	"mmf" to null,
//	"mods" to null,
//	"moflex" to null,
//	"mov" to null,
//	"mp2" to null,
//	"mp3" to null,
//	"mp4" to null,
//	"mpc" to null,
//	"mpc8" to null,
//	"mpeg1video" to null,
//	"mpeg2video" to null,
//	"mpegts" to null,
//	"mpegtsraw" to null,
//	"mpegvideo" to null,
//	"mpjpeg" to null,
//	"mpl2" to null,
//	"mpsub" to null,
//	"msf" to null,
//	"msnwctcp" to null,
//	"msp" to null,
//	"mtaf" to null,
//	"mtv" to null,
//	"mulaw" to null,
//	"musx" to null,
//	"mv" to null,
//	"mvi" to null,
//	"mxf" to null,
//	"mxf_d10" to null,
//	"mxf_opatom" to null,
//	"mxg" to null,
//	"nc" to null,
//	"nistsphere" to null,
//	"nsp" to null,
//	"nsv" to null,
//	"null" to null,
//	"nut" to null,
//	"nuv" to null,
//	"obu" to null,
//	"oga" to null,
//	"ogv" to null,
//	"oma" to null,
//	"paf" to null,
//	"pam_pipe" to null,
//	"pbm_pipe" to null,
//	"pcx_pipe" to null,
//	"pfm_pipe" to null,
//	"pgm_pipe" to null,
//	"pgmyuv_pipe" to null,
//	"pgx_pipe" to null,
//	"phm_pipe" to null,
//	"photocd_pipe" to null,
//	"pictor_pipe" to null,
//	"pjs" to null,
//	"pmp" to null,
//	"png_pipe" to null,
//	"pp_bnk" to null,
//	"ppm_pipe" to null,
//	"psd_pipe" to null,
//	"psp" to null,
//	"psxstr" to null,
//	"pva" to null,
//	"pvf" to null,
//	"qcp" to null,
//	"qdraw_pipe" to null,
//	"qoi_pipe" to null,
//	"r3d" to null,
//	"rawvideo" to null,
//	"realtext" to null,
//	"redspark" to null,
//	"rl2" to null,
//	"rm" to null,
//	"roq" to null,
//	"rpl" to null,
//	"rsd" to null,
//	"rso" to null,
//	"rtp" to null,
//	"rtp_mpegts" to null,
//	"s8" to null,
//	"s16be" to null,
//	"s16le" to null,
//	"s24be" to null,
//	"s24le" to null,
//	"s32be" to null,
//	"s32le" to null,
//	"s337m" to null,
//	"sami" to null,
//	"sap" to null,
//	"sbc" to null,
//	"sbg" to null,
//	"scc" to null,
//	"scd" to null,
//	"sdp" to null,
//	"sdr2" to null,
//	"sds" to null,
//	"sdx" to null,
//	"segment" to null,
//	"ser" to null,
//	"sga" to null,
//	"sgi_pipe" to null,
//	"shn" to null,
//	"siff" to null,
//	"simbiosis_imx" to null,
//	"sln" to null,
//	"smjpeg" to null,
//	"smk" to null,
//	"smoothstreaming" to null,
//	"smush" to null,
//	"sol" to null,
//	"sox" to null,
//	"spdif" to null,
//	"spx" to null,
//	"srt" to null,
//	"ssegment" to null,
//	"stl" to null,
//	"stream_segment" to null,
//	"streamhash" to null,
//	"subviewer" to null,
//	"subviewer1" to null,
//	"sunrast_pipe" to null,
//	"sup" to null,
//	"svag" to null,
//	"svcd" to null,
//	"svg_pipe" to null,
//	"svs" to null,
//	"swf" to null,
//	"tak" to null,
//	"tedcaptions" to null,
//	"tee" to null,
//	"thp" to null,
//	"tiertexseq" to null,
//	"tiff_pipe" to null,
//	"tmv" to null,
//	"tta" to null,
//	"tty" to null,
//	"txd" to null,
//	"ty" to null,
//	"u8" to null,
//	"u16be" to null,
//	"u16le" to null,
//	"u24be" to null,
//	"u24le" to null,
//	"u32be" to null,
//	"u32le" to null,
//	"uncodedframecrc" to null,
//	"v210" to null,
//	"v210x" to null,
//	"vag" to null,
//	"vbn_pipe" to null,
//	"vc1" to null,
//	"vc1test" to null,
//	"vcd" to null,
//	"vfwcap" to null,
//	"vidc" to null,
//	"vividas" to null,
//	"vivo" to null,
//	"vmd" to null,
//	"vob" to null,
//	"voc" to null,
//	"vpk" to null,
//	"vplayer" to null,
//	"vqf" to null,
//	"w64" to null,
//	"wc3movie" to null,
//	"webm_chunk" to null,
//	"webm_dash_manifest" to null,
//	"webp" to null,
//	"webp_pipe" to null,
//	"webvtt" to null,
//	"wsaud" to null,
//	"wsd" to null,
//	"wsvqa" to null,
//	"wtv" to null,
//	"wv" to null,
//	"wve" to null,
//	"xa" to null,
//	"xbin" to null,
//	"xbm_pipe" to null,
//	"xmv" to null,
//	"xpm_pipe" to null,
//	"xvag" to null,
//	"xwd_pipe" to null,
//	"xwma" to null,
//	"yop" to null,
//	"yuv4mpegpipe" to null,
)
