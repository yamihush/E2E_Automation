https://webhookrelay.com/blog/2017/11/23/github-jenkins-guide/
https://my.webhookrelay.com/tokens

relay login -k cc48d1a2-ed0d-48c8-b46a-4959a411306f -s njXhvIywQtck


export RELAY_KEY=cc48d1a2-ed0d-48c8-b46a-4959a411306f
export RELAY_SECRET=njXhvIywQtck


relay-windows-amd64.exe forward --bucket github-jenkins http://localhost:8080/github-webhook/

=============================================================================================

C:\Users\Muthukumar\software>relay-windows-amd64.exe

Usage:  relay COMMAND

Webhook Relay - tunnels for the web.

By using this product, you are agreeing to the terms of the the AppScension Ltd. Terms of service can be found at: https://webhookrelay.com/tos/

Don't have an account? Create one here: https://my.webhookrelay.com/register
or run:

relay register -e youremail@domain.com -p password -u username

Report client related issues here: https://github.com/webrelay/client/issues.

If you have any questions or security related issues, please contact us via email: support@webhookrelay.com.

Options:
      --config string   Location of client config files (default
                        "C:\\Users\\Muthukumar\\.webhookrelay")
      --help            Print usage
  -v, --version         Print version information and quit

Management Commands:
  bucket      Manage buckets - used to group inputs and outputs together
  ingress     Manage ingresses - reverse tunnels for Kubernetes
  input       Manage inputs - your personal endpoints to receive webhooks
  output      Manage outputs - destinations where requests are relayed
  token       Manage tokens - required for API (OAuth users) and webhook streaming connections
  tunnel      Manage tunnels - bidirectional connections that expose internal services

Commands:
  connect     Connects supplied destination to the public endpoint
  forward     Create forwarding configuration (automatically creates bucket, input endpoint and output destination). If destination and bucket aren't specified - starts a relay for all endpoints
  login       Log in to a Webhook Relay service. Get your token key & secret pair here: https://my.webhookrelay.com/tokens.
  logout      Log out from a Webhook Relay service
  register    Register a new Webhook Relay account
  run         Run relay agent as a service with a given config file
  service     Install and control relay as a background service, available commands (install, uninstall, start, stop, restart, status)

Run 'relay COMMAND --help' for more information on a command.

C:\Users\Muthukumar\software>relay-windows-amd64.exe login -k cc48d1a2-ed0d-48c8-b46a-4959a411306f -s njXhvIywQtck
Clearing existing credentials...
Not logged in to my.webhookrelay.com:443
Not logged in to my.webhookrelay.com:8080
Not logged in to tnl.webrelay.io
Saving new credentials to C:\Users\Muthukumar\.webhookrelay\config.json
success
=============================================================================================
C:\Users\Muthukumar\software>relay-windows-amd64.exe forward --bucket github-jenkins http://localhost:8080/github-webhook/
Forwarding:
https://my.webhookrelay.com/v1/webhooks/265620c6-96f3-4fc9-afd1-38b63df40054 -> http://localhost:8080/github-webhook/
Starting webhook relay agent...
2019-07-15 00:20:47.120 INFO    using standard transport...
2019-07-15 00:20:48.833 INFO    webhook relay ready...  {"host": "my.webhookrelay.com:8080"}
2019-07-15 00:23:27.325 INFO    webhook request relayed {"destination": "http://localhost:8080/github-webhook/", "method": "POST", "bucket": "github-jenkins", "status": 200, "retries": 0}
2019-07-15 00:25:51.869 INFO    webhook request relayed {"destination": "http://localhost:8080/github-webhook/", "method": "POST", "bucket": "github-jenkins", "status": 200, "retries": 0}

