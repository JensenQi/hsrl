package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SunborneValkyr_42440 : Card() {
    override val id = 42440
    override val name = "阳焰瓦格里"
    override val description = "<b>战吼：</b>使相邻的随从获得+2生命值。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "请为奥丁的殿堂带来荣耀，勇士！"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f05604764da7dfd63c94041d069041c56766d3072e120d89694dd740d952af1.png"
}
