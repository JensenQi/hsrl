package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FungalEnchanter_46087 : Card() {
    override val id = 46087
    override val name = "菌菇附魔师"
    override val description = "<b>战吼：</b>为所有友方角色恢复 2点生命值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "应聘条件：生下来就戴着尖顶帽子。"
    override val artist = "Max Grecke"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cb8be935944dabccc3515f442597bffb44cddd68a7d64eecb2b80901e84b087c.png"
}
