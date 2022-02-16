package com.example.movieapp.data

import com.example.movieapp.models.Language
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * Contains data about languages' names and their ISO-638 codes
 */
object LanguagesData {
    /**
     * Used for deserializing JSON to List<Language>
     */
    private val type = object : TypeToken<List<Language>>() {}.type

    /**
     * JSON with raw data
     */
    private val jsonLanguages = """
        [
          { "code": "en", "name": "English" },
          { "code": "de", "name": "German" },
          { "code": "ru", "name": "Russian" },
          { "code": "uk", "name": "Ukrainian" },
          { "code": "ka", "name": "Georgian" },
          { "code": "aa", "name": "Afar" },
          { "code": "ab", "name": "Abkhazian" },
          { "code": "ae", "name": "Avestan" },
          { "code": "af", "name": "Afrikaans" },
          { "code": "ak", "name": "Akan" },
          { "code": "am", "name": "Amharic" },
          { "code": "an", "name": "Aragonese" },
          { "code": "ar", "name": "Arabic" },
          { "code": "as", "name": "Assamese" },
          { "code": "av", "name": "Avaric" },
          { "code": "ay", "name": "Aymara" },
          { "code": "az", "name": "Azerbaijani" },
          { "code": "ba", "name": "Bashkir" },
          { "code": "be", "name": "Belarusian" },
          { "code": "bg", "name": "Bulgarian" },
          { "code": "bh", "name": "Bihari languages" },
          { "code": "bi", "name": "Bislama" },
          { "code": "bm", "name": "Bambara" },
          { "code": "bn", "name": "Bengali" },
          { "code": "bo", "name": "Tibetan" },
          { "code": "br", "name": "Breton" },
          { "code": "bs", "name": "Bosnian" },
          { "code": "ca", "name": "Catalan; Valencian" },
          { "code": "ce", "name": "Chechen" },
          { "code": "ch", "name": "Chamorro" },
          { "code": "co", "name": "Corsican" },
          { "code": "cr", "name": "Cree" },
          { "code": "cs", "name": "Czech" },
          { "code": "cv", "name": "Chuvash" },
          { "code": "cy", "name": "Welsh" },
          { "code": "da", "name": "Danish" },
          { "code": "dv", "name": "Divehi; Dhivehi; Maldivian" },
          { "code": "dz", "name": "Dzongkha" },
          { "code": "ee", "name": "Ewe" },
          { "code": "el", "name": "Greek" },
          { "code": "eo", "name": "Esperanto" },
          { "code": "es", "name": "Spanish; Castilian" },
          { "code": "et", "name": "Estonian" },
          { "code": "eu", "name": "Basque" },
          { "code": "fa", "name": "Persian" },
          { "code": "ff", "name": "Fulah" },
          { "code": "fi", "name": "Finnish" },
          { "code": "fj", "name": "Fijian" },
          { "code": "fo", "name": "Faroese" },
          { "code": "fr", "name": "French" },
          { "code": "fy", "name": "Western Frisian" },
          { "code": "ga", "name": "Irish" },
          { "code": "gd", "name": "Gaelic; Scomttish Gaelic" },
          { "code": "gl", "name": "Galician" },
          { "code": "gn", "name": "Guarani" },
          { "code": "gu", "name": "Gujarati" },
          { "code": "gv", "name": "Manx" },
          { "code": "ha", "name": "Hausa" },
          { "code": "he", "name": "Hebrew" },
          { "code": "hi", "name": "Hindi" },
          { "code": "ho", "name": "Hiri Motu" },
          { "code": "hr", "name": "Croatian" },
          { "code": "ht", "name": "Haitian; Haitian Creole" },
          { "code": "hu", "name": "Hungarian" },
          { "code": "hy", "name": "Armenian" },
          { "code": "hz", "name": "Herero" },
          { "code": "id", "name": "Indonesian" },
          { "code": "ie", "name": "Interlingue; Occidental" },
          { "code": "ig", "name": "Igbo" },
          { "code": "ii", "name": "Sichuan Yi; Nuosu" },
          { "code": "ik", "name": "Inupiaq" },
          { "code": "io", "name": "Ido" },
          { "code": "is", "name": "Icelandic" },
          { "code": "it", "name": "Italian" },
          { "code": "iu", "name": "Inuktitut" },
          { "code": "ja", "name": "Japanese" },
          { "code": "jv", "name": "Javanese" },
          { "code": "kg", "name": "Kongo" },
          { "code": "ki", "name": "Kikuyu; Gikuyu" },
          { "code": "kj", "name": "Kuanyama; Kwanyama" },
          { "code": "kk", "name": "Kazakh" },
          { "code": "kl", "name": "Kalaallisut; Greenlandic" },
          { "code": "km", "name": "Central Khmer" },
          { "code": "kn", "name": "Kannada" },
          { "code": "ko", "name": "Korean" },
          { "code": "kr", "name": "Kanuri" },
          { "code": "ks", "name": "Kashmiri" },
          { "code": "ku", "name": "Kurdish" },
          { "code": "kv", "name": "Komi" },
          { "code": "kw", "name": "Cornish" },
          { "code": "ky", "name": "Kyrgyz" },
          { "code": "la", "name": "Latin" },
          { "code": "lb", "name": "Luxembourgish" },
          { "code": "lg", "name": "Ganda" },
          { "code": "li", "name": "Limburgan" },
          { "code": "ln", "name": "Lingala" },
          { "code": "lo", "name": "Lao" },
          { "code": "lt", "name": "Lithuanian" },
          { "code": "lu", "name": "Luba-Katanga" },
          { "code": "lv", "name": "Latvian" },
          { "code": "mg", "name": "Malagasy" },
          { "code": "mh", "name": "Marshallese" },
          { "code": "mi", "name": "Maori" },
          { "code": "mk", "name": "Macedonian" },
          { "code": "ml", "name": "Malayalam" },
          { "code": "mn", "name": "Mongolian" },
          { "code": "mr", "name": "Marathi" },
          { "code": "ms", "name": "Malay" },
          { "code": "mt", "name": "Maltese" },
          { "code": "my", "name": "Burmese" },
          { "code": "na", "name": "Nauru" },
          { "code": "nb", "name": "Norwegian Bokmål" },
          { "code": "nd", "name": "Ndebele, North; North Ndebele" },
          { "code": "ne", "name": "Nepali" },
          { "code": "ng", "name": "Ndonga" },
          { "code": "nl", "name": "Dutch; Flemish" },
          { "code": "no", "name": "Norwegian" },
          { "code": "nr", "name": "Ndebele, South; South Ndebele" },
          { "code": "nv", "name": "Navajo; Navaho" },
          { "code": "ny", "name": "Chichewa; Chewa; Nyanja" },
          { "code": "oc", "name": "Occitan (post 1500)" },
          { "code": "oj", "name": "Ojibwa" },
          { "code": "om", "name": "Oromo" },
          { "code": "or", "name": "Oriya" },
          { "code": "os", "name": "Ossetian; Ossetic" },
          { "code": "pa", "name": "Panjabi; Punjabi" },
          { "code": "pi", "name": "Pali" },
          { "code": "pl", "name": "Polish" },
          { "code": "ps", "name": "Pushto; Pashto" },
          { "code": "pt", "name": "Portuguese" },
          { "code": "qu", "name": "Quechua" },
          { "code": "rm", "name": "Romansh" },
          { "code": "rn", "name": "Rundi" },
          { "code": "ro", "name": "Romanian; Moldavian; Moldovan" },
          { "code": "rw", "name": "Kinyarwanda" },
          { "code": "sa", "name": "Sanskrit" },
          { "code": "sc", "name": "Sardinian" },
          { "code": "sd", "name": "Sindhi" },
          { "code": "se", "name": "Northern Sami" },
          { "code": "sg", "name": "Sango" },
          { "code": "si", "name": "Sinhala; Sinhalese" },
          { "code": "sk", "name": "Slovak" },
          { "code": "sl", "name": "Slovenian" },
          { "code": "sm", "name": "Samoan" },
          { "code": "sn", "name": "Shona" },
          { "code": "so", "name": "Somali" },
          { "code": "sq", "name": "Albanian" },
          { "code": "sr", "name": "Serbian" },
          { "code": "ss", "name": "Swati" },
          { "code": "st", "name": "Sotho, Southern" },
          { "code": "su", "name": "Sundanese" },
          { "code": "sv", "name": "Swedish" },
          { "code": "sw", "name": "Swahili" },
          { "code": "ta", "name": "Tamil" },
          { "code": "te", "name": "Telugu" },
          { "code": "tg", "name": "Tajik" },
          { "code": "th", "name": "Thai" },
          { "code": "ti", "name": "Tigrinya" },
          { "code": "tk", "name": "Turkmen" },
          { "code": "tl", "name": "Tagalog" },
          { "code": "tn", "name": "Tswana" },
          { "code": "to", "name": "Tonga (Tonga Islands)" },
          { "code": "tr", "name": "Turkish" },
          { "code": "ts", "name": "Tsonga" },
          { "code": "tt", "name": "Tatar" },
          { "code": "tw", "name": "Twi" },
          { "code": "ty", "name": "Tahitian" },
          { "code": "ug", "name": "Uighur; Uyghur" },
          { "code": "ur", "name": "Urdu" },
          { "code": "uz", "name": "Uzbek" },
          { "code": "ve", "name": "Venda" },
          { "code": "vi", "name": "Vietnamese" },
          { "code": "vo", "name": "Volapük" },
          { "code": "wa", "name": "Walloon" },
          { "code": "wo", "name": "Wolof" },
          { "code": "xh", "name": "Xhosa" },
          { "code": "yi", "name": "Yiddish" },
          { "code": "yo", "name": "Yoruba" },
          { "code": "za", "name": "Zhuang; Chuang" },
          { "code": "zh", "name": "Chinese" },
          { "code": "zu", "name": "Zulu" }
        ]
    """.trimIndent()

    /**
     * A list with Language objects
     */
    private val languages: List<Language> = Gson().fromJson(
        jsonLanguages,
        type
    )

    /**
     * Searches by language's name
     *
     * @return Language object
     */
    fun findByName(name: String) = languages.find { c -> c.name == name }

    /**
     * Searches by language's API ID
     *
     * @return Language object
     */
    fun findByCode(code: String) = languages.find { c -> c.code == code }

    /**
     * Composes a list of languages' names
     */
    fun getNamesList() = languages.map { g -> g.name }
}