curl -X PUT "127.0.0.1:9200/xfg_dev_tech.user_order/_mapping" -H 'Content-Type: application/json' -d'
{
  "properties": {
    "_sku_name": {
      "type": "text"
    }
  }
}'