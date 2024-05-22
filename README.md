# ♕ BYU CS 240 Chess

This project demonstrates mastery of proper software design, client/server architecture, networking using HTTP and WebSocket, database persistence, unit testing, serialization, and security.

## 10k Architecture Overview

The application implements a multiplayer chess server and a command line chess client.

[![Sequence Diagram](10k-architecture.png)](https://sequencediagram.org/index.html#initialData=C4S2BsFMAIGEAtIGckCh0AcCGAnUBjEbAO2DnBElIEZVs8RCSzYKrgAmO3AorU6AGVIOAG4jUAEyzAsAIyxIYAERnzFkdKgrFIuaKlaUa0ALQA+ISPE4AXNABWAexDFoAcywBbTcLEizS1VZBSVbbVc9HGgnADNYiN19QzZSDkCrfztHFzdPH1Q-Gwzg9TDEqJj4iuSjdmoMopF7LywAaxgvJ3FC6wCLaFLQyHCdSriEseSm6NMBurT7AFcMaWAYOSdcSRTjTka+7NaO6C6emZK1YdHI-Qma6N6ss3nU4Gpl1ZkNrZwdhfeByy9hwyBA7mIT2KAyGGhuSWi9wuc0sAI49nyMG6ElQQA)

## Modules

The application has three modules.

- **Client**: The command line program used to play a game of chess over the network.
- **Server**: The command line program that listens for network requests from the client and manages users and games.
- **Shared**: Code that is used by both the client and the server. This includes the rules of chess and tracking the state of a game.

## Starter Code

As you create your chess application you will move through specific phases of development. This starts with implementing the moves of chess and finishes with sending game moves over the network between your client and server. You will start each phase by copying course provided [starter-code](starter-code/) for that phase into the source code of the project. Do not copy a phases' starter code before you are ready to begin work on that phase.

## IntelliJ Support

Open the project directory in IntelliJ in order to develop, run, and debug your code using an IDE.

## Maven Support

You can use the following commands to build, test, package, and run your code.

| Command                    | Description                                     |
| -------------------------- | ----------------------------------------------- |
| `mvn compile`              | Builds the code                                 |
| `mvn package`              | Run the tests and build an Uber jar file        |
| `mvn package -DskipTests`  | Build an Uber jar file                          |
| `mvn install`              | Installs the packages into the local repository |
| `mvn test`                 | Run all the tests                               |
| `mvn -pl shared test`      | Run all the shared tests                        |
| `mvn -pl client exec:java` | Build and run the client `Main`                 |
| `mvn -pl server exec:java` | Build and run the server `Main`                 |

These commands are configured by the `pom.xml` (Project Object Model) files. There is a POM file in the root of the project, and one in each of the modules. The root POM defines any global dependencies and references the module POM files.

## Running the program using Java

Once you have compiled your project into an uber jar, you can execute it with the following command.

```sh
java -jar client/target/client-jar-with-dependencies.jar

♕ 240 Chess Client: chess.ChessPiece@7852e922
```
## Sequence Diagram Link
https://sequencediagram.org/index.html?presentationMode=readOnly#initialData=IYYwLg9gTgBAwgGwJYFMB2YBQAHYUxIhK4YwDKKUAbpTngUSWDABLBoAmCtu+hx7ZhWqEUdPo0EwAIsDDAAgiBAoAzqswc5wAEbBVKGBx2ZM6MFACeq3ETQBzGAAYAdAE5M9qBACu2GADEaMBUljAASij2SKoWckgQaIEA7gAWSGBiiKikALQAfOSUNFAAXDAA2gAKAPJkACoAujAA9D4GUAA6aADeAETtlMEAtih9pX0wfQA0U7jqydAc45MzUyjDwEgIK1MAvpjCJTAFrOxclOX9g1AjYxNTs33zqotQyw9rfRtbO58HbE43FgpyOonKUCiMUyUAAFJForFKJEAI4+NRgACUh2KohOhVk8iUKnU5XsKDAAFUOrCbndsYTFMo1Kp8UYdOUyABRAAyXLg9RgdOAoxgADNvMMhR1MIziSyTqDcSpymgfAgEDiRCo2XLmaSYCBIXIUNTKLSOndZi83hxZj9tgztPL1GzjOUAJIAOW54UFwtG1v0ryW9s22xg3vqNWltDBOtOepJqnKRpQJoUPjAqQtQxFKCdRP1rNO7sjPq5ftjt3zs2AWdS9QgAGt0OXozB69nZc7i4rCvGUOUu42W+gtVQ8blToCLmUIlCkVBIqp1VhZ8D+0VqJcYNdLfnJuVVk8R03W2gj1N9hPKFvsuZygAmJxObr7vOjK8nqZnseXmBjxvdAOFMLxfH8AJoHYckYB5CBoiSAI0gyLJkHMNkjl3ao6iaVoDHUBI0HfAMUCDBYlgOLCQUKDdLg-Gsv0+J4bSWXY+gBc5NyVbUhxgBAEKQNBYXgxDUXRWJsUHXVe2TUoSiQMVLDNOFSMLJlkzdDlyF5fl-QPUUJQgKUbnIkN3h7ItNOnAdlT40iJynAlZJZVNjUyTNs1zRiC0sjSFVLbTvV9fTPzIzsG3PNsoxjEc-JdEseMnFUIuzKK0EchMZy43dRKElc10wOiQSS3cGLub9Hl-SL-0qjjbxKwoHwwZ9X3fAYDLGQDry+P8Lzqg4QLA7w-ECLwUDbUTfGYZD0kyTBmuYUr5wqaRdPqLlmhaAjVCI7o+vHai2WK0oR2gJAAC94kScoAB4DrQfIipymjt2SviBPsaaRIQ6bxIxKS7JkqzXKMFBuA8htYQe9SEq08o1r5DbUtHC9xUlat4r7Gy3vBPcqKBnGTrg36swKhB1xerdqKuAmd0a+B0JamAXycMxOGGiDAkhDg4OhGAAHF81ZWbUIWpmlts+nygqAWuTwlp7HzfaaovBrjpe06G3Oq6CBumB7tV9AnuKzC7PKZBYiF0ZVBE6FrbUf7JMywxExcg1yTATycxhrHrMKMtuT5AUUfS9HjND-8NCTAKkrxh6XeB-yDUtsAHdt2HsYD7Sg70zsNRgJWbfDqUQB8KBIVIIu1D92Opfe4cNXTxOic1vmreF8nKaBO8cZpvc+mr1Rxkqfpq49aQR4ARifABmAAWJ4UMyFSKomL4dAQUBm1Xw916eauvXzde9hgRo6eOHHFtat9eimIeR4qMf8wn6e58XqZl9NTqVg3reQB3j-fe998xH1GCfM+g0OaeBGpBbA5dsDcHgO5QwDsUhzTQjkSWb1sK1AaFtauKs0r-nfIffMF9e60U1mdKAl1rpoDug9fI74QGjDAfcPokxOI91eoONy6ZMgO1hHAFBDsnZYhbs5EGHsKTe2hkbNAmd-bsk5LpEOD0S6RwvNHd2iV67xwUZImQuj+EmiEWQ0YSiArZ09BWKsFjDAxUNOXSuzAh611dH3c2hcX7SBbtlHh5QRECJQGItQhVTZeOlnuVhKBX7lBngvGAFCGbXxZm1O+g9fFvySVA0CMCuYBEsODASyQYAACkIBCUFvmQIm9t7iywWbaJ1RKQK0IcEBR75EHAGKVAOAEABJQFmOPaQKSNaBJoXQvWDCDZMJYc8LefSBlDJWAAdRYB6DaLQABCPIFBwAANJfFGTk+eyTno8OaQ3AAVlUtAQjKlCTCWiAGRiY4yK9lDX2HySw2J0sHQUGijJSgejo6RejcYpQTtJN2ELSie3Mb4qxnj-m5xDtXTRZcK4YXcb86m3jq7vJMX4LQgj8ywmrtaJZlAVnQBRX8lRMBKRVGkAoZGmKQXOJxVXYWMBkgZFSDAHpyzBnQA8ZCvh+N-FUMCRU+5YTVwU0uXOAl0SejjKvhLG+7N8ngVGgELwvTGbplgMAbAiDCD0PQWLRa1zsKI3lptVoxh1YBLnKUDVKruL6JVCAbgeAFAWuQCAehwiA1QCDZa0NMzxGA14knBKqYI2wgZfDGQ60uT5wQD44uXLsWuNzTXfFUSG7Sthe64EQSI1RpDfQru3re7LVpm604aTWa6swEAA
