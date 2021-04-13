package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PintSizePotion_40936 : Card() {
    override val id = 40936
    override val name = "缩小药水"
    override val description = "在本回合中，使所有敌方随从获得-3攻击力。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Msog
    override val background = "本产品有一定概率会缩小到亚原子状态。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b5c8348647b8cc9f95a441e220948a71f17e2740fcb6ef467a2f1d4cf4b87d86.png"
}
