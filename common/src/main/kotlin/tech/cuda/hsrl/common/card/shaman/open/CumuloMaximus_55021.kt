package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CumuloMaximus_55021 : Card() {
    override val id = 55021
    override val name = "遮天雨云"
    override val description = "<b>战吼：</b>如果你有<b>过载</b>的法力水晶，造成5点伤害。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“你们没有云娱乐设备吗？！”"
    override val artist = "Evgeniy Dlinnov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/622537b479ead4c26363eb40768aa61f77896d9c234ee3d3ef67748c2ccf3760.png"
}
