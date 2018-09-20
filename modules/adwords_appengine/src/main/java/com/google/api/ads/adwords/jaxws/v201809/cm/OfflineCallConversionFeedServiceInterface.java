// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201809.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Service that handles the reporting of externally provided call conversions.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "OfflineCallConversionFeedServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface OfflineCallConversionFeedServiceInterface {


    /**
     * 
     *         Reports a call conversion for each entry in {@code operations}.
     *         
     *         <p>This bulk operation does not have any transactional guarantees. Some operations can succeed
     *         while others fail.
     *         
     *         <p><b>Note:</b> {@link OfflineCallConversionFeedOperation} supports only the
     *         {@code ADD} operator. ({@code SET} and {@code REMOVE} are not supported.)
     *         
     *         @param operations A list of offline call conversion feed operations.
     *         @return The list of offline call conversion feed results (in the same order as the operations).
     *         @throws {@link ApiException} if problems occurred while applying offline call conversions.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201809.cm.OfflineCallConversionFeedReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.OfflineCallConversionFeedServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809", className = "com.google.api.ads.adwords.jaxws.v201809.cm.OfflineCallConversionFeedServiceInterfacemutateResponse")
    public OfflineCallConversionFeedReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201809")
        List<OfflineCallConversionFeedOperation> operations)
        throws ApiException_Exception
    ;

}
