package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AbominableBowman_43245 : Card() {
    override val id = 43245
    override val name = "憎恶弓箭手"
    override val description = "<b>亡语：</b>随机召唤一个在本局对战中死亡的友方野兽。"
    override var cost: Int? = 7
    override var health: Int? = 7
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Kotf
    override val background = "装了第三只手后，射速提高了50%！"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d2e74cb552da49ed635832edce72946cebfa26bff3db6a444f130bfdd850e871.png"
}
