package com.example.gangapackagesolution.models.bill

data class bill(
    val id: String,
    val billNumber: String,
    val companyName: String,
    val lrNumber: String,
    val invoiceDate: String,
    val deliveryDate: String,
    val movingPath: String,
    val typeOfShipment: String,
    val movingPathRemark: String,
    val moveFrom: String,
    val moveTo: String,
    val vehicleNumber: String,
    // billing details
    val billToName: String,
    val billToPhone: String,
    val gstin: String,
    val country: String,
    val state: String,
    val city: String,
    val pinCode: String,
    val address: String,
    //cionsignor details
    val citionsignorName: String,
    val citionsignorPhone: String,
    val citionsignorGstin: String,
    val citionsignorCountry: String,
    val citionsignorState: String,
    val citionsignorCity: String,
    val citionsignorPinCode: String,
    val citionsignorAddress: String,

    // consignee details
    val consigneeName: String,
    val consigneePhone: String,
    val consigneeGstin: String,
    val consigneeCountry: String,
    val consigneeState: String,
    val consigneeCity: String,
    val consigneePinCode: String,
    val consigneeAddress: String,
    // package details
    val packageName: String,
    val description: String,
    val weight: String,
    val selectedWeight:String,
    val remarks: String,
    // payment details
    val freightCharge: String,
    val advancePaid: String,
    val packingCharge: String,
    val unpackingCharge:String,
    val loadingCharge:String,
    val unloadingCharge:String,
    val packingMaterialCharge:String,
    val StorageCharge:String,
    val carbikeTpt:String,
    val miscellaneousCharge:String,
    val otherCharge:String,
    val stCharge:String,
    val greentax:String,
    val subcharge:String,
    val gstinorex:String,
    val gst:String,
    val gstType:String,
    val reverseCharge:String,
    val gstpaidby:String,
    val paymentRemark:String,
    val discount:String,

    // insurance Details
    val insuranceType:String,
    val insuranceCharge:String,
    val insuranceGst:String,

    //vehicle insurance
    val vehicleInsuranceType:String,
    val vehicleInsuranceCharge:String,
    val vehicleInsuranceGst:String,
    val vehicleInsuranceRemark:String,
    val total:String?

    )
