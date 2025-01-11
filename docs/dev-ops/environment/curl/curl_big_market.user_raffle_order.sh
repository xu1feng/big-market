curl -X PUT "http://127.0.0.1:9200/big_market.user_raffle_order" -H 'Content-Type: application/json' -d'
{
    "mappings": {
      "properties": {
        "_user_id":{"type": "text"},
        "_activity_id":{"type": "text"},
        "_activity_name":{"type": "text"},
        "_strategy_id":{"type": "text"},
        "_order_id":{"type": "text"},
        "_order_time":{"type": "date"},
        "_order_state":{"type": "text"},
        "_create_time":{"type": "date"},
        "_update_time":{"type": "date"}
      }
    }
}'