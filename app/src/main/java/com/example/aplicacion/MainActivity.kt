package com.example.aplicacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var estado = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        principal.setImageResource(R.drawable.guatemala)

        star.setOnClickListener{

            if(estado == true){

                mostrar.setVisibility(View.INVISIBLE)
                nombre.setVisibility(View.VISIBLE)
                titulo.setVisibility(View.VISIBLE)
                estado =false
            }

            else{

                nombre.setVisibility(View.INVISIBLE)
                titulo.setVisibility(View.INVISIBLE)
                mostrar.setText(nombre.text)
                mostrar.setVisibility(View.VISIBLE)
                estado = true

            }
        }

        tikal.setOnClickListener{
            val intent = Intent (this, Main2Activity::class.java)
            intent.putExtra("titulo", "Tikal")
            intent.putExtra("lema", "¡¡¡ Mundo Maya !!!")
            intent.putExtra("informacion", "La densa selva de Petén alberga una de las ciudades más importantes del mundo maya, Tikal, que se distingue por sus grandes estructuras y monumentales edificios que lo hicieron, un lugar neurálgico de la cultura durante el periodo clásico maya —250-900 dC—.  Exploradores, arqueólogos y aventureros se han maravillado con más de 165 años de exploraciones.  “Gran parte de los descubrimientos sobre la cultura maya se han logrado gracias a la exploración y estudio de Tikal. Esta una de la ciudades mejor restauradas y que gracias a ello recibe una gran cantidad de visitantes”, comenta el encargado del Museo Regional del Sureste de Petén Dr. Juan Pedro Laporte Molina, Wálter Oil, quien ha dedicado su vida a la investigación arqueológica.  “La restauración que comenzó la Universidad de Pennsylvania, en la década de 1950, fue importante para la arqueología nacional. Antes, hubo poca investigación”, agrega Oil. Este sitio fue uno de los secretos mejor guardados por la selva. De este se sabía muy poco y no hay exploraciones previas al siglo XIX.\n" +
                    "\n" +
                    "“Tikal fue descubierta hace relativamente poco tiempo, en 1848, aunque su existencia ya era conocida por algunos nativos de la zona y también es posible que el fraile español Avendaño haya visitado estas ruinas durante algunos de sus viajes en 1690”, describió el arqueólogo Miguel Acosta en su trabajo Las cresterías del nororiente de Petén, el Palacio 5d-91 de Tikal")


            startActivity(intent)
        }

        atitlan.setOnClickListener{
            val intent = Intent (this, Main2Activity::class.java)

            intent.putExtra("titulo", "Atitlan")
            intent.putExtra("lema", "¡¡¡ Hermosas Vistas !!!")
            intent.putExtra("informacion", "Los orígenes del Lago Atitlán son de hace mucho tiempo cuando los cakchiqueles dieron muerte a saetazos a Tolgom, se marcharon más allá del lugar de Qakbatzulú y arrojaron a la laguna los pedazos de Tolgom. Desde entonces es famosa la punta del cerro del lanzamiento de Tolgom.\n" +
                    "\n" +
                    "Enseguida dijeron: vamos adentro de la laguna, pasaron ordenadamente y sintieron todos mucho miedo cuando se agitó la superficie del agua. De allá se dirigieron a los lugares llamados Panpatí y Payán Chocol, practicando sus artes de hechicería. Allí encontraron nueve zapotes en el lugar de Chitulul.\n" +
                    "\n" +
                    "Después comenzaron a cruzar el lago todos los guerreros yendo por último Gagavitz y su hermana llamada Chetehauh. Hicieron alto y construyeron sus casas en la punta llamada actualmente Qabouil Abah. Enseguida se marchó Gagavitz, fue realmente terrible cuando lo vieron arrojarse al agua y convertirse en la serpiente emplumada.\n" +
                    "\n" +
                    "Al instante se obscurecieron las aguas, luego se levantó un viento norte y se formó un remolino en el agua que acabó de agitar la superficie del lago. Los poblados mencionados han de haber estado en la parte noroeste del lago, mientras que lo siguiente pudo haber sucedido cercano al actual lago de Santiago Atitlán: Allí deseaban quedarse las siete tribus, querían ver la ruina del poder de los Zutujiles.\n" +
                    "\n" +
                    "Cuando aquellos bajaron a la orilla del agua y se detuvieron allí, les dijeron a los descendientes de los Atziquinahay que acababa de agitarse la superficie de nuestra laguna, nuestro mar ¡oh hermano nuestro! Que sea para ti la mitad del lago y para ti una parte de sus frutos, los patos, los cangrejos, los pescados, les dijeron. Y después de consultar entre sí, contestaron está bien, hermano.\n" +
                    "\n" +
                    "De esta manera fue hecha la división del lago, según contaban los abuelos. Y así fue también como nuestros hermanos y parientes se quedaron con los Zutujiles.")
            startActivity(intent)

        }

        semuc.setOnClickListener{
            val intent = Intent (this, Main2Activity::class.java)
            intent.putExtra("titulo", "Semuc Champey")
            intent.putExtra("lema", "¡¡¡ El agua sagrada de Guatemala !!!")
            intent.putExtra("informacion", "En el año 1954, varios pobladores de las comunidades de Chicanuz, Semil y Arenal acudieron ante las autoridades del municipio de Lanquín para dar aviso de que en una parte de esa localidad se encontraba un hombre herido. Todo esto ocurrió para que sucediera el descubrimiento de Semuc Champey. Para atender esa situación se requería de la presencia del entonces alcalde Hermógenes García, así como la del Juez de Paz. Sin embargo, al no contar con la asistencia del primero, se acudió al secretario Rigoberto Molino.\n" +
                    "\n" +
                    "Cuando las autoridades llegaron a donde se encontraba el hombre herido —llamado Benjamín Rosales— notaron que no podía caminar debido a un terrible accidente. El señor Rosales intentó lanzar una bomba de clorato de agua, pero en el intento, la bomba explotó en sus manos.\n" +
                    "\n" +  "Estos hechos sucedieron cerca de la cascada de las siete piletas que conforman Semuc Champey. Fue así como los representantes de la autoridad administrativa del territorio recorrieron maravillados el lugar en donde el agricultor se había accidentado.\n" +
                    "\n" +
                    "Posteriormente, se emitió un aviso a la Gobernación Departamental acerca de la majestuosa belleza natural que se encontraba en ese lugar. Mismo que en la actualidad se conoce como el paraíso natural al que llegan cientos de personas nacionales y extranjeros.")
            startActivity(intent)

        }

    }

}




