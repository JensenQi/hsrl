package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Shrubadier_55038 : Card() {
    override val id = 55038
    override val name = "盆栽投手"
    override val description = "<b>战吼：</b>召唤一个2/2的树人。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.DescentOfDragons
    override val background = "投之以花盆，爆之以树人。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e88098a15560a2fd7b8eaf1e0c6382d6b0f13484b6fb16fec07419b104faf79a.png"
}
