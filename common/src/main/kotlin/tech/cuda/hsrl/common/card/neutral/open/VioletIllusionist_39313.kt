package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VioletIllusionist_39313 : Card() {
    override val id = 39313
    override val name = "紫罗兰法师"
    override val description = "在你的回合时，你的英雄会获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "自从加入到紫罗兰之眼后，困扰她多年的近视问题终于解决了。"
    override val artist = "Eric Braddock"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cd62e07d3d2f5566ae3e64e524346d8782e0f949d9ac41d15903e0d9720d1058.png"
}
