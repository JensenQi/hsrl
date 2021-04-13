package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Whirlwind_636 : Card() {
    override val id = 636
    override val name = "旋风斩"
    override val description = "对所有随从造成 1点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Legacy1635
    override val background = "分辨资深战士和新手战士的最好办法：新手在用旋风斩时会喊“哇哇哇”。"
    override val artist = "Jonboy Meyers"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6a99f5296487683a9772de6dd80d09efded20434c807af9be6f7b735a7a22190.png"
}
