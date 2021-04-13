package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ApexisBlast_57217 : Card() {
    override val id = 57217
    override val name = "埃匹希斯冲击"
    override val description = "造成 5点伤害。如果你的牌库中没有随从牌，随机召唤一个法力值消耗为（5）的随从。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "落单的法师照样可以冲你们一群！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/20a486a207e6c33b91ebda1f26c9f733c2baa61ea6ea9ccd7342272d5c824d2c.png"
}
