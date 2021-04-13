package tech.cuda.hsrl.common.card.paladin.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentProtector_69611 : Card() {
    override val id = 69611
    override val name = "银色保卫者"
    override val description = "<b>战吼：</b>使一个其他友方随从获得<b>圣盾</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Core
    override val background = "“我没说你能够躲过火球。我是说有了这盾，你就不需要躲了。”"
    override val artist = "Doug Alexander"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0a391521b2dff858d735c74df7255aad9d0be7030a35a3c0d2df82b0bd5c93de.png"
}
