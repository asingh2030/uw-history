package com.uw.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.*;
import java.io.Serializable;
@ApiModel("Underwriter related information.")
public class UnderwriterModel implements Serializable {
    @ApiModelProperty(notes="Underwriter unique identifier in application.")
    private Long id;
    @ApiModelProperty(notes="Underwriter business details.")
    private String businessDetails;
    @ApiModelProperty(notes="Underwriter business type.")
    private String businessType;
    @ApiModelProperty(notes="Underwriter business category.")
    private String businessCategory;
    @ApiModelProperty(notes="Underwriter business name.")
    private String businessName;
    @ApiModelProperty(notes="Underwriter business account.")
    private String businessAcc;
    @ApiModelProperty(notes="Underwriter business tax identifier.")
    private String taxId;
    @ApiModelProperty(notes="Underwriter business address.")
    private String businessAddress;
    @ApiModelProperty(notes="Underwriter business channel.")
    private String underwriterChannel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBusinessDetails() {
        return businessDetails;
    }

    public void setBusinessDetails(String businessDetails) {
        this.businessDetails = businessDetails;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessCategory() {
        return businessCategory;
    }

    public void setBusinessCategory(String businessCategory) {
        this.businessCategory = businessCategory;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAcc() {
        return businessAcc;
    }

    public void setBusinessAcc(String businessAcc) {
        this.businessAcc = businessAcc;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getUnderwriterChannel() {
        return underwriterChannel;
    }

    public void setUnderwriterChannel(String underwriterChannel) {
        this.underwriterChannel = underwriterChannel;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
