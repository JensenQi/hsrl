package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DarkPharaohTekahn_53890 : Card() {
    override val id = 53890
    override val name = "黑暗法老塔卡恒"
    override val description = "<b>战吼：</b>在本局对战的剩余时间内，你的<b>跟班</b>变为4/4。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "他必将战胜探险者协会，还有他们的小鱼人！"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e09bf825adc8cd3ec65bf99423b36ca4b4de4e90b2229505572f0265e71c979.png"
}
