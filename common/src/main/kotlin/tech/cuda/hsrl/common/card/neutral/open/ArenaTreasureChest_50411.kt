package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArenaTreasureChest_50411 : Card() {
    override val id = 50411
    override val name = "竞技场财宝箱"
    override val description = "<b>亡语：</b>抽两张牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "宝箱开出了胸甲特质装，不错，但你开出武器了吗？！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83e9869ee3fc7f2717b7467f04b028f5724102edb1a27eb16bd70f8c073fc9f4.png"
}
