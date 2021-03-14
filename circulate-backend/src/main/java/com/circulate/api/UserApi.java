/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.24).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.circulate.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.circulate.dto.CustMaster;
import com.circulate.model.Request;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-07T11:46:35.995Z[GMT]")
public interface UserApi {

	@Operation(summary = "Get customer details", description = "Get all customer details", tags={ "transaction" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful Operation", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Request.class)))) })
    @RequestMapping(value = "/customer/{custId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
	ResponseEntity<CustMaster> getCustomerByUserId(@Parameter(in = ParameterIn.PATH, description = "User ID", required=true, schema=@Schema()) @PathVariable("custId") BigInteger customerId);

}

