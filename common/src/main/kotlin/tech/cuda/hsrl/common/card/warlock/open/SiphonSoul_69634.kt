package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiphonSoul_69634 : Card() {
    override val id = 69634
    override val name = "灵魂虹吸"
    override val description = "消灭一个随从，为你的英雄恢复 3点生命值。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Core
    override val background = "你最好避免虹吸自己的灵魂，这样会造成一些很奇怪的死循环。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db3d5b7456cc992811fbfd5e11cd6f013497143fb2579283e3b06306d1b4b98d.png"
}
