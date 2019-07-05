package cgm.internship.android.widgets.recyclerview

import cgm.internship.android.widgets.Utils

/**
 * Created by dorunechifor.
 */
object SampleData {
    fun generateSampleContactsList(): List<Contact> {
        return listOf(
                Contact("James Butt", "504-621-8927", "jbutt@gmail.com"),
                Contact("Josephine Darakjy", "810-292-9388", "josephine_darakjy@darakjy.org"),
                Contact("Art Venere", "856-636-8749", "art@venere.org"),
                Contact("Lenna Paprocki", "907-385-4412", "lpaprocki@hotmail.com"),
                Contact("Donette Foller", "513-570-1893", "donette.foller@cox.net"),
                Contact("Simona Morasca", "419-503-2484", "simona@morasca.com"),
                Contact("Mitsue Tollner", "773-573-6914", "mitsue_tollner@yahoo.com"),
                Contact("Leota Dilliard", "408-752-3500", "leota@hotmail.com"),
                Contact("Sage Wieser", "605-414-2147", "sage_wieser@cox.net"),
                Contact("Kris Marrier", "410-655-8723", "kris@gmail.com"),
                Contact("Minna Amigon", "215-874-1229", "minna_amigon@yahoo.com"),
                Contact("Abel Maclead", "631-335-3414", "amaclead@gmail.com"),
                Contact("Kiley Caldarera", "310-498-5651", "kiley.caldarera@aol.com"),
                Contact("Graciela Ruta", "440-780-8425", "gruta@cox.net"),
                Contact("Cammy Albares", "956-537-6195", "calbares@gmail.com"),
                Contact("Mattie Poquette", "602-277-4385", "mattie@aol.com"),
                Contact("Meaghan Garufi", "931-313-9635", "meaghan@hotmail.com"),
                Contact("Gladys Rim", "414-661-9598", "gladys.rim@rim.org"),
                Contact("Yuki Whobrey", "313-288-7937", "yuki_whobrey@aol.com"),
                Contact("Fletcher Flosi", "815-828-2147", "fletcher.flosi@yahoo.com"),
                Contact("Bette Nicka", "610-545-3615", "bette_nicka@cox.net"),
                Contact("Veronika Inouye", "408-540-1785", "vinouye@aol.com"),
                Contact("Willard Kolmetz", "972-303-9197", "willard@hotmail.com"),
                Contact("Maryann Royster", "518-966-7987", "mroyster@royster.com"),
                Contact("Alisha Slusarski", "732-658-3154", "alisha@slusarski.com"),
                Contact("Allene Iturbide", "715-662-6764", "allene_iturbide@cox.net"),
                Contact("Chanel Caudy", "913-388-2079", "chanel.caudy@caudy.org"),
                Contact("Ezekiel Chui", "410-669-1642", "ezekiel@chui.com"),
                Contact("Willow Kusko", "212-582-4976", "wkusko@yahoo.com")
        )
    }

    fun generateSampleColorsArray(): IntArray {
        val colors = IntArray(30)
        for (i in 0..29) {
            colors[i] = Utils.generateRandomColor()
        }
        return colors
    }
}
