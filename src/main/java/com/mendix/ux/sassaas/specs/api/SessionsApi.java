// This file was generated by swagger-codegen.
//
// WARNING: Code you write here will be lost the next time you update the specification

package com.mendix.ux.sassaas.specs.api;

import com.mendix.ux.sassaas.specs.model.*;

import java.io.File;
import com.mendix.ux.sassaas.specs.model.ErrorResponse;
import com.mendix.ux.sassaas.specs.model.ResultResponse;
import com.mendix.ux.sassaas.specs.model.KeyValue;
import java.util.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@RequestMapping(value = "/sessions", produces = {APPLICATION_JSON_VALUE})
public interface SessionsApi {
    /* @Api(value = "/sessions", description = "The sessions API") */


        /**
        * @ApiOperation(value = "", notes = "Get compiled CSS output", response = File.class)
        * Parameters:
        * @ApiParam(value = "",required=true ) String sessionId
        *
        * @ApiResponses(value = { 
        *     @ApiResponse(code = 200, message = "Success"),
        *     @ApiResponse(code = 0, message = "Error") })
        **/
        @RequestMapping(value = "/{sessionId}/css",


        method = RequestMethod.GET)
        public File getCSSOutput(
@PathVariable("sessionId") String sessionId
)
        throws Exception;

        /**
        * @ApiOperation(value = "", notes = "Get uploaded logo", response = File.class)
        * Parameters:
        * @ApiParam(value = "",required=true ) String sessionId
        *
        * @ApiResponses(value = { 
        *     @ApiResponse(code = 200, message = "Success"),
        *     @ApiResponse(code = 0, message = "Error") })
        **/
        @RequestMapping(value = "/{sessionId}/logo",


        method = RequestMethod.GET)
        public File getLogo(
@PathVariable("sessionId") String sessionId
)
        throws Exception;

        /**
        * @ApiOperation(value = "", notes = "Upload a logo", response = ResultResponse.class)
        * Parameters:
        * @ApiParam(value = "",required=true ) String sessionId
        * @ApiParam(value = "file detail") MultipartFile fileDetail
        *
        * @ApiResponses(value = { 
        *     @ApiResponse(code = 200, message = "Success"),
        *     @ApiResponse(code = 0, message = "Error") })
        **/
        @RequestMapping(value = "/{sessionId}/logo",


        method = RequestMethod.POST)
        public ResultResponse uploadLogo(
@PathVariable("sessionId") String sessionId
,

@RequestPart("file") MultipartFile fileDetail)
        throws Exception;

        /**
        * @ApiOperation(value = "", notes = "Set variable values", response = ResultResponse.class)
        * Parameters:
        * @ApiParam(value = "",required=true ) String sessionId
        * @ApiParam(value = ""  ) List<KeyValue> variables
        *
        * @ApiResponses(value = { 
        *     @ApiResponse(code = 200, message = "Success"),
        *     @ApiResponse(code = 0, message = "Error") })
        **/
        @RequestMapping(value = "/{sessionId}/variables",


        method = RequestMethod.PUT)
        public ResultResponse setVariables(
@PathVariable("sessionId") String sessionId
,

List<KeyValue> variables)
        throws Exception;

        /**
        * @ApiOperation(value = "", notes = "Get compiled Zip output", response = File.class)
        * Parameters:
        * @ApiParam(value = "",required=true ) String sessionId
        *
        * @ApiResponses(value = { 
        *     @ApiResponse(code = 200, message = "Success"),
        *     @ApiResponse(code = 0, message = "Error") })
        **/
        @RequestMapping(value = "/{sessionId}/zip",


        method = RequestMethod.GET)
        public File getZipOutput(
@PathVariable("sessionId") String sessionId
)
        throws Exception;
    }
