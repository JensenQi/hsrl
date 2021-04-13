package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Battlefiend_58487 : Card() {
    override val id = 58487
    override val name = "战斗邪犬"
    override val description = "在你的英雄攻击后，获得+1攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.DemonhunterInitiate
    override val background = "看到这个斧头斧脑的家伙没，这是我的战友。"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f670d32fbd7020f4e653b7b881c338e579d3c67658c43c9ee8514579935d58f2.png"
}
