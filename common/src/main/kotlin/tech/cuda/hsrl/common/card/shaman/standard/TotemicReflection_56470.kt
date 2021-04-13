package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TotemicReflection_56470 : Card() {
    override val id = 56470
    override val name = "图腾映像"
    override val description = "使一个随从获得+2/+2。如果该随从是图腾，召唤一个它的复制。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“根据映像的启示，我觉得你的对战面板上需要更多的我。”"
    override val artist = "Daria Tuzova"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/252d88ce8ce763192d50b795e9cc65dfe0f8e573508ed66729912c06f29958e1.png"
}
