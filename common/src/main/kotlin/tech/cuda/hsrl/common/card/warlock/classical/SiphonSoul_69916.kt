package tech.cuda.hsrl.common.card.warlock.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiphonSoul_69916 : Card() {
    override val id = 69916
    override val name = "灵魂虹吸"
    override val description = "消灭一个随从，为你的英雄恢复 3点生命值。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.ClassicCards
    override val background = "你最好避免虹吸自己的灵魂，这样会造成一些很奇怪的死循环。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e3e86e96bf0273abdad5727f1ff57f7f0ef8f5644c664c57ab26a449c362d45.png"
}
