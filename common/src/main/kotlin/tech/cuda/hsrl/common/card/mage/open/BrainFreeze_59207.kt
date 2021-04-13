package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BrainFreeze_59207 : Card() {
    override val id = 59207
    override val name = "冰冷智慧"
    override val description = "<b>冻结</b>一个随从。<b>连击：</b>并对其造成 3点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“教授让我回答问题，我直接凉了！”"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be91431c61dbe4d0440cfd55b4a9c0ba56ed3a83e231e376db9915d47c7f0e2e.png"
}
