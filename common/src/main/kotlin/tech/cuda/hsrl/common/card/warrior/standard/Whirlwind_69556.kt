package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Whirlwind_69556 : Card() {
    override val id = 69556
    override val name = "旋风斩"
    override val description = "对所有随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Core
    override val background = "分辨资深战士和新手战士的最好办法：新手在用旋风斩时会喊“哇哇哇”。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6cf97a3bd8c6424ce960c9e02daa0d912e9a7e8ba5242fd4ddd318b14e3acdc2.png"
}
