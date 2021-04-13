package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MyrasUnstableElement_48487 : Card() {
    override val id = 48487
    override val name = "迈拉的不稳定元素"
    override val description = "抽取你牌库剩下的牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.BoomsdayProject
    override val background = "你一定是疯了才会这么做……"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec258d35814f5d22b7bbdfd55f1e77af35c47c6fd25e87d5cf358a27c4f7c59c.png"
}
