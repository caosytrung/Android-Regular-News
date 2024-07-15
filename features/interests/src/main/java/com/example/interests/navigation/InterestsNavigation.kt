package com.example.interests.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

const val TOPIC_ID_ARG = "topicId"
const val INTERESTS_ROUTE_BASE = "interests_route"
const val INTERESTS_ROUTE = "$INTERESTS_ROUTE_BASE?$TOPIC_ID_ARG={$TOPIC_ID_ARG}"

fun NavController.navigateToInterests(topicId: String? = null, navOptions: NavOptions? = null) {
    val route = if (topicId != null) {
        "$INTERESTS_ROUTE_BASE?$TOPIC_ID_ARG=$topicId"
    } else {
        INTERESTS_ROUTE_BASE
    }
    navigate(route, navOptions)
}

fun NavGraphBuilder.interestsScreen(
    onTopicClick: (String) -> Unit,
) {
    composable(
        route = INTERESTS_ROUTE,
        arguments = listOf(
            navArgument(TOPIC_ID_ARG) {
                defaultValue = null
                nullable = true
                type = NavType.StringType
            },
        ),
    ) {
        InterestsRoute(onTopicClick = onTopicClick)
    }
}

@Composable
fun InterestsRoute(onTopicClick: (String) -> Unit, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        Column {
            ElevatedButton(onClick = { onTopicClick.invoke("xx") }) {
                Text(text = "Click Me")
            }
        }
    }
}
