package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AldorAttendant_56445 : Card() {
    override val id = 56445
    override val name = "奥尔多侍从"
    override val description = "<b>战吼：</b>在本局对战中，你的圣契的法力值消耗减少（1）点。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.AshesOfOutland
    override val background = "借阅圣契的时候请她招呼一声，打折。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8e7dd714f7b971b9e225a115a7fcc0f87dcce90130a153be3af71d1649e08b59.png"
}
