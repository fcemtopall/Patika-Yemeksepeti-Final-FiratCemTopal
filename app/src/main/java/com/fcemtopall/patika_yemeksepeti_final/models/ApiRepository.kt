package com.fcemtopall.patika_yemeksepeti_final.models

import com.fcemtopall.patika_yemeksepeti_final.models.entity.addFood.FoodAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.addRestaurant.RestaurantAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.login.LoginRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.order.OrderAddRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.profile.UserRequest
import com.fcemtopall.patika_yemeksepeti_final.models.entity.register.RegisterRequest
import com.fcemtopall.patika_yemeksepeti_final.models.local.LocalDataSource
import com.fcemtopall.patika_yemeksepeti_final.models.remote.AuthRemoteDataSource
import com.fcemtopall.patika_yemeksepeti_final.models.remote.RemoteDataSource
import com.fcemtopall.patika_yemeksepeti_final.utils.performAuthTokenNetworkOperation
import com.fcemtopall.patika_yemeksepeti_final.utils.performNetworkOperation
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private var remoteDataSource: RemoteDataSource,
    private var authRemoteDataSource: AuthRemoteDataSource,
    private var localDataSource: LocalDataSource
) {

    fun login(request: LoginRequest) = performAuthTokenNetworkOperation(
        call = {
            remoteDataSource.postLogin(request)
        },
        saveToken = {
            localDataSource.saveToken(it)
        }
    )

    fun register(request: RegisterRequest) = performAuthTokenNetworkOperation(
        call = {
            remoteDataSource.postRegister(request)
        },
        saveToken = {
            localDataSource.saveToken(it)
        }
    )

    fun getRestaurants() =
        performNetworkOperation {
            remoteDataSource.getRestaurants()
        }

    fun getRestaurantById(id: String) =
        performNetworkOperation {
            remoteDataSource.getRestaurantById(id)
        }

    fun postRestaurant(restaurantAddRequest: RestaurantAddRequest) =
        performNetworkOperation {
            authRemoteDataSource.postRestaurant(request = restaurantAddRequest)
        }

    fun getMealById(id: String) =
        performNetworkOperation {
            remoteDataSource.getMealById(id)
        }


    fun postMeal(restaurantId: String, mealAddRequest: FoodAddRequest) =
        performNetworkOperation {
            authRemoteDataSource.postMeal(restaurantId, request = mealAddRequest)
        }

    fun getRestaurantByCuisine(cuisine: String) =
        performNetworkOperation {
            remoteDataSource.getRestaurantsByCuisine(cuisine)
        }


    fun getOrder() =
        performNetworkOperation {
            authRemoteDataSource.getOrders()
        }

    fun getUser() = performNetworkOperation {
        authRemoteDataSource.getUser()
    }

    fun updateUser(user : UserRequest) = performNetworkOperation {
        authRemoteDataSource.updateUser(request = user)
    }

    fun postOrder(orderAddRequest: OrderAddRequest) =
        performNetworkOperation {
            authRemoteDataSource.postOrder(orderAddRequest)
        }

    fun logOut() {
        localDataSource.saveToken("")
    }

}
