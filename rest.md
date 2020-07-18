# REST
- [What is rest architecture? What are the requirements?](#what-is-rest-architecture-what-are-the-requirements)
- [Is there state in rest architecture?](#is-there-state-in-rest-architecture)
- [Can be used query params in rest architecture?](#can-be-used-query-params-in-rest-architecture)
- [What is the difference get and post?](#what-is-the-difference-get-and-post)
- [What is the difference between soap and rest?](#what-is-the-difference-between-soap-and-rest)
- [Is it correct to update something during get request?](#is-it-correct-to-update-something-during-get-request)
- [Is it possible to use body in get requests?](#is-it-possible-to-use-body-in-get-requests)
- [What are possible types of requests for http protocol?](#what-are-possible-types-of-requests-for-http-protocol)
- [Why method options is needed?](#why-method-options-is-needed)
- [What is the difference between put and post?](#what-is-the-difference-between-put-and-post)
- [What can be used as rest client?](#what-can-be-used-as-rest-client)
- [How http protocol work?](#how-http-protocol-work)
- [What are the possible solutions in the case of big number of parameters for search method?](#what-are-the-possible-solutions-in-the-case-of-big-number-of-parameters-for-search-method)
- [What should be the response in the case of DELETE request?](#what-should-be-the-response-in-the-case-of-delete-request)
- [What is the best solution for representing Enum in API?](#what-is-the-best-solution-for-representing-enum-in-api)
- [What is the best practice for getting Unique Resource From Sub-Collection?](#what-is-the-best-practice-for-getting-unique-resource-from-sub-collection)
- [How search in sub-collections can be implemented?](#how-search-in-sub-collections-can-be-implemented)
- [What is the best practice for nested resources?](#what-is-the-best-practice-for-nested-resources)
- [Fine Grained CRUD Resources vs. Coarse Grained Resources?](#fine-grained-crud-resources-vs-coarse-grained-resources)
- [Best guidelines?](#best-guidelines)
- [Best practice for PATCH?](#best-practice-for-patch)
- [Do sessions violate REST?](#do-sessions-violate-rest)
- [When to use GraphQL?](#when-to-use-graphql)
- [What is ElasticSearch?](#what-is-elasticsearch)
- [What are the possible ways of versioning?](#what-are-the-possible-ways-of-versioning)

## What is rest architecture? What are the requirements?
- resources being identified by a persistent identifier: URIs are the ubiquitous choice of identifier these days
- resources being manipulated using a common set of verbs: HTTP methods are the commonly seen case - the venerable Create, Retrieve, Update, Delete becomes POST, GET, PUT, and DELETE. But REST is not limited to HTTP, it is just the most commonly used transport right now.
- the actual representation retrieved for a resource is dependent on the request and not the identifier: use Accept headers to control whether you want XML, HTTP, or even a Java Object representing the resource
- maintaining the state in the object and representing the state in the representation
- representing the relationships between resources in the representation of the resource: the links between objects are embedded directly in the representation
- resource representations describe how the representation can be used and under what circumstances it should be discarded/refetched in a consistent manner: usage of HTTP Cache-Control headers
###### Relative links:
+ https://stackoverflow.com/questions/671118/what-exactly-is-restful-programming
+ https://restfulapi.net/rest-architectural-constraints/

## Is there state in rest architecture?
As per the REST (REpresentational “State” Transfer) architecture, the server does not store any state about the client session on the server side. This restriction is called Statelessness. Each request from the client to server must contain all of the information necessary to understand the request, and cannot take advantage of any stored context on the server. Session state is therefore kept entirely on the client. client is responsible for storing and handling all application state related information on client side.
###### Relative links:
+ https://restfulapi.net/statelessness/

## Can be used query params in rest architecture?
I'd recommend putting any required parameters in the path, and any optional parameters should certainly be query string parameters. Putting optional parameters in the path will end up getting really messy when trying to write URL handlers that match different combinations.
###### Relative links:
+ https://stackoverflow.com/questions/4024271/rest-api-best-practices-where-to-put-parameters
+ https://stackoverflow.com/questions/11552248/when-to-use-queryparam-vs-pathparam

## What is the difference get and post?
- **GET** is idempotent: it is for obtaining a resource, without changing anything on the server. As a consequence it should be perfectly safe to resubmit a GET request.
- **POST** is not: it is for updating information on the server. It can therefore not be assumed that it is safe to re-submit the request which is why most browsers ask for confirmation when you hit refresh on a POST request.
###### Relative links:
+ https://stackoverflow.com/questions/2080863/what-is-the-difference-between-a-http-get-and-http-post-and-why-is-http-post-wea

## What is the difference between soap and rest?
- REST API has no has no official standard at all because it is an architectural style. SOAP API, on the other hand, has an official standard because it is a protocol.
- REST APIs uses multiple standards like HTTP, JSON, URL, and XML while SOAP APIs is largely based on HTTP and XML.
- As REST API deploys multiple standards, so it takes fewer resources and bandwidth as compared to SOAP that uses XML for the creation of Payload and results in the large sized file.
- The ways both APIs exposes the business logics are also different. REST API takes advantage of URL exposure like @path("/WeatherService") while SOAP API use of services interfaces like @WebService.
- SOAP API defines too many standards, and its implementer implements the things in a standard way only. In the case of miscommunication from service, the result will be the error. REST API, on the other hand, don't make emphasis on too many standards and results in corrupt API in the end.
- REST API uses Web Application Description Language, and SOAP API used Web Services Description language for describing the functionalities being offered by web services.
- REST APIs are more convenient with JavaScript and can be implemented easily as well. SOAP APIs are also convenient with JavaScript but don't support for greater implementation.
###### Relative links:
+ https://dzone.com/articles/difference-between-rest-and-soap-api

## Is it correct to update something during get request?
no. GET is idempotent: it is for obtaining a resource, without changing anything on the server. As a consequence it should be perfectly safe to resubmit a GET request.
###### Relative links:
+ https://stackoverflow.com/questions/2080863/what-is-the-difference-between-a-http-get-and-http-post-and-why-is-http-post-wea

## Is it possible to use body in get requests?
Yes, you can send a request body with GET but it should not have any meaning. If you give it meaning by parsing it on the server and changing your response based on its contents, then you are ignoring this recommendation in the HTTP/1.1 spec, section 4.3:

[...] if the request method does not include defined semantics for an entity-body, then the message-body SHOULD be ignored when handling the request.
###### Relative links:
- https://stackoverflow.com/questions/978061/http-get-with-request-body

## What are possible types of requests for http protocol?
**GET**

The GET method requests a representation of the specified resource. Requests using GET should only retrieve data.

**HEAD**

The HEAD method asks for a response identical to that of a GET request, but without the response body.

**POST**

The POST method is used to submit an entity to the specified resource, often causing a change in state or side effects on the server.

**PUT**

The PUT method replaces all current representations of the target resource with the request payload.

**DELETE**

The DELETE method deletes the specified resource.

**CONNECT**

The CONNECT method establishes a tunnel to the server identified by the target resource.

**OPTIONS**

The OPTIONS method is used to describe the communication options for the target resource.

**TRACE**

The TRACE method performs a message loop-back test along the path to the target resource.

**PATCH**

The PATCH method is used to apply partial modifications to a resource.
###### Relative links:
- https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods

## Why method options is needed?
The **HTTP OPTIONS** method is used to request information about the communication options available for the target resource. The response may include an Allow header indicating allowed HTTP methods on the resource, or various Cross Origin Resource Sharing headers. The HTTP OPTIONS method is both safe and idempotent, as it is intended only for use in querying information about ways to interact with a resource.
###### Relative links:
- https://egghead.io/lessons/tools-use-http-options-method

## What is the difference between put and post?
- **POST** to a URL creates a child resource at a server defined URL.
- **PUT** to a URL creates/replaces the resource in its entirety at the client defined URL.
- **PATCH** to a URL updates part of the resource at that client defined URL.
###### Relative links:
- https://stackoverflow.com/questions/630453/put-vs-post-in-rest

## What can be used as rest client?
1. Netflix provides Feign as an abstraction over REST-based calls, by which microservices can communicate with each other, but developers don't have to bother about REST internal details.
2. Jersey
3. Spring RestTemplate
###### Relative links:
+ https://dzone.com/articles/microservices-communication-feign-as-rest-client
+ https://stackoverflow.com/questions/221442/rest-clients-for-java

## How http protocol work?
As a request-response protocol, HTTP gives users a way to interact with web resources such as HTML files by transmitting hypertext messages between clients and servers. HTTP clients generally use Transmission Control Protocol (TCP) connections to communicate with servers.
###### Relative links:
+ https://www.extrahop.com/resources/protocols/http/
+ https://www.quora.com/How-does-HTTP-work

## What are the possible solutions in the case of big number of parameters for search method?
1. POST request with body;
2. Encoding the query string in GET request;
3. Aliases.
###### Relative links:
- https://softwareengineering.stackexchange.com/questions/353086/what-is-a-proper-way-to-do-a-complex-restful-search-method

## What should be the response in the case of DELETE request?
There is no hard RESTful standard. **204 No Content** is a popular response for DELETE.
###### Relative links:
- https://stackoverflow.com/questions/25970523/restful-what-should-a-delete-response-body-contain

## What is the best solution for representing Enum in API?
Strings.
###### Relative links:
- https://softwareengineering.stackexchange.com/questions/220091/how-to-represent-enum-types-in-a-public-api

## What is the best practice for getting Unique Resource From Sub-Collection?
###### Relative links:
- https://cloud.google.com/apis/design/design_patterns#get_unique_resource_from_sub-collection

## How search in sub-collections can be implemented?
###### Relative links:
- https://cloud.google.com/apis/design/design_patterns#list_sub-collections

## What is the best practice for nested resources?
###### Relative links:
- https://www.moesif.com/blog/technical/api-design/REST-API-Design-Best-Practices-for-Sub-and-Nested-Resources/

## Fine Grained CRUD Resources vs. Coarse Grained Resources?
###### Relative links:
- https://dzone.com/articles/rest-api-design-resource-modeling-1
- https://medium.com/garri-hov/rest-api-guideline-resource-modeling-48e63807a1b3
- https://nordicapis.com/how-granular-should-you-design-apis/

## Best guidelines?
###### Relative links:
- https://github.com/microsoft/api-guidelines/blob/vNext/Guidelines.md
- https://opensource.zalando.com/restful-api-guidelines/

## Best practice for PATCH?
###### Relative links:
- https://opensource.zalando.com/restful-api-guidelines/#patch

## Do sessions violate REST?
###### Relative links:
- https://stackoverflow.com/questions/6068113/do-sessions-really-violate-restfulness

## When to use GraphQL?
###### Relative links:
- https://dzone.com/articles/why-and-when-to-use-graphql-1

## What is ElasticSearch?
###### Relative links:
- https://dzone.com/articles/what-is-elasticsearch-and-how-it-can-be-useful

## What are the possible ways of versioning?
###### Relative links:
- https://restfulapi.net/versioning/

[Home Page](README.md)
