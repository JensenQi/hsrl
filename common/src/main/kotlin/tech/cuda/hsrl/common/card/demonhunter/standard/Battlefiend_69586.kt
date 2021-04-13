package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Battlefiend_69586 : Card() {
    override val id = 69586
    override val name = "战斗邪犬"
    override val description = "在你的英雄攻击后，获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.Core
    override val background = "看到这个斧头斧脑的家伙没，这是我的战友。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6b67bb63f5f567d5814fc798b4274f19c7ee54ce92aa9cc5ab82e83c2248ef3b.png"
}
