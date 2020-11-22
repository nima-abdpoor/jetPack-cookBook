package com.nima.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Composable
fun RecipeCard(recipe: Recipe) {
    val image  = imageResource(id = recipe.imageResource)
    Column(modifier = Modifier.fillMaxWidth()) {
        Image(
                asset = image,
                contentScale = ContentScale.Crop, modifier = Modifier.fillMaxWidth().height(144.dp)
        )
        Text(text = recipe.title ,textAlign = TextAlign.Center )
    }
}

@Composable
@Preview
fun DefaultRecipeCard() {
    RecipeCard(defaultRecipes[0])
}