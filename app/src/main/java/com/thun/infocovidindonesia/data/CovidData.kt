package com.thun.infocovidindonesia.data

import com.squareup.moshi.Json

data class CovidData(

	@Json(name="data")
	val data: Data? = null,

	@Json(name="update")
	val update: Update? = null
)

data class HarianItem(

	@Json(name="key_as_string")
	val keyAsString: String? = null,

	@Json(name="doc_count")
	val docCount: Int? = null,

	@Json(name="jumlah_positif_kum")
	val jumlahPositifKum: JumlahPositifKum? = null,

	@Json(name="jumlah_sembuh_kum")
	val jumlahSembuhKum: JumlahSembuhKum? = null,

	@Json(name="jumlah_meninggal_kum")
	val jumlahMeninggalKum: JumlahMeninggalKum? = null,

	@Json(name="jumlah_meninggal")
	val jumlahMeninggal: JumlahMeninggal? = null,

	@Json(name="jumlah_sembuh")
	val jumlahSembuh: JumlahSembuh? = null,

	@Json(name="key")
	val key: Long? = null,

	@Json(name="jumlah_positif")
	val jumlahPositif: JumlahPositif? = null,

	@Json(name="jumlah_dirawat_kum")
	val jumlahDirawatKum: JumlahDirawatKum? = null,

	@Json(name="jumlah_dirawat")
	val jumlahDirawat: JumlahDirawat? = null
)

data class JumlahSembuhKum(

	@Json(name="value")
	val value: Int? = null
)

data class Penambahan(

	@Json(name="created")
	val created: String? = null,

	@Json(name="jumlah_meninggal")
	val jumlahMeninggal: Int? = null,

	@Json(name="tanggal")
	val tanggal: String? = null,

	@Json(name="jumlah_sembuh")
	val jumlahSembuh: Int? = null,

	@Json(name="jumlah_positif")
	val jumlahPositif: Int? = null,

	@Json(name="jumlah_dirawat")
	val jumlahDirawat: Int? = null
)

data class JumlahDirawat(

	@Json(name="value")
	val value: Int? = null
)

data class JumlahMeninggal(

	@Json(name="value")
	val value: Int? = null
)

data class JumlahSembuh(

	@Json(name="value")
	val value: Int? = null
)

data class JumlahDirawatKum(

	@Json(name="value")
	val value: Int? = null
)

data class Total(

	@Json(name="jumlah_meninggal")
	val jumlahMeninggal: Int? = null,

	@Json(name="jumlah_sembuh")
	val jumlahSembuh: Int? = null,

	@Json(name="jumlah_positif")
	val jumlahPositif: Int? = null,

	@Json(name="jumlah_dirawat")
	val jumlahDirawat: Int? = null
)

data class JumlahMeninggalKum(

	@Json(name="value")
	val value: Int? = null
)

data class Update(

	@Json(name="penambahan")
	val penambahan: Penambahan? = null,

	@Json(name="total")
	val total: Total? = null,

	@Json(name="harian")
	val harian: List<HarianItem?>? = null
)

data class Data(

	@Json(name="jumlah_odp")
	val jumlahOdp: Int? = null,

	@Json(name="jumlah_pdp")
	val jumlahPdp: Int? = null,

	@Json(name="total_spesimen")
	val totalSpesimen: Int? = null,

	@Json(name="total_spesimen_negatif")
	val totalSpesimenNegatif: Int? = null,

	@Json(name="id")
	val id: Int? = null
)

data class JumlahPositif(

	@Json(name="value")
	val value: Int? = null
)

data class JumlahPositifKum(

	@Json(name="value")
	val value: Int? = null
)
