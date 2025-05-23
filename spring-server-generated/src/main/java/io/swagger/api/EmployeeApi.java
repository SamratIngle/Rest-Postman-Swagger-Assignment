
package io.swagger.api;

import io.swagger.model.Employee;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-11T10:44:51.052867237Z[GMT]")
@Validated
public interface EmployeeApi {

    @Operation(summary = "Create employee", description = "This can only be done by the logged in employee.", tags={ "employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class))) })
    @RequestMapping(value = "/employee",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    ResponseEntity<Employee> createEmployee(@Parameter(in = ParameterIn.DEFAULT, description = "Created employee object", schema=@Schema()) @Valid @RequestBody Employee body
);
    @Operation(summary = "Get user by employee name", description = "", tags={ "employee" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Employee.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid Employeename supplied"),
        
        @ApiResponse(responseCode = "404", description = "employee not found") })
    @RequestMapping(value = "/employee/{Employeename}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Employee> getEmployeeByName(@Parameter(in = ParameterIn.PATH, description = "The name that needs to be fetched. Use employee1 for testing. ", required=true, schema=@Schema()) @PathVariable("Employeename") String employeename
);

}

