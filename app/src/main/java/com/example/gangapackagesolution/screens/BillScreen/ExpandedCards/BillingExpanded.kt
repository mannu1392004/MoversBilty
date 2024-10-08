package com.example.gangapackagesolution.screens.BillScreen.ExpandedCards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gangapackagesolution.models.bill.BillState
import com.example.gangapackagesolution.screens.BillScreen.Components.ExtendedField
import com.example.gangapackagesolution.screens.BillScreen.Components.RegularField

@Composable
fun BillingExpanded(modifier: Modifier = Modifier,billState: BillState) {

    val addressState = billState.address
    val toName =  billState.billToName
    val toPhone = billState.billToPhone
    val gstinNumber = billState.gstin
    val countryName = billState.country
    val stateName =  billState.state
    val cityName = billState.city
    val pinCode = billState.pinCode

    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier
            .padding(10.dp)
            .fillMaxSize()
    ) {
        RegularField(
            stateHolder = toName,
            title = "BILL TO NAME"
        )
        RegularField(
            stateHolder = toPhone,
            title = "BILL TO PHONE",
            wordType = false
        )
        RegularField(
            stateHolder = gstinNumber,
            title = "GSTIN",
            wordType = false
        )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
            ) {
                RegularField(
                    stateHolder = countryName,
                    title = "COUNTRY",
                )
            }

            Spacer(modifier = Modifier.weight(0.07f))

            Box(
                modifier = Modifier
                    .weight(1f)
            )
            {
                RegularField(
                    stateHolder = stateName,
                    title = "STATE",
                )
            }

        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
            )
            {
                RegularField(
                    stateHolder = cityName,
                    title = "CITY",
                )
            }

            Spacer(modifier = Modifier.weight(0.07f))

            Box(
                modifier = Modifier
                    .weight(1f)
            )
            {
                RegularField(
                    stateHolder = pinCode,
                    title = "PINCODE",
                    wordType = false,
                )
            }

        }

        ExtendedField(
            title = "ADDRESS",
            stateHolder = addressState
        )
    }

}