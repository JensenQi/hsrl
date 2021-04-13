package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BodyWrapper_54783 : Card() {
    override val id = 54783
    override val name = "裹尸匠"
    override val description = "<b>战吼：</b><b>发现</b>一个在本局对战中死亡的友方随从。将其洗入你的牌库。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "裹尸匠采用腌黄瓜片进行眼部养护，确保双眼滋润如新。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2247d3f551d7c351750d844a2170944fd70ca3f20a6f9bb652555e52e1ed1d6d.png"
}
