@echo off
title Re-enable Necessary Services
color 30
echo.
echo Re-enabling necessary services...
echo.

:: Re-enable Bluetooth services
sc config bthserv start= auto
sc config BthAvctpSvc start= auto
sc config BthHFSrv start= auto
sc config irmon start= auto
sc config WdiServiceHost start= auto
sc config WdiSystemHost start= auto

:: Re-enable Wi-Fi services
sc config WlanSvc start= auto
sc config WwanSvc start= auto
sc config Ndisuio start= auto
sc config Netman start= auto
sc config NlaSvc start= auto
sc config fdPHost start= auto
sc config FDResPub start= auto
sc config iphlpsvc start= auto

:: Re-enable Fingerprint services
sc config WbioSrvc start= auto
sc config VaultSvc start= auto
sc config DeviceAssociationService start= auto
sc config SensrSvc start= auto
sc config SensorService start= auto
sc config SensorDataService start= auto

:: Start the services
net start bthserv
net start BthAvctpSvc
net start BthHFSrv
net start irmon
net start WdiServiceHost
net start WdiSystemHost
net start WlanSvc
net start WwanSvc
net start Ndisuio
net start Netman
net start NlaSvc
net start fdPHost
net start FDResPub
net start iphlpsvc
net start WbioSrvc
net start VaultSvc
net start DeviceAssociationService
net start SensrSvc
net start SensorService
net start SensorDataService

echo.
echo Necessary services have been re-enabled.
pause