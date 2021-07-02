package com.jackecxzerotwo.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodRecipe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recipe);
        String foodRecipeSelected = getIntent().getStringExtra("SelectedFood");

        Log.d("A", "RECEIVED: " + getIntent().getStringExtra("SelectedFood"));
        ImageView recipeImage = findViewById(R.id.recipeImageView);
        TextView recipeTitle =  findViewById(R.id.recipetxt);
        TextView recipeIngredients = findViewById(R.id.ingredientesTxt);
        TextView recipePreparation = findViewById(R.id.preparacionTxt);
        switch (foodRecipeSelected) {
            case "Tortilla de patatas vegana":
                // code block
                recipeTitle.setText(R.string.TITLE_TORTILLAVEGANAPATATAS);
                break;
            case "Revuelto vegano de tofu":
                recipeTitle.setText(R.string.TITLE_REVUELTOVEGANO);
                recipeImage.setImageResource(R.drawable.revueltoveganodetofu);
                // code block
                break;
            case "Tortilla jugosa vegana de calabacín":
                recipeTitle.setText(R.string.TITLE_TORTILLAVEGANA);
                recipeImage.setImageResource(R.drawable.tortillacalabacin);
                // code block
                break;
            case "Curry de garbanzos con mango":
                recipeTitle.setText(R.string.TITLE_CURRYMANGO);
                recipeImage.setImageResource(R.drawable.currymango);
                // code block
                break;
            case "Pasta con salsa verde":
                recipeTitle.setText(R.string.TITLE_PASTASALSAVERDE);
                recipeImage.setImageResource(R.drawable.pastaconsalsaverde);
                // code block
                break;
            case "Pasta con atún":
                recipeTitle.setText(R.string.TITLE_PASTAATUN);
                recipeImage.setImageResource(R.drawable.pastaconatun);
                // code block
                break;
            case "Pasta con chorizo":
                recipeTitle.setText(R.string.TITLE_PASTACHORIZO);
                recipeImage.setImageResource(R.drawable.pastaconchorizo);
                // code block
                break;
            case "Coditos con salsa cremosa":
                recipeTitle.setText(R.string.TITLE_CODITOSSALSA);
                recipeImage.setImageResource(R.drawable.coditossalsacremosa);
                // code block
                break;
            case "Macarrones con queso y espinaca":
                recipeTitle.setText(R.string.TITLE_MACARRONESQUESO);
                recipeImage.setImageResource(R.drawable.quesoespinaca);
                // code block
                break;
            case "Budin de pan casero":
                recipeTitle.setText(R.string.TITLE_BUDINCASERO);
                recipeImage.setImageResource(R.drawable.budinpancasero);
                recipeIngredients.setText("6 rebanadas de pan de molde blanco sin corteza\n" +
                        "5 huevos M\n" +
                        "600 ml de leche entera\n" +
                        "1 cucharada de esencia de vainilla\n" +
                        "225 g de azúcar\n" +
                        "6 cucharadas de caramelo líquido");
                recipePreparation.setText("Preparación de budin de pan casero\n" +
                        "Cortamos las rebanadas de pan en dados y los colocamos en un recipiente hondo y amplio. En caso de utilizar otro tipo de pan, podemos retirar las cortezas y quedarnos solo con la parte blanca. No es necesario, pero el resultado es un budin blanco y más homogéneo en color. Es una mera cuestión estética.\n" +
                        "Calentamos la leche en un cacito junto con el azúcar. Removemos sin parar para que el azúcar se diluya. Cuando no se noten granos de azúcar, apagamos el fuego y añadimos la esencia de vainilla. Removemos para homogeneizar.\n" +
                        "Vertemos la leche sobre el pan troceado y removemos bien para que se empape en condiciones. Dejamos reposar cinco minutos.\n" +
                        "Batimos los huevos y los añadimos al recipiente anterior. Trituramos con una batidora de mano para que el pan quede más integrado.\n" +
                        "Caramelizamos un molde rectangular de 25 x 10 cm (7 cm de alto), extendiendo bien el caramelo líquido por la base y las paredes. Después rellenamos con la mezcla del pan.\n" +
                        "Horneado y presentación del budin de pan\n" +
                        "Colocamos el molde en una bandeja para hornear con agua caliente que cubra hasta la mitad del molde aproximadamente y tapamos el molde con papel de aluminio.\n" +
                        "Introducimos en la parte más baja del horno, precalentado a 180 ºC con calor arriba y abajo, y cocemos durante 1 hora y 15-30 minutos o hasta que esté perfectamente cuajado. Esto lo podemos comprobar pinchando con un palillo, si sale limpio es que está listo y lo podemos retirar del horno. Sí no, lo dejamos unos minutos más.\n" +
                        "Retiramos el molde del horno y dejamos enfriar completamente antes de guardar en la nevera.\n" +
                        "Cuando llegue el momento de consumir en budin, retiramos el papel de aluminio, pasamos un cuchillo por el contorno y desmoldamos sobre un plato de servir. Decoramos al gusto y a disfrutar de este postre tan tradicional que está de rechupete.");
                // code block
                break;
            case "Bartolillos madrileños":
                recipeTitle.setText(R.string.TITLE_BARTORILLOS);
                recipeImage.setImageResource(R.drawable.bartolillosmadrilenhos);
                recipeIngredients.setText("400 g. de harina de repostería\n" +
                        "80 g. de manteca de cerdo\n" +
                        "100 ml. de vino blanco\n" +
                        "30 g. de azúcar\n" +
                        "Una pizca de sal\n" +
                        "Azúcar blanquilla o azúcar glass para rebozar\n" +
                        "Aceite suave para freír\n" +
                        "500 ml. de crema pastelera");
                recipePreparation.setText("En un cazo mezclamos el vino, el azúcar y la sal. Cocinamos hasta que el azúcar y la sal se hayan disuelto. Dejamos templar antes de utilizar.\n" +
                        "En un bol incorporamos la harina, la manteca de cerdo que ha de estar a temperatura ambiente, blandita, y agregamos el vino ya templado. Con un tenedor comenzamos a integrar los ingredientes hasta que formemos una arena que acabaremos de formar con las manos. Hacemos una bola con la masa y la dejamos reposar, en un bol ligeramente enharinado, durante 30 minutos, tapándola con un paño.\n" +
                        "Formamos un rulo con la masa y la dividimos en 12 partes iguales. Estiramos cada una de las partes con un rodillo formando un pañuelo de unos 20 cm. de largo, dándole forma ovalada. Ponemos una cucharada de crema pastelera y cerramos el pañuelo doblándolo sobre sí mismo.\n" +
                        "En el blog podéis encontrar mi receta de crema pastelera, fácil y rápida, perfecta para rellenar los bartolillos."+"Sellamos el pañuelo con la ayuda de un tenedor, de la misma forma que hacemos con las empanadillas. Es importante que no se nos abran durante la fritura así que intentaremos asegurarnos de que nos queden perfectamente sellados.\n" +
                        "En una cazuela de paredes altas, por eso de no salpicar hasta el techo, agregamos abundante aceite suave. Cuando esté caliente incorporamos los bartolillos y los freímos a temperatura media o media alta. Regulad la temperatura para evitar que se nos tuesten demasiado por fuera y por dentro nos queden crudos.\n" +
                        "Retiramos sobre un papel de cocina para retirar el exceso de aceite. Esperamos unos segundos para que el aceite vuelva a calentarse antes de añadir la siguiente tanda de bartolillos. Servimos los bartolillos rebozados con azúcar blanquilla o azúcar glass, eso va para gustos.");
                // code block
                break;
            case "Mousse de limón":
                recipeTitle.setText(R.string.TITLE_MOUSSELIMON);
                recipeImage.setImageResource(R.drawable.mousselimon);
                recipeIngredients.setText("Limón (para la crema de limón)\n" +
                        "1.5\n" +
                        "Huevo (para la crema de limón)\n" +
                        "1\n" +
                        "Azúcar (para la crema de limón)\n" +
                        "65 g\n" +
                        "Mantequilla (para la crema de limón)\n" +
                        "80 g\n" +
                        "Clara de huevo (para el merengue italiano)\n" +
                        "1\n" +
                        "Agua (para el merengue italiano)\n" +
                        "170 ml\n" +
                        "Azúcar (para el merengue italiano)\n" +
                        "56 g\n" +
                        "Limón\n" +
                        "1\n" +
                        "Gelatina en láminas\n" +
                        "1\n" +
                        "Nata líquida para montar\n" +
                        "180 g");
                recipePreparation.setText("Empezamos por la crema de limón, que necesita reposar un par de horas en la nevera antes de poder ser utilizada. Rallamos el limón y medio y exprimimos su zumo. Mezclamos junto con el huevo y el azúcar en un cuenco y cocemos al baño María hasta que empiece a espesar. Colamos, añadimos la mantequilla y removemos bien. Dejamos atemperar antes de guardar en la nevera.\n" +
                        "\n" +
                        "Para el merengue italiano calentamos el agua y el azúcar en un cacito hasta alcanzar entre 126-135ºC. Con una batidora eléctrica montamos la clara de huevo a punto de nieve de \"pico blando\", es decir, que no esté demasiado firme. Sin dejar de batir, a velocidad media, añadimos el almíbar en forma de hilo. Paramos cuando el merengue se haya enfriado un poco.\n" +
                        "\n" +
                        "Remojamos la hoja de gelatina en agua fría durante 10 minutos (la receta original indica tres hojas de gelatina, pero queda demasiado dura para nuestro gusto así que nos hemos permitido esta pequeña licencia). Rallamos el limón y exprimimos su zumo, que calentamos hasta llegar a ebullición. Escurrimos la gelatina y la disolvemos en el zumo caliente. Añadimos una cucharada de crema de limón y removemos. Repetimos la operación para enfriar la mezcla lentamente y evitar que la gelatina forme grumos.\n" +
                        "\n" +
                        "Vertemos esta mezcla en el resto de la crema de limón y removemos hasta homogeneizar. Agregamos el merengue italiano y luego la nata montada, removiendo con paciencia y suavidad, de abajo a arriba, hasta incorporar. Repartimos en seis vasitos y dejamos reposar en la nevera durante un mínimo de una hora o hasta el momento de servir.");
                // code block

                break;
            case "Receta de pastel lava":
                recipeTitle.setText(R.string.TITLE_PASTELLAVA);
                recipeImage.setImageResource(R.drawable.pastellava);
                recipeIngredients.setText("Chocolate negro\n" +
                        "55 g\n" +
                        "Nata líquida para montar\n" +
                        "45 ml\n" +
                        "Ron (opcional) o zumo de naranja\n" +
                        "15 ml\n" +
                        "Mantequilla y más para engrasar\n" +
                        "110 g\n" +
                        "Chocolate negro\n" +
                        "170 g\n" +
                        "Huevo\n" +
                        "3\n" +
                        "Azúcar\n" +
                        "50 g\n" +
                        "Esencia de vainilla\n" +
                        "5 ml\n" +
                        "Harina de quinoa o trigo sarraceno o trigo común (y más para los moldes)\n" +
                        "30 g\n" +
                        "Sal");
                recipePreparation.setText("Preparar al menos una o dos horas antes las trufas. Picar los 55 g de chocolate y poner a calentar al baño maría la nata con el ron o zumo, u otro licor. Cuando vaya a entrar en ebullición, echar el chocolate y remover suavemente hasta fundir. Llevar a un recipiente frío, esperar a que temple y enfriar en la nevera. Cuando se solidifiquen, formar seis bolas y reservar refrigeradas.\n"+"Precalentar el horno a 215ºC con calor arriba y abajo. Engrasar con mantequilla seis moldes pequeños tipo ramekin o flaneras, aptas para el horno. Espolvorear con harina sin gluten (o de trigo genérica) tamizada, sacudir el exceso y reservar sobre una bandeja de horno.\n" +
                        "\n" +
                        "Fundir al baño maría el resto del chocolate picado con la mantequilla troceada, removiendo suavemente hasta homogeneizar. Apartar y reservar, dejando que se enfríe un poco.\n" +
                        "\n" +
                        "Batir en otro recipiente los huevos con el azúcar, la vainilla y la sal, usando batidora de varillas, unos tres o cuatro minutos, hasta obtener una crema pálida espesa. Incorporar la crema de chocolate y mantequilla, mezclando suavemente, y la harina tamizada. Terminar de mezclar hasta que no haya grumos."+"Llenar los moldes preparados con la mitad de la masa, colocar en el centro de cada uno una de las bolas de ganaché de la nevera, y terminar de cubrir con el resto de masa.\n" +
                        "\n" +
                        "Hornear durante unos 15 minutos, sacar y esperar 2-3 minutos antes de pasar un cuchillo por los bordes y desmoldar, con cuidado de no quemarnos, dándoles la vuelta sobre platos individuales. Servir inmediatamente.");
                // code block
                break;
            case "Strudel de fresa":
                recipeTitle.setText(R.string.TITLE_STRUDELFRESA);
                recipeImage.setImageResource(R.drawable.strudelfresa);
                recipeIngredients.setText("2 1/2 tazas de mantequilla, a temperatura ambiente, 270 g\n" +
                        "1 taza de azúcar, 200 g\n" +
                        "2 yemas de huevo, cocidas\n" +
                        "4 cucharadas de canela en polvo, 15 g\n" +
                        "1 cucharada de ralladura de limón\n" +
                        "1 cucharada de extracto de almendra\n" +
                        "2 1/2 tazas de harina, 330 g\n" +
                        "1 taza de harina de almendra, 60 g\n" +
                        "suficiente de mermelada Smuckers® de fresa\n" +
                        "suficiente de clara de huevo\n" +
                        "al gusto de azúcar morena, para decorar");
                recipePreparation.setText("En un recipiente o bowl, mezcla la mantequilla y el azúcar con ayuda de una espátula, agrega las yemas e incorpora perfectamente hasta que se deshagan dentro de la mantequilla, agrega la canela en polvo, la ralladura de limón y el extracto de almendra; agrega la harina y la harina de almendra, puedes ayudarte de un colador o haberla cernido previamente, incorpora poco a poco con la espátula hasta integrar perfectamente.\n" +
                        "Cubre la masa con película plástica y refrigera por 1 hora.\n" +
                        "Una vez que la masa esté fría, trabaja un poco con las manos para que la puedas manejar nuevamente, estira con la ayuda de un rodillo con un poco de harina sobre la superficie para que no se pegue, recuerda no manipular demasiado para no calentarla y se rompa. Reserva un poco de masa para cubrir la tarta.\n" +
                        "Acomoda la base de masa en un molde para tarta previamente engrasado y rellena la tarta con Mermelada de fresa Smuckers®; con la parte de la masa que reservaste, corta tiras de 1.5 cm de ancho y acomoda las tiras en forma de red en la tarta, barniza con clara de huevo para que se peguen entre sí, espolvorea azúcar morena.\n" +
                        "Precalienta el horno a 170°C.\n" +
                        "Hornea la tarta por 40 o 45 min, hasta que esté dorada.\n" +
                        "Enfría la tarta, desmolda y sirve, puedes acompañar con la bebida de tu preferencia.");
                // code block
                break;
            case "Tarta de zanahoria":
                recipeTitle.setText(R.string.TITLE_TARTAZANAHORIA);
                recipeImage.setImageResource(R.drawable.tartazanahoria);
                recipeIngredients.setText("Para los bizcochos: 280 g de harina de trigo de todo uso\n" +
                        "350 g de zanahorias\n" +
                        "4 huevos M\n" +
                        "300 g. de azúcar moreno\n" +
                        "250 g. de mantequilla\n" +
                        "1 cucharadita tipo postre de canela molida\n" +
                        "1 cucharadita de esencia de vainilla\n" +
                        "1 cucharadita de jengibre molido y otra de nuez moscada\n" +
                        "4 clavos de olor machacados\n" +
                        "1 cucharadita de bicarbonato sódico\n" +
                        "2 cucharaditas de levadura química en polvo\n" +
                        "1 pizca de sal (3 gramos)\n" +
                        "Para la cobertura: 300 g de queso crema Mascarpone\n" +
                        "300 ml de nata para montar 33% M.G.\n" +
                        "250 g de azúcar en polvo\n" +
                        "50 g de mantequilla\n" +
                        "1/2 cucharadita de extracto de vainilla");

                recipePreparation.setText("Preparación de la tarta de zanahoria o Carrot Cake\n" +
                        "Empezaremos precalentando el horno a 160° C y engrasando el molde donde vayamos a preparar la tarta. Para evitar que se pegue vamos a forrar la base con papel parafinado.\n" +
                        "\n" +
                        "Vamos a empezar por los bizcochos, para ello lavamos muy bien las zanahorias. Secamos y picamos hasta que queden en trocitos muy pequeñitos. Si no tenéis la picadora de la batidora tendréis que hacerlo a mano. Reservamos.\n" +
                        "Mezclamos por un lado los ingredientes secos. Tamizamos la harina, el bicarbonato, la levadura en polvo y las especias (canela, el clavo, la nuez moscada y jengibre) en un recipiente grande.\n" +
                        "Después añadimos el azúcar moreno y los huevos en otro bol y batimos hasta que se forme espuma. Incorporamos una mezcla de un bol a otro, añadimos la zanahoria y la mantequilla que hemos derretido en el microondas. Mezclamos hasta que quede una masa homogénea.\n" +
                        "Metemos el molde en la bandeja media del horno a 180º C con calor arriba y abajo. El tiempo de cocción será  aproximadamente de 60-70 minutos, o hasta que lo pinchemos con un tenedor y veamos que sale limpio. Cuando lleve 30 minutos en el horno (se verá que ya tiene un poco de costra, que empieza a cuajar) ponemos un poquito de papel de aluminio para tapar la superficie y evitar que se nos queme. Los últimos 5-8 minutos la dejamos destapada para que pille color.\n" +
                        "Una vez transcurrido el tiempo, sacamos el bizcocho y lo dejamos enfriar en el molde sin desmoldar durante unos 10 minutos, para posteriormente pasarlo al plato donde lo vayamos a presentar con la crema de queso. Lo dejamos enfriar sobre una rejilla de horno.\n" +
                        "Vamos a preparar la cobertura, no es más que un buttercream. Es muy sencilla, ya la habéis visto en el blog en varias ocasiones y que además nos vale de relleno.\n" +
                        "Mezclamos la mantequilla, que estará a temperatura ambiente con el queso Mascarpone y la esencia de vainilla, cuando estén mezclados, añadimos el azúcar. Montamos la nata y la incorporamos a la mezcla anterior con movimientos envolventes."+"Preparación final y montaje de la Carrot Cake\n" +
                        "Cortamos el bizcocho en tres bases, si creéis que se os va a romper, lo cortáis directamente por el centro. Rellenamos con la cobertura primero en una de las bases de bizcocho. Colocamos la otra mitad del bizcocho encima y procedemos a cubrir con otra capa y otra base de bizcocho.\n" +
                        "Luego vamos con la tarta entera, primero una capa finita para eliminar las migas que salgan. Para cubrir la tarta finalmente, necesitaremos dejarla enfriar en la nevera como mínimo 1 hora. Sacamos de la nevera y le ponemos una capa más gordita con la ayuda de una espátula. Repasamos toda la superficie y esparcimos unos pocos frutos secos (los que más os gusten) por encima. En caso de que hagamos un layer cake y también necesitemos cobertura para rellenar el pastel, tendremos que doblar la cantidad.\n" +
                        "Recordad que es una tarta casera, no una obra de arte, aunque la parte final es para nota, aquí es donde podemos poner nota.");
                // code block
                break;
            case "Tarta de queso":
                recipeTitle.setText(R.string.TITLE_TARTAQUESO);
                recipeImage.setImageResource(R.drawable.tartaqueso);
                recipeIngredients.setText("Para la base de la tarta de queso: 25 galleta tipo desayuno (vuestras preferidas)\n" +
                        "100 g de mantequilla\n" +
                        "Para la crema de la tarta de queso: 200 ml o 260 g. de leche condensada\n" +
                        "1 sobre y medio de gelatina neutra Royal (15 g)\n" +
                        "300 g de crema de queso cremoso (vuestra marca preferida)\n" +
                        "200 ml de nata para montar o crema de leche 35% M.G.\n" +
                        "2 cucharadas de azúcar blanquilla para montar la nata\n" +
                        "Para la cobertura de la tarta de queso: Agua caliente para diluir la gelatina 300 ml.\n" +
                        "200 g de confitura de frambuesas o de vuestra mermelada preferida (la de fresas también queda muy bien)");
                recipePreparation.setText("Preparación de la base de la tarta de queso\n" +
                        "Derretimos la mantequilla (usamos el microondas, es más rápido). Con la picadora trituramos las galletas (sino tuvierais, en un trapo de cocina echamos las 25 galletas y las envolvemos para luego machacarlas con una cuchara o algo pesado, no queda tan fino pero sirve igual) y añadimos por encima la mantequilla derretida.\n" +
                        "Cogemos la mezcla de mantequilla y galletas y la repartimos por la base de un molde desmontable grande.\n" +
                        "Apretamos contra el fondo con la ayuda de una cuchara o con los dedos. Introducimos en la nevera mientras hacemos la crema de queso."+"Preparación de la base de la tarta de queso\n" +
                        "En un bol introducimos las dos tarrinas de crema de queso crema.\n" +
                        "Añadimos la mitad de la leche condensada y mezclamos con la batidora.\n" +
                        "El paso más complicado viene por el tema de la gelatina. Ponemos 10 g. de gelatina neutra en un bol que esté seco. De 300 ml de agua (1 vaso y medio aprox.) de agua fría. Separamos una tacita y la añadimos a la gelatina.\n" +
                        "Ponemos el resto del agua en un cazo al fuego hasta ebullición (o al micro directamente 2 minutos). Retiramos y vertemos el agua en el recipiente donde se había dejado la gelatina.\n" +
                        "Removemos hasta su completa disolución. Mezclamos con la crema de queso y el resto de la leche condesada. Batimos ligeramente toda la mezcla para que quede homogénea y sin ningún grumo.\n" +
                        "Montamos la nata. El mejor consejo, que todos los ingredientes estén fríos. Al contrario que en el merengue (que debe estar a temperatura ambiente) la nata debe utilizarse fría. La nata, el azúcar y el recipiente deben estar recién salidos de la nevera. Batimos el azúcar y la nata hasta que quede compacta. Os aseguro que con el truco del frío sale perfecto.\n" +
                        "Mezclamos la nata montada con la mezcla de queso pero de manera suave. Utilizamos mejor una espátula de madera o silicona para que no baje la nata.\n" +
                        "Sacamos el recipiente con la base de galleta de la nevera y echamos la crema de queso. Volvemos a introducir en la nevera unas 4 horas."+"Preparación y montaje de la cobertura de confitura\n" +
                        "Si tenéis confitura ya hecha mucho mejor. Yo antes preparaba una de moras en verano que estaba deliciosa pero está vez es con mezcla de frambuesas y arándanos. Las 2 muy ricas, elegid la que más os guste.\n" +
                        "Ponemos 5 g. de gelatina neutra en un bol que esté seco. Diluimos en 2 cda. de agua.\n" +
                        "Ponemos 100 ml. de agua en un cazo al fuego junto con la mermelada o confitura y lo llevamos a ebullición. Retiramos y vertemos el agua en el recipiente donde se había dejado la gelatina.\n" +
                        "Trituramos con la batidora si queremos una crema fina y dejamos que se temple antes de verterla sobre la tarta. Volvemos a introducir la tarta en el frigo hasta que la mermelada se cuaje.");
                // code block
                break;
            case "Coca de San Juan de chocolate":
                recipeTitle.setText(R.string.TITLE_COCASJCHOCOLATE);
                recipeImage.setImageResource(R.drawable.cocadechocolate);
                recipeIngredients.setText("Para la crema pastelera de chocolate: 250 ml. de leche entera\n" +
                        "80 g. de azúcar blanquilla\n" +
                        "1 huevo grande\n" +
                        "20 g. de maicena o almidón de maíz\n" +
                        "10 g. de cacao en polvo\n" +
                        "Para la masa de la coca de chocolate: 600 g. harina de trigo con fuerza W220 o harina de trigo con 11,5 - 12,5 % de proteínas\n" +
                        "25 g. de cacao en polvo\n" +
                        "12 g. de levadura seca de panadero (o 36 g. de levadura fresca)\n" +
                        "120 g. de azúcar blanquilla\n" +
                        "120 ml. de leche entera\n" +
                        "3 huevos grandes\n" +
                        "100 g. de mantequilla (textura pomada)\n" +
                        "5 g. de sal\n" +
                        "Para decorar la coca: 50 g. de almendra laminada\n" +
                        "1 huevo para pintar la coca de chocolate");
                recipePreparation.setText("Preparación de la crema pastelera de chocolate:\n" +
                        "Empezamos preparando la crema pastelera. Batimos el huevo en un cazo y lo mezclamos con la leche. Añadimos la maicena y removemos hasta eliminar los grumos, con una varilla manual será más fácil.\n" +
                        "Ponemos el cazo a fuego medio y añadimos el azúcar y el cacao. No dejamos de remover hasta conseguir una crema espesa. Pasamos la crema pastelera a un bol y lo cubrimos con papel film. Presionamos con los dedos para que el film toque la crema y no se forme costra. Dejamos templar a temperatura ambiente y después la guardamos en el frigorífico.\n" +
                        "Preparación de la masa de la coca de chocolate. Amasado, forma y decoración\n" +
                        "Para la masa mezclamos en un bol grande la harina, la levadura, el azúcar y el cacao. Mezclamos.\n" +
                        "Añadimos los huevos y la leche. Removemos con una cuchara hasta integrar los ingredientes. Pasamos la masa a una superficie limpia, lisa y ligeramente enharinada. Amasamos un par de minutos y dejamos reposar la masa unos 10 minutos.\n" +
                        "Pasado el reposo vamos integrando poco a poco la mantequilla. Seguimos amasando hasta que toda la mantequilla esté bien integrada y tengamos una masa elástica. Hacemos una bola con la masa.\n" +
                        "Engrasamos un bol grande con un poco de aceite y ponemos la masa dentro. Cubrimos el bol con film y dejamos levar la masa entre 1-3 horas hasta que duplique su tamaño. O la dejamos levar en el frigorífico hasta el día siguiente.\n" +
                        "Vertemos la masa levada sobre papel vegetal y aplanamos con las manos o con ayuda de un rodillo. Podemos darle forma ovalada o rectangular.\n" +
                        "Con un cuchillo hacemos cortes superficiales formando un enrejado. Pincelamos con huevo batido. Si hace calor, por seguridad alimentaria, nos saltamos este paso y nos quedamos sólo con el pincelado que haremos más adelante.\n" +
                        "Pasamos la crema de chocolate a una manga pastelera. Y vamos rellenando las líneas del enrejado con ella. Dejamos reposar una hora, para que leve más y aumente su tamaño.");
                // code block
                break;
            case "Pastel de 3 leches":
                recipeTitle.setText(R.string.TITLE_CAKETRESLECHES);
                recipeImage.setImageResource(R.drawable.pasteldetresleches);
                recipeIngredients.setText("4 unidades de huevo\n" +
                        "1 taza de azúcar\n" +
                        "1 1/3 tazas de harina para hotcakes\n" +
                        "1 1/3 tazas de leche de vaca\n" +
                        "2 tazas de crema para batir sin azúcar\n" +
                        "1/4 tazas de cajeta\n" +
                        "1 unidad de leche condensada\n" +
                        "1 lata de media crema\n" +
                        "1 lata de leche evaporada\n" +
                        "1 cucharadita de vainilla líquida\n" +
                        "1/2 tazas de piña en almíbar, picada\n" +
                        "1/4 tazas de cerezas en almíbar\n" +
                        "3 cucharadas de menta\n" +
                        "1 taza de harina");
recipePreparation.setText("Batir los huevos con el azúcar hasta que esponjen.\n" +
        "Agregar el aceite en forma de hilo sin dejar de batir.\n" +
        "Añadir una porción de la harina para hot cakes y la harina integral junto con la mitad de la leche. Repetir este proceso hasta agregar todo.\n" +
        "Verter la mezcla en un molde previamente engrasado y enharinado.\n" +
        "Hornear a 170° C por 35 minutos.\n" +
        "Sacar el pastel del horno y dejar enfriar por 30 minutos.\n" +
        "Para el relleno batir 250 ml de crema para batir en un tazón frío hasta obtener picos firmes; agregar la cajeta y batir hasta incorporar.\n" +
        "Para las tres leches mezclar la leche condensada, la media crema y la leche evaporada hasta incorporar; refrigerar.\n" +
        "Para el betún batir el resto de la crema para batir con la vainilla hasta obtener picos firmes.\n" +
        "Desmoldar el pastel y cortarlo por la mitad, picar ambas partes con un tenedor.\n" +
        "Montar una capa del pastel, bañarla con la mitad de las 3 leches.\n" +
        "Agregar una ligera capa de crema para batir con cajeta y colocar la segunda capa encima, luego bañar esa capa con el resto de la mezcla de leches.\n" +
        "Cubrir el pastel con el betún y adornar con piña en almíbar picada, fresas, unas cerezas, nuez y menta.");
                // code block
                break;
            case "Cupcakes de chocolate":
                recipeTitle.setText(R.string.TITLE_CUPCAKECHOCOLATE);
                recipeImage.setImageResource(R.drawable.cupcakeschocolate);
                recipeIngredients.setText("3 huevos\n" +
                        "1 taza de azúcar\n" +
                        "1 taza de mantequilla, derretida\n" +
                        "2 1/4 tazas de harina\n" +
                        "2 cucharaditas de polvo para hornear Rexal®\n" +
                        "1 taza de leche, 350 ml\n" +
                        "1/2 cucharaditas de sal\n" +
                        "1 cucharadita de vainilla D´Gari®, 8 ml\n" +
                        "1/4 tazas de azúcar glass\n" +
                        "1 1/2 tazas de crema batida, para rellenar\n" +
                        "1 1/2 tazas de chocolate semi-amargo, fundido, para la ganache\n" +
                        "3/4 tazas de crema para batir, caliente, para la ganache, 180 ml\n" +
                        "2 cucharadas de mantequilla, suave, para la ganache, 30 g\n" +
                        "1 taza de mermelada de fresa, para rellenar\n" +
                        "suficiente de granillo de chocolate, para decorar");
                recipePreparation.setText("En una batidora con globo, bate a velocidad media el huevo con el azúcar hasta que esté esponjoso y doble su tamaño; baja la velocidad al mínimo y vierte la mantequilla en forma de hilo hasta que quede completamente integrada; agrega 1/3 de la harina y el Rexal® polvo para hornear, agrega 1/3 de la leche y ve alternando con la harina hasta terminar; agrega la sal y la vainilla. Y bate 1 minuto más.\n" +
                        "Vierte la mezcla en los capacillos hasta llenar ¾ partes de su capacidad y hornea por 20 min. Deja enfriar y reserva.\n" +
                        "Para la ganache, mezcla el chocolate fundido con la crema para batir caliente y agrega mantequilla, mezcla perfectamente y reserva a temperatura ambiente. Nota: es importante mantener la ganache con textura líquida, pero no caliente.\n" +
                        "Haz un orificio al centro de los cupcakes y rellena con mermelada; coloca la crema batida en una manga y cubre los cupcakes formando un copete en forma de helado; congela por 10 minutos. Cubre con la ganache, agrega las chispitas de chocolate y enfría nuevamente por 3 minutos y disfruta.");
                // code block
                break;
            case "Tostadas de salpicón":
                recipeTitle.setText(R.string.TITLE_SALPICON);
                recipeImage.setImageResource(R.drawable.tostadasdesalpicon);
                recipeIngredients.setText("1 kilo de falda de res\n" +
                        "1/2 cebollas\n" +
                        "4 dientes de ajo\n" +
                        "3 hojas de laurel\n" +
                        "3 jitomates, cortado en cuadritos y sin semillas\n" +
                        "1/2 cebollas moradas, cortada finamente\n" +
                        "6 rábanos, cortado en cuadritos\n" +
                        "3 chiles serranos, finamente picado, sin semillas\n" +
                        "3 cucharadas de cilantro fresco\n" +
                        "1/4 lechugas orejonas, cortada en tiritas\n" +
                        "1/4 tazas de jugo de limón\n" +
                        "3 cucharadas de vinagre blanco\n" +
                        "1 pizca de sal\n" +
                        "al gusto de tostadas, para acompañar\n" +
                        "al gusto de aguacate, para acompañar\n" +
                        "1 pizca de orégano");
                recipePreparation.setText("Calienta una olla exprés con agua a fuego medio, cocina la carne de res, la cebolla, el ajo, las hojas de laurel por aproximadamente 1 hora. Enfría.\n" +
                        "Con ayuda de unos tenedores deshebra la carne.\n" +
                        "En un bowl agrega la carne, el jitomate, la cebolla morada, los rábanos, el chile serrano, el cilantro y la lechuga orejona.\n" +
                        "Sazona con jugo de limón vinagre blanco, orégano y sal a tu gusto. Sirve sobre tostadas y acompaña con aguacate y orégano.");
                // code block
                break;
            case "Tacos de milanesa de pollo":
                recipeTitle.setText(R.string.TITLE_TACOS_DE_MILANESAPOLLO);
                recipeImage.setImageResource(R.drawable.tacosdemilanesadepollo);
                recipeIngredients.setText("3 Huevos San Juan®\n" +
                        "1 cucharada de mostaza\n" +
                        "suficiente de sal y pimienta\n" +
                        "1/2 tazas de leche de vaca\n" +
                        "500 gramos de milanesa de pollo\n" +
                        "suficiente de pan molido\n" +
                        "suficiente de aceite vegetal, para freír\n" +
                        "3 jitomates, en mitades, para la salsa roja\n" +
                        "3 chiles serranos, para la salsa roja\n" +
                        "1 ajo, para la salsa roja\n" +
                        "suficiente de sal de grano, para la salsa roja\n" +
                        "1 cucharada de cilantro fresco, finamente picado, para la salsa\n" +
                        "suficiente de tortillas de maíz\n" +
                        "1 taza de frijol refrito\n" +
                        "suficiente de cilantro fresco, fresco, para decorar\n" +
                        "suficiente de limón, para servir");
                recipePreparation.setText("En un bowl, casca las piezas de Huevo San Juan® y bate ligeramente con la mostaza, la sal, la pimienta y la leche.\n" +
                        "Empaniza las milanesas pasando por la mezcla de huevo y el pan molido.\n" +
                        "En un sartén a fuego medio calienta el aceite y fríe las milanesas por ambos lados hasta dorar. Escurre sobre papel absorbente.\n" +
                        "Sobre una tabla, corta la milanesa en tiritas. Reserva.\n" +
                        "Para la salsa, en un comal a fuego medio asa los jitomates, los chiles y el ajo.\n" +
                        "Martaja el ajo asado con un poco de sal de grano hasta obtener un puré. Agrega los chiles, los jitomates, y continúa martajando hasta obtener una salsa. Rectifica sazón y agrega el cilantro.\n" +
                        "Calienta las tortillas en un comal y unta con los frijoles refritos.\n" +
                        "Sirve las tiritas de milanesa sobre las tortillas, decora con cilantro y sirve con salsa y limón.");
                // code block
                break;
            case "Sándwich de nopal con jamón y queso":
                recipeTitle.setText(R.string.TITLE_SANDWICH_NOPALJAMONQUESO);
                recipeImage.setImageResource(R.drawable.sandwichdenopalconjamonqueso);
                recipeIngredients.setText("1 cucharadita de polvo de ajo, para el aceite\n" +
                        "1 cucharadita de orégano, para el aceite\n" +
                        "al gusto de sal, para el aceite\n" +
                        "al gusto de pimienta, para el aceite\n" +
                        "1/2 tazas de aceite\n" +
                        "2 nopales, para el sándwich\n" +
                        "2 rebanadas de queso manchego, para el sándwich\n" +
                        "1/2 jitomates, para el sándwich\n" +
                        "3 rebanadas de jamón, para el sándwich");
                recipePreparation.setText("En un bowl, mezcla el ajo en polvo, el orégano, la sal, la pimienta y el aceite hasta obtener una mezcla homogénea. Reserva.\n" +
                        "Coloca los nopales sobre una tabla, barniza por una cara y asa sobre una sartén parrilla bien caliente. Coloca aceite en la otra cara del nopal y voltea para asar.\n" +
                        "Sobre una pieza de nopal, coloca dos rebanadas de queso y sobre la otra, coloca las rebanadas de jitomate y el jamón. Cocina por 5 minutos o hasta que el queso se derrita; junta ambas caras para formar un sándwich. Sirve acompañado de fruta y jugo natural. ¡Disfruta!");
                // code block
                break;
            case "Arroz blanco con elote y chile poblano":
                recipeTitle.setText(R.string.TITLE_ARROZBLANCOELOTE);
                recipeImage.setImageResource(R.drawable.arrozblancoconychilepoblano);
                recipeIngredients.setText("3 tazas de agua\n" +
                        "2 dientes de ajo\n" +
                        "1/4 cebollas\n" +
                        "suficiente de aceite\n" +
                        "1 1/2 tazas de arroz, remojado en agua caliente\n" +
                        "1/2 tazas de grano de elote\n" +
                        "1/2 tazas de raja de chile poblano\n" +
                        "al gusto de sal\n" +
                        "suficiente de cilantro fresco\n" +
                        "2 cucharadas de jugo de limón");
                recipePreparation.setText("Licúa el agua con el ajo y la cebolla. Reserva.\n" +
                        "Calienta a fuego medio el aceite, agrega el arroz y fríe por 5 minutos, o hasta que esté ligeramente dorado.\n" +
                        "Agrega los granos de elote, las rajas de chile poblano, el agua, el cilantro y sazona con sal; tapa y cocina por 10 minutos, después agrega el jugo de limón y cocina por 10 minutos más.\n" +
                        "Deja reposar de 5 a 10 minutos para que se termine de cocer con el mismo calor. Sirve y decora con cilantro.");
                // code block
                break;
            case "Tortitas de papa con jamón":
                recipeTitle.setText(R.string.TITLE_TORTITASPAPAJAMON);
                recipeImage.setImageResource(R.drawable.tortitasdepapaconjam_n);
                recipeIngredients.setText("suficiente de agua\n" +
                        "4 papas, enteras, con cáscara\n" +
                        "1/2 tazas de mantequilla, derretida\n" +
                        "al gusto de sal\n" +
                        "al gusto de pimienta\n" +
                        "1/2 tazas de fécula de maíz\n" +
                        "1 taza de jamón, en cuadritos\n" +
                        "1 huevo\n" +
                        "6 cucharadas de aceite, para freír las tortitas\n" +
                        "suficiente de ensalada, con mezcla de lechugas para acompañar");
                recipePreparation.setText("En una ollita a fuego medio, cocina las papas con el agua por 25 minutos, o bien, hasta que estén suaves. Escurre, deja enfriar y reserva.\n" +
                        "Sobre una tabla, pela las papas, coloca en un bowl y con ayuda de un machacador, aplasta hasta tener una consistencia pastosa, añade la mantequilla, sazona con sal y pimienta, agrega la fécula de maíz, el jamón, el huevo y mezcla hasta integrar completamente y tener una mezcla homogénea. Forma tortitas con ayuda de una cuchara y reserva.\n" +
                        "En un sartén a fuego bajo, calienta el aceite y cocina las tortitas hasta que estén doraditas. Coloca sobre papel absorbente para retirar el exceso de aceite.\n" +
                        "Sirve acompañadas de ensalada de lechugas.");
                // code block
                break;
            default:
                // code block
        }
    }

    public void getBack(View view) {
        Intent mainActivity = new Intent(this, PlatesActivity.class);
        getIntent().removeExtra("SelectedFood");
        startActivity(mainActivity);
    }


}