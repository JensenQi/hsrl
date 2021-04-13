package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentProtector_69936 : Card() {
    override val id = 69936
    override val name = "银色保卫者"
    override val description = "<b>战吼：</b>使一个其他友方随从获得<b>圣盾</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "“我没说你能够躲过火球。我是说有了这盾，你就不需要躲了。”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f4faa24f546aa38127b3780614a926a8067c99cdb6908e6a0b653e3d5898d2b5.png"
}
