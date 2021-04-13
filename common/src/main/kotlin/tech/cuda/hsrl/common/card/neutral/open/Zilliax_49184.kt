package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Zilliax_49184 : Card() {
    override val id = 49184
    override val name = "奇利亚斯"
    override val description = "<b>磁力，圣盾，嘲讽，吸血，突袭</b>"
    override var cost: Int? = 5
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "设施完备，功能齐全，只缺一个水槽就能用了。等等，它背面有个水槽。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a851c5a4a7f00613341db9dbb4b163db49e121b85aa151f3314b1cdbd9b9b41e.png"
}
