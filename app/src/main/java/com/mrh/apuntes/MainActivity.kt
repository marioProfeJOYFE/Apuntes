package com.mrh.apuntes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.mrh.apuntes.ui.theme.ApuntesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApuntesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    // CONTENEDORES

    /* Columna
        import androidx.compose.foundation.layout.Column
     */
    Column(){
        //Aqui va el contenido
    }
    /* Fila
        import androidx.compose.foundation.layout.Row
     */
    Row(){
        //Aqui va el contenido
    }
    /* Box
        import androidx.compose.foundation.layout.Box
     */
    Box(){

    }
    /* Grid Verical
        import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
        import androidx.compose.foundation.lazy.grid.GridCells
     */
    LazyVerticalGrid(
        // Numero de columnas
        columns = GridCells.Fixed(3)
    ) {
        //Aqui va el contenido
    }
    /* Tarjeta
        import androidx.compose.material3.Card
        import androidx.compose.material3.CardDefaults
        import androidx.compose.ui.graphics.Color
     */
    Card(
        //Cambiar el color
        colors = CardDefaults.cardColors(
            containerColor = Color.Red
        ),
        //Accion al hacer click sobre el
        onClick = {

        }
    ){

    }
    /* Texto
        import androidx.compose.material3.Text
     */
    Text(
        text = "Hello!",
        modifier = modifier
    )
    var texto by remember { mutableStateOf("") }
    /* Entrada de Texto
        import androidx.compose.material3.TextField
     */
    TextField(
        value = texto,
        onValueChange = { textoEscrito ->
            texto = textoEscrito
        },
        // Poner teclado solo numeros
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}
