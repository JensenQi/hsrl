package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SavageCombatant_2780 : Card() {
    override val id = 2780
    override val name = "狂野争斗者"
    override val description = "<b>激励：</b>在本回合中，使你的英雄获得+2攻击力。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Tgt
    override val background = "或许哼个小曲会让他安静下来……不信你试试。"
    override val artist = "Alex Pascenko"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b7c6a78e3fcd3742f0bfa10534acd8a0c5fe9f4ed5cd91601175ba3e5a34fbd4.png"
}
