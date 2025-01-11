curl -X PUT "http://127.0.0.1:9200/big_market.raffle_activity_order" -H 'Content-Type: application/json' -d'
{
    "mappings": {
      "properties": {
        "_user_id":{"type": "text"},
        "_sku":{"type": "text"},
        "_activity_id":{"type": "text"},
        "_activity_name":{"type": "text"},
        "_strategy_id":{"type": "text"},
        "_order_id":{"type": "text"},
        "_order_time":{"type": "text"},
        "_total_count":{"type": "text"},
        "_day_count":{"type": "text"},
        "_month_count":{"type": "text"},
        "_pay_amount":{"type": "text"},
        "_state":{"type": "text"},
        "_out_business_no":{"type": "text"},
        "_create_time":{"type": "date"},
        "_update_time":{"type": "date"}
      }
    }
}'