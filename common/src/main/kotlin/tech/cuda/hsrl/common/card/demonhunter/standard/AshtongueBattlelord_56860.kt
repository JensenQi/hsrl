package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AshtongueBattlelord_56860 : Card() {
    override val id = 56860
    override val name = "灰舌将领"
    override val description = "<b>嘲讽，吸血</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "恶魔夺去了众多灰舌德莱尼的生命。如今他肩上担着斧仇的重任。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0fbb07b55f9408ac1e1ebf5250ed27a4206efeac568edcf1cd6823ce918e827f.png"
}
