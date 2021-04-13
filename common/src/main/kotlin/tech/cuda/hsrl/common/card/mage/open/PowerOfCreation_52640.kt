package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerOfCreation_52640 : Card() {
    override val id = 52640
    override val name = "创世之力"
    override val description = "<b>发现</b>一张法力值消耗为（6）的随从牌。召唤两个它的 复制。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.RiseOfShadows
    override val background = "通常用于晚会表演，真的。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e02eabeda55d9fc3076a0fee0156112d97b3d2e071a8b0345ef90c74a7d6a09e.png"
}
