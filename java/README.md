# LittleAstro-API

### Java Client

### Quick Start

### Need to update URL locations to reflect the new endpoint location

```java
public static void main(String[] args) throws ConfigurationException, IOException, InvalidEnumException
{
    HoroscopeReadings horoscopeReadings = HoroscopeReadings.getInstance();
    ZodiacReadings zodiacReadings = ZodiacReadings.getInstance();

    HoroscopeSign aries = horoscopeReadings.getSign(AstroEnum.Aries);
    ZodiacSign rat = zodiacReadings.getSign(AstroEnum.Rat);

    System.out.println(aries);
    System.out.println(rat);

    System.out.println(aries.getDaily_Horoscope());
    System.out.println(aries.getLove());
    System.out.println(aries.getWellness());
    System.out.println(rat.getDaily_Zodiac());
}
```
[Demo App](https://github.com/xiaoerge/LittleAstroGWT)

