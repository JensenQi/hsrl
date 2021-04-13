package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DivingGryphon_54926 : Card() {
    override val id = 54926
    override val name = "俯冲狮鹫"
    override val description = "<b>突袭，战吼：</b>从你的牌库中抽一张具有<b>突袭</b>的随从牌。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "警告：可能使你想起被旋转木马支配的不良回忆。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5bcdc90a725618a24e4778a60a237995e034fce85887fb0928aef884e9a1e60b.png"
}
