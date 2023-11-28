package com.marzbani.android_hcfrc.product.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.marzbani.android_hcfrc.product.data.model.Products
import com.marzbani.android_hcfrc.product.presentation.viewModel.MainViewModel
import com.marzbani.android_hcfrc.ui.theme.Purple80

@Composable
fun TabThreeScreen(
    mainViewModel: MainViewModel
){
    val products by mainViewModel.products.collectAsState()
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Purple80), contentAlignment = Alignment.Center){
        LazyColumn{
            items(products){
                item:Products.ProductsItem -> ProductCard(productItem = item)
            }
        }
    }
}


@Composable
fun ProductCard(productItem: Products.ProductsItem){
    val image = rememberImagePainter(data = productItem.image)
    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .padding(vertical = 5.dp, horizontal = 10.dp)
            .fillMaxSize()
    ) {
    Column {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = productItem.title, fontWeight = FontWeight.Bold)
            Text(text = productItem.description, maxLines = 2, overflow = TextOverflow.Ellipsis)


        }

    }
    }
}

