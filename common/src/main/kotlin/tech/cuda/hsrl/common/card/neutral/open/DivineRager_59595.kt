package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivineRager_59595 : Card() {
    override val id = 59595
    override val name = "神圣暴怒者"
    override val description = "<b>圣盾</b>"
    override var cost: Int? = 4
    override var health: Int? = 1
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "冲冠一怒为何事？圣光容易把人抛。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f6eb73882ebb9b3461756ad06a9d91280c05265a877aca52f130501f4d19157a.png"
}
