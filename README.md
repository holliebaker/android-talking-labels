# Android Talking Labels

Android app for labelling objects with NFC, QR codes or barcodes.

## Proposed Features

1. ability to "write" codes.
  - user enters item_name
  - optionally user enters item_details
  - tag_type is selected
  - user taps "write"
  - uuid is generated, item added to database.
  - if NFC
    - record 1: tag_taye, "TAG_TALK"
    - record 2: text, item_name
    - record 3: uuid, item_uuid
    - insert item_tag (uuid,uuid)
  - if qr
    - read qr, if uuid then insert item_tag (tag_uuid, uuid)
  - if barcode
    - read barcode, insert item_tag (barcode, uuid)
  - if record for tag_id already exists prompt user if they want to overwrite
1. ability to "read" tags
  - nfc: application listens for TAG_TALK nfc tags
  - qr / barcode: within app, user selects scan, when code is detected, look it up in db, if it's not in db then show a message
  - display a new screen: item_name, item_details. speak "item_name" (based on user setting)
1. Quick-find mode. 
  - user selects camera or nfc as required
    - when a tag talk tag is detected, device displays and speaks item_name. last item_name remains at bottom of screen, user can tap more info to see the full details.  
  - the idea is to allow user to find what they are looking for quickly.
3. Options
  - speak tag (yes/no)
  - change colours of text / background for enhanced readability
  - increase / decrease text size, ensure application works with variable text / display sizez as selected in device settings
 
## Compile and Install

```
./gradlew
./gradlew build
./gradlew InstallDebug
```

