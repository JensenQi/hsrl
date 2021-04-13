package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RabidWorgen_46650 : Card() {
    override val id = 46650
    override val name = "狂暴的狼人"
    override val description = "<b>突袭</b>"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "“我很抱歉，孩子。我们不得不把老霍勒送去……遥远的牧场……”"
    override val artist = "Chris Seaman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e43faf3354f6e77586f524bec7ae9c243da19ef723f17fb7a35415f993a7d5d1.png"
}
