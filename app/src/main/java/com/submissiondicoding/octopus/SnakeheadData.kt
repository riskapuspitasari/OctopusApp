package com.submissiondicoding.octopus

object SnakeheadData {
        private var SnakeadNames = arrayOf(
            "Channa Andrao",
            "Channa Argus",
            "Channa Bleheri",
            "Channa Lucius",
            "Channa Marulius",
            "Channa Melasoma",
            "Channa Pleuropthalma",
            "Channa sp.fire and ice",
            "Channa sp.five stripe",
            "Pharachanna Africana"
        )

        private var SnakeheadDetails = arrayOf(
            "Channa andrao adalah ikan ali lembah Sungai Brahmaputra di timur laut India, dan secara resmi hanya diketahui hidup di rawa-rawa di sekitar kota Barobisha, meskipun koleksi untuk perdagangan ikan hias tampaknya menunjukkan keberadaan setidaknya satu populasi tambahan.Barobisha terletak di zona dataran subtropis antara sungai Raidak dan Sangosh, keduanya adalah anak sungai Brahmaputra yang menampilkan fluktuasi musiman dramatis dalam hal volume dan aliran air.",
            "Channa argus berasal dari sistem sungai Kuning dan Yangtze yang lebih rendah di China timur, drainase Amur di tenggara Rusia dan China timur, dan berbagai sungai di semenanjung Korea, dengan populasi yang diperkenalkan di Jepang, Amerika Serikat, Asia Tengah, dan sebagian Eropa Timur. Di Eropa Timur, mereka awalnya dimaksudkan untuk digunakan dalam proyek-proyek akuakultur, tetapi spesies ini sekarang telah masuk ke sejumlah sungai dan badan perairan lainnya.Ikan ini bisa hidup di berbagai jenis habitat meskipun cenderung menghindari air yang mengalir sangat cepat.",
            "Ikan hias yang populer ini adalah hewan endemik daerah aliran sungai Brahmaputra di negara bagian Assam dan Arunachal Pradesh, India timur laut, dengan penyebaran penuhnya tidak jelas. Mereka tampaknya terbatas pada bagian utara Assam, sementara di Arunachal Pradesh mereka ditemukan di sekitar Doimukh di drainase sungai Dikrong. Daerah tempat Channa bleheri hidup memiliki iklim hutan hujan monsun tropis yang ditandai dengan curah hujan yang tinggi, kelembaban tinggi, dan suhu musim panas yang tinggi.",
            "Ikan ini saat ini memiliki jangkauan wilayah yang sangat luas, membentang ke timur dan selatan dari sistem Sungai Mekong sampai ke banyak wilayah Indochina termasuk Laos, Kamboja, Vietnam, Thailand, Myanmar, dan Semenanjung Malaysia serta Kepulauan Sunda Besar di Sumatra, Kalimantan, dan Jawa serta sejumlah pulau-pulau kecil di wilayah tersebut.Channa lucius bisa hidup di berbagai jenis habitat meskipun cenderung menghindari air yang mengalir sangat cepat dan menunjukkan preferensi untuk tinggal di area rawa hutan dan anak sungai.",
            "Channa marulius tercatat berasal dari Pakistan melalui India, Sri Lanka, Bangladesh, Nepal, Myanmar, dan Thailand hingga China selatan, Laos, dan Vietnam, meskipun kemungkinannya jauh lebih luas dari riset yang akan datang. Populasi ikan ini juga muncul di Broward County, Florida, AS.Habitat yang disukainya adalah saluran sungai yang besar, danau pedalaman, kanal, dan rawa-rawa di mana mereka sering dikaitkan dengan vegetasi perairan.",
            "Wilayah spesies ini saat ini dianggap meluas dari Thailand selatan yang ekstrim (distrik Kolok) melalui Semenanjung Malaysia, Singapura, dan Kepulauan Sunda Besar di Kalimantan dan Sumatra, meskipun tidak ada di Jawa. Mereka juga muncul di Filipina dan di sejumlah kepulauan yang lebih kecil seperti Bangka, Belitung, dan Palawan.Channa melasoma menampilkan preferensi untuk hidup di aliran air hutan jernih dengan substrat lumpur dan serasah daun, tetapi juga tercatat bisa hidup blackwater asam di hutan rawa gambut dan lingkungan keruh.",
            "Channa pleuropthalma berasal dari Sumatra bagian tenggara ditambah daerah aliran sungai Kapuas dan Barito di Kalimantan. Spesies ini juga disebut sebagai ikan gabus berbintik oranye. Mereka hidup di sungai dan perairan bakau.",
            "Ikan dengan panjang maksimal 120-150 mm ini hanya memiliki sedikit detail tentang habitatnya, tetapi tampaknya mereka berasal dari wilayah perbatasan antara Myanmar dan Thailand barat, kemungkinan adalah anak-anak sungai dalam sistem sungai Salween.Spesies yang tak teridentifikasi ini pertama kali muncul dalam perdagangan ikan hias pada tahun 2009. Nama ‘api dan es’ berasal dari pola warna merah (api) dan biru (es) di kepalanya",
            "Spesies ini diperkirakan berasal dari sekitar Alipurduar, Distrik Jalpaiguri, negara bagian Benggala Barat, India utara. Alipurduar terletak dekat dengan perbatasan India dan Bhutan dan berjarak lebih dari 1.000 kilometer di sebelah timur perbatasan Pakistan.Berdasarkan pola warnanya dan detail terbatas mengenai habitat aslinya, spesies ini kemungkinan dapat beradaptasi untuk tinggal di antara dan di bawah bebatuan. Alipurduar terletak di daerah tropis lembab di dataran banjir dan kaki pegunungan Himalaya timur yang biasa disebut sebagai Dooars atau Duar, yang secara tradisional dianggap sebagai pintu gerbang ke Bhutan.",
            "Wilayah cakupan spesies ini yang diketahui membentang dari Togo ke Kamerun, dengan laporan menyebut mereka juga hidup di beberapa sungai yang mengalir ke Teluk Guinea, termasuk daerah aliran sungai Ouémé di Benin selatan, dan cekungan Niger dan Cross yang lebih rendah di Nigeria. Parachanna africana terutama mendiami dataran rendah, cekungan sungai pesisir, rawa-rawa, danau, dan waduk buatan, dan tercatat ada di wilayah Delta Niger."
        )

        private var Snakeadimages = intArrayOf(
            R.drawable.channa_andrao,
            R.drawable.channa_argus,
            R.drawable.channa_bleheri,
            R.drawable.channa_luciuss,
            R.drawable.channa_marulius,
            R.drawable.channa_melasoma,
            R.drawable.channa_pleuropthalma,
            R.drawable.channa_sp_fire_and_ice,
            R.drawable.channa_sp_five_stripe,
            R.drawable.parachanna_africana
        )

        val listData: ArrayList<Snakehead>
            get() {
                val list = arrayListOf<Snakehead>()
                for (position in SnakeadNames.indices) {
                    val Snakehead = Snakehead()
                    Snakehead.name = SnakeadNames[position]
                    Snakehead.detail = SnakeheadDetails[position]
                    Snakehead.photo = Snakeadimages[position]
                    list.add(Snakehead)
                }
                return list
            }
    }