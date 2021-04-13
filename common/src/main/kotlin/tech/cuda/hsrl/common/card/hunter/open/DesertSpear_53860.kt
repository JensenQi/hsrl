package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DesertSpear_53860 : Card() {
    override val id = 53860
    override val name = "沙漠之矛"
    override val description = "在你的英雄攻击后，召唤一只1/1并具有<b>突袭</b>的 蝗虫。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "一点寒芒先到，随后一只蝗虫。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eab56dc0c5ba8245e79d3e581118f8835922d76507cf903928b5cae16e97c760.png"
}
