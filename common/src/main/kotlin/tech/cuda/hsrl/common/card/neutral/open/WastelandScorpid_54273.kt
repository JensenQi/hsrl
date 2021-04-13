package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WastelandScorpid_54273 : Card() {
    override val id = 54273
    override val name = "废土巨蝎"
    override val description = "<b>剧毒</b>"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "这种身材的巨蝎，有没有毒已经不重要了。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3d1add739659cbac6b0b97ec7b21f3814949f807fe6ce10873a02804487c10c.png"
}
