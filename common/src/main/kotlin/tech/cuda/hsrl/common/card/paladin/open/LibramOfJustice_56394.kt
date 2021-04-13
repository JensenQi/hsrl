package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LibramOfJustice_56394 : Card() {
    override val id = 56394
    override val name = "正义圣契"
    override val description = "装备一把1/4的武器。将所有敌方随从的生命值变为1。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "对方不想说话并向你扔了一本书。"
    override val artist = "Wayne Wu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87fd13e68d7f23cb85f2c00b3eed2233296fab39cef221b3714acde4ee7ef5e5.png"
}
