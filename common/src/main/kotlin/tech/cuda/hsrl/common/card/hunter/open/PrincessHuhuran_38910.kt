package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrincessHuhuran_38910 : Card() {
    override val id = 38910
    override val name = "哈霍兰公主"
    override val description = "<b>战吼：</b>触发一个友方随从的<b>亡语</b>。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Wotog
    override val background = "哈霍兰公主游荡在安其拉废墟的上空，梦想有朝一日能遇见自己的心上人，并为他生下成千上万个孩子。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b3014ed8b2ecf00d01fe4ecfd82c8fa9c702bc244269cff622fcf028c432ed7.png"
}
