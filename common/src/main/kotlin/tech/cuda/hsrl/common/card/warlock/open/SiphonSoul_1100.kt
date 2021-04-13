package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SiphonSoul_1100 : Card() {
    override val id = 1100
    override val name = "灵魂虹吸"
    override val description = "消灭一个随从，为你的英雄恢复 3点生命值。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Legacy3
    override val background = "你最好避免虹吸自己的灵魂，这样会造成一些很奇怪的死循环。"
    override val artist = "Tyler Walpole"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0e2b20ebfd68aa65cbe40c4882799e28bd8a4e5acacc63328179258ae7c93967.png"
}
