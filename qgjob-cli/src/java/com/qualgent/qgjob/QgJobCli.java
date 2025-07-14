package com.qualgent.qgjob;

import picocli. CommandLine:
import
picocli.CommandLine.Command;]

import picocli.CommandLine.Option:
import
java-net.http.*;

import java.net.URI;

import java nio. file.Files;

import java.nio. file.Paths;

import java.util.concurrent.Callable;
nterview help
Editing QualGent-Backend-Codi x
SamuelSidariResume - Google D x
+
e8-8001-80f1-3e63b9a19ead
X Ogjob Orchestrator ~
11.6
18
23
24
25
26
27く
28 v
@Command (name - "agjob", mixinstandardHelpOptions = true, version - "dejob 1.8".
description = "QualGent Test Job CLI", subcommands = {Submit.class, Status.class})
public class gJobcli {
public static void main(String[] args) €
int exitCode = new CommandLine(new QgJobCli()).execute(args);
System.exit(exitCode);
31
32
34
35
36
37
38
End Session
InPrivate
て↓ロ
@Command (name -
"submit", description = "Submit a test job")
class Submit
implements Callable<Integer> {
Option (names - "--org-id", required = true) String orgId;
@Option (names = "--app-version-id", required = true) String appVersionId;
@Option (names = *--test"
, required - true) String testPath;
@Option (names = "--target", required = false, defaultValue = "emulator") String target;
public Integer call() throws Exception (
Httpolient client = HttpClient.newHttpClient();
String payload = String format('(\"orgid\":\"%\", \"appVersionId\": \"%\",\"testPath\*:\"%s\", \"target\":\"%s\"}",
HttpRequest request = HttpRequest.newBuilder()
•uri(URI. create(http: //localhost:8080/jobs"))
header (*Content-Type"
"application/json")
-POST (HttpRequest.BodyPublishers.ofString(payload))
-build();
HttpResponse‹String> response = client. send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body(D);
return 8;