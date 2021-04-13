package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EmbraceTheShadow_38439 : Card() {
    override val id = 38439
    override val name = "暗影之握"
    override val description = "在本回合中，你的治疗效果转而造成等量的伤害。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "要是你的奥金尼灵魂祭司请病假了，就用它吧。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06128a125b91e49ee7dfe5f4f470a7bfee77e518f91108a2601b7d294e817676.png"
}
